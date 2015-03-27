package com.application.linkit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import actions.Compose;


public class MainActivity extends Activity {
 //Test Data


    /**
     * Beginning entry of class
     * @param savedInstanceState Bundle
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.application_name);
        tv.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left));

        //  setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,items));

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

    public void startEmail(View view)
    {


        Intent intent = new Intent(this, Compose.class);
            startActivity(intent);

    }

    public void getContactInput(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setView(R.layout.font_page);
        dialog.setMessage("Welcome to LinkIt");
        dialog.setTitle("LinkIt");


        dialog.show();


    }
}
