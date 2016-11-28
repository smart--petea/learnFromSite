package com.memorynotfound.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by root on 11/28/16.
 */
public class ServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfig.class };
    }

    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
