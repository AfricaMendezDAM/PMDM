using UnityEngine;
using UnityEngine.InputSystem;

public class Player1Movement : MonoBehaviour
{
    enum AnimationType { idle, running, jumping }
    AnimationType state = AnimationType.idle;
    Animator animator;

    private SpriteRenderer sr;
    private float jumpForce = 5f;
    private Rigidbody2D rb;
    private bool isGrounded = true;
    private BoxCollider2D coll;



    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {

        rb = GetComponent<Rigidbody2D>();
        coll = GetComponent<BoxCollider2D>();
        animator = GetComponent<Animator>();
        sr.flipX = GetComponent<SpriteRenderer>();

    }
    
    /*private bool estaEnElSuelo()
    {
        return Physics
    }*/

    // Update is called once per frame
    void Update()
    {

        if (Keyboard.current.leftArrowKey.isPressed || Keyboard.current.aKey.isPressed)
        {
            // Vector3 posicion = new Vector3(-0.1f, 0, 0);
            // transform.Translate(-0.1f, 0, 0);


            rb.linearVelocity = new Vector3(-5f, 0, 0);
            state = AnimationType.running;
            sr.flipX = false;
            //animator.SetInteger("state", 1);

            Debug.Log("Me muevo hacia atrás");
        }

        else if (Keyboard.current.rightArrowKey.isPressed || Keyboard.current.dKey.isPressed)
        {
            //transform.Translate(0.1f, 0, 0);
            rb.linearVelocity = new Vector3(5f, 0, 0);
            state = AnimationType.running;
            Debug.Log("Me muevo hacia delante");
        }

        else if (Keyboard.current.upArrowKey.isPressed || Keyboard.current.wKey.isPressed)
        {
            state = AnimationType.jumping;
            Debug.Log("Error! Presionaste la flecha 'hacia arriba' ó w");
        }

        else if (Keyboard.current.downArrowKey.isPressed || Keyboard.current.sKey.isPressed)
        {
            state = AnimationType.idle;
            Debug.Log("Error! Presionaste la flecha 'hacia abajo' ó s");
        }


        /*if (Keyboard.current.spaceKey.isPressed && estaEnElSuelo())
        {

        }*/

        animator.SetInteger("state", (int)state);


        

    }
}
