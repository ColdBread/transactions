package com.transactions.app.enity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lectures")
public class Lecture {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private int id;
	private String name;
	private double credits;
	// Getters and settings
	public Lecture(){
		id = 0;
		name = "predmet";
		credits = 0;

	}

	public Lecture(int id, String n, double c){
		this.id = id;
		name = n;
		credits = c;

	}





	public void setId(int id){
		this.id = id;
	}
	public void setName (String name){
		this.name = name;
	}
	public void setCredits(double credits){
		this.credits = credits;
	}
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getCredits(){
		return credits;
	}

	@Override
	public String toString() {
		return id + " "+ name + " "+ credits + " ";
	}
}
