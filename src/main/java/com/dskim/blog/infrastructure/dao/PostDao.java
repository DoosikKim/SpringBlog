package com.dskim.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dskim.blog.domain.model.entity.Post;

public interface PostDao extends JpaRepository<Post, Integer> {

}
