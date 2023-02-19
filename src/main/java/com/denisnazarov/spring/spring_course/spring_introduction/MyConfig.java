package com.denisnazarov.spring.spring_course.spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("classpath:myApp.properties ")
//@ComponentScan("com.zaurtregulov.spring.spring_course.spring_introduction")
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }
    
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }

}
