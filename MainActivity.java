package com.example.while_factoral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnClick(View v)
    {
        EditText ed1;
        TextView tv1;
        int endingNum, prod1, x;

        ed1 = (EditText)findViewById(R.id.ed_num1);
        tv1 = (TextView)findViewById(R.id.ed_prod1);

        endingNum = Integer.parseInt(ed1.getText().toString());
        x = 1;
        prod1 = 1;
        while (x <= endingNum)
        {
            prod1 = prod1 * x;
            x = x + 1;
        }
        tv1.setText(String.valueOf(prod1));
    }
}