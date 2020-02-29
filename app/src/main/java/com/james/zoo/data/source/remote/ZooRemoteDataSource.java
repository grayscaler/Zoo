package com.james.zoo.data.source.remote;

import com.james.zoo.BuildConfig;
import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class ZooRemoteDataSource {

    private static ZooRemoteDataSource INSTANCE;

    private ZooRemoteDataSourceApi mApi;

    public static ZooRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ZooRemoteDataSource();
        }
        return INSTANCE;
    }

    private ZooRemoteDataSource() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(httpClient.build())
                .build();

        mApi = retrofit.create(ZooRemoteDataSourceApi.class);
    }

    public Observable<Area> rxGetAreas(Map<String, String> options) {
        return mApi.rxGetAreas(options);
    }

    public Observable<Plant> rxGetPlants(Map<String, String> options) {
        return mApi.rxGetPlants(options);
    }
}
