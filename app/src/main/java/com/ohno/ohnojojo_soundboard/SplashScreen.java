package com.ohno.ohnojojo_soundboard;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.ImageView;

/**
 * Created by game1_000 on 1/20/2016.
 */

public class SplashScreen extends Activity
{


    private class AsyncLoad extends AsyncTask<Integer, Integer, String>
    {
        /*
        @Override
        protected void onPreExecute()
        {
            Log.d("TAG", "onPreExecute");
            SoundManager.getInstance(getBaseContext());
        }
        */

        @Override
        protected String doInBackground(Integer... params)
        {
            Log.d("TAG", "doInBackground");
            SoundManager.getInstance(getBaseContext());
            return "Finished Loading Files";
        }

        @Override
        protected void onPostExecute(String result)
        {
            Log.d("TAG", "PostExecute");
            startActivity(new Intent(SplashScreen.this, SoundBoard.class));
            finish();
        }
    }


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

        new AsyncLoad().execute();


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
        /*
        new Handler().postDelayed(new Runnable()
        {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run()
            {

                //SoundManager.getInstance(getBaseContext());
                //Intent intent = new Intent(SplashScreen.this,SoundBoard.class);
                //startActivity(intent);

                // close this activity
                finish();
            }
        }, 3*1000); // wait for 3 seconds
        */

    }

    @Override
    protected void onPause()
    {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }
}
