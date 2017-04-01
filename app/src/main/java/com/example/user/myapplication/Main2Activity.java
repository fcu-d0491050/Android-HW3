package com.example.homework2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText enter;
    private Button back;
    private View.OnClickListener goback=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent closePage = new Intent();
            String name=enter.getText().toString();
            closePage.putExtra("name",name);
            setResult(RESULT_OK,closePage);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        enter=(EditText) findViewById(R.id.enterName);
        back=(Button)findViewById(R.id.button2);
        back.setOnClickListener(goback);
    }

}
    Contact GitHub API Training Shop Blog About
        © 2017 GitHub, Inc. Terms Privacy Security Status Help