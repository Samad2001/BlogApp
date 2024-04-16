package com.example.OrmDataBase.service;

import com.example.OrmDataBase.model.entity.Blog;

import java.util.List;

public interface BlogService {

    List<Blog>  getBlogs();
    Blog getById(Integer id);

    Blog saveBlog(Blog blog);
    void deleteBlog(Integer id);
}
