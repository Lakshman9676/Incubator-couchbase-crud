package com.lakshman.blogs.repository;

import com.lakshman.blogs.models.Blogs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BlogRepository extends CrudRepository<Blogs, String> {
    
    Blogs findByAuthor(String author);
    
    List<Blogs> deleteBytopicAndAuthor(String title, String author);
}