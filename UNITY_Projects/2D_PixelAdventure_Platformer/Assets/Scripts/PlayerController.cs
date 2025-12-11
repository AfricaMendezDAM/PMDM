using System;
using Unity.VisualScripting.FullSerializer;
using UnityEngine;

public class PlayerMovement : MonoBehaviour
{
    [SerializeField] private float speed = 0.7f;
    [SerializeField] private float jumpForce = 0.7f;
    private Rigidbody2D rb;
    private SpriteRenderer sr;
    private Vector2 moveInput;
    private PlayerControls playerControls;
    private Boolean jumpPressed = false;
    private Boolean isGrounded = false;

    void OnEnable()
    {
        playerControls.Enable();
    }

    void OnDisable()
    {
        playerControls.Disable();
    }

    void Awake()
    {
        playerControls = new PlayerControls();
    }
    
    void Start()
    {
        
    }

    void Update()
    {

    }

    void FixedUpdate()
    {

    }

    
}
