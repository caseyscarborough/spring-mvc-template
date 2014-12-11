package springapp.mvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;

@Configuration
@ComponentScan(basePackages = {"springapp.mvc"},
    excludeFilters={
        @ComponentScan.Filter(type= FilterType.CUSTOM, value=ApplicationConfig.WebPackage.class)
    })
public class ApplicationConfig {
  public static class WebPackage extends RegexPatternTypeFilter {
    public WebPackage() {
      super(Pattern.compile("springapp\\.mvc\\.web"));
    }
  }
}
