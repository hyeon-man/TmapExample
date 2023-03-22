package kr.ac.kopo.tmapexample.api;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class ApiService {
    WebClient client = WebClient.create();
    TmapAPI api = new TmapAPI();


    public Mono<String> getMap() {
        String apikey = api.getTmapApiKey();
        return client.get()
                .uri("https://apis.openapi.sk.com/tmap/vectorjs?version=1&appKey=" + apikey)
                .retrieve()
                .bodyToMono(String.class);
    }
}
