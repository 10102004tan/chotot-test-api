package com.example.findworktestapi.Datamodels;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class JobList {
    @SerializedName("ads")
    private ArrayList<Job> jobs;

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

    public JobList(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }
}
