package com.example.viewresolvertest.config;

import org.springframework.web.servlet.View;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import java.util.Locale;

public class CustomThymeleafViewResolver extends ThymeleafViewResolver {
    @Override
    public View createView(String viewName, Locale locale) throws Exception {
        return super.createView(viewName, locale);
    }
}
