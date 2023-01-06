package com.example.Jan2023.repository;

import com.example.Jan2023.model.Customerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerinfoRepository extends JpaRepository<Customerinfo, Integer> {

}
