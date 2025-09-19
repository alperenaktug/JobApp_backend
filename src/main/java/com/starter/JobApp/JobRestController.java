package com.starter.JobApp;

import com.starter.JobApp.model.JobPost;
import com.starter.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping("jobPosts")
    private List<JobPost> getAllJobs()
    {
        return service.getAllJobs();
    }
}
