package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
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
 * of the program will change to the color you chose, it have one more color option in the menu.
 */
public class MainActivity2 extends AppCompatActivity {
    ConstraintLayout RL;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RL = findViewById(R.id.RL);
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
        menu.add("Gray");
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
        else if(st.equals("Yellow")){
            RL.setBackgroundColor(Color.YELLOW);
        }
        else{
            RL.setBackgroundColor(Color.GRAY);
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     *
     * @param view
     * @return the function will return us to the main activity.
     */
    public void pressed(View view) {
        finish();
    }
}