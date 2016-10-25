package com.brainacad.lab2_17_6;

/**
 * Created by User on 20/10/2016.
 */
public class Storage {

    private int store;
    private boolean readyToSet = true;
    private boolean JobDone = false;

    public void setStore(int store) {
        this.store = store;
    }

    public int getStore() {
        return store;
    }

    public boolean isReadyToSet() {
        return readyToSet;
    }

    public void setReadyToSet(boolean readyToSet) {
        this.readyToSet = readyToSet;
    }

    public boolean isJobDone() {
        return JobDone;
    }

    public void setJobDone(boolean jobDone) {
        this.JobDone = jobDone;
    }
}
