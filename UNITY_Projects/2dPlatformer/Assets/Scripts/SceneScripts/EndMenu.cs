using UnityEngine;
using UnityEngine.SceneManagement;
using TMPro;
public class EndMenu : MonoBehaviour
{
    [SerializeField] private TMP_Text resultText;
   
     public void SetupMenu()
    {
        if (GameManager.Instance.playerWon)
        {
            resultText.text = "You win!";
        }
        else
        {
            resultText.text = "You lost";
        }
    }

    public void restartGame()
    {
        SceneManager.LoadScene("MainScene");
    }

    public void backToMenu()
    {
        SceneManager.LoadScene("OpeningScene");
    }

    public void exitGame()
    {
        Application.Quit();
    }

    private void Start()
    {
        SetupMenu();
    }
   
   
    
}
