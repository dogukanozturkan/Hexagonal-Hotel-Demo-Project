package com.hexagonaldemo.hotelapi.common.rest.configuration;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.RequestDispatcher;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class CustomErrorAttributes extends DefaultErrorAttributes {

    @Bean
    public ErrorAttributes errorAttributes() {

        return new DefaultErrorAttributes() {
            @Override
            public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
                Map<String, Object> errorAttributes = super.getErrorAttributes((WebRequest) webRequest, includeStackTrace);
                Map<String, Object> newErrorAttributes = new LinkedHashMap<String, Object>();
                Object errorMessage = webRequest.getAttribute(RequestDispatcher.ERROR_MESSAGE, RequestAttributes.SCOPE_REQUEST);
                if (errorMessage != null) {
                    newErrorAttributes.put("response-type",  "error");
                    newErrorAttributes.put("error-code", errorAttributes.get("status"));
                    newErrorAttributes.put("message",  errorAttributes.get("message"));
                    newErrorAttributes.put("error-message",  errorAttributes.get("error"));
                }
                return newErrorAttributes;
            }
        };
    }
}