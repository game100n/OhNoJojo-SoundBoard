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
public class SoundManager {

    private  SoundPool mSoundPool;
    //private  HashMap<Integer, Integer> mSoundPoolMap;
    private  SparseIntArray mSoundPoolMap;
    private  AudioManager  mAudioManager;
    private  Context mContext;


    public SoundManager()
    {

    }

    @SuppressWarnings("deprecation")
    private SoundPool buildSoundPool() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();

            mSoundPool = new SoundPool.Builder()
                    .setMaxStreams(25)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else {
            mSoundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        }
        return mSoundPool;
    }



    public void initSounds(Context theContext) {
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

    public void playSound(int index) {

        int streamVolume = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mSoundPool.play(mSoundPoolMap.get(index), streamVolume, streamVolume, 1, 0, 1f);
    }
}
