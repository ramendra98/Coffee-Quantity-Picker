package com.rsweapon.coffeoraderupdatingtime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView coffeNO,price;
private int  quntity=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        coffeNO=findViewById(R.id.coffeno);
        price=findViewById(R.id.prices);


    }
    public  void  increment(View v)
    {
        quntity=quntity+1;
        display(quntity);

    }
    public  void  decrement(View v)
    {
        if(quntity>=0){
        quntity=quntity-1;
        display(quntity);}

    }
    public  void  orader(View view)
    {
        int prices=quntity*13;
        String message="Total : "+prices;
            message+="\n Thank You";
        displaymes(message);
    }



    private void display(int quntity) {
       coffeNO.setText(" "+quntity);
       price.setText("Total : 13");


    }
    private void displaymes(String message) {
    price.setText(message);
    }

}