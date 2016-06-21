package com.example.neha.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  Button button1,
       button2,button3 , button4, button5, button6 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
         button4 = (Button) findViewById(R.id.button4);
         button5 = (Button) findViewById(R.id.button5);
         button6 = (Button) findViewById(R.id.button6);


        button1.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getApplicationContext(), "This button will launch my " + getText(R.string.popular_movies) + " app", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );

        button2.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getApplicationContext(), "This button will launch my " +getText( R.string.stock_hawk) + " app", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );

        button3.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getApplicationContext(), "This button will launch my " + getText(R.string.build_it_bigger) + " app", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );
        button4.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getApplicationContext(), "This button will launch my " + getText(R.string.make_your_app) + " app", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );

        button5.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getApplicationContext(), "This button will launch my " + getText(R.string.go_ubiquitous) + " app", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );


        button6.setOnClickListener(new View.OnClickListener() {

                                       @Override
                                       public void onClick(View view) {
                                           Toast.makeText(getApplicationContext(), "This button will launch my " + getText(R.string.capstone)+ " app", Toast.LENGTH_SHORT).show();
                                       }
                                   }
        );

    }

}