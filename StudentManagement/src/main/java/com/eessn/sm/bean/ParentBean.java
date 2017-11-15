package com.eessn.sm.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="parentbean")
public class ParentBean {
	
	@GeneratedValue
	@Column(name="parentId")
	private int parentId;
	
	@Column(name="fatherFirstName")
	private String fatherFirstName;
	@Column(name="fatherMiddleName")
	private String fatherMiddleName;
	@Column(name="fatherLastName")
	private String fatherLastName;
	@Column(name="fatherOccupation")
	private String fatherOccupation;
	@Column(name="fatherQualification")
	private String fatherQualification;
	@Column(name="motherFirstName")
	private String motherFirstName;
	@Column(name="motherMiddleName")
	private String motherMiddleName;
	@Column(name="motherLastName")
	private String motherLastName;
	@Column(name="motherOccupation")
	private String motherOccupation;
	@Column(name="motherQualification")
	private String motherQualification;
	@Column(name="mobileNo")
	private long mobileNo;
	@Column(name="alternateMobileNo")
	private long alternateMobileNo;
	@Id 
	@Column(name="rowrefId")
	    private long rowrefId;
	    @Column(name="rowMappingId")
	    private long rowMappingId;
	  /*  @OneToMany(cascade=CascadeType.ALL)
	    @JoinColumn(name="rowrefId")
	private Set<StudentBean> studentbeans;*/
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
	public int getParentId() {
		return parentId;
		
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getFatherFirstName() {
		return fatherFirstName;
	}
	public void setFatherFirstName(String fatherFirstName) {
		this.fatherFirstName = fatherFirstName;
	}
	public String getFatherMiddleName() {
		return fatherMiddleName;
	}
	public void setFatherMiddleName(String fatherMiddleName) {
		this.fatherMiddleName = fatherMiddleName;
	}
	public String getFatherLastName() {
		return fatherLastName;
	}
	public void setFatherLastName(String fatherLastName) {
		this.fatherLastName = fatherLastName;
	}
	public String getFatherOccupation() {
		return fatherOccupation;
	}
	public void setFatherOccupation(String fatherOccupation) {
		this.fatherOccupation = fatherOccupation;
	}
	public String getFatherQualification() {
		return fatherQualification;
	}
	public void setFatherQualification(String fatherQualification) {
		this.fatherQualification = fatherQualification;
	}
	public String getMotherFirstName() {
		return motherFirstName;
	}
	public void setMotherFirstName(String motherFirstName) {
		this.motherFirstName = motherFirstName;
	}
	public String getMotherMiddleName() {
		return motherMiddleName;
	}
	public void setMotherMiddleName(String motherMiddleName) {
		this.motherMiddleName = motherMiddleName;
	}
	public String getMotherLastName() {
		return motherLastName;
	}
	public void setMotherLastName(String motherLastName) {
		this.motherLastName = motherLastName;
	}
	public String getMotherOccupation() {
		return motherOccupation;
	}
	public void setMotherOccupation(String motherOccupation) {
		this.motherOccupation = motherOccupation;
	}
	public String getMotherQualification() {
		return motherQualification;
	}
	public void setMotherQualification(String motherQualification) {
		this.motherQualification = motherQualification;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public long getAlternateMobileNo() {
		return alternateMobileNo;
	}
	public void setAlternateMobileNo(long alternateMobileNo) {
		this.alternateMobileNo = alternateMobileNo;
	}
	
	public ParentBean(int parentId, String fatherFirstName,
			String fatherMiddleName, String fatherLastName,
			String fatherOccupation, String fatherQualification,
			String motherFirstName, String motherMiddleName,
			String motherLastName, String motherOccupation,
			String motherQualification, long mobileNo, long alternateMobileNo,
			long rowrefId, long rowMappingId) {
		super();
		this.parentId = parentId;
		this.fatherFirstName = fatherFirstName;
		this.fatherMiddleName = fatherMiddleName;
		this.fatherLastName = fatherLastName;
		this.fatherOccupation = fatherOccupation;
		this.fatherQualification = fatherQualification;
		this.motherFirstName = motherFirstName;
		this.motherMiddleName = motherMiddleName;
		this.motherLastName = motherLastName;
		this.motherOccupation = motherOccupation;
		this.motherQualification = motherQualification;
		this.mobileNo = mobileNo;
		this.alternateMobileNo = alternateMobileNo;
		this.rowrefId = rowrefId;
		this.rowMappingId = rowMappingId;
	}
	public ParentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
