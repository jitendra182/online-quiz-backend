package com.jitendra182.onlinequiz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int questionId;

	@Column(nullable = false)
	private String question;
	@Column(nullable = false)
	private String options;
	@Column(nullable = false)
	private int answer;
}
