package org.superbiz.struts;

import com.opensymphony.module.sitemesh.filter.PageFilter;
import org.apache.struts2.dispatcher.ActionContextCleanUp;
import org.apache.struts2.dispatcher.FilterDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.util.HashMap;

/**
 * Created by pivotal on 5/4/17.
 */
@ComponentScan("org.superbiz.struts")
@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean dispatcherFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.addInitParameter("actionPackages","com.lq");
        registrationBean.setFilter(struts2());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("struts2");
        registrationBean.setOrder(0);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean actionContextCleanUpFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.setFilter(struts_cleanup());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("struts-cleanup");

        registrationBean.setOrder(1);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean pageFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        registrationBean.setFilter(sitemesh());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("sitemesh");

        registrationBean.setOrder(2);
        return registrationBean;
    }

    @Bean
    public ActionContextCleanUp struts_cleanup()
    {
        return new ActionContextCleanUp();
    }

    @Bean
    public PageFilter sitemesh() { return new PageFilter();    }

    @Bean
    public FilterDispatcher struts2()
    {
        return new FilterDispatcher();
    }
}
