package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.util.TypedValue;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private long num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.print);

    }

    public void clickEqual(View view) {

        text.setText("=");

    }

    public void clickClear(View view) {

        text.setText("0");
        reSize(100);

    }

    public void clickDel(View view) {

        text.setText(text.getText().toString().substring(0, text.length() - 1));

    }

    public void checkLast(){

        if(text.getText().toString().lastIndexOf('+') == text.length()-1
          || text.getText().toString().lastIndexOf('-') == text.length()-1
          || text.getText().toString().lastIndexOf('x') == text.length()-1
          || text.getText().toString().lastIndexOf('/') == text.length()-1
          || text.getText().toString().lastIndexOf('=') == text.length()-1) {
            text.setText(text.getText().toString().substring(0, text.length()-1));
        }

    }

    public void clickPlus(View view) {

        checkLast();
        text.append("+");

    }

    public void clickMinus(View view) {

        checkLast();
        text.append("-");

    }

    public void clickMultiply(View view) {

        checkLast();
        text.append("x");

    }

    public void clickDivide(View view) {

        checkLast();
        text.append("/");

    }

    public void clickDot(View view) {

        text.setText(".");

    }

    public void reSize(int size) {

        text.setTextSize(TypedValue.COMPLEX_UNIT_DIP, size);

    }

    public void addNum(String addNum) {

        if(text.getText().toString().equals("0")) {
            text.setText(addNum);
        }
        else if (text.getText().toString().indexOf('+') == -1 && text.length() < 15) {
            text.append(addNum);
            if (text.length() > 6)
                reSize(50);
        }
        else if (text.getText().toString().indexOf('+') != -1 && text.length() < 31) {
            text.append(addNum);
            if (text.length() > 6)
                reSize(50);
        }

    }

    public void click0(View view) {

        addNum("0");

    }

    public void click1(View view) {

        addNum("1");

    }

    public void click2(View view) {

        addNum("2");

    }

    public void click3(View view) {

        addNum("3");

    }

    public void click4(View view) {

        addNum("4");

    }

    public void click5(View view) {

        addNum("5");

    }

    public void click6(View view) {

        addNum("6");

    }

    public void click7(View view) {

        addNum("7");

    }

    public void click8(View view) {

        addNum("8");

    }

    public void click9(View view) {

        addNum("9");

    }
}