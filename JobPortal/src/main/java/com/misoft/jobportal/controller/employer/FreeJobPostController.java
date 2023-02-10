package com.misoft.jobportal.controller.employer;

import com.misoft.jobportal.entity.employer.FreeJobPost;
import com.misoft.jobportal.service.employer.FreeJobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RequestMapping("/employer")
public class FreeJobPostController {

    @Autowired
    private FreeJobPostService freeJobPostService;

    @PostMapping("/freelance-job-post")
    public FreeJobPost save(@RequestBody FreeJobPost freeJobPost) {
        freeJobPostService.save(freeJobPost);
        return freeJobPost;
    }

    @GetMapping("/freelance-job-post")
    public List<FreeJobPost> get() {
        return freeJobPostService.get();
    }

    @GetMapping("/freelance-job-post/{id}")
    public FreeJobPost getById(@PathVariable Long id) {
        FreeJobPost freeJobPost = freeJobPostService.getById(id);
        return freeJobPost;
    }

    @PutMapping("/freelance-job-post/{id}")
    public FreeJobPost update(@PathVariable Long id, @RequestBody FreeJobPost freeJobPost) {
        FreeJobPost post = freeJobPostService.getById(id);

        post.setId(freeJobPost.getId());
        post.setJobCategory(freeJobPost.getJobCategory());
        post.setJobTitle(freeJobPost.getJobTitle());
        post.setCompanyName(freeJobPost.getCompanyName());
        post.setJobType(freeJobPost.getJobType());
        post.setExperienceLevel(freeJobPost.getExperienceLevel());
        post.setProjectLength(freeJobPost.getProjectLength());
        post.setWorkplace(freeJobPost.getWorkplace());
        post.setPrice(freeJobPost.getPrice());
        post.setDeadline(freeJobPost.getDeadline());
        post.setRequiredSkills(freeJobPost.getRequiredSkills());
        post.setDescription(freeJobPost.getDescription());
        freeJobPostService.save(post);
        return post;
    }



    @DeleteMapping("/freelance-job-post/{id}")
    public FreeJobPost delete(@PathVariable Long id) {
        FreeJobPost freeJobPost = freeJobPostService.getById(id);
        freeJobPostService.delete(freeJobPost);
        return freeJobPost;
    }

}
