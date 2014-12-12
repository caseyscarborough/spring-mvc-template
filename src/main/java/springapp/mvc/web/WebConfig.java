package springapp.mvc.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"springapp.mvc"})
public class WebConfig extends WebMvcConfigurerAdapter {

  @Bean
  public TilesViewResolver viewResolver() {
    return new TilesViewResolver();
  }

  @Bean
  public TilesConfigurer tilesConfigurer() {
    TilesConfigurer configurer = new TilesConfigurer();
    configurer.setDefinitions(new String[] {
        "/WEB-INF/layouts/tiles.xml"
    });
    return configurer;
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }
}
