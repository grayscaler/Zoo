package com.james.zoo.data.source.remote;

import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ZooRemoteDataSourceApi {

    @GET("apiAccess")
    Observable<Area> rxGetAreas(@QueryMap Map<String, String> options);

    @GET("apiAccess")
    Observable<Plant> rxGetPlants(@QueryMap Map<String, String> options);
}
