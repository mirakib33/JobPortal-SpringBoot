package com.misoft.jobportal.controller;

import com.misoft.jobportal.entity.admin.JobCategory;
import com.misoft.jobportal.service.admin.JobCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private JobCategoryService jobCategoryService;

    @GetMapping("/job-category")
    public List<JobCategory> get() {
        return jobCategoryService.get();
    }
}
