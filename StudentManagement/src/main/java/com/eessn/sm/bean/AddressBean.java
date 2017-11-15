package com.eessn.sm.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="addressbean")
public class AddressBean 
{
	
	@GeneratedValue
	
	@Column(name="addressId")
	private int addressId ;
	@Column(name="residential_address")
	private String residential_address;
	@Column(name="residential_town")
    private String residential_town;
	@Column(name="residential_lane")
    private String residential_lane;
	@Column(name="residential_landMark")
    private String residential_landMark;
	@Column(name="residential_city")
    private String residential_city;
	@Column(name="residential_state")
    private String residential_state;
	@Column(name="residential_district")
    private String residential_district;
	@Column(name="residential_pincode")
    private int residential_pincode;
	@Column(name="residential_postOffice")
    private String residential_postOffice;
	@Column(name="prensent_address")
    private String prensent_address;
	@Column(name="prensent_town")
    private String prensent_town;
	@Column(name="prensent_lane")
    private String prensent_lane;
	@Column(name="prensent_landMark")
    private String prensent_landMark;
	@Column(name="prensent_city")
    private String prensent_city;
	@Column(name="prensent_state")
    private String prensent_state;
	@Column(name="prensent_district")
    private String prensent_district;
	@Column(name="prensent_pincode")
    private int prensent_pincode;
	@Column(name="prensent_postOffice")
    private String prensent_postOffice;
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
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getResidential_address() {
		return residential_address;
	}
	public void setResidential_address(String residential_address) {
		this.residential_address = residential_address;
	}
	public String getResidential_town() {
		return residential_town;
	}
	public void setResidential_town(String residential_town) {
		this.residential_town = residential_town;
	}
	public String getResidential_lane() {
		return residential_lane;
	}
	public void setResidential_lane(String residential_lane) {
		this.residential_lane = residential_lane;
	}
	public String getResidential_landMark() {
		return residential_landMark;
	}
	public void setResidential_landMark(String residential_landMark) {
		this.residential_landMark = residential_landMark;
	}
	public String getResidential_city() {
		return residential_city;
	}
	public void setResidential_city(String residential_city) {
		this.residential_city = residential_city;
	}
	public String getResidential_state() {
		return residential_state;
	}
	public void setResidential_state(String residential_state) {
		this.residential_state = residential_state;
	}
	public String getResidential_district() {
		return residential_district;
	}
	public void setResidential_district(String residential_district) {
		this.residential_district = residential_district;
	}
	public int getResidential_pincode() {
		return residential_pincode;
	}
	public void setResidential_pincode(int residential_pincode) {
		this.residential_pincode = residential_pincode;
	}
	public String getResidential_postOffice() {
		return residential_postOffice;
	}
	public void setResidential_postOffice(String residential_postOffice) {
		this.residential_postOffice = residential_postOffice;
	}
	public String getPrensent_address() {
		return prensent_address;
	}
	public void setPrensent_address(String prensent_address) {
		this.prensent_address = prensent_address;
	}
	public String getPrensent_town() {
		return prensent_town;
	}
	public void setPrensent_town(String prensent_town) {
		this.prensent_town = prensent_town;
	}
	public String getPrensent_lane() {
		return prensent_lane;
	}
	public void setPrensent_lane(String prensent_lane) {
		this.prensent_lane = prensent_lane;
	}
	public String getPrensent_landMark() {
		return prensent_landMark;
	}
	public void setPrensent_landMark(String prensent_landMark) {
		this.prensent_landMark = prensent_landMark;
	}
	public String getPrensent_city() {
		return prensent_city;
	}
	public void setPrensent_city(String prensent_city) {
		this.prensent_city = prensent_city;
	}
	public String getPrensent_state() {
		return prensent_state;
	}
	public void setPrensent_state(String prensent_state) {
		this.prensent_state = prensent_state;
	}
	public String getPrensent_district() {
		return prensent_district;
	}
	public void setPrensent_district(String prensent_district) {
		this.prensent_district = prensent_district;
	}
	public int getPrensent_pincode() {
		return prensent_pincode;
	}
	public void setPrensent_pincode(int prensent_pincode) {
		this.prensent_pincode = prensent_pincode;
	}
	public String getPrensent_postOffice() {
		return prensent_postOffice;
	}
	public void setPrensent_postOffice(String prensent_postOffice) {
		this.prensent_postOffice = prensent_postOffice;
	}
	public AddressBean(int addressId, String residential_address,
			String residential_town, String residential_lane,
			String residential_landMark, String residential_city,
			String residential_state, String residential_district,
			int residential_pincode, String residential_postOffice,
			String prensent_address, String prensent_town,
			String prensent_lane, String prensent_landMark,
			String prensent_city, String prensent_state,
			String prensent_district, int prensent_pincode,
			String prensent_postOffice) {
		super();
		this.addressId = addressId;
		this.residential_address = residential_address;
		this.residential_town = residential_town;
		this.residential_lane = residential_lane;
		this.residential_landMark = residential_landMark;
		this.residential_city = residential_city;
		this.residential_state = residential_state;
		this.residential_district = residential_district;
		this.residential_pincode = residential_pincode;
		this.residential_postOffice = residential_postOffice;
		this.prensent_address = prensent_address;
		this.prensent_town = prensent_town;
		this.prensent_lane = prensent_lane;
		this.prensent_landMark = prensent_landMark;
		this.prensent_city = prensent_city;
		this.prensent_state = prensent_state;
		this.prensent_district = prensent_district;
		this.prensent_pincode = prensent_pincode;
		this.prensent_postOffice = prensent_postOffice;
	}
	public AddressBean() {
		super();
		// TODO Auto-generated constructor stub
	}
   
    

}
