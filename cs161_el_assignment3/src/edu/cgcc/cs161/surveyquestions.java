package edu.cgcc.cs161;

public class surveyquestions {
	//fields
	private int questionNumber;
	private String Question;
	//constructors
	void surveyQuestions() {
		questionNumber = 11;
		Question = "Do you have any form of viral symptoms?";
	}
	//operators
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int a) {
		questionNumber = a;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String b) {
		Question = b;
	}
}
