package com.mi.hz.hzretrofit;

/**
 * Created by mi on 17-4-8.
 */

import com.mi.hz.hzretrofit.model.BaseModel;
import com.mi.hz.hzretrofit.model.Benefit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public  interface Api {
    @GET("api/data/{type}/{pageCount}/{pageIndex}")
    Call<BaseModel<ArrayList<Benefit>>> defaultBenefits(
            @Path("type") String type,
            @Path("pageCount") int pageCount,
            @Path("pageIndex") int pageIndex
    );

//    @GET("api/data/福利/{pageCount}/{pageIndex}")
//    Observable<BaseModel<ArrayList<Benefit>>> rxBenefits(
//            @Path("pageCount") int pageCount,
//            @Path("pageIndex") int pageIndex
//    );
}
