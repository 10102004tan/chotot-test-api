package com.example.findworktestapi.Datamodels;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JobApi {
    String BASE_URL="https://gateway.chotot.com/";

    @GET("v1/public/ad-listing?")
    Call<JobList> getJobs(@Query("limit") int limit,@Query("protection_entitlement") boolean protection_entitlement,
                                 @Query("page") int page, @Query("cg") int cg,@Query("region_v2") int region_v2,@Query("job_type") int job_type
                          ,@Query("st") String st, @Query("key_param_included") boolean key_param_included
                                 );
}
