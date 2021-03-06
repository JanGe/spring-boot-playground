package com.comsysto.boot.neo4j;

import org.neo4j.kernel.impl.util.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class Application
{
    public static void main(String[] args) throws IOException
    {
        FileUtils.deleteRecursively(new File("test.db"));
        SpringApplication.run(Application.class, args);
    }
}


