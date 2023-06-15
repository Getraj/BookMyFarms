package com.bookmyfarms.bmf.service;

import com.bookmyfarms.bmf.model.InsertFarmsResponse;
import com.bookmyfarms.bmf.repository.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    private final FarmRepository repository;

    public AuthService(FarmRepository repository) {
        this.repository = repository;
    }

}
