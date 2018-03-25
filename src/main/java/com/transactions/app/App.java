package com.transactions.app;

import java.util.Date;


import com.transactions.app.enity.Teacher;
import com.transactions.app.enity.PIB;

import com.transactions.app.worker.TeachersWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.transactions.app.enity.Lecture;
import com.transactions.app.worker.LecturesWorker;


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		Lecture lecture = new Lecture();

		lecture.setName("Introduction to Spring");
		lecture.setCredits(2.5);
		LecturesWorker lectureWorker = (LecturesWorker) context.getBean("lectureWorker");
		TeachersWorker teachersWorker = (TeachersWorker) context.getBean("teacherWorker");
		Teacher teacher = new Teacher();
		teacher.setPib(new PIB("Symonenko","Dmitryi","Valerievich"));
		teacher.setDegree("hohland");
		teacher.setDateOfBirth(new Date());
		lectureWorker.addLecture(lecture);
		teachersWorker.addTeacher(teacher);
		//lectureWorker.getLecture(1);



	}
}
