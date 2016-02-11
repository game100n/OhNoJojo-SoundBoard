package com.soundboard.joseph;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SoundBoard extends Activity
{

    private SoundManager mSoundManager;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_soundboard);

        mSoundManager = SoundManager.getInstance(getBaseContext());

        Button SoundButton1 = (Button) findViewById(R.id.sound1);
        SoundButton1.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(1);
            }
        });
        Button SoundButton2 = (Button) findViewById(R.id.sound2);
        SoundButton2.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(2);
            }
        });
        Button SoundButton3 = (Button) findViewById(R.id.sound3);
        SoundButton3.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(3);
            }
        });
        Button SoundButton4 = (Button) findViewById(R.id.sound4);
        SoundButton4.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(4);
            }
        });
        Button SoundButton5 = (Button) findViewById(R.id.sound5);
        SoundButton5.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(5);
            }
        });
        Button SoundButton6 = (Button) findViewById(R.id.sound6);
        SoundButton6.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(6);
            }
        });
        Button SoundButton7 = (Button) findViewById(R.id.sound7);
        SoundButton7.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(7);
            }
        });
        Button SoundButton8 = (Button) findViewById(R.id.sound8);
        SoundButton8.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(8);
            }
        });
        Button SoundButton9 = (Button) findViewById(R.id.sound9);
        SoundButton9.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(9);
            }
        });
        Button SoundButton10 = (Button) findViewById(R.id.sound10);
        SoundButton10.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(10);
            }
        });
        Button SoundButton11 = (Button) findViewById(R.id.sound11);
        SoundButton11.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(11);
            }
        });
        Button SoundButton12 = (Button) findViewById(R.id.sound12);
        SoundButton12.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(12);
            }
        });
        Button SoundButton13 = (Button) findViewById(R.id.sound13);
        SoundButton13.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(13);
            }
        });
        Button SoundButton14 = (Button) findViewById(R.id.sound14);
        SoundButton14.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(14);
            }
        });
        Button SoundButton15 = (Button) findViewById(R.id.sound15);
        SoundButton15.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(15);
            }
        });
        Button SoundButton16 = (Button) findViewById(R.id.sound16);
        SoundButton16.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(16);
            }
        });
        Button SoundButton17 = (Button) findViewById(R.id.sound17);
        SoundButton17.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(17);
            }
        });
        Button SoundButton18 = (Button) findViewById(R.id.sound18);
        SoundButton18.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(18);
            }
        });
        Button SoundButton19 = (Button) findViewById(R.id.sound19);
        SoundButton19.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(19);
            }
        });
        Button SoundButton20 = (Button) findViewById(R.id.sound20);
        SoundButton20.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(20);
            }
        });
        Button SoundButton21 = (Button) findViewById(R.id.sound21);
        SoundButton21.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(21);
            }
        });
        Button SoundButton22 = (Button) findViewById(R.id.sound22);
        SoundButton22.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(22);
            }
        });
        Button SoundButton23 = (Button) findViewById(R.id.sound23);
        SoundButton23.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(23);
            }
        });
        Button SoundButton24 = (Button) findViewById(R.id.sound24);
        SoundButton24.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(24);
            }
        });
        Button SoundButton25 = (Button) findViewById(R.id.sound25);
        SoundButton25.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(25);
            }
        });
        Button SoundButton26 = (Button) findViewById(R.id.sound26);
        SoundButton26.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(26);
            }
        });
        Button SoundButton27 = (Button) findViewById(R.id.sound27);
        SoundButton27.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(27);
            }
        });
        Button SoundButton28 = (Button) findViewById(R.id.sound28);
        SoundButton28.setOnClickListener(new OnClickListener()
        {

            public void onClick(View v)
            {
                mSoundManager.playSound(28);
            }
        });

    }

}
