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

        if (playerControls.Movement.Jump.IsPressed())
        {
            Jump();
        }
    }

    private void Move()
    {
        rb.MovePosition(rb.position + movement * (movSpeed + Time.fixedDeltaTime));
    }

    private void Jump()
    {

    }

    private void Update()
    {
        PlayerInput();
    }

    private void FixedUpdate()
    {
        Move();
        Jump();
    }
    
}
