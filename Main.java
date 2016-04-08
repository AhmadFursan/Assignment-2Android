package com.example.ahmadfursan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Stack;

public class Main extends AppCompatActivity {

    String equation ="";
    TextView text;
    double operand;
    Stack stack = new Stack();
    double M = 0;
    String test="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button zero = (Button) findViewById(R.id.zero);
        Button one = (Button) findViewById(R.id.one);
        Button tow = (Button) findViewById(R.id.tow);
        Button three = (Button) findViewById(R.id.three);
        Button four = (Button) findViewById(R.id.four);
        Button five = (Button) findViewById(R.id.five);
        Button six = (Button) findViewById(R.id.six);
        Button seven = (Button) findViewById(R.id.seven);
        Button eight = (Button) findViewById(R.id.eight);
        Button nine = (Button) findViewById(R.id.nine);
        Button equals = (Button) findViewById(R.id.equal);
        Button mPlus = (Button) findViewById(R.id.mplus);
        Button C = (Button) findViewById(R.id.c);
        Button mC = (Button) findViewById(R.id.mc);
        Button mR = (Button) findViewById(R.id.mr);
        Button mul = (Button) findViewById(R.id.mul);
        Button div = (Button) findViewById(R.id.div);
        Button minus = (Button) findViewById(R.id.minus);
        Button plus = (Button) findViewById(R.id.plus);
        Button n = (Button) findViewById(R.id.n);
        Button back = (Button) findViewById(R.id.back);

        text = (TextView) findViewById(R.id.text);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "0";
                text.setText(equation);
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "1";
                text.setText(equation);
            }
        });
        tow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "2";
                text.setText(equation);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "3";
                text.setText(equation);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "4";
                text.setText(equation);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "5";
                text.setText(equation);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "6";
                text.setText(equation);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "7";
                text.setText(equation);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "8";
                text.setText(equation);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation += "9";
                text.setText(equation);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.equals("")) {
                    operand = Double.parseDouble(equation);
                    stack.push(operand);
                    if(stack.size()==3){
                        text.setText(result() + "");
                    }
                    stack.push("+");
                }
                equation="";


                if(stack.isEmpty()!= true && isOperation(test = (String)stack.peek()+"")){
                    stack.pop();
                    stack.push("+");
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.equals("")) {
                    operand = Double.parseDouble(equation);
                    stack.push(operand);
                    if(stack.size()==3){
                        text.setText(result() + "");
                    }
                    stack.push("-");
                }
                equation="";


                if(stack.isEmpty()!= true && isOperation(test = (String)stack.peek()+"")){
                    stack.pop();
                    stack.push("-");
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.equals("")) {
                    operand = Double.parseDouble(equation);
                    stack.push(operand);
                    if(stack.size()==3){
                        text.setText(result() + "");
                    }
                    stack.push("*");
                }
                equation="";


                if(stack.isEmpty()!= true && isOperation(test = (String)stack.peek()+"")){
                    stack.pop();
                    stack.push("*");
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!equation.equals("")) {
                    operand = Double.parseDouble(equation);
                    stack.push(operand);
                    if(stack.size()==3){
                        text.setText(result() + "");
                    }
                    stack.push("/");
                }
                equation="";


                if(stack.isEmpty()!= true && isOperation(test = (String)stack.peek()+"")){
                    stack.pop();
                    stack.push("/");
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stack.removeAllElements();
                text.setText("");
                equation="";
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand = Double.parseDouble(equation);
                stack.push(operand);
                double temp = result();
                equation = temp+"";
                text.setText(temp + "");
                stack.pop();
            }
        });
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation = "-"+equation;
                text.setText(equation);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation = equation.substring(0,equation.length()-1);
                text.setText(equation);
            }
        });
        mPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                M+=Double.parseDouble(text.getText().toString());
                text.setText("");
                equation="";
                stack.removeAllElements();
            }
        });
        mR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setText(M+"");
                equation=M+"";
            }
        });
        mC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                M=0;
                text.setText(M+"");
            }
        });

    }
    public double result(){
        double operand1=(double)stack.pop();
        String op = (String)stack.pop();
        char operation = op.charAt(0);
        double operand2=(double)stack.pop();
        double result=0;
        switch (operation){
            case '+':
                result=(operand2+operand1);
                break;
            case '-':
                result=(operand2-operand1);
                break;
            case '*':
                result=(operand2*operand1);
                break;
            case '/':
                result=(operand2/operand1);
                break;
        }
        stack.push(result);
        return result;
    }
    public boolean isOperation (String operation){
        char oper = operation.charAt(0);
        switch (oper){
            case '+':
                return true;
            case '-':
                return true;
            case '*':
                return true;
            case '/':
                return true;
            default:
                return false;
        }
    }
}
