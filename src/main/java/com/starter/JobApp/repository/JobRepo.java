package com.starter.JobApp.repository;

import com.starter.JobApp.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepo  extends JpaRepository<JobPost , Integer> {


    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);

}

