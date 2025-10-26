using UnityEngine;
public class MovingPlatform : MonoBehaviour
{
    public GameObject point1;
    public GameObject point2;
    public float speed = 2f;

    private GameObject refPoint;

    private void Start()
    {
        refPoint = point1; // empezamos yendo a point1
    }

    private void Update()
    {
        // Mover la plataforma hacia refPoint
        transform.position = Vector2.MoveTowards(transform.position, refPoint.transform.position, speed * Time.deltaTime);

        // Cambiar refPoint cuando llegamos al destino
        if (Vector2.Distance(transform.position, refPoint.transform.position) < 0.01f)
        {
            refPoint = (refPoint == point1) ? point2 : point1;
        }
    }

    private void OnCollisionEnter2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Player"))
            collision.transform.SetParent(transform); // el Player se pega
    }

    private void OnCollisionExit2D(Collision2D collision)
    {
        if (collision.gameObject.CompareTag("Player"))
            collision.transform.SetParent(null); // se suelta al salir
    }
}

