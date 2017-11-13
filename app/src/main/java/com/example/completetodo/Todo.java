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

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public Todo() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
