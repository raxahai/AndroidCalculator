package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button9;
    private Button button8;
    private Button button7;
    private Button button6;
    private Button button5;
    private Button button4;
    private Button button3;
    private Button button2;
    private Button button1;
    private Button button0;
    private String text = "";
    private int number1 = 0;
    private int number2 = 0;
    double value;

    boolean add,subtract,multiply,divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button9 = findViewById(R.id.button_nine);
        button8 = findViewById(R.id.button_eight);
        button7 = findViewById(R.id.button_seven);
        button6 = findViewById(R.id.button_six);
        button5 = findViewById(R.id.button_five);
        button4 = findViewById(R.id.button_four);
        button3 = findViewById(R.id.button_three);
        button2 = findViewById(R.id.button_two);
        button1 = findViewById(R.id.button_one);
        button0 = findViewById(R.id.button_one);

    }
        public void performCalculation(View view){
            switch (view.getId()){
                case R.id.button_plus:
                    number1 = Integer.parseInt(text);
                    add = true;
                    text = "";
                    textView.setText(text);
                    break;
                case R.id.button_multiply:
                    number1 = Integer.parseInt(text);
                    multiply = true;
                    text = "";
                    textView.setText(text);
                    break;
                case R.id.button_subtract:
                    number1 = Integer.parseInt(text);
                    subtract = true;
                    text = "";
                    textView.setText(text);
                    break;
                case R.id.buttonDivide:
                    number1 = Integer.parseInt(text);
                    divide = true;
                    text = "";
                    textView.setText(text);
                    break;
                case R.id.button_equals:
                    number2 = Integer.parseInt(text);
                    if (add == true){
                        value = number1 + number2;
                    }
                    if (subtract == true){
                        value = number1 - number2;
                    }
                    if (multiply == true){
                        value = number1 * number2;
                    }
                    if (divide == true){
                        value = number1 / number2;
                    }
                    Log.d("General", Integer.toString(number1));
                    textView.setText(String.format("%.0f",value));
                    break;
                case R.id.buttonAllClear:
                    text = "";
                    number1 = 0;
                    add = false;
                    divide = false;
                    multiply = false;
                    subtract = false;
                    textView.setText(text);
                    break;
                default:
                    if (text.length()<12){
                    text += ((Button) view).getText().toString();
                    textView.setText(text);
                    }
                    Log.d("General", text);
                    break;
            }
        }
}