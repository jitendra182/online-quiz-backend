package com.jitendra182.onlinequiz.service;

import java.util.List;
import java.util.Optional;

import com.jitendra182.onlinequiz.model.Question;

public interface QuestionService {
	
	public Question saveQuestion(Question question);
	
	public List<Question> getAllQuestions();
	
	public Optional<Question> getQuestionById(int id);
	
	public String deleteQuestionById(int id);

}
