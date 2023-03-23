package kr.ac.kopo.tmapexample.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kr.ac.kopo.tmapexample.api.ApiService;
import kr.ac.kopo.tmapexample.api.Marker;
import kr.ac.kopo.tmapexample.api.Paser;
import kr.ac.kopo.tmapexample.api.Weather;
import kr.ac.kopo.tmapexample.dto.SimpleResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/tmap/api")
public class TmapRestController {
    final ApiService api;

    public TmapRestController(ApiService api) {
        this.api = api;
    }
    Paser paser = new Paser();


    @RequestMapping("/map")
    public Mono<String> getMap() {

        return api.getMap();
    }

    @PostMapping("/marker")
    public Marker addMarker(@RequestBody Marker marker) {

        return marker;
    }

    @PostMapping("/changeAddress")
    public ResponseEntity<SimpleResponseDto> changeAddress(@RequestBody String splitResult) throws Exception {
        String substring = splitResult.substring(1, splitResult.length()-1);

        SimpleResponseDto changer = paser.changer(substring);

        return ResponseEntity.ok().body(changer);
    }
}


