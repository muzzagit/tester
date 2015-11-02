package org.muzza.tester.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = {"org.muzza.tester"})
@EnableAutoConfiguration
public class MainApp
{
    public static void main( String[] args ) {

        SpringApplication.run(MainApp.class, args);
    }
}
