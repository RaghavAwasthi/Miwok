package com.rvai.miwok;

/**
 * Created by Raghav Awasthi on 23-02-2018.
 */

public class Word {


    private String mDefaultTranslation;


    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}

