package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * @author Roey Schwartz
 * @version 1
 * @since 18.09.2023
 * this class will show a menu with colors that when you choose a color the background
 * of the program will change to the color you chose.
 */
public class MainActivity extends AppCompatActivity {
    ConstraintLayout RL;
    Intent si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RL = findViewById(R.id.RL);
        si = new Intent(this, MainActivity2.class);
    }

    /**
     *
     * @param menu The options menu in which you place your items.
     *
     * @return the function will create an options menu.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /**
     *
     * @param item the function gets an menu item.
     *
     * @return the function will change the background of the screen as per of the choose in the menu
     */
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        String st = item.getTitle().toString();
        if (st.equals("Black")){
            RL.setBackgroundColor(Color.BLACK);
        }
        else if(st.equals("Green")){
            RL.setBackgroundColor(Color.GREEN);
        }
        else{
            RL.setBackgroundColor(Color.YELLOW);
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * @return this function will start the next activity
     */
    public void pressed_1(View view) {
        startActivity(si);
    }
}