package com.xavient.pojo;
import java.util.ArrayList;

public class QuestionAnswer {

	public QuestionAnswer() {

	}

	public QuestionAnswer(String question, int answer , ArrayList<String> optionList) {
		super();
		this.question = question;
		this.answer = answer;
		this.optionList = optionList ;
	}

	String question;
	int answer;
	
	ArrayList<String> optionList  ;

	public ArrayList<String> getOptionList() {
		return optionList;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

}
