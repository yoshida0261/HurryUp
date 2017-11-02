package com.starcompany.hurryup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;


import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }



    @OnClick(R.id.buttonNum1)
    public void Button(Button button)
    {

       // anser.setText("test");
        Toast.makeText(this, "テスト", Toast.LENGTH_LONG).show();

    }

}
