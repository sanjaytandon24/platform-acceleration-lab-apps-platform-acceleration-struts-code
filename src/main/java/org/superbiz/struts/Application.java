package org.superbiz.struts;

import com.opensymphony.module.sitemesh.filter.PageFilter;
import org.apache.struts2.dispatcher.ActionContextCleanUp;
import org.apache.struts2.dispatcher.FilterDispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import static java.util.Collections.singletonList;

@SpringBootApplication
public class Application {

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public FilterRegistrationBean filterDispatcher() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new FilterDispatcher());
        registration.setUrlPatterns(singletonList("/*"));
        registration.setOrder(0);
        return registration;
    }

    @Bean
    public FilterRegistrationBean actionContextCleanup() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new ActionContextCleanUp());
        registration.setUrlPatterns(singletonList("/*"));
        registration.setOrder(1);
        return registration;
    }

    @Bean
    public FilterRegistrationBean sitemeshPageFilter() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new PageFilter());
        registration.setUrlPatterns(singletonList("/*"));
        registration.setOrder(2);
        return registration;
    }
}
