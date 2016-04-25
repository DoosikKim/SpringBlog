package com.dskim.blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dskim.blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello, Integer>{

}
