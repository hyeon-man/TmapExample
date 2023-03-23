package kr.ac.kopo.tmapexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class RootController {
    @RequestMapping("/tmapV3")
    public String tmapV3(){

        return "tmapV3";
    }
    @RequestMapping("/tmapV2")
    public String tMapv2(){

        return "tmapV2";
    }

}
