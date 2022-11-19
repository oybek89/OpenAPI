package uz.edu.openAPIDogsSec.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

@Configuration
public class DogConfiguration {
//    @Bean
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        return builder
//                .setConnectTimeout(Duration.ofSeconds(60))
//                .setReadTimeout(Duration.ofSeconds(60))
//                .build();
//    }
}
