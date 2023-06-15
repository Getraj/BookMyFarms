package com.bookmyfarms.bmf.service;

import com.bookmyfarms.bmf.model.GetAllFarmsResponse;
import com.bookmyfarms.bmf.model.InsertFarmsRequest;
import com.bookmyfarms.bmf.model.InsertFarmsResponse;
import org.springframework.stereotype.Service;

public interface FarmService {

    public GetAllFarmsResponse getAllFarms();

    public InsertFarmsResponse saveFarms(InsertFarmsRequest request);

}
