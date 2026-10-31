package com.sleepingdogs.launcher;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.Gravity;
import android.graphics.Color;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(Color.rgb(15, 15, 20));

        TextView title = new TextView(this);
        title.setText("SLEEPING DOGS");
        title.setTextSize(32);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        Button play = new Button(this);
        play.setText("PLAY GAME");

        play.setOnClickListener(v -> {
            Intent intent = getPackageManager()
                .getLaunchIntentForPackage("com.winlator");
            if (intent != null) {
                startActivity(intent);
            }
        });

        layout.addView(title);
        layout.addView(play);

        setContentView(layout);
    }
}
