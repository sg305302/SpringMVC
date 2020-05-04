package org.homelab.mvc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("org.homelab.mvc")
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void  configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp();
    }
}
