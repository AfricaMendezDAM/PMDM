using System;
using Unity.VisualScripting.FullSerializer;
using UnityEditor.Tilemaps;
using UnityEngine;

public class PlayerMovement : MonoBehaviour
{
    [SerializeField] private float speed = 0.7f;
    [SerializeField] private float jumpForce = 0.7f;
    private Rigidbody2D rb;
    private SpriteRenderer sr;
    private Vector2 moveInput;
    private PlayerControls controls;
    private Boolean jumpPressed = false;
    private Boolean isGrounded = false;

    void OnEnable()
    {
        controls.Enable();
    }

    void OnDisable()
    {
        controls.Disable();
    }

    void Awake()
    {
        controls = new PlayerControls();
    }
    
    void Start()
    {
        rb = GetComponent<Rigidbody2D> ();
        sr = GetComponent<SpriteRenderer>();
    }

    void Update()
    {
        moveInput = controls.Player.Move.ReadValue<Vector2>();
        jumpPressed = controls.Player.Jump.triggered;
    }

    void FixedUpdate()
    {
        Move();
        Jump();
    }

    void Move()
    {
        rb.linearVelocity=new Vector2(moveInput.x*speed, rb.linearVelocityY);

        if(moveInput.x<0){
            sr.flipX=true;
        } else if(moveInput.x>0){
            sr.flipX=false;
        }
    }

    void Jump()
    {
        if (jumpPressed && isGrounded)
        {
            rb.AddForce(Vector2.up*jumpForce, ForceMode2D.Impulse);
            isGrounded=false; 
        }
    }

    void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Ground"))
        {
            isGrounded=true;
        }
    }


}
