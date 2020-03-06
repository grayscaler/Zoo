package com.james.zoo.plant;

import com.james.zoo.data.Plant;
import com.james.zoo.data.annotation.Title;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class PlantPresenter implements PlantContract.Presenter {

    private final PlantContract.View mView;
    private final Plant.ResultBean.ResultsBean mPlant;

    public PlantPresenter(PlantContract.View view, Plant.ResultBean.ResultsBean plant) {
        mView = view;
        mPlant = plant;

        mView.setPresenter(this);
    }

    @Override
    public void start() {
        mView.setView(mPlant.getF_Pic01_URL(), getPlantOrderedInfo(mPlant));
    }

    private LinkedHashMap<Integer, String> getPlantOrderedInfo(Plant.ResultBean.ResultsBean plant) {
        Field[] fields = Plant.ResultBean.ResultsBean.class.getDeclaredFields();

        int numberOfInfo = 0;
        for (Field f : fields) {
            if (f.getAnnotation(Title.class) != null) {
                numberOfInfo++;
            }
        }

        Arrays.sort(fields, new Comparator<Field>() {
            @Override
            public int compare(Field o1, Field o2) {
                Title or1 = o1.getAnnotation(Title.class);
                Title or2 = o2.getAnnotation(Title.class);
                // nulls last
                if (or1 != null && or2 != null) {
                    return or1.order() - or2.order();
                } else if (or1 != null && or2 == null) {
                    return -1;
                } else if (or1 == null && or2 != null) {
                    return 1;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        LinkedHashMap<Integer, String> plantInfos = new LinkedHashMap<>();

        for (int i = 0; i < numberOfInfo; i++) {
            try {
                Field field = plant.getClass().getDeclaredField(fields[i].getName());
                field.setAccessible(true);
                plantInfos.put(fields[i].getAnnotation(Title.class).title(), (String) field.get(plant));
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return plantInfos;
    }
}
