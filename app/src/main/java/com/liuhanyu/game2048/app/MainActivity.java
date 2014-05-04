package com.liuhanyu.game2048.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    public MainActivity(){
        mainActivity = this;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = (TextView)findViewById(R.id.tvScore);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void clearScore(){
        score = 0;
        showScore();
    }

    public void showScore(){
        tvScore.setText(score + "");
    }

    public void addScore(int s){
        score += s;
        showScore();
    }

    private int score = 0;
    private TextView tvScore;
    private static MainActivity mainActivity = null;

    public static MainActivity getMainActivity() {
        return mainActivity;
    }
}
