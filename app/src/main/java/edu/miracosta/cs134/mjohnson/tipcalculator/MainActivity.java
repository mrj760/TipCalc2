package edu.miracosta.cs134.mjohnson.tipcalculator;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final SeekBar seekBar = findViewById(R.id.seekBar);
        int seekMax = seekBar.getMax();

        TextView tipTV = findViewById(R.id.tip);
        TextView totalTV = findViewById(R.id.total);



        TextView amount = findViewById(R.id.amount);
        TextWatcher watcher = new TextWatcher() {

            boolean _ignore = false; // used to prevent infinite loop
            int percent = seekBar.getProgress();
            // double amount

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (_ignore) return; // false if we didn't change anything
                _ignore = true; // change to true
                // todo: change textViews here
                double tip;



                // TextView.setText()...
                _ignore = false; // release so TextListener can do its job again
            }
        };









    }

    private double getTip(int percent, double amount) {
        return (percent*amount/100);
    }
    private double getTotal (double tip, double amount) { return tip + amount; }



}
