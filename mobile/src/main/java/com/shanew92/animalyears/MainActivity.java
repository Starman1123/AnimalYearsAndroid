package com.shanew92.animalyears;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {



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

    public void onRadioButtonClicked (View view) {
        RadioButton button = (RadioButton) findViewById(R.id.radioButton);
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton button3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton button4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton button5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton button6 = (RadioButton) findViewById(R.id.radioButton6);
        button.setChecked(false);
        button2.setChecked(false);
        button3.setChecked(false);
        button4.setChecked(false);
        button5.setChecked(false);
        button6.setChecked(false);
        switch (view.getId()) {
            case R.id.radioButton: button.setChecked(true);break;
            case R.id.radioButton2: button2.setChecked(true);break;
            case R.id.radioButton3: button3.setChecked(true);break;
            case R.id.radioButton4: button4.setChecked(true);break;
            case R.id.radioButton5: button5.setChecked(true);break;
            case R.id.radioButton6: button6.setChecked(true);break;
        }
    }

    public void onConvertButtonClicked (View view) {
        RadioButton button = (RadioButton) findViewById(R.id.radioButton);
        RadioButton button2 = (RadioButton) findViewById(R.id.radioButton2);
        RadioButton button3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton button4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton button5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton button6 = (RadioButton) findViewById(R.id.radioButton6);
        TextView res = (TextView) findViewById(R.id.resultTextView);

        double multiplier = 0;
        String str = "";
        EditText textField = (EditText) findViewById((R.id.editText));
        Double num = Double.parseDouble(textField.getEditableText().toString());

        if (button.isChecked()) {
            multiplier = 2;
            str = "bear";
        }
        else if (button2.isChecked()) {
            multiplier = 3.2;
            str = "cat";
        }
        else if (button3.isChecked()) {
            multiplier = 3.64;
            str = "dog";
        }
        else if (button4.isChecked()) {
            multiplier = 20;
            str = "hamster";
        }
        else if (button5.isChecked()) {
            multiplier = 1.78;
            str = "hippopotamus";
        }
        else if (button6.isChecked()) {
            multiplier = 8.89;
            str = "kagaroo";
        }

        String numX = String.valueOf(Math.round(num*multiplier));

        res.setText("Your age in "+str+" years is "+numX);
    }


}
