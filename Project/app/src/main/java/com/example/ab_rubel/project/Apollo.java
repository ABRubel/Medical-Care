package com.example.ab_rubel.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Apollo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apollo);
    }


    public void call(View view) {
        //String phone="01729276556";
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:01729276556"));
        startActivity(intent);
    }

    public void web(View view) {
        Intent intent=new Intent(Apollo.this,WebActivity.class);
        intent.putExtra("Uri","http://www.apollodhaka.com/");
        startActivity(intent);
    }

    public void previous(View view) {
        Intent intent=new Intent(Apollo.this,SquareActivity.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent=new Intent(Apollo.this,Sina.class);
        startActivity(intent);
    }
}
