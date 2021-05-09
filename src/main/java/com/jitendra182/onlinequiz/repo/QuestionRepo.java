package com.jitendra182.onlinequiz.repo;

import org.springframework.stereotype.Repository;

import com.jitendra182.onlinequiz.model.Question;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface QuestionRepo extends JpaRepository<Question,Integer>{

}
