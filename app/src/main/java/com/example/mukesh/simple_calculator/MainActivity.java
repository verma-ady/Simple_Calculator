package com.example.mukesh.simple_calculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE="Hello Guys";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void onbuttonclickadd ( View v ){
        EditText e1= (EditText)findViewById(R.id.num1);
        EditText e2= (EditText)findViewById(R.id.num2);
        TextView t1= (TextView)findViewById(R.id.res);
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int res=n1+n2;
        t1.setText(Integer.toString(res));
    }

    public void onbuttonclicksub ( View v ){
        EditText e1= (EditText)findViewById(R.id.num1);
        EditText e2= (EditText)findViewById(R.id.num2);
        TextView t1= (TextView)findViewById(R.id.res);
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int res=n1-n2;
        t1.setText(Integer.toString(res));
    }

    public void onbuttonclickmul ( View v ){
        EditText e1= (EditText)findViewById(R.id.num1);
        EditText e2= (EditText)findViewById(R.id.num2);
        TextView t1= (TextView)findViewById(R.id.res);
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        int res=n1*n2;
        t1.setText(Integer.toString(res));
    }

    public void onbuttonclickdiv ( View v ){
        EditText e1= (EditText)findViewById(R.id.num1);
        EditText e2= (EditText)findViewById(R.id.num2);
        TextView t1= (TextView)findViewById(R.id.res);
        int n1 = Integer.parseInt(e1.getText().toString());
        int n2 = Integer.parseInt(e2.getText().toString());
        if(n2!=0) {
        int res = n1 / n2;
            t1.setText(Integer.toString(res));
        }
        else{
            t1.setText("Divide by 0 error");
        }
    }

    public void onimageclick( View v ){
        Intent intent = new Intent( this, DisMsg.class );
        //EditText edittext = (EditText)findViewById(R.id.imgb);
        //String message = edittext.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message );
        startActivity(intent);
    }
}
