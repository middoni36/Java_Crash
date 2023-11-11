package org.javaHttpRequest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HttpReq {


    private String url;
    private HashMap<String,String> query_params;
    private HashMap<String,String> header_params;


   public HttpReq(String url){

       this.url=url;

   }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HashMap<String, String> getQuery_param() {
        return this.query_params;
    }

    public void setQuery_param(HashMap<String, String> query_param) {
        this.query_params = query_param;
    }

    public HashMap<String, String> getHeader_params() {
        return this.header_params;
    }

    public void setHeader_params(String head_name, String head_value) {

       this.header_params.put(head_name,head_value);


    }
}
