package com.project.relnfo.namaz;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(2018,8,1,19,44);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(2018,8,1,1,44);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(2018,8,1,7,44);
        Calendar calendar4 = Calendar.getInstance();
        calendar4.set(2018,8,1,3,44);
        Calendar calendar5 = Calendar.getInstance();
        calendar5.set(2018,8,1,22,44);
        Calendar calendar6 = Calendar.getInstance();
        calendar6.set(2018,8,1,3,44);
   //     calendar.add(Calendar.HOUR,-2);

        MyVectorClock vectorAnalogClock1 = findViewById(R.id.clock1);
        MyVectorClock vectorAnalogClock2= findViewById(R.id.clock2);
        MyVectorClock vectorAnalogClock3 = findViewById(R.id.clock3);
        MyVectorClock vectorAnalogClock4 = findViewById(R.id.clock4);
        MyVectorClock vectorAnalogClock5 = findViewById(R.id.clock5);
        MyVectorClock vectorAnalogClock6= findViewById(R.id.clock6);
      //  MyVectorClock vectorAnalogClock2 = findViewById(R.id.clock2);

       // Log.e("wahab", "onCreate: "+vectorAnalogClock.getMeasuredWidth() );

        //customization
        clockSetting(calendar1, vectorAnalogClock1,Color.GREEN);
        clockSetting(calendar2, vectorAnalogClock2, Color.BLACK);
        clockSetting(calendar3, vectorAnalogClock3, Color.YELLOW);
        clockSetting(calendar4, vectorAnalogClock4, Color.CYAN);
        clockSetting(calendar5, vectorAnalogClock5, Color.MAGENTA);
        clockSetting(calendar6, vectorAnalogClock6, Color.GREEN);

//        vectorAnalogClock2.setCalendar(calendar)
//                .setDiameterInDp(200.0f)
//                .setOpacity(1.0f)
//                .setShowSeconds(true)
//                .setColor(Color.RED)
//        ;



    }

    private void clockSetting(Calendar calendar, MyVectorClock vectorAnalogClock, int color) {
        vectorAnalogClock.setCalendar(calendar)
                .setOpacity(1.0f)
                .setColor(color)
                .setShowSeconds(false);
    }
}
