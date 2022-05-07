package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bDot, bC, bResult, bPlus, bMinus, bDevide, bDelete, bMultiply;
    private TextView base;
    private String str = "";
    String TAG = "appLOG";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.btn0);
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        bMultiply = findViewById(R.id.btnMultiply);
        bDot = findViewById(R.id.btnDot);
        bC = findViewById(R.id.btnClear);
        bResult = findViewById(R.id.btnResult);
        bPlus = findViewById(R.id.btnPlus);
        bDot = findViewById(R.id.btnDot);
        bMinus = findViewById(R.id.btnMinus);
        bDelete = findViewById(R.id.btnDelete);
        bDevide = findViewById(R.id.btnDevide);
        base = findViewById(R.id.base);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bDot.setOnClickListener(this);
        bC.setOnClickListener(this);
        bMultiply.setOnClickListener(this);
        bDevide.setOnClickListener(this);
        bDelete.setOnClickListener(this);
        bResult.setOnClickListener(this);
        Log.d(TAG, "onCreate: ");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: ");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: ");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: ");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: ");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: ");
        super.onDestroy();
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn0:
                if (str.equals("Math Error"))
                    str = "";
                str += "0";
                base.setText(str);
                Log.d(TAG, str);
            break;
            case R.id.btn1:
                if (str.equals("Math Error"))
                    str = "";
                str += "1";
                base.setText(str);
            break;
            case R.id.btn2:
                if (str.equals("Math Error"))
                    str = "";
                str += "2";
                base.setText(str);
                break;
            case R.id.btn3:
                if (str.equals("Math Error"))
                    str = "";
                str += "3";
                base.setText(str);
                break;
            case R.id.btn4:
                if (str.equals("Math Error"))
                    str = "";
                str += "4";
                base.setText(str);
                break;
            case R.id.btn5:
                if (str.equals("Math Error"))
                    str = "";
                str += "5";
                base.setText(str);
                break;
            case R.id.btn6:
                if (str.equals("Math Error"))
                    str = "";
                str += "6";
                base.setText(str);
                break;
            case R.id.btn7:
                if (str.equals("Math Error"))
                    str = "";
                str += "7";
                base.setText(str);
                break;
            case R.id.btn8:
                if (str.equals("Math Error"))
                    str = "";
                str += "8";
                base.setText(str);
                break;
            case R.id.btn9:
                if (str.equals("Math Error"))
                    str = "";
                str += "9";
                base.setText(str);
                break;
            case R.id.btnPlus:
                str = com.example.myapplication.actions.plus.plus(str);
                base.setText(str);
                break;
            case R.id.btnDevide:
                str = com.example.myapplication.actions.devide.devide(str);
                base.setText(str);
                break;
            case R.id.btnMinus:
                str = com.example.myapplication.actions.minus.minus(str);
                base.setText(str);
                break;
            case R.id.btnDot:
                str = com.example.myapplication.actions.dot.dot(str);
                base.setText(str);
                break;
            case R.id.btnClear:
                str = "";
                base.setText(str);
                break;
            case R.id.btnResult:
                str = com.example.myapplication.actions.result.get_result(str);
                base.setText(str);
                break;
            case R.id.btnDelete:
                str =  com.example.myapplication.actions.delete.del(str);
                base.setText(str);
                break;
            case R.id.btnMultiply:
                str = com.example.myapplication.actions.multiply.multiply(str);
                base.setText(str);
        }

    }
}