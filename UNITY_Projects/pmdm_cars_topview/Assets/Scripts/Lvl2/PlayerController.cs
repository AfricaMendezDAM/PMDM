using UnityEngine;
using UnityEngine.InputSystem;

public class PlayerController : MonoBehaviour
{
    [Header("Movimiento")]
    [SerializeField] float speed=5f;
    [SerializeField] float jumpForce=5f;
    PlayerInputActions controls;
    Rigidbody2D rb;
    SpriteRenderer sr;  
    Vector2 movement;
    bool jumpPressed=false;
    bool isGrounded=false;

    void Awake()
    {
        controls=new PlayerInputActions();
    }
    void OnEnable()
    {
        controls.Enable();
    }

    void OnDisable()
    {
        controls.Disable();
    }
    void Start()
    {
        rb=GetComponent<Rigidbody2D>();
        sr=GetComponent<SpriteRenderer>();
    }

    
    void Update()
    {
        movement=controls.Player.Move.ReadValue<Vector2>();
        jumpPressed=controls.Player.Jump.triggered;

    }

    void FixedUpdate()
    {
        Move();
        Jump();
    }

    void Move()
    {
        rb.linearVelocity=new Vector2(movement.x*speed, rb.linearVelocityY);

        if (movement.x < 0)
        {
            sr.flipX=true;
        }
        else if (movement.x > 0)
        {
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

    void OnCollisionEnter(Collision collision)
    {
        if(collision.gameObject.CompareTag("Ground"))isGrounded=true;
    }
}
