package com.example.android.miwok;

/**
 * A simple object that takes two String objects and allows another method to call them.
 */
public class Word {
    private  String mMiwokTranslation, mDefaultTranslation;
    private int mImageResourceID;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceID = mImageResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }
}
