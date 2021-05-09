package com.jitendra182.onlinequiz.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jitendra182.onlinequiz.model.Question;
import com.jitendra182.onlinequiz.repo.QuestionRepo;
import com.jitendra182.onlinequiz.service.QuestionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class QuestionServiceImpl implements QuestionService{
	
	
	private final QuestionRepo questionRepo;

	@Override
	public Question saveQuestion(Question question) {
		return questionRepo.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		return questionRepo.findAll();
	}

	@Override
	public Optional<Question> getQuestionById(int id) {
		return questionRepo.findById(id);
	}

	@Override
	public String deleteQuestionById(int id) {
		 questionRepo.deleteById(id);
		 return null;
	}

	

}
