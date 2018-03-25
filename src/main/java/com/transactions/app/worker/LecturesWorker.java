package com.transactions.app.worker;

import com.transactions.app.dao.LecturesDAO;
import com.transactions.app.enity.Lecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation= Propagation.SUPPORTS, readOnly = true)
public class LecturesWorker {
	@Autowired
    LecturesDAO lecturesDao;

	@Transactional(propagation=Propagation.REQUIRED, readOnly=true)
	public Lecture addLecture(Lecture lecture){
		lecturesDao.addLecture(lecture);
		System.out.println("Lecture has been saved "+lecture);
		return lecture;
	}


	public Lecture getLecture(int id){
		Lecture lecture = lecturesDao.getLecture(id);
		System.out.println(lecture);
		return lecture;
	}
}
