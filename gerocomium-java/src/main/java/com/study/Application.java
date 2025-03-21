package com.spring;

import net.jntoo.util.AppUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * application 启动类，也就是传说中的spring boot 启动类了
 */
@SpringBootApplication
@MapperScan(basePackages = { "com.spring.dao" })  // mapper 扫描一下这个包
public class Application {
    static public ConfigurableApplicationContext content = null;
    public static void main(String[] args) {

        content = SpringApplication.run(Application.class, args);
        //content.getBean(DataSource.class);
        System.out.println("["+ Application.class.getPackage().getName()+"]");
        AppUtil.bootstrap(Application.class.getPackage().getName()+".util");
    }
    /**
     * 设置匹配.do后缀的请求
     * @param dispatcherServlet
     * @return
     */

     /*
    @Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean bean = new ServletRegistrationBean(dispatcherServlet);
        bean.addUrlMappings("*.do");
        return bean;
    }
    */

}
