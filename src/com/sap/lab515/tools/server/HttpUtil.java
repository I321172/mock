package com.sap.lab515.tools.server;

import com.sap.lab515.tools.server.http.HttpClientBean;
import com.sap.lab515.tools.server.http.HttpClientUtil;

public class HttpUtil
{
    private static HttpClientUtil util         = new HttpClientUtil();
    private static String         cf07         = "http://dc13qaautocandcfapp07.lab.od.sap.biz:8080/login?company=datPLT11&username=admin&password=pwd";
    private static String         provisioning = "https://qacand.sflab.ondemand.com/provisioning_login?server=qacand";

    public static String getResponseId() throws Exception
    {
        HttpClientBean bean = util.fetchWeb(provisioning);
        return bean.getFetchInfo();

    }

    public static void main(String args[]) throws Exception
    {
        String body = getResponseId();
        System.out.println(body);
    }

}
