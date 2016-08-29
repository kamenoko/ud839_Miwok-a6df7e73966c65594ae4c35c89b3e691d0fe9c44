package com.example.android.miwok;

/**
 * A simple object that takes two String objects and allows another method to call them.
 */
public class Word {
    private final static int NO_IMAGE_PROVIDED = -1;
    private  String mMiwokTranslation, mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int audioResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId, int audioResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId = audioResourceId;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    public int getImageResourceID() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
