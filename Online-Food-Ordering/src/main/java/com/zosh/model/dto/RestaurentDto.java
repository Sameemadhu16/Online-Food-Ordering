package com.zosh.model.dto;

import java.util.List;

import jakarta.persistence.Column;
import lombok.Data;


@Data
public class RestaurentDto {
    
    private String title;

    @Column(length = 1000)
    private List<String> images;

    private String description;
    private Long id;
}
