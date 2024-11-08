package com.zara.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SwitchButton extends AppCompatActivity {

    Switch aSwitch;
    ImageView imageView;
    Button button20, radio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_button);

        aSwitch = findViewById(R.id.switchButton22);
        imageView = findViewById(R.id.imageView22);

        imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));

        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(aSwitch.isChecked()){
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_on));
                }else {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.light_off));
                }
            }
        });

        button20 = findViewById(R.id.button);
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SwitchButton.this, MainActivity.class));
            }
        });
    }
}