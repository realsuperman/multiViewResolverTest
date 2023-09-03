package com.example.viewresolvertest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import java.util.Locale;

@RequiredArgsConstructor
@Component
public class CustomViewResolver implements ViewResolver, Ordered {
    private final UrlBasedViewResolver urlBasedViewResolver;
    private final CustomThymeleafViewResolver customThymeleafViewResolver;

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        if (viewName.endsWith(".jsp")) {
            return urlBasedViewResolver.resolveViewName("WEB-INF/views/"+viewName, locale);
        } else if (viewName.endsWith(".html")) {
            return customThymeleafViewResolver.createView(viewName,locale);
        }
        return null;
    }

    @Override
    public int getOrder() {
        return Integer.MIN_VALUE;
    }
}