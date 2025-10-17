using UnityEngine;

public class ObjectCollector : MonoBehaviour
{
    void OnTriggerEnter2D(Collider2D collision) //atravesar
    {
        if (collision.gameObject.CompareTag("comida"))
        {
            print("He conseguido comida");
            Destroy(collision.gameObject);
        }
    }

    void OnTriggerExit2D(Collider2D collision)
    {
        //mirar porque no tengo ni idea, no se que de que cuando suba a la plataforma se mueva con la plataforma y
        //cuando salga(onexit) de la plataforma ya no se mueve a la vez
    }
}
