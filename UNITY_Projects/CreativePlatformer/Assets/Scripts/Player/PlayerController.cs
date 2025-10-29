using UnityEngine;
using UnityEngine.InputSystem;
using UnityEngine.Rendering.Universal.Internal;

public class PlayerController : MonoBehaviour
{
    [SerializeField] private float speed = 5f;
    [SerializeField] private float jumpForce = 7f;
    
    private bool jumpPressed;
    private bool isGrounded = true;

    private Rigidbody2D rb;
    private SpriteRenderer spriteRenderer;
    private InputSystem_Actions controls;
    private Animator animator;
    private Vector2 moveInput;

    private void Awake()
    {
        controls = new InputSystem_Actions();

    }

    private void OnEnable()
    {
        controls.Player.Enable();
    }

    private void OnDisable()
    {
        controls.Player.Disable();
    }

    private void Start()
    {
        rb = GetComponent<Rigidbody2D>();
        spriteRenderer = GetComponent<SpriteRenderer>();
        animator = GetComponent<Animator>();
    }

    private void FixedUpdate()
    {
        Move();
        Jump();
    }

    private void Update()
    {
         // Leer input del jugador cada frame
        moveInput = controls.Player.Move.ReadValue<Vector2>();
        jumpPressed = controls.Player.Jump.triggered;
        //TODO: jump animations logic

    }

    private void Move()
    {
        rb.linearVelocity = new Vector2(moveInput.x * speed, rb.linearVelocity.y);

        if (moveInput.x < 0)
        {
            spriteRenderer.flipX = true;
        }else if(moveInput.x>0)
        {
            spriteRenderer.flipY = false;
        }
    }

    private void Jump()
    {
        if (jumpPressed && isGrounded)
        {
            rb.AddForce(Vector2.up * jumpForce, ForceMode2D.Impulse);
            jumpPressed = false;
            isGrounded = false;
        }
    }

    private void UpdateAnimationParameters()
    {
        
    }
    private void OnCollisionEnter2D(Collision2D collision)
    {

    }

    private void OnTriggerEnter2D(Collider2D collision)
    {

    }

    
    
  
}
