package com.jojoldu.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jojoldu.webservice.domain.posts.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {

}