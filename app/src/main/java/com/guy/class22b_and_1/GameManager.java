package com.guy.class22b_and_1;

import java.util.ArrayList;

public class GameManager {

    private ArrayList<Country> countries;

    private int currentCountryIndex = 0;
    private int score = 0;
    private int lives = 3;

    public GameManager() {
        countries = GameDataManager.buildData();
    }

    public int getCurrentCountryIndex() {
        return currentCountryIndex;
    }

    public void addCurrentCountry() {
        currentCountryIndex++;
    }

    public int getScore() {
        return score;
    }

    public void addToScore() {
        score += 10;
    }

    public int getLives() {
        return lives;
    }

    public void reduceLives() {
        lives--;
    }

    public Country getCurrentCountry() {
        return countries.get(currentCountryIndex);
    }

    public boolean isDead() {
        return lives <= 0;
    }

    public boolean isCountriesDone() {
        return currentCountryIndex >= countries.size();
    }
}
