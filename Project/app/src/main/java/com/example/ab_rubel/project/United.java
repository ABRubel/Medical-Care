package com.example.ab_rubel.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class United extends AppCompatActivity {

    Button Btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_united);
        Btn1=(Button)findViewById(R.id.btn1);
    }

    public void next(View view) {
        Intent intent=new Intent(United.this,SquareActivity.class);
        startActivity(intent);
    }

    public void call(View view) {
        //String phone="028836000";
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:028836000"));
        startActivity(intent);
    }

    public void web(View view) {
        Intent intent=new Intent(United.this,WebActivity.class);
        intent.putExtra("Uri","http://www.uhlbd.com/");
        startActivity(intent);
    }
}
