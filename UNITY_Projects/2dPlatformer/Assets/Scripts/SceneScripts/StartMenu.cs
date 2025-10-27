using UnityEngine;
using UnityEngine.SceneManagement;

public class StartMenu : MonoBehaviour
{

    public void playGame()
    {
        SceneManager.LoadScene("MainScene");
    }
    
    public void exitGame()
    {
        Debug.Log("QuitGame");
        Application.Quit();
        
    }


}
