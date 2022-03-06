package com.guy.class22b_and_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity_Menu extends AppCompatActivity {

    private ArrayList<Meal> meals = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        meals.add(new Meal()
                .setName("Pizza")
                .setCalories(400)
                .setKosher(true)
                .setIngredients(new ArrayList<>(Arrays.asList(
                        "dough",
                        "mozzarella",
                        "tomato",
                        "onion",
                        "jalapeno"
                )))
                .setPrice(60.0)
                .setCooking(new Cooking("Italian").setTemp(180).setDuration(300))
        );


        meals.add(
                new Meal().setName("Pasta").setCalories(300).setKosher(true).setIngredients(new ArrayList<>(Arrays.asList(
                        "pasta",
                        "tomato",
                        "basil"
                ))).setPrice(50.0)
        );

        /*
        Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show();

        Toast t = new Toast(this);
        t.setText("Hello World 2");
        t.setDuration(Toast.LENGTH_LONG);
        t.show();



        new MaterialAlertDialogBuilder(this)
                .setIcon(R.drawable.ic_help)
                .setTitle("Warning!")
                .setMessage("Are you sure you want to delete this entry?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
        .show();
         */












    }
}