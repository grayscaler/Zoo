package com.james.zoo.data.source;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.james.zoo.data.Area;
import com.james.zoo.data.Plant;
import com.james.zoo.data.source.remote.ZooRemoteDataSource;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

import androidx.annotation.NonNull;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.plugins.RxJavaPlugins;

public class ZooRepositoryTest {

    private ZooRepository mZooRepository;

    @Before
    public void setupZooRepository() {
        mZooRepository = ZooRepository.getInstance(ZooRemoteDataSource.getInstance());
    }

    @BeforeClass
    public static void setUpRxSchedulers() {
        final Scheduler immediate = new Scheduler() {
            @Override
            public Disposable scheduleDirect(@NonNull Runnable run, long delay, @NonNull TimeUnit unit) {
                // this prevents StackOverflowErrors when scheduling with a delay
                return super.scheduleDirect(run, 0, unit);
            }

            @Override
            public Worker createWorker() {
                return new ExecutorScheduler.ExecutorWorker(new Executor() {
                    @Override
                    public void execute(Runnable runnable) {
                        runnable.run();
                    }
                });
            }
        };

        RxJavaPlugins.setInitIoSchedulerHandler(new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> scheduler) throws Exception {
                return immediate;
            }
        });
        RxJavaPlugins.setInitComputationSchedulerHandler(new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> scheduler) throws Exception {
                return immediate;
            }
        });
        RxJavaPlugins.setInitNewThreadSchedulerHandler(new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> scheduler) throws Exception {
                return immediate;
            }
        });
        RxJavaPlugins.setInitSingleSchedulerHandler(new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> scheduler) throws Exception {
                return immediate;
            }
        });
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> scheduler) throws Exception {
                return immediate;
            }
        });
    }

    @Test
    public void getAreasFromRemoteSource() {
        mZooRepository.getAreas(new ZooDataSource.GetAreasCallback() {
            @Override
            public void onAreaLoaded(List<Area.ResultBean.ResultsBean> areas) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                System.out.println(gson.toJson(areas));
            }

            @Override
            public void onDataNotAvailable(Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }

    @Test
    public void getPlantsFromRemoteSource() {
        mZooRepository.getPlants(new ZooDataSource.GetPlantsCallback() {
            @Override
            public void onAreaLoaded(List<Plant.ResultBean.ResultsBean> plants) {
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                System.out.println(gson.toJson(plants));
            }

            @Override
            public void onDataNotAvailable(Throwable throwable) {

            }
        }, "臺灣動物區");
    }
}