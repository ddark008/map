package ru.ddark008.map.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MapServiceTest {
    @Autowired
    MapService mapService;

    @Test
    void get() {
        mapService.set(1,1);
        assertEquals(1, mapService.get(1));
    }

    @Test
    void setAll() {
        mapService.set(1,1);
        mapService.setAll(2);
        assertEquals(2, mapService.get(1));
    }
}