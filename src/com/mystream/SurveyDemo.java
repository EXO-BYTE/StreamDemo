package com.mystream;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.stream.Stream;

public class SurveyDemo {
	public static void main(String[] args) {
	ArrayList<SurveyReport>surveyReportsList=new ArrayList<>();
	surveyReportsList.add(new SurveyReport(1,"Alex","Mumbai",5,3,4));
	surveyReportsList.add(new SurveyReport(2,"Ava","Delhi",4,2,5));
	surveyReportsList.add(new SurveyReport(3,"Jules","Delhi",5,7,6));
	surveyReportsList.add(new SurveyReport(4,"Evans","Mumbai",2,1,3));
	surveyReportsList.add(new SurveyReport(5,"Nick","Mumbai",3,3,4));
	
	Stream<SurveyReport> survey=surveyReportsList.stream();
	
	SurveyReport maxRequests = survey.max((a,b)->{
		if(a.getTotalConnectionRequest() == b.getTotalConnectionRequest()) {
			return 0;
		}
		else if(a.getTotalConnectionRequest() > b.getTotalConnectionRequest())
		{
			return 1;
		}
		else return -1;
	}).get();
	
	System.out.println(maxRequests);
   
    double averageCompletionTime = surveyReportsList.stream().mapToInt(SurveyReport:: getNoOfDaysForRequestCompletion).average().orElse(0.0);
    System.out.println("Average time for request completion: " + averageCompletionTime);


    double totalAverageRequestsPerDay = surveyReportsList.stream().mapToInt(SurveyReport:: getAverageRequestPerDay).average().orElse(0.0);
    System.out.println("Total average_request_per_day: " + totalAverageRequestsPerDay);
  
    long locationCountDelhi = surveyReportsList.stream().filter(report -> "Delhi".equals(report.getLocation())).count();
    System.out.println("Location count for Delhi: " + locationCountDelhi);
}

}
