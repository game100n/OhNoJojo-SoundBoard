package com.ohno.ohnojojo_soundboard;

//import java.util.HashMap;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.util.SparseIntArray;

/**
 * Created by game1_000 on 1/5/2016.
 */
public class SoundManager
{
    private static volatile SoundManager instance = new SoundManager();

    private  SoundPool mSoundPool;
    //private  HashMap<Integer, Integer> mSoundPoolMap;
    private  SparseIntArray mSoundPoolMap;
    private  AudioManager  mAudioManager;
    private  Context mContext;

    // private constructor
    private SoundManager()
    {

    }

    public static SoundManager getInstance()
    {
        initSounds(getBaseContext());
        addSound(1, R.raw.sound1);
        SoundManager.addSound(2, R.raw.sound2);
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
        mSoundManager.addSound(28, R.raw.sound28);
        return instance;
    }


    /*
    public SoundManager()
    {

    }
    */

    @SuppressWarnings("deprecation")
    private SoundPool buildSoundPool()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            mSoundPool = new SoundPool.Builder()
                    .setMaxStreams(25)
                    .setAudioAttributes(audioAttributes)
                    .build();
        }
        else
        {
            mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }
        return mSoundPool;
    }



    public void initSounds(Context theContext)
    {
        mContext = theContext;
        buildSoundPool();
        //mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        //mSoundPoolMap = new HashMap<Integer, Integer>();
        mSoundPoolMap = new SparseIntArray();
        mAudioManager = (AudioManager)mContext.getSystemService(Context.AUDIO_SERVICE);
    }

    public void addSound(int Index,int SoundID)
    {
        mSoundPoolMap.put(Index, mSoundPool.load(mContext, SoundID, 1));

    }

    public void playSound(int index)
    {

        int streamVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume, 1, 0, 1f);
    }
}
