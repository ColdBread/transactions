package com.transactions.app.enity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PIB implements Serializable {
	private String prizv;
	private String name;
	private String fath;
	public PIB(){

	}
	public PIB(String p, String n, String f){
		prizv = p;
		name = n;
		fath = f;
	}
	
	public String getPrizv(){
		return prizv;
	}
	public String getName(){
		return name;
	}
	public String getFath(){
		return fath;
	}
	
	public void setPrizv(String p){
		prizv = p;
	}
	public void setName(String n){
		name = n;
	}
	public void setFath(String f){
		fath = f;
	}

	@Override
	public boolean equals(Object o) {

		if (o == this) return true;
		if (!(o instanceof PIB)) {
			return false;
		}

		PIB user = (PIB) o;

		return user.name.equals(name) &&
				user.prizv.equals(prizv) &&
				user.fath.equals(fath);
	}

	//Idea from effective Java : Item 9
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + prizv.hashCode();
		result = 31 * result + fath.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return prizv+" "+name+" "+fath;
	}
}
