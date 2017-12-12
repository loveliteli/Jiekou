package com.exbawei.liteli.jiekou;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements TextView.OnClickListener{

    private TextView textView;
    private TextView textView3;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();

    }

    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView2 = (TextView) findViewById(R.id.textView2);
      textView.setOnClickListener(this);
      textView2.setOnClickListener(this);
      textView3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.textView:
             data.setData(textView.getText().toString());
                finish();
                break;
            case R.id.textView2:
                data.setData(textView2.getText().toString());
                finish();
                break;
            case R.id.textView3:
                data.setData(textView3.getText().toString());
                finish();
            break;
        }

    }

    public static Data data;

    public  static  void getData(Data str){

        Main2Activity.data=str;
    }


    public  interface Data{
        void setData(String str);
    }

}
