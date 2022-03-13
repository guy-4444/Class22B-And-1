package com.guy.class22b_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class Activity_Game extends AppCompatActivity {

    private ImageView[] game_IMG_hearts;

    private ImageView game_IMG_flag;
    private MaterialTextView game_LBL_score;
    private MaterialTextView game_LBL_country;
    private MaterialButton game_BTN_yes;
    private MaterialButton game_BTN_no;

    private GameManager gameManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        findViews();
        game_BTN_yes.setOnClickListener(view -> answered(true));
        game_BTN_no.setOnClickListener(view -> answered(false));

        gameManager = new GameManager();
        updateUI();
    }

    private void updateCountryUI() {
        Country country = gameManager.getCurrentCountry();

        // name
        game_LBL_country.setText(country.getName());

        // flag
        String flagFileName = "flag_" + country.getCode();
        int resID = this.getResources().getIdentifier(flagFileName, "drawable", this.getPackageName());
        game_IMG_flag.setImageResource(resID);
    }

    private void answered(boolean answer) {
        Country country = gameManager.getCurrentCountry();

        if (answer == country.isPeace()) {
            gameManager.addToScore();
        } else {
            gameManager.reduceLives();
        }

        next();
    }

    private void next() {
        gameManager.addCurrentCountry();

        if (gameManager.isDead()) {
            Toast.makeText(this, "Loser", Toast.LENGTH_LONG).show();
            finishGame();
            return;
        } else if (gameManager.isCountriesDone()) {
            Toast.makeText(this, "Winner", Toast.LENGTH_LONG).show();
            finishGame();
            return;
        }

        updateUI();
    }

    private void updateUI() {
        game_LBL_score.setText("" + gameManager.getScore());

        for (int i = 0; i < game_IMG_hearts.length; i++) {
            game_IMG_hearts[i].setVisibility(gameManager.getLives() > i ? View.VISIBLE : View.INVISIBLE);
        }

        updateCountryUI();
    }

    private void finishGame() {
        finish();
    }

    private void findViews() {
        game_IMG_flag = findViewById(R.id.game_IMG_flag);
        game_LBL_score = findViewById(R.id.game_LBL_score);
        game_LBL_country = findViewById(R.id.game_LBL_country);
        game_BTN_yes = findViewById(R.id.game_BTN_yes);
        game_BTN_no = findViewById(R.id.game_BTN_no);

        game_IMG_hearts = new ImageView[] {
                findViewById(R.id.game_IMG_heart1),
                findViewById(R.id.game_IMG_heart2),
                findViewById(R.id.game_IMG_heart3)
        };
    }
}