package com.misoft.jobportal.service.employer;

import com.misoft.jobportal.entity.employer.FreeJobPost;
import com.misoft.jobportal.repository.employer.FreeJobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FreeJobPostService {

    @Autowired
    private FreeJobPostRepository freeJobPostRepository;

    public void save(FreeJobPost freeJobPost) {
        freeJobPostRepository.save(freeJobPost);
    }

    public List<FreeJobPost> get() {
        return freeJobPostRepository.findAll();
    }

    public FreeJobPost getById(Long id) {
        Optional<FreeJobPost> data = freeJobPostRepository.findById(id);
        FreeJobPost freeJobPost = null;
        if (data.isPresent()) {
            freeJobPost = data.get();
        }
        return freeJobPost;
    }


    public void delete(FreeJobPost freeJobPost) {
        freeJobPostRepository.delete(freeJobPost);
    }
}
