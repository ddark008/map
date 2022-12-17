package ru.ddark008.map.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

@Service
public class MapService {
    ConcurrentHashMap<Integer, Integer> map;

    @Autowired
    public MapService(ConcurrentHashMap<Integer, Integer> map) {
        this.map = map;
    }

    int get(int i){
        return map.get(i);
    }
    void set(int i, int v){
        map.put(i,v);
    }
    void setAll(int v){
        map.replaceAll((key, val) -> v);
    }
}
