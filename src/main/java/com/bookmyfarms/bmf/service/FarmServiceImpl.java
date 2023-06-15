package com.bookmyfarms.bmf.service;

import com.bookmyfarms.bmf.model.GetAllFarmsResponse;
import com.bookmyfarms.bmf.model.InsertFarmsRequest;
import com.bookmyfarms.bmf.model.InsertFarmsResponse;
import com.bookmyfarms.bmf.repository.FarmRepository;
import org.springframework.stereotype.Service;

@Service
public class FarmServiceImpl implements FarmService{

    private final FarmRepository repository;

    public FarmServiceImpl(FarmRepository repository) {
        this.repository = repository;
    }


    @Override
    public GetAllFarmsResponse getAllFarms() {
        return null;
    }

    @Override
    public InsertFarmsResponse saveFarms(InsertFarmsRequest request) {
        return null;
    }
}
