package com.example.Jan2023.repository;

import com.example.Jan2023.model.Customerinfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerinfoRepository extends JpaRepository<Customerinfo, Integer> {

}
