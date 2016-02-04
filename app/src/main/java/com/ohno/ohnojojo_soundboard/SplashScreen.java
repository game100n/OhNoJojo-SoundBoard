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
                Intent intent = new Intent(SplashScreen.this,SoundBoard.class);
                startActivity(intent);

                SoundManager.getInstance().initSounds(getBaseContext());
                SoundManager.getInstance().addSound(1, R.raw.sound1);

                /*SoundManager mSoundManager;
                mSoundManager = SoundManager.getInstance();
                mSoundManager.initSounds(getBaseContext());
                mSoundManager.addSound(1, R.raw.sound1);
                mSoundManager.addSound(2, R.raw.sound2);
                mSoundManager.addSound(3, R.raw.sound3);
                mSoundManager.addSound(4, R.raw.sound4);
                mSoundManager.addSound(5, R.raw.sound5);
                mSoundManager.addSound(6, R.raw.sound6);
                mSoundManager.addSound(7, R.raw.sound7);
                mSoundManager.addSound(8, R.raw.sound8);
                mSoundManager.addSound(9, R.raw.sound9);
                mSoundManager.addSound(10, R.raw.sound10);
                mSoundManager.addSound(11, R.raw.sound11);
                mSoundManager.addSound(12, R.raw.sound12);
                mSoundManager.addSound(13, R.raw.sound13);
                mSoundManager.addSound(14, R.raw.sound14);
                mSoundManager.addSound(15, R.raw.sound15);
                mSoundManager.addSound(16, R.raw.sound16);
                mSoundManager.addSound(17, R.raw.sound17);
                mSoundManager.addSound(18, R.raw.sound18);
                mSoundManager.addSound(19, R.raw.sound19);
                mSoundManager.addSound(20, R.raw.sound20);
                mSoundManager.addSound(21, R.raw.sound21);
                mSoundManager.addSound(22, R.raw.sound22);
                mSoundManager.addSound(23, R.raw.sound23);
                mSoundManager.addSound(24, R.raw.sound24);
                mSoundManager.addSound(25, R.raw.sound25);
                mSoundManager.addSound(26, R.raw.sound26);
                mSoundManager.addSound(27, R.raw.sound27);
                mSoundManager.addSound(28, R.raw.sound28);*/

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
