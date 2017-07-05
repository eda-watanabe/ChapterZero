package jp.inc.eda.chapterzero_master;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_one).setOnClickListener(this);
        findViewById(R.id.btn_two).setOnClickListener(this);
        findViewById(R.id.btn_three).setOnClickListener(this);

        findViewById(R.id.btn_web_act_transition).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WebActivity.class));
            }
        });
    }

    @Override
    public void onClick(View v) {

        String s = "";
        switch (v.getId()) {
            case R.id.btn_one:
                s = "ONE";
                break;
            case R.id.btn_two:
                s = "TWO";
                break;
            case R.id.btn_three:
                s = "THREE";
                break;
        }
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
