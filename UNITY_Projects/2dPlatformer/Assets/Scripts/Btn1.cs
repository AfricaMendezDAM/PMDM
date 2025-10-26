using UnityEngine;
using UnityEngine.SceneManagement;

public class Btn1 : MonoBehaviour
{
    void Start()
    {

    }
    
    public void playGame()
    {
        SceneManager.LoadScene("MainScene");
    }

    void Update()
    {
        
    }
}
