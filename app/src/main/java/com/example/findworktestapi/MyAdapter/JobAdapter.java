package com.example.findworktestapi.MyAdapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.findworktestapi.Datamodels.Job;
import com.example.findworktestapi.databinding.JobViewholderBinding;
import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.MyViewHolder> {

    private ArrayList<Job> jobs;
    private Activity context;

    public JobAdapter(ArrayList<Job> jobs,Activity context) {
        this.jobs = jobs;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(JobViewholderBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Job job = jobs.get(position);
        holder.binding.txtSubject.setText(job.getSubject());
        holder.binding.txtAreaName.setText(job.getAreaName());
        holder.binding.txtCompanyName.setText(job.getCompanyName());
        holder.binding.txtPrice.setText(String.valueOf(job.getMinSalary()) + " - " + String.valueOf(job.getMaxSalary()) + "d/thang");
        holder.binding.txtDate.setText(job.getDate());
        Glide.with(context).load(job.getImage()).into(holder.binding.image);
    }

    @Override
    public int getItemCount() {
        return jobs.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        private JobViewholderBinding binding;
        public MyViewHolder(@NonNull JobViewholderBinding itemView) {
            super(itemView.getRoot());
            this.binding = itemView;
        }
    }
}
