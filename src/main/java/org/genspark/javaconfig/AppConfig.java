package org.genspark.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value="classpath:input.properties")
public class AppConfig {
    @Bean
    public Student getStudent(){
        return new Student();
    }
    @Bean
    public Address getAddress(){
        return new Address();
    }
    @Bean
    public Phone getPhone(){
        return new Phone();
    }
}
