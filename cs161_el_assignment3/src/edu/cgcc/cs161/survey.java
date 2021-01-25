package edu.cgcc.cs161;

public class survey {
	//fields
	private int surveyNumber;
	private int questionSet; //this is assuming that both the questions and answers
	private int answerSet; //are pulled as a numerated and predetermined set
	//constructors
	void Survey() {
		surveyNumber = 203;
		questionSet = 4;
		answerSet = 4;
	}
	//operators
	public int getSurveryNumber() {
		return surveyNumber;
	}
	public void setSurveyNumber(int a) {
		surveyNumber = a;
	}
	public int getQuestionSet() {
		return questionSet;
	}
	public void setQuestionSet(int b) {
		questionSet = b;
	}
	public int getAnswerSet() {
		return answerSet;
	}
	public void setAnswerSet(int c) {
		answerSet = c;
	}
	
	
	public void displayQuestion() {
		
	}
	public void recordAnswer() {
		
	}
}
	
