package com.lucasgr7.Bangular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableAutoConfiguration
public class App  
{

    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication(App.class);app.run(args);
    }
}
