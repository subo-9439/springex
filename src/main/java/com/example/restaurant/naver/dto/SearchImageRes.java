package com.example.restaurant.naver.dto;

import lombok.Data;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.List;

@Data
public class SearchImageRes {
    private String localBuildDate;
    private int total;
    private int start;
    private int display;
    private List<SearchImageItem> items;


    @Data
    public static class SearchImageItem{
        private String title;
        private String link;
        private String thumbnail;
        private String sizeheight;
        private String sizewidth;
    }

}

