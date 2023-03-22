package kr.ac.kopo.tmapexample.controller;

import kr.ac.kopo.tmapexample.api.ApiService;
import kr.ac.kopo.tmapexample.api.Marker;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tmap/api")
public class TmapRestController {
    final ApiService api;

    public TmapRestController(ApiService api) {
        this.api = api;
    }

    @RequestMapping("/map")
    public Mono<String> getMap() {

        return api.getMap();
    }

    @PostMapping("/marker")
    public void addMarker(@RequestBody Marker marker) {

        System.out.println(marker.getLat() + " lat 값, " + marker.getLng() + " lng 값");
    }
}


