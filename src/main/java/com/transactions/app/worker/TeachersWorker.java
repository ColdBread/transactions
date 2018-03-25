package com.transactions.app.worker;

import com.transactions.app.dao.TeacherDao;
import com.transactions.app.enity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

public class TeachersWorker {
    @Autowired
    TeacherDao teacherDao;
    @Autowired
    private TransactionTemplate transactionTemplate;


    public Teacher addTeacher(final Teacher teacher){
        transactionTemplate.execute(new TransactionCallback<Void>(){
            public Void doInTransaction(TransactionStatus txStatus){
                try{
                    teacherDao.addTeacher(teacher);
                    System.out.println("Teacher has been added "+teacher);
                }catch (RuntimeException e){
                    txStatus.setRollbackOnly();
                    throw e;
                }
                return null;
            }
        });
        return teacher;
    }
}
