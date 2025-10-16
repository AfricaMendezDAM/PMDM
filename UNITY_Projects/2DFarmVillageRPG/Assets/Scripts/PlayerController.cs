using UnityEngine.InputSystem;
using UnityEngine;
using UnityEngine.Rendering.Universal.Internal;
using UnityEngine.Scripting.APIUpdating;

public class PlayerController:MonoBehaviour
{
    [SerializeField] private float movSpeed = 1f;


    private PlayerControls playerControls;
    private Vector2 movement;
    private Rigidbody2D rb;

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
    }

    private void Move()
    {
        rb.MovePosition(rb.position + movement * (movSpeed + Time.fixedDeltaTime));
    }

    private void Update()
    {
        PlayerInput();
    }

    private void FixedUpdate()
    {
        Move();
    }
    
}
