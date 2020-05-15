package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int i=0,j=0,k=0,l=0;
TextView score1;
TextView score2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goals2(View view) {
        k++;
        score2=findViewById(R.id.score2);
        score2.setText(k+" / "+l);

    }

    public void fouls2(View view) {
        l++;
        score2=findViewById(R.id.score2);

        score2.setText(k+" / "+l);
    }

    public void goals1(View view) {
        i++;
        score1=findViewById(R.id.score1);

        score1.setText(i+" / "+j);
    }

    public void fouls1(View view) {
        j++;
        score1=findViewById(R.id.score1);

        score1.setText(i+" / "+j);
    }

    public void reset(View view) {
        i=j=k=l=0;
        score1=findViewById(R.id.score1);
        score2=findViewById(R.id.score2);
        score1.setText(i+" / "+j);
        score2.setText(k+" / "+l);
    }
}
