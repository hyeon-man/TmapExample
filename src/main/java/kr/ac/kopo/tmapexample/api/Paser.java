package kr.ac.kopo.tmapexample.api;

import kr.ac.kopo.tmapexample.dto.SimpleResponseDto;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;
import static javax.swing.UIManager.removeAuxiliaryLookAndFeel;

public class Paser {

    private Map<String, String> locationMap = new HashMap<String, String>() {{
        put("서울특별시", "11B10101");
        put("인천", "11B20201");
        put("경기도", "11B20601");
        put("강원도영서", "11D10301");
        put("강원도영동", "11D20401");
        put("대전광역시", "11C20401");
        put("세종특별자치도", "11C20402");
        put("충청남도", "11C20403");
        put("충청북도", "11C20404");
        put("퐝주", "11F20501");
        put("전라남도", "11F20801");
        put("전라북도", "11F20401");
        put("대구", "11H10701");
        put("경상북도", "11H20201");
        put("부산", "11H20101");
        put("울산", "11H20301");
        put("경상남도", "11H20401");
        put("제주도", "11G00101");
    }};

    public SimpleResponseDto changer(String address) {
       if (locationMap.containsKey(address)) {
           return SimpleResponseDto.get(address, locationMap.get(address));
       }

       return null;
    }
}