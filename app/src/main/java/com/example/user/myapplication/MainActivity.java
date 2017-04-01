package com.example.user.homework1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView efInput;
    private Button btnCacl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        efInput =(EditText)findViewById(R.id.editText3);
        btnCacl =(Button)findViewById(R.id.btn_submit);
        btnCacl.setOnClickListener(say_hello);
    }
    private  View.OnClickListener say_hello = new View.OnClickListener(){
        public void onClick(View ad2){
            String name = efInput.getText().toString();
            Toast.makeText(MainActivity.this,"Hello "+name,Toast.LENGTH_SHORT).show();
        }

    };

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
        else if (id == R.id.action_About){
            AlertDialog.Builder MB =new AlertDialog.Builder(this);
            MB.setTitle("About this APP");
            MB.setMessage("Author:Chai Ching Ting");

            DialogInterface.OnClickListener SU=new DialogInterface.OnClickListener(){
                public void onClick(DialogInterface ad,int i){
                }
            };
            MB.setPositiveButton("sure",SU);
            MB.show();

        }
        else if (id == R.id.action_Reset){
            efInput.setText("");
        }
        return super.onOptionsItemSelected(item);
    }
}