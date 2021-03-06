package com.mi.hz.hzretrofit;

/**
 * Created by mi on 17-4-8.
 */

import android.database.Observable;

import com.mi.hz.hzretrofit.model.BaseModel;
import com.mi.hz.hzretrofit.model.Bean;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public  interface ApiService {
    @GET("api/data/{type}/{pageCount}/{pageIndex}")
    Call<BaseModel<ArrayList<Bean>>> ListBean(
            @Path("type") String type,
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );

    @GET("api/data/{type}/{pageCount}/{pageIndex}")
    Observable<BaseModel<ArrayList<Bean>>> rxBenefits(
            @Path("type") String type,
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );
}
