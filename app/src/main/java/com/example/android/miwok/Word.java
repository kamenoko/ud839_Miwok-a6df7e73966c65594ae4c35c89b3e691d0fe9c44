package com.example.android.miwok;

/**
 * A simple object that takes two String objects and allows another method to call them.
 */
public class Word {
    private final static int NO_IMAGE_PROVIDED = -1;
    private  String mMiwokTranslation, mDefaultTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;

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

    public boolean hasImage() {
        return mImageResourceID != NO_IMAGE_PROVIDED;
    }
}
