package ua.shaman.configuration;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "ua.shaman")
public class AppConfiguration extends WebMvcConfigurerAdapter {
	
    @Bean(name="HelloWorld")
    public ViewResolver viewResolver() {
            InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
            viewResolver.setViewClass(JstlView.class);
            viewResolver.setPrefix("/WEB-INF/views/");
            viewResolver.setSuffix(".jsp");

            return viewResolver;
    }


    @Bean 
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource = 
                new ReloadableResourceBundleMessageSource();
        messageSource.setBasename("/i18/soldierlistmsg");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

    @Bean
    public LocaleResolver localeResolver(){
        CookieLocaleResolver resolver = new CookieLocaleResolver();
        resolver.setDefaultLocale(new Locale("en"));
        resolver.setCookieName("LocaleCookies");
        resolver.setCookieMaxAge(4800);
        return resolver;
    }
        
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        LocaleChangeInterceptor interceptor = new LocaleChangeInterceptor();
        interceptor.setParamName("locale");
        registry.addInterceptor(interceptor);
    } 
        
    /*
     * Configure ResourceHandlers to serve static resources like CSS/ Javascript etc...
     *
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/static/**").addResourceLocations("/static/");
        registry.addResourceHandler("/assets/**").addResourceLocations("/assets/");
    }
    
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}