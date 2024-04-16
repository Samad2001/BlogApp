package com.example.OrmDataBase.service.lmpl;

import com.example.OrmDataBase.model.entity.Blog;
import com.example.OrmDataBase.repository.BlogRepository;
import com.example.OrmDataBase.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BlogServicelmpl implements BlogService {

    private final BlogRepository blogRepository;

    @Override
    public List<Blog> getBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public Blog getById(Integer id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Blog saveBlog(Blog blog) {
         blogRepository.save(blog);
         return blog;
    }

    @Override
    public void deleteBlog(Integer id) {
        blogRepository.deleteById(id);
    }
}
