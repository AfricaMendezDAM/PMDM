using UnityEngine;
using UnityEngine.InputSystem;

public class Personaje_Controller : MonoBehaviour
{

    
    [SerializeField]private float movSpeed = 0.3f;
    [SerializeField]private float rotSpeed = 2;

    // Start is called once before the first execution of Update after the MonoBehaviour is created
    void Start()
    {
    
    }

    // Update is called once per frame
    void Update()
    {
        float movement = 0.0f;
        float rotation = 0.0f;

        //Miro si pulso tecla adelante
        if (Keyboard.current.upArrowKey.isPressed || Keyboard.current.wKey.isPressed)
        {
            movement = 1;
            Debug.Log("Me muevo hacia delante");
        }

        //Si no, miro si pulso atrás

        else if (Keyboard.current.downArrowKey.isPressed || Keyboard.current.sKey.isPressed)
        {
            movement = -1;
            Debug.Log("Me muevo hacia atrás");
        }


        if (Keyboard.current.leftArrowKey.isPressed || Keyboard.current.aKey.isPressed)
        {
            rotation = 1;
            Debug.Log("Giro a la izquierda");
        }

        else if (Keyboard.current.rightArrowKey.isPressed || Keyboard.current.dKey.isPressed)
        {
            rotation = -1;
            Debug.Log("Giro hacia la derecha");
        }


        transform.Translate(0, movement*movSpeed, 0);
        transform.Rotate(0, 0, rotation * rotSpeed);

        
        
    }
}
