package com.example.ab_rubel.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Sina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sina);
    }


    public void call(View view) {
        //String phone="01823039800";
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:01823039800"));
        startActivity(intent);
    }

    public void web(View view) {
        Intent intent=new Intent(Sina.this,WebActivity.class);
        intent.putExtra("Uri","http://www.ibnsinatrust.com/");
        startActivity(intent);
    }

    public void previous(View view) {
        Intent intent=new Intent(Sina.this,Apollo.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent=new Intent(Sina.this,Labaid.class);
        startActivity(intent);
    }
}
