package com.mystream;

public class SurveyReport {
	private int surveyId;
    private String employeeName;
    private String location;
    private int totalConnectionRequest;
    private int noOfDaysForRequestCompletion;
    private int averageRequestPerDay;

   
    public SurveyReport(int surveyId, String employeeName, String location,
                        int totalConnectionRequest, int noOfDaysForRequestCompletion,int averageRequestPerDay) {
        this.surveyId = surveyId;
        this.employeeName = employeeName;
        this.location = location;
        this.totalConnectionRequest = totalConnectionRequest;
        this.noOfDaysForRequestCompletion = noOfDaysForRequestCompletion;
        this.averageRequestPerDay=averageRequestPerDay;
}


	public int getSurveyId() {
		return surveyId;
	}


	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getTotalConnectionRequest() {
		return totalConnectionRequest;
	}


	public void setTotalConnectionRequest(int totalConnectionRequest) {
		this.totalConnectionRequest = totalConnectionRequest;
	}


	public int getNoOfDaysForRequestCompletion() {
		return noOfDaysForRequestCompletion;
	}


	public void setNoOfDaysForRequestCompletion(int noOfDaysForRequestCompletion) {
		this.noOfDaysForRequestCompletion = noOfDaysForRequestCompletion;
	}


	public int getAverageRequestPerDay() {
		return averageRequestPerDay;
	}


	public void setAverageRequestPerDay(int averageRequestPerDay) {
		this.averageRequestPerDay = averageRequestPerDay;
	}


	@Override
	public String toString() {
		return "SurveyReport [surveyId=" + surveyId + ", employeeName=" + employeeName + ", location=" + location
				+ ", totalConnectionRequest=" + totalConnectionRequest + ", noOfDaysForRequestCompletion="
				+ noOfDaysForRequestCompletion + ", averageRequestPerDay=" + averageRequestPerDay + "]";
	}
}
