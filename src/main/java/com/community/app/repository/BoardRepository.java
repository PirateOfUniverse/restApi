package com.community.app.repository;

import com.community.app.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Post, Integer> {


}
