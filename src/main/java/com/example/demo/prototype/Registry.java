package com.example.demo.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

	private Map<String, Course> courses = new HashMap<String, Course>();
	
	public Registry() {
		loadCourses();	
	}
	
	public Course createCourse (String type) {
		Course course = null;
		
		try {
			course = (Course)(courses.get(type)).clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		return course;
	}
	
	private void loadCourses() {
		LanguageCourse languageCourse = new LanguageCourse();
		languageCourse.setName("Default Name");
		languageCourse.setPrice(0.00);
		languageCourse.setCountry("Default Country");
		courses.put("LanguageCourse", languageCourse);
		ProgrammingCourse programmingCourse = new ProgrammingCourse(); 
		programmingCourse.setName("Default Name");
		programmingCourse.setPrice(0.00);
		programmingCourse.setType("None");
		courses.put("ProgrammingCourse", programmingCourse);
	}
}
