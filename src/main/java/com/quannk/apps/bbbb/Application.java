package com.quannk.apps.bbbb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        String url = "http://localhost:8080/greeting";
//        if (Desktop.isDesktopSupported()) {
//            Desktop desktop = Desktop.getDesktop();
//            desktop.browse(new URI(url));
//        } else {
//            Runtime runtime = Runtime.getRuntime();
//            runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
//
//        }
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}
