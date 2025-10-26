using UnityEngine;

public class PlayerAnimation : MonoBehaviour
{
    public SpriteRenderer spriteRenderer;  
    public Sprite[] sprites;               
    public float framesPerSecond = 10f;    

    private int currentFrame = 0;
    private float timer = 0f;

    void Update()
    {
        if (sprites.Length == 0) return; 

        timer += Time.deltaTime;

        if (timer >= 1f / framesPerSecond)
        {
            currentFrame = (currentFrame + 1) % sprites.Length; 
            spriteRenderer.sprite = sprites[currentFrame];
            timer = 0f;
        }
    }
}
