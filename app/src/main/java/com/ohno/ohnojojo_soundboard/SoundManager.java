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
    private static SoundManager instance =null;

    private  SoundPool mSoundPool;
    //private  HashMap<Integer, Integer> mSoundPoolMap;
    private  SparseIntArray mSoundPoolMap;
    private  AudioManager  mAudioManager;
    private  Context mContext;

    // private constructor
    private SoundManager(Context theContext)
    {
        mContext = theContext;
        buildSoundPool();
        //mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        //mSoundPoolMap = new HashMap<Integer, Integer>();
        mSoundPoolMap = new SparseIntArray();
        mAudioManager = (AudioManager)mContext.getSystemService(Context.AUDIO_SERVICE);
    }

    public static SoundManager getInstance(Context theContext)
    {
        if(instance==null){
            instance=new SoundManager(theContext);
            instance.addSound(1, R.raw.sound1);
            instance.addSound(2, R.raw.sound2);
            instance.addSound(3, R.raw.sound3);
            instance.addSound(4, R.raw.sound4);
            instance.addSound(5, R.raw.sound5);
            instance.addSound(6, R.raw.sound6);
            instance.addSound(7, R.raw.sound7);
            instance.addSound(8, R.raw.sound8);
            instance.addSound(9, R.raw.sound9);
            instance.addSound(10, R.raw.sound10);
            instance.addSound(11, R.raw.sound11);
            instance.addSound(12, R.raw.sound12);
            instance.addSound(13, R.raw.sound13);
            instance.addSound(14, R.raw.sound14);
            instance.addSound(15, R.raw.sound15);
            instance.addSound(16, R.raw.sound16);
            instance.addSound(17, R.raw.sound17);
            instance.addSound(18, R.raw.sound18);
            instance.addSound(19, R.raw.sound19);
            instance.addSound(20, R.raw.sound20);
            instance.addSound(21, R.raw.sound21);
            instance.addSound(22, R.raw.sound22);
            instance.addSound(23, R.raw.sound23);
            instance.addSound(24, R.raw.sound24);
            instance.addSound(25, R.raw.sound25);
            instance.addSound(26, R.raw.sound26);
            instance.addSound(27, R.raw.sound27);
            instance.addSound(28, R.raw.sound28);
        }
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



    public void initSounds()
    {
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
