package kr.ac.kopo.tmapexample.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

public class TmapAPI {
    private String apiKey = "yIMaVf12xnauu7aRo40iL6EWEJXjwVhnbBr6Lc3d";
    public String getTmapApiKey() {

        return apiKey;
    }
}
