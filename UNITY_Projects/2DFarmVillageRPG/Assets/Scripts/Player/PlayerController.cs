using System;
using UnityEngine;

public class PlayerController : MonoBehaviour
{
    [SerializeField] private float movSpeed = 1f;
    [SerializeField] private float jumpForce = 5f;


    private PlayerControls playerControls;
    private Vector2 movement;
    private Rigidbody2D rb;
    private Boolean jumpPressed = false;

    private Boolean isGrounded;

    private void Awake()
    {
        playerControls = new PlayerControls();
        rb = GetComponent<Rigidbody2D>();
    }

    private void OnEnable()
    {
        playerControls.Enable();
    }

    private void PlayerInput()
    {
        movement = playerControls.Movement.Move.ReadValue<Vector2>();
        jumpPressed = playerControls.Movement.Jump.IsPressed();
    }

    private void Move()
    {
        rb.MovePosition(rb.position + movement * movSpeed * Time.fixedDeltaTime);

    }
    private void Jump()
    {
        rb.AddForce(Vector2.up * jumpForce, ForceMode2D.Impulse);
    } 

    private void Update()
    {
        PlayerInput();
    }

    private void FixedUpdate()
    {
        Move();

        if (jumpPressed && isGrounded)
        {
            Jump();
            jumpPressed = false;
        }
    }
    
}
