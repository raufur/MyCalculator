package com.isolutionsbd.mdraufur.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    EditText frist_num;
    EditText second_num;
    Button addBtn;
    Button subBtm;
    Button multiplyBtn;
    Button divBtn,equalBtn;
    double num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frist_num=(EditText)findViewById(R.id.first_number);

        second_num=(EditText)findViewById(R.id.second_number);

        addBtn=(Button)findViewById(R.id.btnadd);
        subBtm=(Button)findViewById(R.id.btnSubtruct);
        multiplyBtn=(Button)findViewById(R.id.btn_multiply);
        divBtn=(Button)findViewById(R.id.btn_divetion);
        equalBtn=(Button)findViewById(R.id.btn_equal);

        tvResult=(TextView)findViewById(R.id.tv_result);
        boolean add,sub,mul,div;


        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fristNumberString=frist_num.getText().toString();
                if(fristNumberString.equals("")){
                    frist_num.setError("Can not be Empty");
                    return;
                }
                String secondNumberString=frist_num.getText().toString();
                if(secondNumberString.equals("")){
                    second_num.setError("Can not be Empty");
                    return;
                }

                double fristArgument=Double.parseDouble(fristNumberString);
                double secondArgument=Double.parseDouble(fristNumberString);
                double answer=fristArgument+secondArgument;
                tvResult.setText(answer+"");


            }
        });

        subBtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fristNumberString=frist_num.getText().toString();
                if(fristNumberString.equals("")){
                    frist_num.setError("Can not be Empty");
                    return;
                }
                String secondNumberString=frist_num.getText().toString();
                if(secondNumberString.equals("")){
                    second_num.setError("Can not be Empty");
                    return;
                }

                double fristArgument=Double.parseDouble(fristNumberString);
                double secondArgument=Double.parseDouble(fristNumberString);
                double answer=fristArgument-secondArgument;
                tvResult.setText(answer+"");


            }
        });
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fristNumberString=frist_num.getText().toString();
                if(fristNumberString.equals("")){
                    frist_num.setError("Can not be Empty");
                    return;
                }
                String secondNumberString=frist_num.getText().toString();
                if(secondNumberString.equals("")){
                    second_num.setError("Can not be Empty");
                    return;
                }

                double fristArgument=Double.parseDouble(fristNumberString);
                double secondArgument=Double.parseDouble(fristNumberString);
                double answer=fristArgument*secondArgument;
                tvResult.setText(answer+"");


            }
        });
        divBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fristNumberString=frist_num.getText().toString();
                if(fristNumberString.equals("")){
                    frist_num.setError("Can not be Empty");
                    return;
                }
                String secondNumberString=frist_num.getText().toString();
                if(secondNumberString.equals("")){
                    second_num.setError("Can not be Empty");
                    return;
                }

                double fristArgument=Double.parseDouble(fristNumberString);
                double secondArgument=Double.parseDouble(fristNumberString);
                double answer=fristArgument/secondArgument;
                tvResult.setText(answer+"");


            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
