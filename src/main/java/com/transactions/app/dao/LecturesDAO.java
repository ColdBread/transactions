package com.transactions.app.dao;

import com.transactions.app.enity.Lecture;

public interface LecturesDAO {
	Lecture addLecture(Lecture lecture);

	Lecture getLecture(int id);

	void saveLecture(Lecture lecture);

}
