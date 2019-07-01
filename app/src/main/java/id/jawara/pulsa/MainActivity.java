package id.jawara.pulsa;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton rdb1, rdb2,rdb3, rdb4, rdb5, rdb6, rdb7, rdb8;
    TextView txtwarna;
    Button btnexit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdb1 = (RadioButton) findViewById(R.id.rdb1);
        rdb2 = (RadioButton) findViewById(R.id.rdb2);
        rdb3 = (RadioButton) findViewById(R.id.rdb3);
        rdb4 = (RadioButton) findViewById(R.id.rdb4);
        rdb5 = (RadioButton) findViewById(R.id.rdb5);
        rdb6 = (RadioButton) findViewById(R.id.rdb6);
        rdb7 = (RadioButton) findViewById(R.id.rdb7);
        rdb8 = (RadioButton) findViewById(R.id.rdb8);
        txtwarna = (TextView) findViewById(R.id.txtwarna);
        btnexit = (Button) findViewById(R.id.btnexit);
        rdb1.setOnClickListener(this);
        rdb2.setOnClickListener(this);
        rdb3.setOnClickListener(this);
        rdb4.setOnClickListener(this);
        rdb5.setOnClickListener(this);
        rdb6.setOnClickListener(this);
        rdb7.setOnClickListener(this);
        rdb8.setOnClickListener(this);
        btnexit.setOnClickListener(this);

    }
    @Override
    public void onClick(View V) {
        if (V == btnexit){
            finish();
        } else if (V == rdb1) {
            txtwarna.setBackgroundResource(R.color.red);
        } else if (V == rdb2) {
            txtwarna.setBackgroundResource(R.color.green);
        } else if (V == rdb3) {
            txtwarna.setBackgroundResource(R.color.blue);
        } else if (V == rdb4) {
            txtwarna.setBackgroundResource(R.color.white);
        } else if (V == rdb5) {
            txtwarna.setBackgroundResource(R.color.yellow);
        } else if (V == rdb6) {
            txtwarna.setBackgroundResource(R.color.black);
        } else if (V == rdb7) {
            txtwarna.setBackgroundResource(R.color.pink);
        } else if (V == rdb8) {
            txtwarna.setBackgroundResource(R.color.cyan);
        }}}
