package com.java.yanlu.dataprocess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChartData {
    public static List<String> domestic_zh = new ArrayList<String>();
    public static List<String> international = new ArrayList<String>();
    public Map<String, String> domestic = new HashMap<String, String>();


    public String name;
    public String begin;
    public List<Integer> confirmed;
    public List<Integer> cured;
    public List<Integer> dead;


    public ChartData(){
        domestic_zh.clear();
        international.clear();
        name="";
        begin="";
        confirmed = new ArrayList<Integer>();
        cured = new ArrayList<Integer>();
        dead = new ArrayList<Integer>();

        international.add("United States of America");
        international.add("China");
        international.add("Brazil");
        international.add("India");
        international.add("United Kingdom");
        international.add("Russia");
        international.add("Bangladesh");
        international.add("Peru");
        international.add("Mexico");
        international.add("Spain");
        international.add("Pakistan");
        international.add("Argentina");
        international.add("Egypt");
        international.add("Saudi Arabia");
        international.add("Philippines");
        international.add("Indonesia");
        international.add("Netherlands");
        international.add("Iraq");
        international.add("Canada");
        international.add("Ukraine");
        international.add("Kazakhstan");
        international.add("Guatemala");
        international.add("Israel");
        international.add("Iran");
        international.add("Oman");
        international.add("Nigeria");
        international.add("Turkey");
        international.add("Afghanistan");
        international.add("Armenia");
        international.add("Romania");
        international.add("Kuwait");
        international.add("United Arab Emirates");
        international.add("Azerbaijan");
        international.add("Poland");
        international.add("Belarus");
        international.add("Kenya");
        international.add("Palestine");
        international.add("Moldova");
        international.add("Uzbekistan");
        international.add("Nepal");
        international.add("El Salvador");
        international.add("Japan");
        international.add("Singapore");
        international.add("Germany");
        international.add("Czechia");
        international.add("Bosnia and Herz.");
        international.add("Bulgaria");
        international.add("Sudan");
        international.add("Bahrain");
        international.add("Luxembourg");
        international.add("Ghana");
        international.add("Ethiopia");
        international.add("Mauritania");
        international.add("Senegal");
        international.add("Morocco");
        international.add("Albania");
        international.add("Switzerland");
        international.add("South Korea");
        international.add("Libya");
        international.add("Lithuania");
        international.add("Latvia");
        international.add("Estonia");
        international.add("Hungary");
        international.add("Cyprus");
        international.add("São Tomé and Principe");
        international.add("Angola");
        international.add("Syria");
        international.add("Finland");
        international.add("Slovenia");
        international.add("Niger");
        international.add("Georgia");
        international.add("Guyana");
        international.add("Thailand");
        international.add("Uruguay");
        international.add("Mauritius");
        international.add("Tajikistan");
        international.add("South Africa");
        international.add("Colombia");
        international.add("Sweden");
        international.add("France");
        international.add("Ecuador");
        international.add("Bolivia");
        international.add("Belgium");
        international.add("Panama");
        international.add("Dominican Rep.");
        international.add("Honduras");
        international.add("Chile");
        international.add("Portugal");
        international.add("Italy");
        international.add("Puerto Rico");
        international.add("Serbia");
        international.add("Venezuela");
        international.add("Costa Rica");
        international.add("Côte d'Ivoire");
        international.add("Haiti");
        international.add("Algeria");
        international.add("Dem. Rep. Congo");
        international.add("Macedonia");
        international.add("Cameroon");
        international.add("Qatar");
        international.add("Central African Rep.");
        international.add("Madagascar");
        international.add("Denmark");
        international.add("Nicaragua");
        international.add("Gabon");
        international.add("Australia");
        international.add("Greece");
        international.add("Paraguay");
        international.add("Eq. Guinea");
        international.add("Somalia");
        international.add("Austria");
        international.add("Cuba");
        international.add("Malawi");
        international.add("Djibouti");
        international.add("Guinea");
        international.add("Croatia");
        international.add("Benin");
        international.add("Lebanon");
        international.add("Mozambique");
        international.add("Namibia");
        international.add("Chad");
        international.add("Mali");
        international.add("Jamaica");
        international.add("eSwatini");
        international.add("Zimbabwe");
        international.add("Rwanda");
        international.add("Sri Lanka");
        international.add("San Marino");
        international.add("Liberia");
        international.add("Togo");
        international.add("Norway");
        international.add("Sierra Leone");
        international.add("Ireland");
        international.add("Maldives");
        international.add("Slovakia");
        international.add("Botswana");
        international.add("Jordan");
        international.add("Andorra");
        international.add("Tanzania");
        international.add("Isle of Man");
        international.add("Guam");
        international.add("Malta");
        international.add("Jersey");
        international.add("Malaysia");
        international.add("Suriname");
        international.add("Tunisia");
        international.add("Guernsey");
        international.add("Mongolia");
        international.add("Lesotho");
        international.add("Cayman Is.");
        international.add("Faeroe Is.");
        international.add("Gibraltar");
        international.add("Burkina Faso");
        international.add("Iceland");
        international.add("Uganda");
        international.add("Trinidad and Tobago");
        international.add("Myanmar");
        international.add("Vietnam");
        international.add("Bahamas");
        international.add("Seychelles");
        international.add("Barbados");
        international.add("Monaco");
        international.add("Fr. Polynesia");
        international.add("Bhutan");
        international.add("Antigua and Barb.");
        international.add("Gambia");
        international.add("Cambodia");
        international.add("Sint Maarten");
        international.add("Belize");
        international.add("St. Vin. and Gren.");
        international.add("Fiji");
        international.add("Saint Lucia");
        international.add("Laos");
        international.add("Liechtenstein");
        international.add("Vatican");
        international.add("Papua New Guinea");
        international.add("Brunei");
        international.add("New Zealand");
        international.add("Turkmenistan");
        international.add("Montenegro");
        international.add("Kyrgyzstan");
        international.add("Congo");
        international.add("Zambia");
        international.add("Cabo Verde");
        international.add("St-Martin");
        international.add("Greenland");
        international.add("Eritrea");
        international.add("Timor-Leste");
        international.add("Dominica");
        international.add("U.S. Virgin Is.");
        international.add("American Samoa");
        international.add("N. Mariana Is.");
        international.add("Guinea-Bissau");
        international.add("Kosovo");
        international.add("Aruba");
        international.add("St. Kitts and Nevis");
        international.add("Montserrat");
        international.add("Grenada");
        international.add("Burundi");
        international.add("S. Sudan");
        international.add("Yemen");
        Collections.sort(international);
        international.add(0,"World");


        domestic_zh.add("北京");
        domestic_zh.add("香港");
        domestic_zh.add("新疆");
        domestic_zh.add("四川");
        domestic_zh.add("甘肃");
        domestic_zh.add("上海");
        domestic_zh.add("广东");
        domestic_zh.add("台湾");
        domestic_zh.add("河北");
        domestic_zh.add("陕西");
        domestic_zh.add("山西");
        domestic_zh.add("云南");
        domestic_zh.add("重庆");
        domestic_zh.add("内蒙古");
        domestic_zh.add("山东");
        domestic_zh.add("浙江");
        domestic_zh.add("天津");
        domestic_zh.add("辽宁");
        domestic_zh.add("福建");
        domestic_zh.add("江苏");
        domestic_zh.add("海南");
        domestic_zh.add("澳门");
        domestic_zh.add("吉林");
        domestic_zh.add("湖北");
        domestic_zh.add("江西");
        domestic_zh.add("黑龙江");
        domestic_zh.add("安徽");
        domestic_zh.add("贵州");
        domestic_zh.add("湖南");
        domestic_zh.add("河南");
        domestic_zh.add("广西");
        domestic_zh.add("宁夏");
        domestic_zh.add("青海");
        domestic_zh.add("西藏");

        domestic.put("北京","China|Beijing");
        domestic.put("香港","China|Hong Kong");
        domestic.put("新疆","China|Xinjiang");
        domestic.put("四川","China|Sichuan");
        domestic.put("甘肃","China|Gansu");
        domestic.put("上海","China|Shanghai");
        domestic.put("广东","China|Guangdong");
        domestic.put("台湾","China|Taiwan");
        domestic.put("河北","China|Hebei");
        domestic.put("陕西","China|Shaanxi");
        domestic.put("山西","China|Shanxi");
        domestic.put("云南","China|Yunnan");
        domestic.put("重庆","China|Chongqing");
        domestic.put("内蒙古","China|Inner Mongol");
        domestic.put("山东","China|Shandong");
        domestic.put("浙江","China|Zhejiang");
        domestic.put("天津","China|Tianjin");
        domestic.put("辽宁","China|Liaoning");
        domestic.put("福建","China|Fujian");
        domestic.put("江苏","China|Jiangsu");
        domestic.put("海南","China|Hainan");
        domestic.put("澳门","China|Macao");
        domestic.put("吉林","China|Jilin");
        domestic.put("湖北","China|Hubei");
        domestic.put("江西","China|Jiangxi");
        domestic.put("黑龙江","China|Heilongjiang");
        domestic.put("安徽","China|Anhui");
        domestic.put("贵州","China|Guizhou");
        domestic.put("湖南","China|Hunan");
        domestic.put("河南","China|Henan");
        domestic.put("广西","China|Guangxi");
        domestic.put("宁夏","China|Ningxia");
        domestic.put("青海","China|Qinghai");
        domestic.put("西藏","China|Xizang");

    }

}
