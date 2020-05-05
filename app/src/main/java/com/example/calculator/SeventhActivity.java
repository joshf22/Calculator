package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.text.DecimalFormat;

public class SeventhActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, clear, equals, add, subtract, multiply, divide, decimal, exp;
    ImageButton toggle;
    EditText editText;
    float val1, val2;
    boolean addition, subtraction, multiplication, division, exponent;
    DecimalFormat df;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        clear = findViewById(R.id.clear);
        equals = findViewById(R.id.equals);
        add = findViewById(R.id.add);
        subtract = findViewById(R.id.subtract);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        decimal = findViewById(R.id.decimal);
        exp = findViewById(R.id.exp);
        editText = findViewById(R.id.numbers);
        df = new DecimalFormat("#.######");

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                addition = true;
                editText.setText(null);
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                subtraction = true;
                editText.setText(null);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                multiplication = true;
                editText.setText(null);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                division = true;
                editText.setText(null);
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");
                exponent = true;
                editText.setText(null);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val2 = Float.parseFloat(editText.getText() + "");
                if (addition) {
                    editText.setText(df.format(val1 + val2) + "");
                    addition = false;
                }
                if (subtraction) {
                    editText.setText(df.format(val1 - val2) + "");
                    subtraction = false;
                }
                if (multiplication) {
                    editText.setText(df.format(val1 * val2) + "");
                    multiplication = false;
                }

                if (division) {
                    editText.setText(df.format(val1 / val2) + "");
                    division = false;
                }
                if (exponent) {
                    editText.setText(df.format(Math.pow(val1, val2)) + "");
                    exponent = false;
                }
            }
        });

        toggleViewBack();

    }

    private void toggleViewBack() {
        ImageButton toggle = findViewById(R.id.toggle);
        toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SeventhActivity.this, MainActivity.class));
            }
        });
    }
}