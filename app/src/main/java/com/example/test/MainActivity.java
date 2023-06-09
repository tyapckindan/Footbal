package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Integer counterScoreUSSR = 0;
    private Integer counterScoreGermany = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtnAddScoreUSSR(View view) {
        counterScoreUSSR++;
        TextView counterView = findViewById(R.id.ScoreUSSR);
        counterView.setText(counterScoreUSSR.toString());
    }

    public void onClickBtnAddScoreGermany(View view) {
        counterScoreGermany++;
        TextView counterView2 = findViewById(R.id.ScoreGermany);
        counterView2.setText(counterScoreGermany.toString());
    }

    public void onClickBtnResetScore(View view) {
        counterScoreUSSR = 0;
        counterScoreGermany = 0;
        TextView counterView = findViewById(R.id.ScoreUSSR);
        counterView.setText(counterScoreUSSR.toString());
        TextView counterView2 = findViewById(R.id.ScoreGermany);
        counterView2.setText(counterScoreGermany.toString());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counterUSSR", counterScoreUSSR);
        outState.putInt("counterGermany", counterScoreGermany);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counterUSSR")) {
            counterScoreUSSR = savedInstanceState.getInt("counterUSSR");
            TextView counterView = findViewById(R.id.ScoreUSSR);
            counterView.setText(counterScoreUSSR.toString());
        }
        if (savedInstanceState != null &&
                savedInstanceState.containsKey("counterGermany")) {
            counterScoreGermany = savedInstanceState.getInt("counterGermany");
            TextView counterView2 = findViewById(R.id.ScoreGermany);
            counterView2.setText(counterScoreGermany.toString());
        }
    }


}