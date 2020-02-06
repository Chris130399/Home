package com.example.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.Measures.Measure1;
import com.Measures.Measure2;
import com.Measures.Measure3;
import com.Measures.Measure4;
import com.getbase.floatingactionbutton.FloatingActionButton;

public class MeasuresActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView measure_1,measure_2,measure_3,measure_4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_measures);

        //DEFINE CARDS

        measure_1 = (CardView) findViewById(R.id.measure1);
        measure_2 = (CardView) findViewById(R.id.measure2);
        measure_3 = (CardView) findViewById(R.id.measure3);
        measure_4 = (CardView) findViewById(R.id.measure4);

        //SETTING CLICK LISTENER

        measure_1.setOnClickListener(this);
        measure_2.setOnClickListener(this);
        measure_3.setOnClickListener(this);
        measure_4.setOnClickListener(this);

        //FLOATING BUTTONS

        final FloatingActionButton fab1 = findViewById(R.id.action1);
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Action 1");

            }
        });

        final FloatingActionButton fab2 = findViewById(R.id.action2);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast("Action 2");

            }
        });
    }

    public void showToast(String Message){
        Toast.makeText(this, Message,Toast.LENGTH_LONG).show();

    }

    //CARD ONCLICK

    @Override
    public void onClick(View v) {

        Intent i;

        switch (v.getId())
        {
            case R.id.measure1: i = new Intent(this, Measure1.class); startActivity(i);break;
            case R.id.measure2: i = new Intent(this, Measure2.class); startActivity(i);break;
            case R.id.measure3: i = new Intent(this, Measure3.class); startActivity(i);break;
            case R.id.measure4: i = new Intent(this, Measure4.class); startActivity(i);break;
            default:break;
        }
    }

}