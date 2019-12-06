package com.example.ex5_7;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams bLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);

        bLayout.weight=1;

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.GREEN);
        setContentView(baseLayout,bLayout);

        LinearLayout baseLayout2 = new LinearLayout(this);
        baseLayout2.setOrientation(LinearLayout.HORIZONTAL);
        baseLayout2.setBackgroundColor(Color.BLUE);

        LinearLayout baseLayout3 = new LinearLayout(this);
        baseLayout3.setOrientation(LinearLayout.HORIZONTAL);
        baseLayout3.setBackgroundColor(Color.RED);

        LinearLayout baseLayout4 = new LinearLayout(this);
        baseLayout4.setOrientation(LinearLayout.VERTICAL);
        baseLayout4.setBackgroundColor(Color.GRAY);

        LinearLayout baseLayout5 = new LinearLayout(this);
        baseLayout5.setOrientation(LinearLayout.VERTICAL);
        baseLayout5.setBackgroundColor(Color.YELLOW);

        LinearLayout baseLayout6 = new LinearLayout(this);
        baseLayout6.setBackgroundColor(Color.LTGRAY);
        LinearLayout baseLayout7 = new LinearLayout(this);
        baseLayout7.setBackgroundColor(Color.BLACK);

        baseLayout.addView(baseLayout2,bLayout);
        baseLayout.addView(baseLayout3,bLayout);
        baseLayout2.addView(baseLayout4,bLayout);
        baseLayout2.addView(baseLayout5,bLayout);
        baseLayout5.addView(baseLayout6,bLayout);
        baseLayout5.addView(baseLayout7,bLayout);









    }
}





