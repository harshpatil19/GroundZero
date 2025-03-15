package com.GroundZero.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GroundZero.Entity.Comments;


@Repository
public interface CommentsRepo extends JpaRepository<Comments, Integer> {

}
