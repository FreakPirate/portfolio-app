package com.udacity.freakpirate.appportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    public void clickOnBtn(View view){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        String toast_text = "";
        switch (view.getId()){

            case R.id.button_spotify:
                toast_text = "Media Streamer";
                break;

            case R.id.button_build_it_bigger:
                toast_text = "Gradle Project";
                break;

            case R.id.button_capstone:
                toast_text = "Capstone";
                break;

            case R.id.button_library_app:
                toast_text = "Library";
                break;

            case R.id.button_scores_app:
                toast_text = "Score Tracker";
                break;

            case R.id.button_xyz_reader:
                toast_text = "Reader";
                break;
        }

        toast_text = getResources().getString(R.string.toast_prefix) + " " + toast_text + " app!";

        Toast toast = Toast.makeText(context, toast_text, duration);
        toast.show();

//        LAZY IMPLEMENTATION
//        Button btn = (Button)view;
//        Toast.makeText(getApplicationContext(), (CharSequence) btn.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
