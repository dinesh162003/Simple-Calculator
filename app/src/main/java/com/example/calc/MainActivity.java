package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    TextView t1;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        t1 = (TextView) findViewById(R.id.result);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {
            String result = "Please enter a value";
            t1.setText(result);
            return false;
        } else {
            num1 = Integer.parseInt(s1);
            num2 = Integer.parseInt(s2);
        }
        return true;
    }
    public void doSum(View v) {
        if (getNumbers()) {
            int sum = num1 + num2;
            t1.setText(num1+"+"+num2+"="+Integer.toString(sum));
        }
    }
    public void doSub(View v) {
        if (getNumbers()) {
            int sub = num1 - num2;
            t1.setText(num1+"-"+num2+"="+Integer.toString(sub));
        }
    }
    public void doMul(View v) {
        if (getNumbers()) {
            int mul = num1 * num2;
            t1.setText(num1+"*"+num2+"="+Integer.toString(mul));
        }
    }
    public void doDiv(View v) {
        if (getNumbers()) {
            double div = num1 / (num2 * 1.0);
            t1.setText(num1+"/"+num2+"="+Double.toString(div));
        }
    }

}