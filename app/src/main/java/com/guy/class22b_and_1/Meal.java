package com.guy.class22b_and_1;

import java.util.ArrayList;

public class Meal {

    private String name = "";
    private int calories = 0;
    private boolean kosher = true;
    private double price = 0.0;
    private ArrayList<String> ingredients = new ArrayList<>();
    private Cooking cooking = new Cooking();

    public Meal() {
    }

    public Meal(String name, int calories, boolean kosher, double price, ArrayList<String> ingredients, Cooking cooking) {
        this.name = name;
        this.calories = calories;
        this.kosher = kosher;
        this.price = price;
        this.ingredients = ingredients;
        this.cooking = cooking;
    }

    public String getName() {
        return name;
    }

    public Meal setName(String name) {
        this.name = name;
        return this;
    }

    public int getCalories() {
        return calories;
    }

    public Meal setCalories(int calories) {
        this.calories = calories;
        return this;
    }

    public boolean isKosher() {
        return kosher;
    }

    public Meal setKosher(boolean kosher) {
        this.kosher = kosher;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Meal setPrice(double price) {
        this.price = price;
        return this;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public Meal setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public Cooking getCooking() {
        return cooking;
    }

    public Meal setCooking(Cooking cooking) {
        this.cooking = cooking;
        return this;
    }
}
