package com.transactions.app.enity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teachers")
public class Teacher {
    @EmbeddedId
    private PIB pib;
    private String degree;
    @Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    public Teacher(){
        pib = new PIB();
        degree = "lecturer";
        dateOfBirth = new Date();

    }
    public Teacher(PIB p, String d, Date b){
        pib = p;
        degree = d;
        dateOfBirth = b;
    }

    public PIB getPib() {
        return pib;
    }


    public String getDegree() {
        return degree;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPib(PIB pib) {
        this.pib = pib;
    }

    @Override
    public String toString(){
        return pib+ " "+ degree + " " + dateOfBirth;
    }


}
