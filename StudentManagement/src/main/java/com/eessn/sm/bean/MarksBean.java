package com.eessn.sm.bean;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class MarksBean 
{
	private int firstLanguage;
	private int secondLanguage;
	private int english;
	private int mathamatics;
	private int science;
	private int social;
	private int genralKonwledge;
	private int computerScience;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="admissionId")
	private StudentBean studentBean;
	
	
	public StudentBean getStudentBean() {
		return studentBean;
	}
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	public int getFirstLanguage() {
		return firstLanguage;
	}
	public void setFirstLanguage(int firstLanguage) {
		this.firstLanguage = firstLanguage;
	}
	public int getSecondLanguage() {
		return secondLanguage;
	}
	public void setSecondLanguage(int secondLanguage) {
		this.secondLanguage = secondLanguage;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMathamatics() {
		return mathamatics;
	}
	public void setMathamatics(int mathamatics) {
		this.mathamatics = mathamatics;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	public int getGenralKonwledge() {
		return genralKonwledge;
	}
	public void setGenralKonwledge(int genralKonwledge) {
		this.genralKonwledge = genralKonwledge;
	}
	public int getComputerScience() {
		return computerScience;
	}
	public void setComputerScience(int computerScience) {
		this.computerScience = computerScience;
	}
	public MarksBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MarksBean(int firstLanguage, int secondLanguage, int english,
			int mathamatics, int science, int social, int genralKonwledge,
			int computerScience, StudentBean studentBean) {
		super();
		this.firstLanguage = firstLanguage;
		this.secondLanguage = secondLanguage;
		this.english = english;
		this.mathamatics = mathamatics;
		this.science = science;
		this.social = social;
		this.genralKonwledge = genralKonwledge;
		this.computerScience = computerScience;
		this.studentBean = studentBean;
	}
	
	

}
