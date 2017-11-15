package com.eessn.sm.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "studentbean")
public class StudentBean implements Serializable {

	private static final long serialVersionUID = 1L;

	
	@GeneratedValue
	@Column(name="adimissionId")
	private int adimissionId ;
	@Column(name="firstName")
	private String firstName;
    @Column(name="middleName")
	private String middleName;
    @Column(name="lastName")
	private String lastName;
    @Column(name="dateOfBirth")
	private String dateOfBirth;
    @Column(name="gender")
	private String gender;
    @Column(name="admissionSought")
	private String admissionSought;
    @Column(name="previousSchoolName")
	private String previousSchoolName;
    @Id
    @Column(name="rowrefId")
    private long rowrefId;
    @Column(name="rowMappingId")
    private long rowMappingId;
    
    
	
	/**
	 * @return the rowrefId
	 */
	public long getRowrefId() {
		return rowrefId;
	}


	/**
	 * @param rowrefId the rowrefId to set
	 */
	public void setRowrefId(long rowrefId) {
		this.rowrefId = rowrefId;
	}


	/**
	 * @return the rowMappingId
	 */
	public long getRowMappingId() {
		return rowMappingId;
	}


	/**
	 * @param rowMappingId the rowMappingId to set
	 */
	public void setRowMappingId(long rowMappingId) {
		this.rowMappingId = rowMappingId;
	}


	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId")
	private AddressBean addressBean;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="parentId")
	private ParentBean parentBean;*/

	
	public int getAdimissionId() {
		return adimissionId;
	}


	public void setAdimissionId(int adimissionId) {
		this.adimissionId = adimissionId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAdmissionSought() {
		return admissionSought;
	}


	public void setAdmissionSought(String admissionSought) {
		this.admissionSought = admissionSought;
	}


	public String getPreviousSchoolName() {
		return previousSchoolName;
	}


	public void setPreviousSchoolName(String previousSchoolName) {
		this.previousSchoolName = previousSchoolName;
	}


	/*public AddressBean getAddressBean() {
		return addressBean;
	}


	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}


	public ParentBean getParentBean() {
		return parentBean;
	}


	public void setParentBean(ParentBean parentBean) {
		this.parentBean = parentBean;
	}*/


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public StudentBean(int adimissionId, String firstName, String middleName,
			String lastName, String dateOfBirth, String gender,
			String admissionSought, String previousSchoolName, long rowrefId,
			long rowMappingId) {
		super();
		this.adimissionId = adimissionId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.admissionSought = admissionSought;
		this.previousSchoolName = previousSchoolName;
		this.rowrefId = rowrefId;
		this.rowMappingId = rowMappingId;
		
	}


	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	

	
	
}
