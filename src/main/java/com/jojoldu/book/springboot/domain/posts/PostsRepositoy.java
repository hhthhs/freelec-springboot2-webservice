package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepositoy extends JpaRepository<Posts,Long> {

    @Query("SELECT p FROM Posts p ORDER BY [.id DESC")
    List<Posts> findAllDesc();

}
