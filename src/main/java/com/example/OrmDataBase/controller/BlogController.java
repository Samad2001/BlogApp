package com.example.OrmDataBase.controller;

import com.example.OrmDataBase.model.entity.Blog;
import com.example.OrmDataBase.service.lmpl.BlogServicelmpl;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/blogs")
//@AllArgsConstructor
public class BlogController {

    private final BlogServicelmpl blogServicelmpl;

    public BlogController(BlogServicelmpl blogServicelmpl) {
        this.blogServicelmpl = blogServicelmpl;
    }

    @GetMapping
    public List<Blog> getAll(){
        return blogServicelmpl.getBlogs();
    }

    @GetMapping("/{id}")
    public Blog getById(@PathVariable Integer id){
        return blogServicelmpl.getById(id);
    }


    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveBlog(@RequestBody Blog blog){
        blogServicelmpl.saveBlog(blog);
    }

    @DeleteMapping("/{id}")
    public void deleteBlog(@PathVariable Integer id){
        blogServicelmpl.deleteBlog(id);
    }


}
