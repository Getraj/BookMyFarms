package com.bookmyfarms.bmf.repository;

import com.bookmyfarms.bmf.model.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmRepository extends CrudRepository<Data, String> {

}
