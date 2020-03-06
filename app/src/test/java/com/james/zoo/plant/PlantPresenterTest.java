package com.james.zoo.plant;

import com.google.gson.Gson;
import com.james.zoo.R;
import com.james.zoo.data.Plant;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import static org.junit.Assert.assertEquals;

public class PlantPresenterTest {

    @Mock
    private PlantContract.View mPlantView;

    private PlantPresenter mPlantPresenter;
    private Plant.ResultBean.ResultsBean mPlant;

    @Before
    public void setupPlantPresenter() {
        MockitoAnnotations.initMocks(this);

        mPlant = new Gson().fromJson(getPlantJson(), Plant.ResultBean.ResultsBean.class);

        mPlantPresenter = new PlantPresenter(mPlantView, mPlant);
    }

    @Test
    public void getPlantOrderedInfo() {
        try {
            Method getPlantOrderedInfo = mPlantPresenter.getClass().getDeclaredMethod("getPlantOrderedInfo", Plant.ResultBean.ResultsBean.class);
            getPlantOrderedInfo.setAccessible(true);
            Object[] argObjs1 = {mPlant};
            LinkedHashMap<Integer, String> linkedHashMap = (LinkedHashMap<Integer, String>) getPlantOrderedInfo.invoke(mPlantPresenter, argObjs1);
            assertEquals((int) linkedHashMap.keySet().iterator().next(), R.string.plant_name_ch);
            assertEquals(linkedHashMap.values().iterator().next(), mPlant.getF_Name_Ch());
            for (Integer id : linkedHashMap.keySet()) {
                System.out.println(id + " " + linkedHashMap.get(id));
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public String getPlantJson() {
        return "{\n" +
                "          \"F_Name_Latin\": \"Lagerstroemia subcostata\",\n" +
                "          \"F_pdf02_ALT\": \"\",\n" +
                "          \"F_Location\": \"臺灣動物區；蟲蟲探索谷；熱帶雨林區；鳥園；兩棲爬蟲動物館\",\n" +
                "          \"F_pdf01_ALT\": \"\",\n" +
                "          \"F_Summary\": \"\",\n" +
                "          \"F_Pic01_URL\": \"http://www.zoo.gov.tw/iTAP/04_Plant/Lythraceae/subcostata/subcostata_1.jpg\",\n" +
                "          \"F_pdf02_URL\": \"\",\n" +
                "          \"F_Pic02_URL\": \"\",\n" +
                "          \"F_Keywords\": \"\",\n" +
                "          \"F_Code\": \"\",\n" +
                "          \"F_Geo\": \"MULTIPOINT ((121.5804577 24.9979216),  (121.5805328 24.9959671),  (121.5836763 24.9957094),  (121.5894029 24.9951126),  (121.5899205 24.9945669))\",\n" +
                "          \"F_Pic03_URL\": \"\",\n" +
                "          \"F_Voice01_ALT\": \"\",\n" +
                "          \"F_AlsoKnown\": \"苞飯花、拘那花、小果紫薇、南紫薇、猴不爬、怕癢樹、南紫薇、九荊、馬鈴花、蚊仔花\",\n" +
                "          \"F_Voice02_ALT\": \"\",\n" +
                "          \"F_Name_Ch\": \"九芎\",\n" +
                "          \"F_Pic04_ALT\": \"\",\n" +
                "          \"F_Name_En\": \"Subcostate Crape Myrtle\",\n" +
                "          \"F_Brief\": \"分布於中低海拔森林及長江以南的地區，為台灣的原生樹種。主要生長在潮濕的崩塌地，有吸水保持土壤之特性，所以是良好的水土保持樹種。\",\n" +
                "          \"F_Pic04_URL\": \"\",\n" +
                "          \"F_Voice01_URL\": \"\",\n" +
                "          \"F_Feature\": \"紅褐色的樹皮剝落後呈灰白色，樹幹光滑堅硬。葉有極短的柄，長橢圓形或卵形，全綠，葉片兩端尖，秋冬轉紅。夏季6～8月開花，花冠白色，花數甚多而密生於枝端，花為圓錐花序頂生，花瓣有長柄，邊緣皺曲像衣裙的花邊花絲長短不一。果實為蒴果，橢圓形約6-8公厘，種子有翅。\",\n" +
                "          \"F_Pic02_ALT\": \"\",\n" +
                "          \"F_Family\": \"千屈菜科 Lythraceae\",\n" +
                "          \"F_Voice03_ALT\": \"\",\n" +
                "          \"F_Voice02_URL\": \"\",\n" +
                "          \"F_Pic03_ALT\": \"\",\n" +
                "          \"F_Pic01_ALT\": \"九芎果實\",\n" +
                "          \"F_CID\": \"\",\n" +
                "          \"F_pdf01_URL\": \"\",\n" +
                "          \"F_Vedio_URL\": \"\",\n" +
                "          \"F_Genus\": \"紫薇屬Lagerstroemia\",\n" +
                "          \"F_Function＆Application\": \"1. 優良薪炭材：木質堅硬耐燒，是臺灣優良的薪炭材之一。\\n2. 水土保持植栽：可栽植於河岸及邊坡供水土保持。\\n3. 農具用材：木質堅硬，乾燥後不太會反翹，是做農具的用材。\\n4. 食用性：花、根入藥，味淡微苦，敗毒散瘀，花蕾味苦有清香，可生食。葉子是長尾水青蛾幼蟲的食草。\",\n" +
                "          \"F_Voice03_URL\": \"\",\n" +
                "          \"F_Update\": \"2017/9/4\",\n" +
                "          \"_id\": 1\n" +
                "        } ";

    }
}