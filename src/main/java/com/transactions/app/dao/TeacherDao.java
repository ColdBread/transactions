package com.transactions.app.dao;

import com.transactions.app.enity.Teacher;
import com.transactions.app.enity.PIB;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class TeacherDao {
    @PersistenceContext
    private EntityManager em;

    public Teacher addTeacher(Teacher teacher) {
        em.persist(teacher);
        return teacher;
    }

    public Teacher getTeacher(PIB id) {
        return em.find(Teacher.class, id);
    }

    public void saveTeacher(Teacher teacher) {
        em.merge(teacher);
    }
}
