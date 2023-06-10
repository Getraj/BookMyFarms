package com.bookmyfarms.bmf.controller;

import com.bookmyfarms.bmf.model.Farms;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/farms")
public class FarmController {

    private final ObjectMapper objectMapper;

    public FarmController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }


    @GetMapping("/listing")
    public Farms getAllFarms() throws IOException {
        return objectMapper.readValue(new File("src/main/resources/templates/HotelRegistration.json"), Farms.class);
    }
}
