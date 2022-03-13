package ru.geekbrains.rover.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.rover.dto.Planet;
import ru.geekbrains.rover.service.PlanetDiscoveryService;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;
import static org.springframework.util.MimeTypeUtils.TEXT_PLAIN_VALUE;

@RestController
public class DiscoveryController {

    private final PlanetDiscoveryService planetDiscoveryService;

    @Autowired
    public DiscoveryController(PlanetDiscoveryService planetDiscoveryService) {
        this.planetDiscoveryService = planetDiscoveryService;
    }

    @RequestMapping(
            value = "/discover/planet",
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE)
    public Planet discoverPlanet() {
        return planetDiscoveryService.getPlanetForDiscovery();
    }
}
