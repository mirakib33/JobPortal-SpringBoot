package com.misoft.jobportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.misoft.jobportal.service.FileUploadService;

@SpringBootApplication
public class JobPortalApplication implements CommandLineRunner {

	@Autowired
	FileUploadService fileUploadService;
	
	@Override
	public void run(String...args) throws Exception {
		fileUploadService.init();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}

}
