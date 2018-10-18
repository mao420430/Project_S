package com.xiao.server;


import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class WebServerImpl implements IWebServer{

    @Override
    public Integer errCode() {
        return null;
    }

    @Override
    public String out() {
        return null;
    }

    @Override
    public String save(String name, String pwd) {
        return null;
    }
}
