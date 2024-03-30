package com.example.findworktestapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.findworktestapi.Datamodels.Job;
import com.example.findworktestapi.Datamodels.JobApi;
import com.example.findworktestapi.Datamodels.JobList;
import com.example.findworktestapi.MyAdapter.JobAdapter;
import com.example.findworktestapi.databinding.MainContentLayoutBinding;
import com.example.findworktestapi.databinding.MainLayoutBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private MainLayoutBinding binding;
    private JobAdapter jobAdapter;
    private ArrayList<Job> jobs = new ArrayList<>();

    private JobApi jobApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MainLayoutBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        getJobs();
        jobAdapter = new JobAdapter(jobs,this);
        binding.listjob.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        binding.listjob.setAdapter(jobAdapter);
    }

    private void getJobs(){
        jobs.clear();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(JobApi.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        jobApi = retrofit.create(JobApi.class);

        /*
        limit=10
        &protection_entitlement=true
        &page=2
        &cg=13010
        &region_v2=13000
        &job_type=2
        &st=s,k&key_param_included=true
        */

        Call<JobList> call =jobApi.getJobs(200,true,2,13010,13000,2,"s,k",true);
        call.enqueue(new Callback<JobList>() {
            @Override
            public void onResponse(Call<JobList> call, Response<JobList> response) {
                if (response.isSuccessful()){
                    JobList jobList = response.body();
                    assert jobList != null;
                    jobs.addAll(jobList.getJobs());
                    jobAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<JobList> call, Throwable t) {
                Log.d("test",t.getMessage());
            }
        });

    }
}