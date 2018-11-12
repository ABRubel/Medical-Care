package com.example.ab_rubel.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SquareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);
    }



    public void call(View view) {
        //String phone="028144400";
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:028144400"));
        startActivity(intent);
    }

    public void web(View view) {
        Intent intent=new Intent(SquareActivity.this,WebActivity.class);
        intent.putExtra("Uri","http://www.squarehospital.com/");
        startActivity(intent);
    }

    public void previous(View view) {
        Intent intent=new Intent(SquareActivity.this,United.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent=new Intent(SquareActivity.this,Apollo.class);
        startActivity(intent);
    }
}
