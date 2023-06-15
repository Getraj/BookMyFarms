package com.bookmyfarms.bmf.controller;

import com.bookmyfarms.bmf.model.GetAllFarmsResponse;
import com.bookmyfarms.bmf.model.InsertFarmsRequest;
import com.bookmyfarms.bmf.service.FarmService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/api/v1/farms")
public class FarmController {

    private final ObjectMapper objectMapper;

    private final FarmService service;

    public FarmController(ObjectMapper objectMapper, FarmService service) {
        this.objectMapper = objectMapper;
        this.service = service;
    }

    @GetMapping("/listing")
    public ResponseEntity<GetAllFarmsResponse> getAllFarms() throws IOException {
        return ResponseEntity.ok(objectMapper
                .readValue(new File("src/main/resources/templates/HotelRegistration.json"), GetAllFarmsResponse.class));
    }

    @PostMapping("/listing")
    public ResponseEntity<InsertFarmsRequest> saveFarms(@RequestBody InsertFarmsRequest request){
        service.saveFarms(request);
        return ResponseEntity.ok(request);
    }

}
