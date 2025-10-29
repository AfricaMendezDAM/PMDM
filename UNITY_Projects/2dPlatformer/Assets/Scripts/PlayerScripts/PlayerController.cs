using UnityEngine;
using UnityEngine.Rendering.Universal.Internal;
using TMPro;
using UnityEngine.UI; 

public class PlayerController : MonoBehaviour
{
    [SerializeField] public float speed = 5f;
    [SerializeField] public float jumpForce = 7f;
    [SerializeField] private Animator animator;
    [SerializeField] private int counter;
    [SerializeField] private TMP_Text coinText;


    private Rigidbody2D rb;
    private PlayerControls controls;
    private Vector2 moveInput;
    private bool jumpPressed;
    private bool isGrounded = true;
    private SpriteRenderer spriteRenderer;

    private void Awake()
    {
        controls = new PlayerControls();
    }

    private void Start()
    {
        rb = GetComponent<Rigidbody2D>();
        spriteRenderer = GetComponent<SpriteRenderer>();
    }

    private void OnEnable()
    {
        controls.Player.Enable();
    }

    private void OnDisable()
    {
        controls.Player.Disable();
    }

    private void Update()
    {
        moveInput = controls.Player.Move.ReadValue<Vector2>();

        if (controls.Player.Jump.triggered && isGrounded)
        {
            jumpPressed = true;
            if (animator != null)
            {
                animator.SetBool("IsJumping", true); 
            }
                
        }

        if (animator != null)
        {
            animator.SetFloat("Speed", Mathf.Abs(moveInput.x));
        }
            
    }

    private void FixedUpdate()
    {
        rb.linearVelocity = new Vector2(moveInput.x * speed, rb.linearVelocity.y);

        if (moveInput.x < 0)
            spriteRenderer.flipX = true;
        else if (moveInput.x > 0)
            spriteRenderer.flipX = false;

        if (jumpPressed && isGrounded)
        {
            rb.AddForce(Vector2.up * jumpForce, ForceMode2D.Impulse);
            jumpPressed = false;
            isGrounded = false;
        }
    }

    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Ground"))
        {
            isGrounded = true;
            if (animator != null)
                animator.SetBool("IsJumping", false);
        }
    }

    private void OnTriggerEnter2D(Collider2D collision)
    {
        if (collision.CompareTag("Coin"))
        {
            counter++;
            Destroy(collision.gameObject);
            if (coinText != null)
            {
                coinText.text = "Strawberries: " + counter;
            }

            if(counter >= 2)
            {
                GameManager.Instance.EndGame(true);
            }

        }
        
        if(collision.CompareTag("Death")){
            GameManager.Instance.EndGame(false);
        }
    }
}
