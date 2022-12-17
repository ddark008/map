package ru.ddark008.map.repositories;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class MapComponent {
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public ConcurrentHashMap<Integer, Integer> getMap(){
        return new ConcurrentHashMap<>();
    }
}
