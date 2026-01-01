using UnityEngine;
using UnityEngine.InputSystem;

public class CarController : MonoBehaviour
{
    [Header("Movimiento")]
    [SerializeField] float moveSpeed=5f;
    [SerializeField] float rotationSpeed=180f;   

    void Update()
    {
        Move();
        Rotate();
    }

    void Move()
    {
        float yMovement = 0f;

        if(UpPressed())yMovement=1;
        else if(DownPressed())yMovement=-1;

        transform.Translate(
            transform.up*yMovement*moveSpeed*Time.deltaTime,
            Space.World
        );
        
    }

    void Rotate()
    {
        float rotInput=0f;

        if(LeftPressed()) rotInput=1;
        else if(RightPressed()) rotInput=-1;

        transform.Rotate(0,0, rotInput*rotationSpeed*Time.deltaTime);
    }

    bool UpPressed()=>Keyboard.current.wKey.isPressed || Keyboard.current.upArrowKey.isPressed;
    bool DownPressed()=>Keyboard.current.sKey.isPressed || Keyboard.current.downArrowKey.isPressed;
    bool LeftPressed()=>Keyboard.current.aKey.isPressed || Keyboard.current.leftArrowKey.isPressed;
    bool RightPressed()=>Keyboard.current.dKey.isPressed || Keyboard.current.rightArrowKey.isPressed;
}
