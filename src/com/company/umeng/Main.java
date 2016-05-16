package com.company.umeng;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String subUrl = "/v2/user/token";
        UmHttpClient.APP_KEY = "4eaee02c527015373b000003";
        UmHttpClient.APP_SECRECT = "a102852523d3070310d74f676d128a3c";
        UmHttpClient.SERVER_ADDRESS = "http://rest.test.wsq.umeng.com:8090";
        UmHttpClient.SDK_VERSION = "2.5.0";
        UmHttpClient umHttpClient = new UmHttpClient();
        HashMap<String,Object>  map = new HashMap<>();
        //map.put("test","1");
        map.put("ak",UmHttpClient.APP_KEY);
        System.out.println(umHttpClient.accessTokenRequest(map,subUrl,UmHttpClient.APP_SECRECT));
    }
}
