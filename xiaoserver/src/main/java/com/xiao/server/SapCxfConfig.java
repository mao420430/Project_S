package com.xiao.server;
//
//
//import java.util.Set;
//import javax.jws.WebMethod;
//import javax.jws.WebParam;
//import javax.jws.WebService;
//import javax.xml.transform.Result;
//import org.apache.cxf.Bus;
//import org.apache.cxf.bus.spring.SpringBus;
//import org.apache.cxf.transport.servlet.CXFServlet;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//
//@Component
//@WebService(serviceName="sapPushExpenseWebservice")
//public class SapPushExpenseWebservice  {
//    private static Logger logger = LoggerFactory.getLogger(SapPushExpenseWebservice.class);
//    @WebMethod
//    public Result<Object> pushExpense(@WebParam(name="expenseDTOSet") Set<String> expenseDTOSet) {
//        logger.info(JSON.toJSONString(expenseDTOSet));
//        return null;
//    }
//}
//
//@Configuration
public class SapCxfConfig {
//    @Bean
//    public ServletRegistrationBean dispatcherServlet(){
//        return new ServletRegistrationBean(new CXFServlet(), "/sap/soap/*");
//    }
//
//    @Bean(name = Bus.DEFAULT_BUS_ID)
//    public SpringBus springBus(){
//        return new SpringBus();
//    }
//
//    @Bean
//    public ISapPushExpenseWebservice
}
