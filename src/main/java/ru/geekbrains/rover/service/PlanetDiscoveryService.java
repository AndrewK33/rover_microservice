package ru.geekbrains.rover.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.rover.dto.Planet;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Service
public class PlanetDiscoveryService {
    private static final Map<Integer, Planet> planetMap = new HashMap<>();
    private Planet planetForDiscover;

    @PostConstruct
    public void planetGenerate() {
        planetMap.put(0, new Planet("Mars"));
        planetMap.put(1, new Planet("Sun"));
        planetMap.put(2, new Planet("Mercury"));
        planetMap.put(3, new Planet("Venus"));
        planetMap.put(4, new Planet("Earth"));
        planetMap.put(5, new Planet("Jupiter"));
        planetMap.put(6, new Planet("Saturn"));
        planetMap.put(7, new Planet("Pandora"));
        planetMap.put(8, new Planet("X11"));

        planetForDiscover = planetMap.get(new Random().nextInt(8));
    }

    public Planet getPlanetForDiscovery() {
        return planetForDiscover;
    }

}
