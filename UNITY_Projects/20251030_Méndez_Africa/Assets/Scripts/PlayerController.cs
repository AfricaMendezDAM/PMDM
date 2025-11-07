using UnityEngine;
using UnityEngine.Rendering.RenderGraphModule;
using UnityEngine.UIElements;

public class PlayerController : MonoBehaviour
{

    [SerializeField] private float speed = 5f;
    [SerializeField] private float jumpForce = 7f;

    private InputSystem_Actions controls;
    private Rigidbody2D rb;
    private SpriteRenderer renderer;
    private Vector2 moveInput;
    private bool jumpPressed;
    private bool isGrounded = true;

    void Awake()
    {
        controls = new InputSystem_Actions();
    }

    void Start()
    {
        rb = GetComponent<Rigidbody2D>();
        renderer = GetComponent<SpriteRenderer>();
    }


    void Update()
    {

    }

    void FixedUpdate()
    {
        rb.linearVelocity = new Vector2(rb.linearVelocity.x * speed, rb.linearVelocity.y);
        moveInput = controls.Player.Move.ReadValue<Vector2>(); 
        jumpPressed = controls.Player.Jump.triggered;

        Move();
        Jump();
    }

    void Move()
    {

        controls.Player.Move.ReadValue<Vector2>(); 

        if (moveInput.x < 0)
        {
            renderer.flipX = true;
            
        }else if(moveInput.x > 0)
        {
            renderer.flipX = false;
        }
    }
    
    void Jump()
    {

        if (jumpPressed && isGrounded)
        {
            rb.AddForce(moveInput * jumpForce, ForceMode2D.Impulse);
            isGrounded = false;
            jumpPressed = false;
        }

        isGrounded = true;
    }
}
