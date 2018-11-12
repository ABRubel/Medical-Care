package com.example.ab_rubel.project;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Labaid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labaid);
    }

    public void call(View view) {
        String phone="0258610793";
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:0258610793"));
        startActivity(intent);
    }

    public void web(View view) {
        Intent intent=new Intent(Labaid.this,WebActivity.class);
        intent.putExtra("Uri","http://www.labaidgroup.com/");
        startActivity(intent);
    }

    public void previous(View view) {
        Intent intent=new Intent(Labaid.this,Sina.class);
        startActivity(intent);
    }
}
