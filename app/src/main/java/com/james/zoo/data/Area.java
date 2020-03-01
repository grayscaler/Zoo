package com.james.zoo.data;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Area {

    /**
     * result : {"limit":1000,"offset":0,"count":17,"sort":"","results":[{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/01_FormosanAnimal.jpg","E_Geo":"MULTIPOINT ((121.5805931 24.9985962))","E_Info":"臺灣動物區以臺灣原生動物與棲息環境為展示重點，佈置模擬動物原生棲地之生態環境，讓動物表現如野外般自然的生活習性，引導觀賞者更正確地認識本土野生動物。臺灣位處於亞熱帶，雨量充沛、氣候溫暖，擁有各種地形景觀，因而孕育了豐富龐雜的生物資源。","E_no":"1","E_Category":"戶外區","E_Name":"臺灣動物區","E_Memo":"","_id":1,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=12"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/02_ChildrenZoo.jpg","E_Geo":"MULTIPOINT ((121.5819383 24.9989718))","E_Info":"兒童動物園全區以埤塘、水田等各類濕地與郊野生態造景為環境意象，串聯農村動物、經濟動物、寵物、入侵之外來種動物等單元主題，點出人類與動物間的密切關係，提供學童、家長與老師一處共同體驗與學習的空間。","E_no":"2","E_Category":"戶外區","E_Name":"兒童動物區","E_Memo":"","_id":2,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=13"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/03_TropicalRainforest.jpg","E_Geo":"MULTIPOINT ((121.5834188 24.9950215))","E_Info":"熱帶雨林區模擬東南亞熱帶雨林的自然生態景觀，依展示動線規劃成河口生態、密林生態及林緣生態三大展示區，區內可見板根、氣生根、支柱根、附生植物、林間霧氣等熱帶雨林特有的生態現象。","E_no":"3","E_Category":"戶外區","E_Name":"熱帶雨林區","E_Memo":"","_id":3,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=14"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/04_DesertAnimal.jpg","E_Geo":"MULTIPOINT ((121.5851489 24.9952621))","E_Info":"沙漠動物區以隨風搖曳的棕櫚樹模擬中東地區的沙漠環境，展示具代表性的單峰駱駝、雙峰駱駝、非洲野驢和弓角羚羊等。來到這裡，你就能知道動物用什麼方式適應乾旱、高溫及晝夜溫差大的氣候呢？","E_no":"4","E_Category":"戶外區","E_Name":"沙漠動物區","E_Memo":"","_id":4,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=15"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/05_AustralianAnimal.jpg","E_Geo":"MULTIPOINT ((121.5853326 24.994184))","E_Info":"澳洲動物區栽種許多澳洲特有的桉樹，在這裡可以遇到袋鼠、鴯?和食火雞。澳洲大陸長時間與其他陸塊隔離，繁衍並演化出與其他陸域不同形態的物種，值得大小朋友一同來認識牠們喔！","E_no":"5","E_Category":"戶外區","E_Name":"澳洲動物區","E_Memo":"","_id":5,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=16"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/06_AfricanAnimal.jpg","E_Geo":"MULTIPOINT ((121.5880094 24.9951333))","E_Info":"非洲動物區多採動物混群的展示方式，模擬東非莽原情境，讓參觀者在視覺上宛如置身非洲草原。非洲大陸被譽為「野生動物王國」，擁有世界最龐大的動物族群，不僅動物種類豐富，數量亦最為壯觀，快來這裡拜訪陸地上體型最大和身高最高的動物吧！","E_no":"6","E_Category":"戶外區","E_Name":"非洲動物區","E_Memo":"","_id":6,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=17"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/07_TemperateZone.jpg","E_Geo":"MULTIPOINT ((121.5896013 24.9931447))","E_Info":"溫帶動物區有棲息於溫帶草原和森林中的動物。地球上廣大的溫帶氣候區有沙漠、草原、落葉林及針帶林等不同生態環境，因此動物種類繁多。然而溫帶氣候也很適合人類居住，因此這裡的動物大多面臨棲息地減少或其他與人有關的生存危機，需要我們一起來關心牠們的保育。","E_no":"7","E_Category":"戶外區","E_Name":"溫帶動物區","E_Memo":"","_id":7,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=18"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/08_BirdWorld.jpg","E_Geo":"MULTIPOINT ((121.5888946 24.9957179))","E_Info":"鳥園區包括鳥類形態區、雉類與珍禽區、鶴園、鸚鵡房、生態鳥園及水禽區，可以觀察到住在不同棲息地的鳥類，是都會環境中難得的賞鳥據點。歡迎放慢腳步，聽聽悅耳鳥鳴、看看羽色繽紛的輕盈身影，感受另一個廣闊而自由的世界。","E_no":"8","E_Category":"戶外區","E_Name":"鳥園區","E_Memo":"","_id":8,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=19"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/09_EducationCenter.jpg","E_Geo":"MULTIPOINT ((121.5818524 24.9978621))","E_Info":"教育中心包括博物館展示區、圖書館、演講廳、動物藝坊及動物學堂等，為本園展示動物園文化的櫥窗。館內以動物標本、生態全景展示傳達動物知識及保育觀念，最特別的是還有亞洲象「林旺」的標本展示區，以及恐龍模型展示喔！","E_no":"9","E_Category":"室內區","E_Name":"教育中心","E_Memo":"每週一休館，入館門票：全票20元、優待票10元","_id":9,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=22"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/10_PenguinHouse.jpg","E_Geo":"MULTIPOINT ((121.5911959 24.9929758))","E_Info":"企鵝館是「國王企鵝」及「黑腳企鵝」的家，牠們是不會飛的水生鳥類，牠們全是游泳的專家，在水裡潛泳可以「飛」得又快又好。在觀賞可愛的企鵝之餘，也可以在企鵝館了解牠們的分布、形態特徵、生活習性及繁殖求偶行為喔！","E_no":"10","E_Category":"室內區","E_Name":"企鵝館","E_Memo":"每月第二個週一休館","_id":10,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=9"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/11_KoalaHouse.jpg","E_Geo":"MULTIPOINT ((121.5828744 24.9982291))","E_Info":"無尾熊為最具代表性的有袋目動物之一。來自澳洲「庫倫賓野生動物保護區」，代表城市友誼並肩負保育、教育使命的無尾熊們，自引進以來一直都是眾所矚目的焦點。無尾熊館設有多個獨立空間，每間屋頂都有天窗可以讓陽光照射進來。在適當天氣時，無尾熊偶爾也會到戶外場地活動，享受溫暖的陽光。","E_no":"11","E_Category":"室內區","E_Name":"無尾熊館","E_Memo":"","_id":11,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=7"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/12_AmphibianReptile.jpg","E_Geo":"MULTIPOINT ((121.5898494 24.9940697))","E_Info":"本館以不同的生態系展示各種兩棲爬蟲活體動物，包括溼地、熱帶雨林、溫帶森林、沙漠等四大類型。除了經常性的動物生態展示區之外，館內還有靜態的解說教育展示區及定期更換主題的特展區，希望藉由各類動物、寫實模型、互動教材與文化藝品的多元展示，引導遊客進入兩棲爬蟲動物的奧秘世界。","E_no":"12","E_Category":"室內區","E_Name":"兩棲爬蟲動物館","E_Memo":"每月第三個週一休館","_id":12,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=10"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/13_Insectarium.jpg","E_Geo":"MULTIPOINT ((121.5807004 24.9967402))","E_Info":"昆蟲館分為五大區域：序幕大廳、多媒體視聽教室、臺灣昆蟲區、生態展示室、昆蟲特展區。除了介紹昆蟲的起源與演化、構造與適應，更有溫室及生態網室，讓遊客身處昆蟲圍繞的環境中。館區後方還有一個擁有豐富昆蟲資源的「蟲蟲探索谷」，為本園進行戶外生態解說教育的場所之一。","E_no":"13","E_Category":"室內區","E_Name":"昆蟲館","E_Memo":"每月第四個週一休館","_id":13,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=5"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/14_PandaHouse.jpg","E_Geo":"MULTIPOINT ((121.5830956 24.9968265))","E_Info":"新光特展館（大貓熊館）包括一個戶外場地和兩個室內場地，提供多樣的活動空間及攀爬、遮蔭設施，還有大小石塊及流瀑水。戶外場地則模擬大貓熊野外棲息地，草坪寬闊，並以濃綠喬木構成背景。","E_no":"14","E_Category":"室內區","E_Name":"新光特展館（大貓熊館）","E_Memo":"每月第一個週一休館","_id":14,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=8"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/15_PangolinDome.jpg","E_Geo":"MULTIPOINT ((121.5828662 24.9967279))","E_Info":"位在熱帶雨林區的熱帶雨林室內館（穿山甲館），使用臺灣穿山甲為主要意象，不僅是外觀設計的主要視覺焦點，更同時結合節能減碳、太陽能光電、雨水回收系統以及節能空調設計，是一座符合生物多樣性概念的展館。以南美洲亞馬遜河流域環境為展示主軸，顯現熱帶雨林的生物多樣性特色與氛圍。藉由高層空間，融合水域、樹林、樹冠層的沉浸式複合生態系，以不同感官體驗雨林多樣的生物組成，了解保育雨林的重要性，進而支持參與雨林保育。","E_no":"15","E_Category":"室內區","E_Name":"熱帶雨林室內館（穿山甲館）","E_Memo":"","_id":15,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=11"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/16_EcoHouse.jpg","E_Geo":"MULTIPOINT ((121.5742216 24.9946471))","E_Info":"經濟部能源局及工業技術研究院，結合臺北市立動物園的環境教育及生態保育理念，建造這一棟位於沙漠動物區入口處的酷Cool節能屋。這是一座結合空間設計、節能材料及再生能源利用的節能建築，導入童話故事的解說活動，適合全家人一起來體驗。","E_no":"16","E_Category":"特展區","E_Name":"酷Cool節能屋","E_Memo":"每週一休館","_id":16,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=21"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/18_TheStage.jpg","E_Geo":"MULTIPOINT ((121.5826075 24.9987238))","E_Info":"為了讓更多的市民貼近、瞭解大自然，同時寓教於樂，兒童動物區內的特展區「生命驛站」，希望透過農田環境、動物標本和農具展示，以及自導式互動遊戲，呈現大自然萬物的生命循環歷程，讓參觀者感受生命與環境間的重要關聯。","E_no":"17","E_Category":"特展區","E_Name":"生命驛站","E_Memo":"每週六、日13:30-15:30開放參觀","_id":17,"E_URL":"https://www.zoo.gov.taipei/cp.aspx?n=274AFEA1B85B9D7B"}]}
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
         * count : 17
         * sort :
         * results : [{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/01_FormosanAnimal.jpg","E_Geo":"MULTIPOINT ((121.5805931 24.9985962))","E_Info":"臺灣動物區以臺灣原生動物與棲息環境為展示重點，佈置模擬動物原生棲地之生態環境，讓動物表現如野外般自然的生活習性，引導觀賞者更正確地認識本土野生動物。臺灣位處於亞熱帶，雨量充沛、氣候溫暖，擁有各種地形景觀，因而孕育了豐富龐雜的生物資源。","E_no":"1","E_Category":"戶外區","E_Name":"臺灣動物區","E_Memo":"","_id":1,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=12"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/02_ChildrenZoo.jpg","E_Geo":"MULTIPOINT ((121.5819383 24.9989718))","E_Info":"兒童動物園全區以埤塘、水田等各類濕地與郊野生態造景為環境意象，串聯農村動物、經濟動物、寵物、入侵之外來種動物等單元主題，點出人類與動物間的密切關係，提供學童、家長與老師一處共同體驗與學習的空間。","E_no":"2","E_Category":"戶外區","E_Name":"兒童動物區","E_Memo":"","_id":2,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=13"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/03_TropicalRainforest.jpg","E_Geo":"MULTIPOINT ((121.5834188 24.9950215))","E_Info":"熱帶雨林區模擬東南亞熱帶雨林的自然生態景觀，依展示動線規劃成河口生態、密林生態及林緣生態三大展示區，區內可見板根、氣生根、支柱根、附生植物、林間霧氣等熱帶雨林特有的生態現象。","E_no":"3","E_Category":"戶外區","E_Name":"熱帶雨林區","E_Memo":"","_id":3,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=14"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/04_DesertAnimal.jpg","E_Geo":"MULTIPOINT ((121.5851489 24.9952621))","E_Info":"沙漠動物區以隨風搖曳的棕櫚樹模擬中東地區的沙漠環境，展示具代表性的單峰駱駝、雙峰駱駝、非洲野驢和弓角羚羊等。來到這裡，你就能知道動物用什麼方式適應乾旱、高溫及晝夜溫差大的氣候呢？","E_no":"4","E_Category":"戶外區","E_Name":"沙漠動物區","E_Memo":"","_id":4,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=15"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/05_AustralianAnimal.jpg","E_Geo":"MULTIPOINT ((121.5853326 24.994184))","E_Info":"澳洲動物區栽種許多澳洲特有的桉樹，在這裡可以遇到袋鼠、鴯?和食火雞。澳洲大陸長時間與其他陸塊隔離，繁衍並演化出與其他陸域不同形態的物種，值得大小朋友一同來認識牠們喔！","E_no":"5","E_Category":"戶外區","E_Name":"澳洲動物區","E_Memo":"","_id":5,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=16"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/06_AfricanAnimal.jpg","E_Geo":"MULTIPOINT ((121.5880094 24.9951333))","E_Info":"非洲動物區多採動物混群的展示方式，模擬東非莽原情境，讓參觀者在視覺上宛如置身非洲草原。非洲大陸被譽為「野生動物王國」，擁有世界最龐大的動物族群，不僅動物種類豐富，數量亦最為壯觀，快來這裡拜訪陸地上體型最大和身高最高的動物吧！","E_no":"6","E_Category":"戶外區","E_Name":"非洲動物區","E_Memo":"","_id":6,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=17"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/07_TemperateZone.jpg","E_Geo":"MULTIPOINT ((121.5896013 24.9931447))","E_Info":"溫帶動物區有棲息於溫帶草原和森林中的動物。地球上廣大的溫帶氣候區有沙漠、草原、落葉林及針帶林等不同生態環境，因此動物種類繁多。然而溫帶氣候也很適合人類居住，因此這裡的動物大多面臨棲息地減少或其他與人有關的生存危機，需要我們一起來關心牠們的保育。","E_no":"7","E_Category":"戶外區","E_Name":"溫帶動物區","E_Memo":"","_id":7,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=18"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/08_BirdWorld.jpg","E_Geo":"MULTIPOINT ((121.5888946 24.9957179))","E_Info":"鳥園區包括鳥類形態區、雉類與珍禽區、鶴園、鸚鵡房、生態鳥園及水禽區，可以觀察到住在不同棲息地的鳥類，是都會環境中難得的賞鳥據點。歡迎放慢腳步，聽聽悅耳鳥鳴、看看羽色繽紛的輕盈身影，感受另一個廣闊而自由的世界。","E_no":"8","E_Category":"戶外區","E_Name":"鳥園區","E_Memo":"","_id":8,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=19"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/09_EducationCenter.jpg","E_Geo":"MULTIPOINT ((121.5818524 24.9978621))","E_Info":"教育中心包括博物館展示區、圖書館、演講廳、動物藝坊及動物學堂等，為本園展示動物園文化的櫥窗。館內以動物標本、生態全景展示傳達動物知識及保育觀念，最特別的是還有亞洲象「林旺」的標本展示區，以及恐龍模型展示喔！","E_no":"9","E_Category":"室內區","E_Name":"教育中心","E_Memo":"每週一休館，入館門票：全票20元、優待票10元","_id":9,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=22"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/10_PenguinHouse.jpg","E_Geo":"MULTIPOINT ((121.5911959 24.9929758))","E_Info":"企鵝館是「國王企鵝」及「黑腳企鵝」的家，牠們是不會飛的水生鳥類，牠們全是游泳的專家，在水裡潛泳可以「飛」得又快又好。在觀賞可愛的企鵝之餘，也可以在企鵝館了解牠們的分布、形態特徵、生活習性及繁殖求偶行為喔！","E_no":"10","E_Category":"室內區","E_Name":"企鵝館","E_Memo":"每月第二個週一休館","_id":10,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=9"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/11_KoalaHouse.jpg","E_Geo":"MULTIPOINT ((121.5828744 24.9982291))","E_Info":"無尾熊為最具代表性的有袋目動物之一。來自澳洲「庫倫賓野生動物保護區」，代表城市友誼並肩負保育、教育使命的無尾熊們，自引進以來一直都是眾所矚目的焦點。無尾熊館設有多個獨立空間，每間屋頂都有天窗可以讓陽光照射進來。在適當天氣時，無尾熊偶爾也會到戶外場地活動，享受溫暖的陽光。","E_no":"11","E_Category":"室內區","E_Name":"無尾熊館","E_Memo":"","_id":11,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=7"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/12_AmphibianReptile.jpg","E_Geo":"MULTIPOINT ((121.5898494 24.9940697))","E_Info":"本館以不同的生態系展示各種兩棲爬蟲活體動物，包括溼地、熱帶雨林、溫帶森林、沙漠等四大類型。除了經常性的動物生態展示區之外，館內還有靜態的解說教育展示區及定期更換主題的特展區，希望藉由各類動物、寫實模型、互動教材與文化藝品的多元展示，引導遊客進入兩棲爬蟲動物的奧秘世界。","E_no":"12","E_Category":"室內區","E_Name":"兩棲爬蟲動物館","E_Memo":"每月第三個週一休館","_id":12,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=10"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/13_Insectarium.jpg","E_Geo":"MULTIPOINT ((121.5807004 24.9967402))","E_Info":"昆蟲館分為五大區域：序幕大廳、多媒體視聽教室、臺灣昆蟲區、生態展示室、昆蟲特展區。除了介紹昆蟲的起源與演化、構造與適應，更有溫室及生態網室，讓遊客身處昆蟲圍繞的環境中。館區後方還有一個擁有豐富昆蟲資源的「蟲蟲探索谷」，為本園進行戶外生態解說教育的場所之一。","E_no":"13","E_Category":"室內區","E_Name":"昆蟲館","E_Memo":"每月第四個週一休館","_id":13,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=5"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/14_PandaHouse.jpg","E_Geo":"MULTIPOINT ((121.5830956 24.9968265))","E_Info":"新光特展館（大貓熊館）包括一個戶外場地和兩個室內場地，提供多樣的活動空間及攀爬、遮蔭設施，還有大小石塊及流瀑水。戶外場地則模擬大貓熊野外棲息地，草坪寬闊，並以濃綠喬木構成背景。","E_no":"14","E_Category":"室內區","E_Name":"新光特展館（大貓熊館）","E_Memo":"每月第一個週一休館","_id":14,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=8"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/15_PangolinDome.jpg","E_Geo":"MULTIPOINT ((121.5828662 24.9967279))","E_Info":"位在熱帶雨林區的熱帶雨林室內館（穿山甲館），使用臺灣穿山甲為主要意象，不僅是外觀設計的主要視覺焦點，更同時結合節能減碳、太陽能光電、雨水回收系統以及節能空調設計，是一座符合生物多樣性概念的展館。以南美洲亞馬遜河流域環境為展示主軸，顯現熱帶雨林的生物多樣性特色與氛圍。藉由高層空間，融合水域、樹林、樹冠層的沉浸式複合生態系，以不同感官體驗雨林多樣的生物組成，了解保育雨林的重要性，進而支持參與雨林保育。","E_no":"15","E_Category":"室內區","E_Name":"熱帶雨林室內館（穿山甲館）","E_Memo":"","_id":15,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=11"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/16_EcoHouse.jpg","E_Geo":"MULTIPOINT ((121.5742216 24.9946471))","E_Info":"經濟部能源局及工業技術研究院，結合臺北市立動物園的環境教育及生態保育理念，建造這一棟位於沙漠動物區入口處的酷Cool節能屋。這是一座結合空間設計、節能材料及再生能源利用的節能建築，導入童話故事的解說活動，適合全家人一起來體驗。","E_no":"16","E_Category":"特展區","E_Name":"酷Cool節能屋","E_Memo":"每週一休館","_id":16,"E_URL":"http://www.zoo.gov.tw/introduce/gq.aspx?tid=21"},{"E_Pic_URL":"http://www.zoo.gov.tw/iTAP/05_Exhibit/18_TheStage.jpg","E_Geo":"MULTIPOINT ((121.5826075 24.9987238))","E_Info":"為了讓更多的市民貼近、瞭解大自然，同時寓教於樂，兒童動物區內的特展區「生命驛站」，希望透過農田環境、動物標本和農具展示，以及自導式互動遊戲，呈現大自然萬物的生命循環歷程，讓參觀者感受生命與環境間的重要關聯。","E_no":"17","E_Category":"特展區","E_Name":"生命驛站","E_Memo":"每週六、日13:30-15:30開放參觀","_id":17,"E_URL":"https://www.zoo.gov.taipei/cp.aspx?n=274AFEA1B85B9D7B"}]
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
             * E_Pic_URL : http://www.zoo.gov.tw/iTAP/05_Exhibit/01_FormosanAnimal.jpg
             * E_Geo : MULTIPOINT ((121.5805931 24.9985962))
             * E_Info : 臺灣動物區以臺灣原生動物與棲息環境為展示重點，佈置模擬動物原生棲地之生態環境，讓動物表現如野外般自然的生活習性，引導觀賞者更正確地認識本土野生動物。臺灣位處於亞熱帶，雨量充沛、氣候溫暖，擁有各種地形景觀，因而孕育了豐富龐雜的生物資源。
             * E_no : 1
             * E_Category : 戶外區
             * E_Name : 臺灣動物區
             * E_Memo :
             * _id : 1
             * E_URL : http://www.zoo.gov.tw/introduce/gq.aspx?tid=12
             */

            private String E_Pic_URL;
            private String E_Geo;
            private String E_Info;
            private String E_no;
            private String E_Category;
            private String E_Name;
            private String E_Memo;
            private int _id;
            private String E_URL;

            protected ResultsBean(Parcel in) {
                E_Pic_URL = in.readString();
                E_Geo = in.readString();
                E_Info = in.readString();
                E_no = in.readString();
                E_Category = in.readString();
                E_Name = in.readString();
                E_Memo = in.readString();
                _id = in.readInt();
                E_URL = in.readString();
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

            public String getE_Pic_URL() {
                return E_Pic_URL;
            }

            public void setE_Pic_URL(String E_Pic_URL) {
                this.E_Pic_URL = E_Pic_URL;
            }

            public String getE_Geo() {
                return E_Geo;
            }

            public void setE_Geo(String E_Geo) {
                this.E_Geo = E_Geo;
            }

            public String getE_Info() {
                return E_Info;
            }

            public void setE_Info(String E_Info) {
                this.E_Info = E_Info;
            }

            public String getE_no() {
                return E_no;
            }

            public void setE_no(String E_no) {
                this.E_no = E_no;
            }

            public String getE_Category() {
                return E_Category;
            }

            public void setE_Category(String E_Category) {
                this.E_Category = E_Category;
            }

            public String getE_Name() {
                return E_Name;
            }

            public void setE_Name(String E_Name) {
                this.E_Name = E_Name;
            }

            public String getE_Memo() {
                return E_Memo;
            }

            public void setE_Memo(String E_Memo) {
                this.E_Memo = E_Memo;
            }

            public int get_id() {
                return _id;
            }

            public void set_id(int _id) {
                this._id = _id;
            }

            public String getE_URL() {
                return E_URL;
            }

            public void setE_URL(String E_URL) {
                this.E_URL = E_URL;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(E_Pic_URL);
                parcel.writeString(E_Geo);
                parcel.writeString(E_Info);
                parcel.writeString(E_no);
                parcel.writeString(E_Category);
                parcel.writeString(E_Name);
                parcel.writeString(E_Memo);
                parcel.writeInt(_id);
                parcel.writeString(E_URL);
            }
        }
    }
}
