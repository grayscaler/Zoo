package com.james.zoo.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Plant {

    /**
     * result : {"limit":1000,"offset":0,"count":51,"sort":"","results":[{"F_Name_Latin":"Lagerstroemia subcostata","F_pdf02_ALT":"","F_Location":"臺灣動物區；蟲蟲探索谷；熱帶雨林區；鳥園；兩棲爬蟲動物館","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Lythraceae/subcostata/subcostata_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216),  (121.5805328 24.9959671),  (121.5836763 24.9957094),  (121.5894029 24.9951126),  (121.5899205 24.9945669))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"苞飯花、拘那花、小果紫薇、南紫薇、猴不爬、怕癢樹、南紫薇、九荊、馬鈴花、蚊仔花","F_Voice02_ALT":"","F_Name_Ch":"九芎","F_Pic04_ALT":"","F_Name_En":"Subcostate Crape Myrtle","F_Brief":"分布於中低海拔森林及長江以南的地區，為台灣的原生樹種。主要生長在潮濕的崩塌地，有吸水保持土壤之特性，所以是良好的水土保持樹種。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"紅褐色的樹皮剝落後呈灰白色，樹幹光滑堅硬。葉有極短的柄，長橢圓形或卵形，全綠，葉片兩端尖，秋冬轉紅。夏季6～8月開花，花冠白色，花數甚多而密生於枝端，花為圓錐花序頂生，花瓣有長柄，邊緣皺曲像衣裙的花邊花絲長短不一。果實為蒴果，橢圓形約6-8公厘，種子有翅。","F_Pic02_ALT":"","F_Family":"千屈菜科 Lythraceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"九芎果實","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"紫薇屬Lagerstroemia","F_Function＆Application":"1. 優良薪炭材：木質堅硬耐燒，是臺灣優良的薪炭材之一。\n2. 水土保持植栽：可栽植於河岸及邊坡供水土保持。\n3. 農具用材：木質堅硬，乾燥後不太會反翹，是做農具的用材。\n4. 食用性：花、根入藥，味淡微苦，敗毒散瘀，花蕾味苦有清香，可生食。葉子是長尾水青蛾幼蟲的食草。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":1},{"F_Name_Latin":"Lagerstroemia speciosa","F_pdf02_ALT":"","F_Location":"臺灣動物區；蟲蟲探索谷；兒童動物區；熱帶雨林區；白手長臂猿島","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Lythraceae/speciosa/speciosa_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216),  (121.5805328 24.9959671),  (121.582185 24.9984662),  (121.5836763 24.9957094),  (121.5816861 24.9980966))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"爆炸樹、大果紫薇、大葉紫薇、洋紫薇、百日紅","F_Voice02_ALT":"","F_Name_Ch":"大花紫薇","F_Pic04_ALT":"","F_Name_En":"Queen lagerstroemia、Queen crape myrtle","F_Brief":"原產於澳洲、熱帶亞洲。生長快速，木材堅硬，耐腐力強，色紅而光亮，價值媲美柚木。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"落葉喬木，可高達25公尺，樹幹通直，樹皮光滑，呈片狀剝落。單葉對生，革質，葉呈長橢圓形，長度10~28公分，寬度5~12公分，脫落前會變紅。花朵直徑5~8公分，花瓣有6枚，長度2.5~3.5公分，接近圓形，邊緣呈不規則波浪狀，早上初開時呈紅色，傍晚轉為紫紅色。果實直徑約3.5公分，呈球形，分裂成6瓣，初生時呈綠色，成熟時轉褐色。種子扁平具有翅，有利隨風散播。","F_Pic02_ALT":"","F_Family":"千屈菜科Lythraceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"由數小朵花朵聚成一團甚為壯觀","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"紫薇屬Lagerstroemia","F_Function＆Application":"1. 園藝景觀植栽用：花大、美麗，開花時，花團錦簇，甚為壯觀。秋季滿樹金黃的葉子，常栽培於庭園供觀賞或作行道樹用。\n2. 木材用途：木材堅硬，耐腐力強，色紅而亮，在原產地常被用於家具、舟車、橋樑、電杆、枕木及建築，也作水中用材。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":3},{"F_Name_Latin":"Deutzia pulchra","F_pdf02_ALT":"","F_Location":"臺灣動物區；熱帶雨林區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Saxifragaceae/pulchra/pulchra_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216),  (121.5836763 24.9957094))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"白埔姜、常山、百祥花、大花溲疏、美麗溲疏","F_Voice02_ALT":"","F_Name_Ch":"大葉溲疏","F_Pic04_ALT":"","F_Name_En":"Evergreen deutzia","F_Brief":"分布於菲律賓呂宋島北部及臺灣，在臺灣主要分布於中高海拔山區，蘭嶼也有。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"可為灌木或小喬木。葉呈卵形至長橢圓形，質地如皮革，雙面皆有星狀鱗片貼伏，上表面呈暗綠色，下表面則呈淡綠色。花穗可長達15公分，花軸多毛，花朵眾多，花瓣長度12公厘，寬度3公厘，呈白色披針形，雄蕊與花瓣大致等長。","F_Pic02_ALT":"","F_Family":"虎耳草科Saxifragaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"花開後有淡香深受人們喜愛","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"溲疏屬Deutzia","F_Function＆Application":"1.園藝用途：花潔白、有淡香味，可作庭植添景樹，花、果枝則供作花材。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":4},{"F_Name_Latin":"Alpinia intermedia","F_pdf02_ALT":"","F_Location":"臺灣動物區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Zingiberaceae/intermedia/intermedia_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Zingiberaceae/intermedia/intermedia_2.jpg","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"中位月桃、山月桃仔、紅三七、七葉蓮、小月桃","F_Voice02_ALT":"","F_Name_Ch":"山月桃","F_Pic04_ALT":"","F_Name_En":"Small shellflower","F_Brief":"分布於菲律賓、琉球、日本及臺灣，在臺灣分布於海拔300~1000公尺森林底層。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"草本植物，植株高度1公尺，終年常綠。葉長25~30公分，寬6~8公分，兩面光滑，邊緣多毛。花穗直立，花軸柔軟，長10~20公分，花穗每條分支開3~4朵花，每朵花有3片花瓣。果實呈球形，橘紅色，表面光滑。","F_Pic02_ALT":"雪白的花穗中帶著粉紅色格外漂亮","F_Family":"薑科Zingiberaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"莖葉叢生","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"月桃屬Alpinia","F_Function＆Application":"1. 莖葉有韌性，可做繩索。\n2. 花果美觀，可作庭園景觀植物。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":9},{"F_Name_Latin":"Hibiscus taiwanensis","F_pdf02_ALT":"","F_Location":"臺灣動物區；蟲蟲探索谷；溫帶動物區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Malvaceae/taiwanensis/taiwanensis_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216), (121.5805328 24.9959671), (121.5902638 24.9927776))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"臺灣芙蓉、狗頭芙蓉、三醉芙蓉、酸芙蓉、臺灣山芙蓉、千面美人、千面女娘、拒霜花","F_Voice02_ALT":"","F_Name_Ch":"山芙蓉","F_Pic04_ALT":"","F_Name_En":"Taiwan?cotton-rose","F_Brief":"臺灣特有種，分布海拔上限2000公尺。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"灌木，葉柄及花梗有少許短毛。葉長7~9公分，質感類似紙張，呈廣卵形，有3~7裂片，但也有部份葉片並未分裂，葉柄長達10~16公分，表面多毛。花朵直徑6~9公分，形狀類似鈴鐺，單生，開在葉柄與莖的接合處，花瓣寬度4~5公分，接近圓形，表面多毛。果實直徑3.5公分，表面多毛。","F_Pic02_ALT":"","F_Family":"錦葵科Malvaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"花朵的形狀乍看下如同芙蓉一般","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"木槿屬Hibiscus","F_Function＆Application":"1. 庭園觀賞用：清晨花朵綻放時是白色或粉紅色，到了午後至傍晚凋落前，則轉為紫紅色或粉紅色。\n2. 食用：花可食用，沙拉、炒食或油炸均可。\n3. 木屐、繩索：木材色白質輕軟，主幹粗大可供製木屐；樹皮含纖維，在野外求生或露宿時，可替代繩索用。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":10},{"F_Name_Latin":"Hypericum subalatum","F_pdf02_ALT":"","F_Location":"臺灣動物區；熱帶雨林區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Guttiferae/subalatum/subalatum_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216), (121.5836763 24.9957094))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"絲海棠、土連翹、小汗淋草、小過路黃、小對月草、貫葉連翹、小對葉草、聖約翰草","F_Voice02_ALT":"","F_Name_Ch":"方莖金絲桃","F_Pic04_ALT":"","F_Name_En":"Four-angled Stem","F_Brief":"臺灣特有種，分布於海拔400~900公尺的石灰岩裂縫，如新北市新店、宜蘭龜山島及花蓮縣。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"灌木，莖呈方形。葉片沒有葉柄，長2~7公分，寬0.5~1.5公分，呈長橢圓形，上表面具有明顯的灰白色油腺點。枝條末端通常開1~3朵花，葉柄與莖的接合處偶爾會開多達12朵花，花朵直徑2.5公分，花瓣長1~1.2公分，寬6~7公厘，呈黃色；雄蕊具有琥珀色腺體，每朵花有5束雄蕊，每束有15枚雄蕊，共有75枚。果實長7~9公厘，寬3~4公厘，形狀類似狹長的雞蛋或圓柱體。","F_Pic02_ALT":"","F_Family":"金絲桃科Guttiferae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"盛開的金絲桃花朵相當搶眼","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"金絲桃屬Hypericum","F_Function＆Application":"1. 觀賞用：花朵於四~五月盛開。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":12},{"F_Name_Latin":"Pongamia pinnata","F_pdf02_ALT":"","F_Location":"臺灣動物區；蕨園；兒童動物區；熱帶雨林區；澳洲動物區；非洲動物區；門內外廣場","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Papilionaceae/pinnata/pinnata_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Papilionaceae/pinnata/pinnata_2.jpg","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216), (121.5808258 24.9981769), (121.582185 24.9984662), (121.5836763 24.9957094), (121.5855083 24.9944599), (121.5867072 24.9945377), (121.5811899 24.9986995))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"九重吹、水流豆、臭腥仔、鳥樹、重吹舅、掛錢樹、野豆","F_Voice02_ALT":"","F_Name_Ch":"水黃皮","F_Pic04_ALT":"","F_Name_En":"Poonga-oil tree、Poongaoil、Poongaoil pongamia、Pongam oiltree、Pongamia","F_Brief":"分布於印度、馬來西亞、中國南部、琉球群島至澳洲北部。在臺灣主要分布於南部濱海。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"半落葉中型喬木。整片葉長30公分，寬20公分，分出5~7片小葉，小葉數量通常為奇數，長度6~10公分，寬度3~5公分，呈卵形或長橢圓形，質感類似薄皮革，雙面光滑無毛，邊緣呈波浪狀。花穗長在葉柄與莖的接合處，花朵呈淡紫色。果莢長度4~7公分，寬度2.5~3公分，呈扁平鐮刀狀，質感等同木材，不會開裂，內僅含1顆種子，少有2顆。","F_Pic02_ALT":"扁平鐮刀狀的果實","F_Family":"蝶形花科Papilionaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"樹冠茂密可遮蔭乘涼","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"水黃皮屬Pongamia","F_Function＆Application":"1. 優良水土保持樹種：其生長快速，生性強健，樹冠傘形，枝葉濃密，抗風、耐乾旱，適合種為海岸護堤、防風林使用。 \n2. 園藝景觀用：樹姿優美，其淡紫色花多成串密生，頗具觀賞價值，為行道樹和公園、庭園景觀樹種。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":18}]}
     */

    private ResultBean result;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * limit : 1000
         * offset : 0
         * count : 51
         * sort :
         * results : [{"F_Name_Latin":"Lagerstroemia subcostata","F_pdf02_ALT":"","F_Location":"臺灣動物區；蟲蟲探索谷；熱帶雨林區；鳥園；兩棲爬蟲動物館","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Lythraceae/subcostata/subcostata_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216),  (121.5805328 24.9959671),  (121.5836763 24.9957094),  (121.5894029 24.9951126),  (121.5899205 24.9945669))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"苞飯花、拘那花、小果紫薇、南紫薇、猴不爬、怕癢樹、南紫薇、九荊、馬鈴花、蚊仔花","F_Voice02_ALT":"","F_Name_Ch":"九芎","F_Pic04_ALT":"","F_Name_En":"Subcostate Crape Myrtle","F_Brief":"分布於中低海拔森林及長江以南的地區，為台灣的原生樹種。主要生長在潮濕的崩塌地，有吸水保持土壤之特性，所以是良好的水土保持樹種。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"紅褐色的樹皮剝落後呈灰白色，樹幹光滑堅硬。葉有極短的柄，長橢圓形或卵形，全綠，葉片兩端尖，秋冬轉紅。夏季6～8月開花，花冠白色，花數甚多而密生於枝端，花為圓錐花序頂生，花瓣有長柄，邊緣皺曲像衣裙的花邊花絲長短不一。果實為蒴果，橢圓形約6-8公厘，種子有翅。","F_Pic02_ALT":"","F_Family":"千屈菜科 Lythraceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"九芎果實","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"紫薇屬Lagerstroemia","F_Function＆Application":"1. 優良薪炭材：木質堅硬耐燒，是臺灣優良的薪炭材之一。\n2. 水土保持植栽：可栽植於河岸及邊坡供水土保持。\n3. 農具用材：木質堅硬，乾燥後不太會反翹，是做農具的用材。\n4. 食用性：花、根入藥，味淡微苦，敗毒散瘀，花蕾味苦有清香，可生食。葉子是長尾水青蛾幼蟲的食草。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":1},{"F_Name_Latin":"Lagerstroemia speciosa","F_pdf02_ALT":"","F_Location":"臺灣動物區；蟲蟲探索谷；兒童動物區；熱帶雨林區；白手長臂猿島","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Lythraceae/speciosa/speciosa_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216),  (121.5805328 24.9959671),  (121.582185 24.9984662),  (121.5836763 24.9957094),  (121.5816861 24.9980966))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"爆炸樹、大果紫薇、大葉紫薇、洋紫薇、百日紅","F_Voice02_ALT":"","F_Name_Ch":"大花紫薇","F_Pic04_ALT":"","F_Name_En":"Queen lagerstroemia、Queen crape myrtle","F_Brief":"原產於澳洲、熱帶亞洲。生長快速，木材堅硬，耐腐力強，色紅而光亮，價值媲美柚木。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"落葉喬木，可高達25公尺，樹幹通直，樹皮光滑，呈片狀剝落。單葉對生，革質，葉呈長橢圓形，長度10~28公分，寬度5~12公分，脫落前會變紅。花朵直徑5~8公分，花瓣有6枚，長度2.5~3.5公分，接近圓形，邊緣呈不規則波浪狀，早上初開時呈紅色，傍晚轉為紫紅色。果實直徑約3.5公分，呈球形，分裂成6瓣，初生時呈綠色，成熟時轉褐色。種子扁平具有翅，有利隨風散播。","F_Pic02_ALT":"","F_Family":"千屈菜科Lythraceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"由數小朵花朵聚成一團甚為壯觀","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"紫薇屬Lagerstroemia","F_Function＆Application":"1. 園藝景觀植栽用：花大、美麗，開花時，花團錦簇，甚為壯觀。秋季滿樹金黃的葉子，常栽培於庭園供觀賞或作行道樹用。\n2. 木材用途：木材堅硬，耐腐力強，色紅而亮，在原產地常被用於家具、舟車、橋樑、電杆、枕木及建築，也作水中用材。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":3},{"F_Name_Latin":"Deutzia pulchra","F_pdf02_ALT":"","F_Location":"臺灣動物區；熱帶雨林區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Saxifragaceae/pulchra/pulchra_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216),  (121.5836763 24.9957094))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"白埔姜、常山、百祥花、大花溲疏、美麗溲疏","F_Voice02_ALT":"","F_Name_Ch":"大葉溲疏","F_Pic04_ALT":"","F_Name_En":"Evergreen deutzia","F_Brief":"分布於菲律賓呂宋島北部及臺灣，在臺灣主要分布於中高海拔山區，蘭嶼也有。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"可為灌木或小喬木。葉呈卵形至長橢圓形，質地如皮革，雙面皆有星狀鱗片貼伏，上表面呈暗綠色，下表面則呈淡綠色。花穗可長達15公分，花軸多毛，花朵眾多，花瓣長度12公厘，寬度3公厘，呈白色披針形，雄蕊與花瓣大致等長。","F_Pic02_ALT":"","F_Family":"虎耳草科Saxifragaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"花開後有淡香深受人們喜愛","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"溲疏屬Deutzia","F_Function＆Application":"1.園藝用途：花潔白、有淡香味，可作庭植添景樹，花、果枝則供作花材。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":4},{"F_Name_Latin":"Alpinia intermedia","F_pdf02_ALT":"","F_Location":"臺灣動物區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Zingiberaceae/intermedia/intermedia_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Zingiberaceae/intermedia/intermedia_2.jpg","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"中位月桃、山月桃仔、紅三七、七葉蓮、小月桃","F_Voice02_ALT":"","F_Name_Ch":"山月桃","F_Pic04_ALT":"","F_Name_En":"Small shellflower","F_Brief":"分布於菲律賓、琉球、日本及臺灣，在臺灣分布於海拔300~1000公尺森林底層。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"草本植物，植株高度1公尺，終年常綠。葉長25~30公分，寬6~8公分，兩面光滑，邊緣多毛。花穗直立，花軸柔軟，長10~20公分，花穗每條分支開3~4朵花，每朵花有3片花瓣。果實呈球形，橘紅色，表面光滑。","F_Pic02_ALT":"雪白的花穗中帶著粉紅色格外漂亮","F_Family":"薑科Zingiberaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"莖葉叢生","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"月桃屬Alpinia","F_Function＆Application":"1. 莖葉有韌性，可做繩索。\n2. 花果美觀，可作庭園景觀植物。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":9},{"F_Name_Latin":"Hibiscus taiwanensis","F_pdf02_ALT":"","F_Location":"臺灣動物區；蟲蟲探索谷；溫帶動物區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Malvaceae/taiwanensis/taiwanensis_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216), (121.5805328 24.9959671), (121.5902638 24.9927776))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"臺灣芙蓉、狗頭芙蓉、三醉芙蓉、酸芙蓉、臺灣山芙蓉、千面美人、千面女娘、拒霜花","F_Voice02_ALT":"","F_Name_Ch":"山芙蓉","F_Pic04_ALT":"","F_Name_En":"Taiwan?cotton-rose","F_Brief":"臺灣特有種，分布海拔上限2000公尺。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"灌木，葉柄及花梗有少許短毛。葉長7~9公分，質感類似紙張，呈廣卵形，有3~7裂片，但也有部份葉片並未分裂，葉柄長達10~16公分，表面多毛。花朵直徑6~9公分，形狀類似鈴鐺，單生，開在葉柄與莖的接合處，花瓣寬度4~5公分，接近圓形，表面多毛。果實直徑3.5公分，表面多毛。","F_Pic02_ALT":"","F_Family":"錦葵科Malvaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"花朵的形狀乍看下如同芙蓉一般","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"木槿屬Hibiscus","F_Function＆Application":"1. 庭園觀賞用：清晨花朵綻放時是白色或粉紅色，到了午後至傍晚凋落前，則轉為紫紅色或粉紅色。\n2. 食用：花可食用，沙拉、炒食或油炸均可。\n3. 木屐、繩索：木材色白質輕軟，主幹粗大可供製木屐；樹皮含纖維，在野外求生或露宿時，可替代繩索用。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":10},{"F_Name_Latin":"Hypericum subalatum","F_pdf02_ALT":"","F_Location":"臺灣動物區；熱帶雨林區","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Guttiferae/subalatum/subalatum_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216), (121.5836763 24.9957094))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"絲海棠、土連翹、小汗淋草、小過路黃、小對月草、貫葉連翹、小對葉草、聖約翰草","F_Voice02_ALT":"","F_Name_Ch":"方莖金絲桃","F_Pic04_ALT":"","F_Name_En":"Four-angled Stem","F_Brief":"臺灣特有種，分布於海拔400~900公尺的石灰岩裂縫，如新北市新店、宜蘭龜山島及花蓮縣。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"灌木，莖呈方形。葉片沒有葉柄，長2~7公分，寬0.5~1.5公分，呈長橢圓形，上表面具有明顯的灰白色油腺點。枝條末端通常開1~3朵花，葉柄與莖的接合處偶爾會開多達12朵花，花朵直徑2.5公分，花瓣長1~1.2公分，寬6~7公厘，呈黃色；雄蕊具有琥珀色腺體，每朵花有5束雄蕊，每束有15枚雄蕊，共有75枚。果實長7~9公厘，寬3~4公厘，形狀類似狹長的雞蛋或圓柱體。","F_Pic02_ALT":"","F_Family":"金絲桃科Guttiferae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"盛開的金絲桃花朵相當搶眼","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"金絲桃屬Hypericum","F_Function＆Application":"1. 觀賞用：花朵於四~五月盛開。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":12},{"F_Name_Latin":"Pongamia pinnata","F_pdf02_ALT":"","F_Location":"臺灣動物區；蕨園；兒童動物區；熱帶雨林區；澳洲動物區；非洲動物區；門內外廣場","F_pdf01_ALT":"","rank":0.0573088,"F_Summary":"","F_Pic01_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Papilionaceae/pinnata/pinnata_1.jpg","_full_count":"51","F_pdf02_URL":"","F_Pic02_URL":"http://www.zoo.gov.tw/iTAP/04_Plant/Papilionaceae/pinnata/pinnata_2.jpg","F_Keywords":"","F_Code":"","F_Geo":"MULTIPOINT ((121.5804577 24.9979216), (121.5808258 24.9981769), (121.582185 24.9984662), (121.5836763 24.9957094), (121.5855083 24.9944599), (121.5867072 24.9945377), (121.5811899 24.9986995))","F_Pic03_URL":"","F_Voice01_ALT":"","F_AlsoKnown":"九重吹、水流豆、臭腥仔、鳥樹、重吹舅、掛錢樹、野豆","F_Voice02_ALT":"","F_Name_Ch":"水黃皮","F_Pic04_ALT":"","F_Name_En":"Poonga-oil tree、Poongaoil、Poongaoil pongamia、Pongam oiltree、Pongamia","F_Brief":"分布於印度、馬來西亞、中國南部、琉球群島至澳洲北部。在臺灣主要分布於南部濱海。","F_Pic04_URL":"","F_Voice01_URL":"","F_Feature":"半落葉中型喬木。整片葉長30公分，寬20公分，分出5~7片小葉，小葉數量通常為奇數，長度6~10公分，寬度3~5公分，呈卵形或長橢圓形，質感類似薄皮革，雙面光滑無毛，邊緣呈波浪狀。花穗長在葉柄與莖的接合處，花朵呈淡紫色。果莢長度4~7公分，寬度2.5~3公分，呈扁平鐮刀狀，質感等同木材，不會開裂，內僅含1顆種子，少有2顆。","F_Pic02_ALT":"扁平鐮刀狀的果實","F_Family":"蝶形花科Papilionaceae","F_Voice03_ALT":"","F_Voice02_URL":"","F_Pic03_ALT":"","F_Pic01_ALT":"樹冠茂密可遮蔭乘涼","F_CID":"","F_pdf01_URL":"","F_Vedio_URL":"","F_Genus":"水黃皮屬Pongamia","F_Function＆Application":"1. 優良水土保持樹種：其生長快速，生性強健，樹冠傘形，枝葉濃密，抗風、耐乾旱，適合種為海岸護堤、防風林使用。 \n2. 園藝景觀用：樹姿優美，其淡紫色花多成串密生，頗具觀賞價值，為行道樹和公園、庭園景觀樹種。","F_Voice03_URL":"","F_Update":"2017/9/4","_id":18}]
         */

        private int limit;
        private int offset;
        private int count;
        private String sort;
        private List<ResultsBean> results;

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getSort() {
            return sort;
        }

        public void setSort(String sort) {
            this.sort = sort;
        }

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }

        public static class ResultsBean implements Parcelable {
            /**
             * F_Name_Latin : Lagerstroemia subcostata
             * F_pdf02_ALT :
             * F_Location : 臺灣動物區；蟲蟲探索谷；熱帶雨林區；鳥園；兩棲爬蟲動物館
             * F_pdf01_ALT :
             * rank : 0.0573088
             * F_Summary :
             * F_Pic01_URL : http://www.zoo.gov.tw/iTAP/04_Plant/Lythraceae/subcostata/subcostata_1.jpg
             * _full_count : 51
             * F_pdf02_URL :
             * F_Pic02_URL :
             * F_Keywords :
             * F_Code :
             * F_Geo : MULTIPOINT ((121.5804577 24.9979216),  (121.5805328 24.9959671),  (121.5836763 24.9957094),  (121.5894029 24.9951126),  (121.5899205 24.9945669))
             * F_Pic03_URL :
             * F_Voice01_ALT :
             * F_AlsoKnown : 苞飯花、拘那花、小果紫薇、南紫薇、猴不爬、怕癢樹、南紫薇、九荊、馬鈴花、蚊仔花
             * F_Voice02_ALT :
             * F_Name_Ch : 九芎
             * F_Pic04_ALT :
             * F_Name_En : Subcostate Crape Myrtle
             * F_Brief : 分布於中低海拔森林及長江以南的地區，為台灣的原生樹種。主要生長在潮濕的崩塌地，有吸水保持土壤之特性，所以是良好的水土保持樹種。
             * F_Pic04_URL :
             * F_Voice01_URL :
             * F_Feature : 紅褐色的樹皮剝落後呈灰白色，樹幹光滑堅硬。葉有極短的柄，長橢圓形或卵形，全綠，葉片兩端尖，秋冬轉紅。夏季6～8月開花，花冠白色，花數甚多而密生於枝端，花為圓錐花序頂生，花瓣有長柄，邊緣皺曲像衣裙的花邊花絲長短不一。果實為蒴果，橢圓形約6-8公厘，種子有翅。
             * F_Pic02_ALT :
             * F_Family : 千屈菜科 Lythraceae
             * F_Voice03_ALT :
             * F_Voice02_URL :
             * F_Pic03_ALT :
             * F_Pic01_ALT : 九芎果實
             * F_CID :
             * F_pdf01_URL :
             * F_Vedio_URL :
             * F_Genus : 紫薇屬Lagerstroemia
             * F_Function＆Application : 1. 優良薪炭材：木質堅硬耐燒，是臺灣優良的薪炭材之一。
             * 2. 水土保持植栽：可栽植於河岸及邊坡供水土保持。
             * 3. 農具用材：木質堅硬，乾燥後不太會反翹，是做農具的用材。
             * 4. 食用性：花、根入藥，味淡微苦，敗毒散瘀，花蕾味苦有清香，可生食。葉子是長尾水青蛾幼蟲的食草。
             * F_Voice03_URL :
             * F_Update : 2017/9/4
             * _id : 1
             */

            private String F_Name_Latin;
            private String F_pdf02_ALT;
            private String F_Location;
            private String F_pdf01_ALT;
            private double rank;
            private String F_Summary;
            private String F_Pic01_URL;
            private String _full_count;
            private String F_pdf02_URL;
            private String F_Pic02_URL;
            private String F_Keywords;
            private String F_Code;
            private String F_Geo;
            private String F_Pic03_URL;
            private String F_Voice01_ALT;
            private String F_AlsoKnown;
            private String F_Voice02_ALT;
            private String F_Name_Ch;
            private String F_Pic04_ALT;
            private String F_Name_En;
            private String F_Brief;
            private String F_Pic04_URL;
            private String F_Voice01_URL;
            private String F_Feature;
            private String F_Pic02_ALT;
            private String F_Family;
            private String F_Voice03_ALT;
            private String F_Voice02_URL;
            private String F_Pic03_ALT;
            private String F_Pic01_ALT;
            private String F_CID;
            private String F_pdf01_URL;
            private String F_Vedio_URL;
            private String F_Genus;
            @SerializedName("F_Function＆Application")
            private String F_FunctionApplication;
            private String F_Voice03_URL;
            private String F_Update;
            private int _id;

            protected ResultsBean(Parcel in) {
                F_Name_Latin = in.readString();
                F_pdf02_ALT = in.readString();
                F_Location = in.readString();
                F_pdf01_ALT = in.readString();
                rank = in.readDouble();
                F_Summary = in.readString();
                F_Pic01_URL = in.readString();
                _full_count = in.readString();
                F_pdf02_URL = in.readString();
                F_Pic02_URL = in.readString();
                F_Keywords = in.readString();
                F_Code = in.readString();
                F_Geo = in.readString();
                F_Pic03_URL = in.readString();
                F_Voice01_ALT = in.readString();
                F_AlsoKnown = in.readString();
                F_Voice02_ALT = in.readString();
                F_Name_Ch = in.readString();
                F_Pic04_ALT = in.readString();
                F_Name_En = in.readString();
                F_Brief = in.readString();
                F_Pic04_URL = in.readString();
                F_Voice01_URL = in.readString();
                F_Feature = in.readString();
                F_Pic02_ALT = in.readString();
                F_Family = in.readString();
                F_Voice03_ALT = in.readString();
                F_Voice02_URL = in.readString();
                F_Pic03_ALT = in.readString();
                F_Pic01_ALT = in.readString();
                F_CID = in.readString();
                F_pdf01_URL = in.readString();
                F_Vedio_URL = in.readString();
                F_Genus = in.readString();
                F_FunctionApplication = in.readString();
                F_Voice03_URL = in.readString();
                F_Update = in.readString();
                _id = in.readInt();
            }

            public static final Creator<ResultsBean> CREATOR = new Creator<ResultsBean>() {
                @Override
                public ResultsBean createFromParcel(Parcel in) {
                    return new ResultsBean(in);
                }

                @Override
                public ResultsBean[] newArray(int size) {
                    return new ResultsBean[size];
                }
            };

            public String getF_Name_Latin() {
                return F_Name_Latin;
            }

            public void setF_Name_Latin(String F_Name_Latin) {
                this.F_Name_Latin = F_Name_Latin;
            }

            public String getF_pdf02_ALT() {
                return F_pdf02_ALT;
            }

            public void setF_pdf02_ALT(String F_pdf02_ALT) {
                this.F_pdf02_ALT = F_pdf02_ALT;
            }

            public String getF_Location() {
                return F_Location;
            }

            public void setF_Location(String F_Location) {
                this.F_Location = F_Location;
            }

            public String getF_pdf01_ALT() {
                return F_pdf01_ALT;
            }

            public void setF_pdf01_ALT(String F_pdf01_ALT) {
                this.F_pdf01_ALT = F_pdf01_ALT;
            }

            public double getRank() {
                return rank;
            }

            public void setRank(double rank) {
                this.rank = rank;
            }

            public String getF_Summary() {
                return F_Summary;
            }

            public void setF_Summary(String F_Summary) {
                this.F_Summary = F_Summary;
            }

            public String getF_Pic01_URL() {
                return F_Pic01_URL;
            }

            public void setF_Pic01_URL(String F_Pic01_URL) {
                this.F_Pic01_URL = F_Pic01_URL;
            }

            public String get_full_count() {
                return _full_count;
            }

            public void set_full_count(String _full_count) {
                this._full_count = _full_count;
            }

            public String getF_pdf02_URL() {
                return F_pdf02_URL;
            }

            public void setF_pdf02_URL(String F_pdf02_URL) {
                this.F_pdf02_URL = F_pdf02_URL;
            }

            public String getF_Pic02_URL() {
                return F_Pic02_URL;
            }

            public void setF_Pic02_URL(String F_Pic02_URL) {
                this.F_Pic02_URL = F_Pic02_URL;
            }

            public String getF_Keywords() {
                return F_Keywords;
            }

            public void setF_Keywords(String F_Keywords) {
                this.F_Keywords = F_Keywords;
            }

            public String getF_Code() {
                return F_Code;
            }

            public void setF_Code(String F_Code) {
                this.F_Code = F_Code;
            }

            public String getF_Geo() {
                return F_Geo;
            }

            public void setF_Geo(String F_Geo) {
                this.F_Geo = F_Geo;
            }

            public String getF_Pic03_URL() {
                return F_Pic03_URL;
            }

            public void setF_Pic03_URL(String F_Pic03_URL) {
                this.F_Pic03_URL = F_Pic03_URL;
            }

            public String getF_Voice01_ALT() {
                return F_Voice01_ALT;
            }

            public void setF_Voice01_ALT(String F_Voice01_ALT) {
                this.F_Voice01_ALT = F_Voice01_ALT;
            }

            public String getF_AlsoKnown() {
                return F_AlsoKnown;
            }

            public void setF_AlsoKnown(String F_AlsoKnown) {
                this.F_AlsoKnown = F_AlsoKnown;
            }

            public String getF_Voice02_ALT() {
                return F_Voice02_ALT;
            }

            public void setF_Voice02_ALT(String F_Voice02_ALT) {
                this.F_Voice02_ALT = F_Voice02_ALT;
            }

            public String getF_Name_Ch() {
                return F_Name_Ch;
            }

            public void setF_Name_Ch(String F_Name_Ch) {
                this.F_Name_Ch = F_Name_Ch;
            }

            public String getF_Pic04_ALT() {
                return F_Pic04_ALT;
            }

            public void setF_Pic04_ALT(String F_Pic04_ALT) {
                this.F_Pic04_ALT = F_Pic04_ALT;
            }

            public String getF_Name_En() {
                return F_Name_En;
            }

            public void setF_Name_En(String F_Name_En) {
                this.F_Name_En = F_Name_En;
            }

            public String getF_Brief() {
                return F_Brief;
            }

            public void setF_Brief(String F_Brief) {
                this.F_Brief = F_Brief;
            }

            public String getF_Pic04_URL() {
                return F_Pic04_URL;
            }

            public void setF_Pic04_URL(String F_Pic04_URL) {
                this.F_Pic04_URL = F_Pic04_URL;
            }

            public String getF_Voice01_URL() {
                return F_Voice01_URL;
            }

            public void setF_Voice01_URL(String F_Voice01_URL) {
                this.F_Voice01_URL = F_Voice01_URL;
            }

            public String getF_Feature() {
                return F_Feature;
            }

            public void setF_Feature(String F_Feature) {
                this.F_Feature = F_Feature;
            }

            public String getF_Pic02_ALT() {
                return F_Pic02_ALT;
            }

            public void setF_Pic02_ALT(String F_Pic02_ALT) {
                this.F_Pic02_ALT = F_Pic02_ALT;
            }

            public String getF_Family() {
                return F_Family;
            }

            public void setF_Family(String F_Family) {
                this.F_Family = F_Family;
            }

            public String getF_Voice03_ALT() {
                return F_Voice03_ALT;
            }

            public void setF_Voice03_ALT(String F_Voice03_ALT) {
                this.F_Voice03_ALT = F_Voice03_ALT;
            }

            public String getF_Voice02_URL() {
                return F_Voice02_URL;
            }

            public void setF_Voice02_URL(String F_Voice02_URL) {
                this.F_Voice02_URL = F_Voice02_URL;
            }

            public String getF_Pic03_ALT() {
                return F_Pic03_ALT;
            }

            public void setF_Pic03_ALT(String F_Pic03_ALT) {
                this.F_Pic03_ALT = F_Pic03_ALT;
            }

            public String getF_Pic01_ALT() {
                return F_Pic01_ALT;
            }

            public void setF_Pic01_ALT(String F_Pic01_ALT) {
                this.F_Pic01_ALT = F_Pic01_ALT;
            }

            public String getF_CID() {
                return F_CID;
            }

            public void setF_CID(String F_CID) {
                this.F_CID = F_CID;
            }

            public String getF_pdf01_URL() {
                return F_pdf01_URL;
            }

            public void setF_pdf01_URL(String F_pdf01_URL) {
                this.F_pdf01_URL = F_pdf01_URL;
            }

            public String getF_Vedio_URL() {
                return F_Vedio_URL;
            }

            public void setF_Vedio_URL(String F_Vedio_URL) {
                this.F_Vedio_URL = F_Vedio_URL;
            }

            public String getF_Genus() {
                return F_Genus;
            }

            public void setF_Genus(String F_Genus) {
                this.F_Genus = F_Genus;
            }

            public String getF_FunctionApplication() {
                return F_FunctionApplication;
            }

            public void setF_FunctionApplication(String f_FunctionApplication) {
                this.F_FunctionApplication = f_FunctionApplication;
            }

            public String getF_Voice03_URL() {
                return F_Voice03_URL;
            }

            public void setF_Voice03_URL(String F_Voice03_URL) {
                this.F_Voice03_URL = F_Voice03_URL;
            }

            public String getF_Update() {
                return F_Update;
            }

            public void setF_Update(String F_Update) {
                this.F_Update = F_Update;
            }

            public int get_id() {
                return _id;
            }

            public void set_id(int _id) {
                this._id = _id;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(F_Name_Latin);
                parcel.writeString(F_pdf02_ALT);
                parcel.writeString(F_Location);
                parcel.writeString(F_pdf01_ALT);
                parcel.writeDouble(rank);
                parcel.writeString(F_Summary);
                parcel.writeString(F_Pic01_URL);
                parcel.writeString(_full_count);
                parcel.writeString(F_pdf02_URL);
                parcel.writeString(F_Pic02_URL);
                parcel.writeString(F_Keywords);
                parcel.writeString(F_Code);
                parcel.writeString(F_Geo);
                parcel.writeString(F_Pic03_URL);
                parcel.writeString(F_Voice01_ALT);
                parcel.writeString(F_AlsoKnown);
                parcel.writeString(F_Voice02_ALT);
                parcel.writeString(F_Name_Ch);
                parcel.writeString(F_Pic04_ALT);
                parcel.writeString(F_Name_En);
                parcel.writeString(F_Brief);
                parcel.writeString(F_Pic04_URL);
                parcel.writeString(F_Voice01_URL);
                parcel.writeString(F_Feature);
                parcel.writeString(F_Pic02_ALT);
                parcel.writeString(F_Family);
                parcel.writeString(F_Voice03_ALT);
                parcel.writeString(F_Voice02_URL);
                parcel.writeString(F_Pic03_ALT);
                parcel.writeString(F_Pic01_ALT);
                parcel.writeString(F_CID);
                parcel.writeString(F_pdf01_URL);
                parcel.writeString(F_Vedio_URL);
                parcel.writeString(F_Genus);
                parcel.writeString(F_FunctionApplication);
                parcel.writeString(F_Voice03_URL);
                parcel.writeString(F_Update);
                parcel.writeInt(_id);
            }
        }
    }
}
