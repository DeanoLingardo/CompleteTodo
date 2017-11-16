package com.example.completetodo;

import java.util.Date;
import java.util.UUID;

/**
 * Created by dean on 13/11/17.
 */

public class Todo {
    private UUID mId;
    private String mTitle;
    private String mDetail;
    private Date mDate;
    private boolean mIsComplete;
    

    public Todo() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmIsComplete(boolean mIsComplete) {
        this.mIsComplete = mIsComplete;
    }

    public String getTitle() {
        return mTitle;
    }

    public Date getDate() {
        return mDate;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setComplete(boolean complete) {
        this.mIsComplete = complete;
    }

    public UUID getId() {
        return mId;
    }
}
