package com.liu.data;

import java.util.HashMap;
import java.util.Map;

public class DataSourceMap {
    public static Map<String, String> question_1_map = new HashMap<>();
    public static Map<String, String> question_2_map = new HashMap<>();
    public static Map<String, String> question_3_map = new HashMap<>();

    public static Map<String, String> question_5_map = new HashMap<>();

    public static Map<String, String> question_61_map = new HashMap<>();
    public static Map<String, String> question_62_map = new HashMap<>();
    public static Map<String, String> question_63_map = new HashMap<>();


    public static Map<String, String> question_7_map = new HashMap<>();
    public static Map<String, String> map1 = new HashMap<>();

    public static Map<Integer, Double> map2 = new HashMap<>();

    public static Map<String, Double> map3 = new HashMap<>();

    static {
        //question1
        question_1_map.put("1", "Åsele");
        question_1_map.put("2", "Bjurholm");
        question_1_map.put("3", "Dorotea");
        question_1_map.put("4", "Lycksele");
        question_1_map.put("5", "Malå");
        question_1_map.put("6", "Nordmaling");
        question_1_map.put("7", "Norsjö");
        question_1_map.put("8", "Robertsfors");
        question_1_map.put("9", "Skellefteå");
        question_1_map.put("10", "Sorsele");
        question_1_map.put("11", "Storuman");
        question_1_map.put("12", "Umeå");
        question_1_map.put("13", "Vännäs");
        question_1_map.put("14", "Vilhelmina");
        question_1_map.put("15", "Vindeln");

        question_2_map.put("1", "1961-1980");
        question_2_map.put("2", "until1960");
        question_2_map.put("3", "after1980");

        question_3_map.put("1", ">2");
        question_3_map.put("2", "1or2");

        question_5_map.put("1", "in units (kWh) consumed");
        question_5_map.put("2", "in bill amount (SEK)");

        question_61_map.put("1", "Lägenhet (Säkring 16 Ampere, kalkylerad årsförbrukning 2000 kWh)");
        question_61_map.put("2", "Villa utan elvärmde (Säkring 16 Ampere, kalkylerad årsförbrukning 5000 kWh)");
        question_61_map.put("3", "Villa med elvärme (Säkring 20 Ampere, kalkylerad årsförbrukning 20000 kWh)");
        question_61_map.put("4", "Större hushåll (Säkring 35 Ampere, kalkylerad årsförbrukning 30000 kWh)");

        question_62_map.put("1", "Yes");
        question_62_map.put("2", "No");

        question_63_map.put("1", "Avtal om löpande rörligt pris");
        question_63_map.put("2", "Avtal om fast pris, 1 års löptid");
        question_63_map.put("3", "Avtal om fast pris, 2 års löptid");
        question_63_map.put("4", "Avtal om fast pris, 3 års löptid");
        question_63_map.put("5", "Anvisat avtal");

        question_7_map.put("1", "Fuel oil");
        question_7_map.put("2", "Natural gas");
        question_7_map.put("3", "Firewood");
        question_7_map.put("4", "Lignite Briquette");
        question_7_map.put("5", "No");


        map1.put("Åsele_until1960_1or2_0-100", "194.2609047");
        map1.put("Åsele_until1960_1or2_101-200", "159.4344274");
        map1.put("Åsele_until1960_1or2_>200", "170.3084682");
        map1.put("Åsele_until1960_>2_0-100", "194.2609047");
        map1.put("Åsele_until1960_>2_101-200", "159.4344274");
        map1.put("Åsele_until1960_>2_>200", "170.3084682");
        map1.put("Åsele_1961-1980_1or2_0-100", "201.4211687");
        map1.put("Åsele_1961-1980_1or2_101-200", "129.0309784");
        map1.put("Åsele_1961-1980_1or2_>200", "134.9121739");
        map1.put("Åsele_1961-1980_>2_0-100", "201.4211687");
        map1.put("Åsele_1961-1980_>2_101-200", "129.0309784");
        map1.put("Åsele_1961-1980_>2_>200", "134.9121739");
        map1.put("Åsele_after1980_1or2_0-100", "128.9963201");
        map1.put("Åsele_after1980_1or2_101-200", "121.2586682");
        map1.put("Åsele_after1980_1or2_>200", "84.5073324");
        map1.put("Åsele_after1980_>2_0-100", "128.9963201");
        map1.put("Åsele_after1980_>2_101-200", "121.2586682");
        map1.put("Åsele_after1980_>2_>200", "84.5073324");
        map1.put("Bjurholm_until1960_1or2_0-100", "169.7093875");
        map1.put("Bjurholm_until1960_1or2_101-200", "153.2179097");
        map1.put("Bjurholm_until1960_1or2_>200", "141.3120125");
        map1.put("Bjurholm_until1960_>2_0-100", "169.7093875");
        map1.put("Bjurholm_until1960_>2_101-200", "153.2179097");
        map1.put("Bjurholm_until1960_>2_>200", "141.3120125");
        map1.put("Bjurholm_1961-1980_1or2_0-100", "157.3012371");
        map1.put("Bjurholm_1961-1980_1or2_101-200", "133.7891232");
        map1.put("Bjurholm_1961-1980_1or2_>200", "107.6738367");
        map1.put("Bjurholm_1961-1980_>2_0-100", "157.3012371");
        map1.put("Bjurholm_1961-1980_>2_101-200", "133.7891232");
        map1.put("Bjurholm_1961-1980_>2_>200", "107.6738367");
        map1.put("Bjurholm_after1980_1or2_0-100", "119.0733294");
        map1.put("Bjurholm_after1980_1or2_101-200", "88.33333333");
        map1.put("Bjurholm_after1980_1or2_>200", "71.14517437");
        map1.put("Bjurholm_after1980_>2_0-100", "119.0733294");
        map1.put("Bjurholm_after1980_>2_101-200", "88.33333333");
        map1.put("Bjurholm_after1980_>2_>200", "71.14517437");
        map1.put("Dorotea_until1960_1or2_0-100", "194.2609047");
        map1.put("Dorotea_until1960_1or2_101-200", "130.5353723");
        map1.put("Dorotea_until1960_1or2_>200", "124.365836");
        map1.put("Dorotea_until1960_>2_0-100", "194.2609047");
        map1.put("Dorotea_until1960_>2_101-200", "130.5353723");
        map1.put("Dorotea_until1960_>2_>200", "124.365836");
        map1.put("Dorotea_1961-1980_1or2_0-100", "140.4321789");
        map1.put("Dorotea_1961-1980_1or2_101-200", "127.7890232");
        map1.put("Dorotea_1961-1980_1or2_>200", "106.7272868");
        map1.put("Dorotea_1961-1980_>2_0-100", "140.4321789");
        map1.put("Dorotea_1961-1980_>2_101-200", "127.7890232");
        map1.put("Dorotea_1961-1980_>2_>200", "106.7272868");
        map1.put("Dorotea_after1980_1or2_0-100", "128.9963201");
        map1.put("Dorotea_after1980_1or2_101-200", "126.8396109");
        map1.put("Dorotea_after1980_1or2_>200", "84.5073324");
        map1.put("Dorotea_after1980_>2_0-100", "128.9963201");
        map1.put("Dorotea_after1980_>2_101-200", "126.8396109");
        map1.put("Dorotea_after1980_>2_>200", "84.5073324");
        map1.put("Lycksele_until1960_1or2_0-100", "194.2609047");
        map1.put("Lycksele_until1960_1or2_101-200", "152.6099511");
        map1.put("Lycksele_until1960_1or2_>200", "131.8409306");
        map1.put("Lycksele_until1960_>2_0-100", "194.2609047");
        map1.put("Lycksele_until1960_>2_101-200", "152.6099511");
        map1.put("Lycksele_until1960_>2_>200", "131.8409306");
        map1.put("Lycksele_1961-1980_1or2_0-100", "201.4211687");
        map1.put("Lycksele_1961-1980_1or2_101-200", "127.0724947");
        map1.put("Lycksele_1961-1980_1or2_>200", "113.9932585");
        map1.put("Lycksele_1961-1980_>2_0-100", "201.4211687");
        map1.put("Lycksele_1961-1980_>2_101-200", "127.0724947");
        map1.put("Lycksele_1961-1980_>2_>200", "113.9932585");
        map1.put("Lycksele_after1980_1or2_0-100", "128.9963201");
        map1.put("Lycksele_after1980_1or2_101-200", "121.2586682");
        map1.put("Lycksele_after1980_1or2_>200", "84.5073324");
        map1.put("Lycksele_after1980_>2_0-100", "128.9963201");
        map1.put("Lycksele_after1980_>2_101-200", "121.2586682");
        map1.put("Lycksele_after1980_>2_>200", "84.5073324");
        map1.put("Malå_until1960_1or2_0-100", "");
        map1.put("Malå_until1960_1or2_101-200", "152.9632488");
        map1.put("Malå_until1960_1or2_>200", "137.0815554");
        map1.put("Malå_until1960_>2_0-100", "");
        map1.put("Malå_until1960_>2_101-200", "152.9632488");
        map1.put("Malå_until1960_>2_>200", "137.0815554");
        map1.put("Malå_1961-1980_1or2_0-100", "226.9841986");
        map1.put("Malå_1961-1980_1or2_101-200", "140.5578419");
        map1.put("Malå_1961-1980_1or2_>200", "145.6558659");
        map1.put("Malå_1961-1980_>2_0-100", "226.9841986");
        map1.put("Malå_1961-1980_>2_101-200", "140.5578419");
        map1.put("Malå_1961-1980_>2_>200", "145.6558659");
        map1.put("Malå_after1980_1or2_0-100", "");
        map1.put("Malå_after1980_1or2_101-200", "112.5797354");
        map1.put("Malå_after1980_1or2_>200", "88.46968427");
        map1.put("Malå_after1980_>2_0-100", "");
        map1.put("Malå_after1980_>2_101-200", "192.446934");
        map1.put("Malå_after1980_>2_>200", "88.46968427");
        map1.put("Nordmaling_until1960_1or2_0-100", "");
        map1.put("Nordmaling_until1960_1or2_101-200", "136.2703798");
        map1.put("Nordmaling_until1960_1or2_>200", "105.658011");
        map1.put("Nordmaling_until1960_>2_0-100", "");
        map1.put("Nordmaling_until1960_>2_101-200", "136.2703798");
        map1.put("Nordmaling_until1960_>2_>200", "105.658011");
        map1.put("Nordmaling_1961-1980_1or2_0-100", "");
        map1.put("Nordmaling_1961-1980_1or2_101-200", "120.783545");
        map1.put("Nordmaling_1961-1980_1or2_>200", "85.52401487");
        map1.put("Nordmaling_1961-1980_>2_0-100", "");
        map1.put("Nordmaling_1961-1980_>2_101-200", "120.783545");
        map1.put("Nordmaling_1961-1980_>2_>200", "85.52401487");
        map1.put("Nordmaling_after1980_1or2_0-100", "");
        map1.put("Nordmaling_after1980_1or2_101-200", "108.129083");
        map1.put("Nordmaling_after1980_1or2_>200", "71.14517437");
        map1.put("Nordmaling_after1980_>2_0-100", "");
        map1.put("Nordmaling_after1980_>2_101-200", "108.129083");
        map1.put("Nordmaling_after1980_>2_>200", "71.14517437");
        map1.put("Norsjö_until1960_1or2_0-100", "");
        map1.put("Norsjö_until1960_1or2_101-200", "121.1594529");
        map1.put("Norsjö_until1960_1or2_>200", "127.6955879");
        map1.put("Norsjö_until1960_>2_0-100", "");
        map1.put("Norsjö_until1960_>2_101-200", "121.1594529");
        map1.put("Norsjö_until1960_>2_>200", "127.6955879");
        map1.put("Norsjö_1961-1980_1or2_0-100", "150.1308901");
        map1.put("Norsjö_1961-1980_1or2_101-200", "126.5153825");
        map1.put("Norsjö_1961-1980_1or2_>200", "145.6558659");
        map1.put("Norsjö_1961-1980_>2_0-100", "150.1308901");
        map1.put("Norsjö_1961-1980_>2_101-200", "126.5153825");
        map1.put("Norsjö_1961-1980_>2_>200", "145.6558659");
        map1.put("Norsjö_after1980_1or2_0-100", "");
        map1.put("Norsjö_after1980_1or2_101-200", "126.3338339");
        map1.put("Norsjö_after1980_1or2_>200", "88.46968427");
        map1.put("Norsjö_after1980_>2_0-100", "");
        map1.put("Norsjö_after1980_>2_101-200", "126.3338339");
        map1.put("Norsjö_after1980_>2_>200", "88.46968427");
        map1.put("Robertsfors_until1960_1or2_0-100", "168.4873188");
        map1.put("Robertsfors_until1960_1or2_101-200", "147.5828228");
        map1.put("Robertsfors_until1960_1or2_>200", "137.0059535");
        map1.put("Robertsfors_until1960_>2_0-100", "168.4873188");
        map1.put("Robertsfors_until1960_>2_101-200", "147.5828228");
        map1.put("Robertsfors_until1960_>2_>200", "137.0059535");
        map1.put("Robertsfors_1961-1980_1or2_0-100", "");
        map1.put("Robertsfors_1961-1980_1or2_101-200", "126.8564211");
        map1.put("Robertsfors_1961-1980_1or2_>200", "109.7654288");
        map1.put("Robertsfors_1961-1980_>2_0-100", "");
        map1.put("Robertsfors_1961-1980_>2_101-200", "136.1420328");
        map1.put("Robertsfors_1961-1980_>2_>200", "109.7654288");
        map1.put("Robertsfors_after1980_1or2_0-100", "");
        map1.put("Robertsfors_after1980_1or2_101-200", "119.385022");
        map1.put("Robertsfors_after1980_1or2_>200", "");
        map1.put("Robertsfors_after1980_>2_0-100", "");
        map1.put("Robertsfors_after1980_>2_101-200", "119.385022");
        map1.put("Robertsfors_after1980_>2_>200", "");
        map1.put("Skellefteå_until1960_1or2_0-100", "161.9229959");
        map1.put("Skellefteå_until1960_1or2_101-200", "134.2961218");
        map1.put("Skellefteå_until1960_1or2_>200", "108.3884015");
        map1.put("Skellefteå_until1960_>2_0-100", "161.9229959");
        map1.put("Skellefteå_until1960_>2_101-200", "134.2961218");
        map1.put("Skellefteå_until1960_>2_>200", "108.3884015");
        map1.put("Skellefteå_1961-1980_1or2_0-100", "153.9634907");
        map1.put("Skellefteå_1961-1980_1or2_101-200", "116.0739829");
        map1.put("Skellefteå_1961-1980_1or2_>200", "104.6382609");
        map1.put("Skellefteå_1961-1980_>2_0-100", "153.9634907");
        map1.put("Skellefteå_1961-1980_>2_101-200", "116.0739829");
        map1.put("Skellefteå_1961-1980_>2_>200", "104.6382609");
        map1.put("Skellefteå_after1980_1or2_0-100", "128.8516353");
        map1.put("Skellefteå_after1980_1or2_101-200", "117.6428114");
        map1.put("Skellefteå_after1980_1or2_>200", "115.2996903");
        map1.put("Skellefteå_after1980_>2_0-100", "128.8516353");
        map1.put("Skellefteå_after1980_>2_101-200", "116.9955866");
        map1.put("Skellefteå_after1980_>2_>200", "91.21580197");
        map1.put("Sorsele_until1960_1or2_0-100", "");
        map1.put("Sorsele_until1960_1or2_101-200", "151.7860678");
        map1.put("Sorsele_until1960_1or2_>200", "");
        map1.put("Sorsele_until1960_>2_0-100", "");
        map1.put("Sorsele_until1960_>2_101-200", "151.7860678");
        map1.put("Sorsele_until1960_>2_>200", "");
        map1.put("Sorsele_1961-1980_1or2_0-100", "");
        map1.put("Sorsele_1961-1980_1or2_101-200", "151.2683088");
        map1.put("Sorsele_1961-1980_1or2_>200", "");
        map1.put("Sorsele_1961-1980_>2_0-100", "");
        map1.put("Sorsele_1961-1980_>2_101-200", "151.2683088");
        map1.put("Sorsele_1961-1980_>2_>200", "");
        map1.put("Sorsele_after1980_1or2_0-100", "");
        map1.put("Sorsele_after1980_1or2_101-200", "151.2683088");
        map1.put("Sorsele_after1980_1or2_>200", "");
        map1.put("Sorsele_after1980_>2_0-100", "");
        map1.put("Sorsele_after1980_>2_101-200", "151.2683088");
        map1.put("Sorsele_after1980_>2_>200", "");
        map1.put("Storuman_until1960_1or2_0-100", "");
        map1.put("Storuman_until1960_1or2_101-200", "136.0176962");
        map1.put("Storuman_until1960_1or2_>200", "131.0734544");
        map1.put("Storuman_until1960_>2_0-100", "");
        map1.put("Storuman_until1960_>2_101-200", "136.0176962");
        map1.put("Storuman_until1960_>2_>200", "131.0734544");
        map1.put("Storuman_1961-1980_1or2_0-100", "220.8006672");
        map1.put("Storuman_1961-1980_1or2_101-200", "139.1536721");
        map1.put("Storuman_1961-1980_1or2_>200", "107.0503832");
        map1.put("Storuman_1961-1980_>2_0-100", "220.8006672");
        map1.put("Storuman_1961-1980_>2_101-200", "139.1536721");
        map1.put("Storuman_1961-1980_>2_>200", "107.0503832");
        map1.put("Storuman_after1980_1or2_0-100", "");
        map1.put("Storuman_after1980_1or2_101-200", "135.4906563");
        map1.put("Storuman_after1980_1or2_>200", "135.2697105");
        map1.put("Storuman_after1980_>2_0-100", "");
        map1.put("Storuman_after1980_>2_101-200", "135.4906563");
        map1.put("Storuman_after1980_>2_>200", "101.8172502");
        map1.put("Umeå_until1960_1or2_0-100", "169.7093875");
        map1.put("Umeå_until1960_1or2_101-200", "126.9627398");
        map1.put("Umeå_until1960_1or2_>200", "105.9161645");
        map1.put("Umeå_until1960_>2_0-100", "169.7093875");
        map1.put("Umeå_until1960_>2_101-200", "126.9627398");
        map1.put("Umeå_until1960_>2_>200", "105.9161645");
        map1.put("Umeå_1961-1980_1or2_0-100", "157.3012371");
        map1.put("Umeå_1961-1980_1or2_101-200", "112.0497412");
        map1.put("Umeå_1961-1980_1or2_>200", "97.66328265");
        map1.put("Umeå_1961-1980_>2_0-100", "157.3012371");
        map1.put("Umeå_1961-1980_>2_101-200", "112.0497412");
        map1.put("Umeå_1961-1980_>2_>200", "97.66328265");
        map1.put("Umeå_after1980_1or2_0-100", "119.0733294");
        map1.put("Umeå_after1980_1or2_101-200", "99.95577272");
        map1.put("Umeå_after1980_1or2_>200", "89.2071455");
        map1.put("Umeå_after1980_>2_0-100", "119.0733294");
        map1.put("Umeå_after1980_>2_101-200", "99.95577272");
        map1.put("Umeå_after1980_>2_>200", "89.2071455");
        map1.put("Vännäs_until1960_1or2_0-100", "");
        map1.put("Vännäs_until1960_1or2_101-200", "142.8121215");
        map1.put("Vännäs_until1960_1or2_>200", "118.4186254");
        map1.put("Vännäs_until1960_>2_0-100", "");
        map1.put("Vännäs_until1960_>2_101-200", "142.8121215");
        map1.put("Vännäs_until1960_>2_>200", "118.4186254");
        map1.put("Vännäs_1961-1980_1or2_0-100", "");
        map1.put("Vännäs_1961-1980_1or2_101-200", "121.7076495");
        map1.put("Vännäs_1961-1980_1or2_>200", "107.6738367");
        map1.put("Vännäs_1961-1980_>2_0-100", "");
        map1.put("Vännäs_1961-1980_>2_101-200", "121.7076495");
        map1.put("Vännäs_1961-1980_>2_>200", "107.6738367");
        map1.put("Vännäs_after1980_1or2_0-100", "");
        map1.put("Vännäs_after1980_1or2_101-200", "119.8797313");
        map1.put("Vännäs_after1980_1or2_>200", "116.1676647");
        map1.put("Vännäs_after1980_>2_0-100", "");
        map1.put("Vännäs_after1980_>2_101-200", "119.8797313");
        map1.put("Vännäs_after1980_>2_>200", "116.1676647");
        map1.put("Vilhelmina_until1960_1or2_0-100", "");
        map1.put("Vilhelmina_until1960_1or2_101-200", "138.2980516");
        map1.put("Vilhelmina_until1960_1or2_>200", "124.365836");
        map1.put("Vilhelmina_until1960_>2_0-100", "");
        map1.put("Vilhelmina_until1960_>2_101-200", "138.2980516");
        map1.put("Vilhelmina_until1960_>2_>200", "124.365836");
        map1.put("Vilhelmina_1961-1980_1or2_0-100", "140.4321789");
        map1.put("Vilhelmina_1961-1980_1or2_101-200", "129.6057911");
        map1.put("Vilhelmina_1961-1980_1or2_>200", "106.7272868");
        map1.put("Vilhelmina_1961-1980_>2_0-100", "140.4321789");
        map1.put("Vilhelmina_1961-1980_>2_101-200", "129.6057911");
        map1.put("Vilhelmina_1961-1980_>2_>200", "106.7272868");
        map1.put("Vilhelmina_after1980_1or2_0-100", "");
        map1.put("Vilhelmina_after1980_1or2_101-200", "126.8396109");
        map1.put("Vilhelmina_after1980_1or2_>200", "");
        map1.put("Vilhelmina_after1980_>2_0-100", "");
        map1.put("Vilhelmina_after1980_>2_101-200", "126.8396109");
        map1.put("Vilhelmina_after1980_>2_>200", "");
        map1.put("Vindeln_until1960_1or2_0-100", "");
        map1.put("Vindeln_until1960_1or2_101-200", "134.8244082");
        map1.put("Vindeln_until1960_1or2_>200", "116.3545103");
        map1.put("Vindeln_until1960_>2_0-100", "");
        map1.put("Vindeln_until1960_>2_101-200", "134.8244082");
        map1.put("Vindeln_until1960_>2_>200", "116.3545103");
        map1.put("Vindeln_1961-1980_1or2_0-100", "");
        map1.put("Vindeln_1961-1980_1or2_101-200", "124.2491629");
        map1.put("Vindeln_1961-1980_1or2_>200", "92.48784367");
        map1.put("Vindeln_1961-1980_>2_0-100", "");
        map1.put("Vindeln_1961-1980_>2_101-200", "75.84686469");
        map1.put("Vindeln_1961-1980_>2_>200", "92.48784367");
        map1.put("Vindeln_after1980_1or2_0-100", "");
        map1.put("Vindeln_after1980_1or2_101-200", "118.3322251");
        map1.put("Vindeln_after1980_1or2_>200", "116.515748");
        map1.put("Vindeln_after1980_>2_0-100", "");
        map1.put("Vindeln_after1980_>2_101-200", "118.3322251");
        map1.put("Vindeln_after1980_>2_>200", "116.515748");


        map2.put(1995, 164.0);
        map2.put(1996, 161.9715341);
        map2.put(1997, 159.9681577);
        map2.put(1998, 157.9895604);
        map2.put(1999, 156.0354358);
        map2.put(2000, 154.1054812);
        map2.put(2001, 152.1993976);
        map2.put(2002, 150.3168897);
        map2.put(2003, 148.457666);
        map2.put(2004, 146.6214385);
        map2.put(2005, 144.8079227);
        map2.put(2006, 143.0168378);
        map2.put(2007, 141.2479062);
        map2.put(2008, 139.500854);
        map2.put(2009, 137.7754106);
        map2.put(2010, 136.0713086);
        map2.put(2011, 134.3882842);
        map2.put(2012, 132.7260765);
        map2.put(2013, 131.0844283);
        map2.put(2014, 129.463085);
        map2.put(2015, 127.8617957);
        map2.put(2016, 126.2803122);
        map2.put(2017, 124.7183896);
        map2.put(2018, 123.1757859);
        map2.put(2019, 121.6522623);
        map2.put(2020, 120.1475826);
        map2.put(2021, 118.6615138);
        map2.put(2022, 117.1938258);
        map2.put(2023, 115.7442912);
        map2.put(2024, 114.3126854);
        map2.put(2025, 112.8987868);
        map2.put(2026, 111.5023762);
        map2.put(2027, 110.1232373);
        map2.put(2028, 108.7611567);
        map2.put(2029, 107.4159231);
        map2.put(2030, 106.0873284);
        map2.put(2031, 104.7751666);
        map2.put(2032, 103.4792346);
        map2.put(2033, 102.1993316);
        map2.put(2034, 100.9352593);
        map2.put(2035, 99.68682189);
        map2.put(2036, 98.45382605);
        map2.put(2037, 97.23608075);
        map2.put(2038, 96.03339738);
        map2.put(2039, 94.84558962);
        map2.put(2040, 93.6724735);
        map2.put(2041, 92.5138673);
        map2.put(2042, 91.36959154);
        map2.put(2043, 90.23946898);
        map2.put(2044, 89.12332455);
        map2.put(2045, 88.02098538);
        map2.put(2046, 86.93228071);
        map2.put(2047, 85.85704188);
        map2.put(2048, 84.79510236);
        map2.put(2049, 83.74629765);
        map2.put(2050, 82.71046528);

        //7_8_6_winter/spring/summer/autumn
        //1
        map3.put("1_1_1_winter", 1.85);
        map3.put("1_1_1_spring", 2.07);
        map3.put("1_1_1_summer", 1.78);
        map3.put("1_1_1_autumn", 1.76);

        map3.put("1_1_2_winter", 1.72);
        map3.put("1_1_2_spring", 1.94);
        map3.put("1_1_2_summer", 1.64);
        map3.put("1_1_2_autumn", 1.63);

        map3.put("1_1_3_winter", 1.27);
        map3.put("1_1_3_spring", 1.49);
        map3.put("1_1_3_summer", 1.20);
        map3.put("1_1_3_autumn", 1.19);

        map3.put("1_1_4_winter", 1.31);
        map3.put("1_1_4_spring", 1.53);
        map3.put("1_1_4_summer", 1.23);
        map3.put("1_1_4_autumn", 1.23);

        //2
        map3.put("1_2_1_winter", 2.08);
        map3.put("1_2_1_spring", 2.43);
        map3.put("1_2_1_summer", 1.94);
        map3.put("1_2_1_autumn", 2.03);

        map3.put("1_2_2_winter", 1.96);
        map3.put("1_2_2_spring", 2.31);
        map3.put("1_2_2_summer", 1.82);
        map3.put("1_2_2_autumn", 1.91);

        map3.put("1_2_3_winter", 1.53);
        map3.put("1_2_3_spring", 1.87);
        map3.put("1_2_3_summer", 1.38);
        map3.put("1_2_3_autumn", 1.48);
                    
        map3.put("1_2_4_winter", 1.56);
        map3.put("1_2_4_spring", 1.91);
        map3.put("1_2_4_summer", 1.42);
        map3.put("1_2_4_autumn", 1.52);

        //3 
        map3.put("1_3_1_winter", 1.87);
        map3.put("1_3_1_spring", 2.03);
        map3.put("1_3_1_summer", 1.82);
        map3.put("1_3_1_autumn", 1.85);

        map3.put("1_3_2_winter", 1.76);
        map3.put("1_3_2_spring", 1.92);
        map3.put("1_3_2_summer", 1.70);
        map3.put("1_3_2_autumn", 1.73);

        map3.put("1_3_3_winter", 1.32);
        map3.put("1_3_3_spring", 1.49);
        map3.put("1_3_3_summer", 1.27);
        map3.put("1_3_3_autumn", 1.30);

        map3.put("1_3_4_winter", 1.36);
        map3.put("1_3_4_spring", 1.52);
        map3.put("1_3_4_summer", 1.31);
        map3.put("1_3_4_autumn", 1.34);

        //4 
        map3.put("1_4_1_winter", 1.86);
        map3.put("1_4_1_spring", 1.93);
        map3.put("1_4_1_summer", 1.83);
        map3.put("1_4_1_autumn", 1.85);

        map3.put("1_4_2_winter", 1.75);
        map3.put("1_4_2_spring", 1.81);
        map3.put("1_4_2_summer", 1.72);
        map3.put("1_4_2_autumn", 1.74);

        map3.put("1_4_3_winter", 1.32);
        map3.put("1_4_3_spring", 1.38);
        map3.put("1_4_3_summer", 1.29);
        map3.put("1_4_3_autumn", 1.31);

        map3.put("1_4_4_winter", 1.35);
        map3.put("1_4_4_spring", 1.42);
        map3.put("1_4_4_summer", 1.33);
        map3.put("1_4_4_autumn", 1.35);

        //5
        map3.put("1_5_1_winter", 2.12);
        map3.put("1_5_1_spring", 2.06);
        map3.put("1_5_1_summer", 2.08);
        map3.put("1_5_1_autumn", 2.11);

        map3.put("1_5_2_winter", 1.97);
        map3.put("1_5_2_spring", 1.92);
        map3.put("1_5_2_summer", 1.93);
        map3.put("1_5_2_autumn", 1.96);

        map3.put("1_5_3_winter", 1.52);
        map3.put("1_5_3_spring", 1.47);
        map3.put("1_5_3_summer", 1.49);
        map3.put("1_5_3_autumn", 1.51);

        map3.put("1_5_4_winter", 1.56);
        map3.put("1_5_4_spring", 1.51);
        map3.put("1_5_4_summer", 1.52);
        map3.put("1_5_4_autumn", 1.55);

        //6
        map3.put("2_1_1_winter", 0.59);
        map3.put("2_1_1_spring", 0.81);
        map3.put("2_1_1_summer", 0.51);
        map3.put("2_1_1_autumn", 0.50);

        map3.put("2_1_2_winter", 0.48);
        map3.put("2_1_2_spring", 0.70);
        map3.put("2_1_2_summer", 0.41);
        map3.put("2_1_2_autumn", 0.40);

        map3.put("2_1_3_winter", 0.43);
        map3.put("2_1_3_spring", 0.64);
        map3.put("2_1_3_summer", 0.35);
        map3.put("2_1_3_autumn", 0.35);

        map3.put("2_1_4_winter", 0.42);
        map3.put("2_1_4_spring", 0.64);
        map3.put("2_1_4_summer", 0.35);
        map3.put("2_1_4_autumn", 0.34);

        //7
        map3.put("2_2_1_winter", 0.82);
        map3.put("2_2_1_spring", 1.17);
        map3.put("2_2_1_summer", 0.67);
        map3.put("2_2_1_autumn", 0.77);

        map3.put("2_2_2_winter", 0.72);
        map3.put("2_2_2_spring", 1.07);
        map3.put("2_2_2_summer", 0.58);
        map3.put("2_2_2_autumn", 0.68);

        map3.put("2_2_3_winter", 0.68);
        map3.put("2_2_3_spring", 1.03);
        map3.put("2_2_3_summer", 0.54);
        map3.put("2_2_3_autumn", 0.63);

        map3.put("2_2_4_winter", 0.68);
        map3.put("2_2_4_spring", 1.03);
        map3.put("2_2_4_summer", 0.53);
        map3.put("2_2_4_autumn", 0.63);

        //8 
        map3.put("2_3_1_winter", 0.61);
        map3.put("2_3_1_spring", 0.77);
        map3.put("2_3_1_summer", 0.55);
        map3.put("2_3_1_autumn", 0.59);

        map3.put("2_3_2_winter", 0.52);
        map3.put("2_3_2_spring", 0.68);
        map3.put("2_3_2_summer", 0.47);
        map3.put("2_3_2_autumn", 0.50);

        map3.put("2_3_3_winter", 0.48);
        map3.put("2_3_3_spring", 0.64);
        map3.put("2_3_3_summer", 0.42);
        map3.put("2_3_3_autumn", 0.46);

        map3.put("2_3_4_winter", 0.48);
        map3.put("2_3_4_spring", 0.64);
        map3.put("2_3_4_summer", 0.42);
        map3.put("2_3_4_autumn", 0.45);

        //9 
        map3.put("2_4_1_winter", 0.60);
        map3.put("2_4_1_spring", 0.66);
        map3.put("2_4_1_summer", 0.57);
        map3.put("2_4_1_autumn", 0.59);

        map3.put("2_4_2_winter", 0.51);
        map3.put("2_4_2_spring", 0.58);
        map3.put("2_4_2_summer", 0.49);
        map3.put("2_4_2_autumn", 0.51);

        map3.put("2_4_3_winter", 0.47);
        map3.put("2_4_3_spring", 0.53);
        map3.put("2_4_3_summer", 0.44);
        map3.put("2_4_3_autumn", 0.47);

        map3.put("2_4_4_winter", 0.47);
        map3.put("2_4_4_spring", 0.53);
        map3.put("2_4_4_summer", 0.44);
        map3.put("2_4_4_autumn", 0.46);

        //10
        map3.put("2_5_1_winter", 0.86);
        map3.put("2_5_1_spring", 0.80);
        map3.put("2_5_1_summer", 0.81);
        map3.put("2_5_1_autumn", 0.85);

        map3.put("2_5_2_winter", 0.74);
        map3.put("2_5_2_spring", 0.68);
        map3.put("2_5_2_summer", 0.70);
        map3.put("2_5_2_autumn", 0.73);

        map3.put("2_5_3_winter", 0.68);
        map3.put("2_5_3_spring", 0.63);
        map3.put("2_5_3_summer", 0.64);
        map3.put("2_5_3_autumn", 0.67);

        map3.put("2_5_4_winter", 0.67);
        map3.put("2_5_4_spring", 0.62);
        map3.put("2_5_4_summer", 0.63);
        map3.put("2_5_4_autumn", 0.66);


    }
}
