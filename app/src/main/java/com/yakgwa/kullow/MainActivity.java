package com.yakgwa.kullow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Unity */

        Button building = (Button)findViewById(R.id.building_button);
        building.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, yakgwa.BuildingRecognition.UnityPlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}