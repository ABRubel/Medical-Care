package com.example.ab_rubel.project;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegistrationActivity extends AppCompatActivity implements View.OnTouchListener {

    private EditText email;
    private EditText pass;
    private EditText ConPass;
    private TextView Login;
    private TextView Already;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        email = (EditText) findViewById(R.id.EmailEt);
        pass = (EditText) findViewById(R.id.PassEt);
        ConPass = (EditText) findViewById(R.id.ConPassEt);
        Login = (TextView) findViewById(R.id.LoginTV);
        Already=(TextView) findViewById(R.id.AlreadyUserTV);

        Login.setOnTouchListener(this);
        mAuth = FirebaseAuth.getInstance();
    }

    public void signUp(View view) {
        String Email = email.getText().toString().trim();
        String Pass = pass.getText().toString().trim();
        if (Email.isEmpty() && Pass.isEmpty()) {
            Already.setText("Sorry! Both Email and Password is Empty");
        } else if (Pass.isEmpty()) {
            Already.setText("Sorry! Password is Empty");
        } else if (Email.isEmpty()) {
            Already.setText("Sorry! Email is Empty");
        }
        else if (ConPass != pass) {
            Already.setText("Sorry! Password not matched");
        }
        else {
            mAuth.createUserWithEmailAndPassword(Email, Pass)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // Sign in success, update UI with the signed-in user's information
                                //Log.d(TAG, "createUserWithEmail:success");
                                FirebaseUser user = mAuth.getCurrentUser();
                                Toast.makeText(RegistrationActivity.this, "Authentication Successful.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                                startActivity(intent);
                                //updateUI(user);
                            } else {
                                // If sign in fails, display a message to the user.
                                //Log.w(TAG, "createUserWithEmail:failure", task.getException());
                                Toast.makeText(RegistrationActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();

                                //updateUI(null);
                            }

                            // ...
                        }
                    });


        }
    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (v.getId() == R.id.LoginTV) {
            Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
            startActivity(intent);
        }
        return true;
    }
}
