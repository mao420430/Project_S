package com.xiao.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IWebServer {
    @WebMethod
    Integer errCode();

    @WebMethod
    String out();

    @WebMethod
    String save(String name, String pwd);
}
