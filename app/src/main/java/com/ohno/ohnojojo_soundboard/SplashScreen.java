package com.ohno.ohnojojo_soundboard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

/**
 * Created by game1_000 on 1/20/2016.
 */

public class SplashScreen extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);


        final ImageView animImageView = (ImageView) findViewById(R.id.LogoImage);
        animImageView.setBackgroundResource(R.drawable.anim);
        animImageView.post(new Runnable() {
            @Override
            public void run() {
                AnimationDrawable frameAnimation =
                        (AnimationDrawable) animImageView.getBackground();
                frameAnimation.start();
            }
        });


        //METHOD 1
        /*
        Thread timerThread = new Thread()
        {
            public void run()
            {
            try
            {
                sleep(4000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            finally
            {
                Intent intent = new Intent(SplashScreen.this,SoundBoard.class);
                startActivity(intent);
            }
            }
        };
        timerThread.start();
        */


        //METHOD 2

        new Handler().postDelayed(new Runnable()
        {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run()
            {
                /*
                SoundManager.getInstance().initSounds(getBaseContext());
                SoundManager.getInstance().addSound(1, R.raw.sound1);
                SoundManager.getInstance().addSound(2, R.raw.sound2);
                SoundManager.getInstance().addSound(3, R.raw.sound3);
                SoundManager.getInstance().addSound(4, R.raw.sound4);
                SoundManager.getInstance().addSound(5, R.raw.sound5);
                SoundManager.getInstance().addSound(6, R.raw.sound6);
                SoundManager.getInstance().addSound(7, R.raw.sound7);
                SoundManager.getInstance().addSound(8, R.raw.sound8);
                SoundManager.getInstance().addSound(9, R.raw.sound9);
                SoundManager.getInstance().addSound(10, R.raw.sound10);
                SoundManager.getInstance().addSound(11, R.raw.sound11);
                SoundManager.getInstance().addSound(12, R.raw.sound12);
                SoundManager.getInstance().addSound(13, R.raw.sound13);
                SoundManager.getInstance().addSound(14, R.raw.sound14);
                SoundManager.getInstance().addSound(15, R.raw.sound15);
                SoundManager.getInstance().addSound(16, R.raw.sound16);
                SoundManager.getInstance().addSound(17, R.raw.sound17);
                SoundManager.getInstance().addSound(18, R.raw.sound18);
                SoundManager.getInstance().addSound(19, R.raw.sound19);
                SoundManager.getInstance().addSound(20, R.raw.sound20);
                SoundManager.getInstance().addSound(21, R.raw.sound21);
                SoundManager.getInstance().addSound(22, R.raw.sound22);
                SoundManager.getInstance().addSound(23, R.raw.sound23);
                SoundManager.getInstance().addSound(24, R.raw.sound24);
                SoundManager.getInstance().addSound(25, R.raw.sound25);
                SoundManager.getInstance().addSound(26, R.raw.sound26);
                SoundManager.getInstance().addSound(27, R.raw.sound27);
                SoundManager.getInstance().addSound(28, R.raw.sound28);
                */

                SoundManager.getInstance(getBaseContext());
                Intent intent = new Intent(SplashScreen.this,SoundBoard.class);
                startActivity(intent);

                // close this activity
                finish();
            }
        }, 3*1000); // wait for 3 seconds

    }

    @Override
    protected void onPause()
    {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
