package dev.erarnitox.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var resultImg : ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollBtn : Button = findViewById(R.id.roll_btn);
        resultImg = findViewById(R.id.dice_img);

        rollBtn.setOnClickListener{
            rollDice();
        }
    }

    private fun rollDice() {
        val resultNum = Random().nextInt(6) + 1;

        val imageRes = when (resultNum){
            1 -> R.drawable.dice_1;
            2 -> R.drawable.dice_2;
            3 -> R.drawable.dice_3;
            4 -> R.drawable.dice_4;
            5 -> R.drawable.dice_5;
            else -> R.drawable.dice_6;
        }
        resultImg.setImageResource(imageRes);
    }
}
