package com.jitendra182.onlinequiz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jitendra182.onlinequiz.model.Question;
import com.jitendra182.onlinequiz.service.QuestionService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1")
public class QuestionController {
	
	private final QuestionService questionService;

	@GetMapping("/hii")
	public String index() {
		return "Hii";
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Question question) {
		Question saved = questionService.saveQuestion(question);
		return "Success"+ saved.getQuestionId();
	}
	
	@GetMapping("/getAll")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
}
