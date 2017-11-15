/**
 * 
 */
package com.eessn.sm.json;

import java.util.List;

import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.ParentBean;
import com.eessn.sm.bean.StudentBean;

/**
 * @author NARSINGH MAHANKALI
 *
 *this is the resonse object which we can set all the result data from shared object.
 *
 */
public class Response {
	
	private List<StudentBean> listOfStudent ;
	private List<ParentBean> listOfParent;
	private List<AddressBean> listOfAddress;
	
	private StudentBean studentBean;
	private ParentBean parentBean;
	private AddressBean addressBean;
	
	/**
	 * @return the studentBean
	 */
	public StudentBean getStudentBean() {
		return studentBean;
	}
	/**
	 * @param studentBean the studentBean to set
	 */
	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
	/**
	 * @return the parentBean
	 */
	public ParentBean getParentBean() {
		return parentBean;
	}
	/**
	 * @param parentBean the parentBean to set
	 */
	public void setParentBean(ParentBean parentBean) {
		this.parentBean = parentBean;
	}
	/**
	 * @return the addressBean
	 */
	public AddressBean getAddressBean() {
		return addressBean;
	}
	/**
	 * @param addressBean the addressBean to set
	 */
	public void setAddressBean(AddressBean addressBean) {
		this.addressBean = addressBean;
	}
	/**
	 * @return the listOfStudent
	 */
	public List<StudentBean> getListOfStudent() {
		return listOfStudent;
	}
	/**
	 * @param listOfStudent the listOfStudent to set
	 */
	public void setListOfStudent(List<StudentBean> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}
	/**
	 * @return the listOfParent
	 */
	public List<ParentBean> getListOfParent() {
		return listOfParent;
	}
	/**
	 * @param listOfParent the listOfParent to set
	 */
	public void setListOfParent(List<ParentBean> listOfParent) {
		this.listOfParent = listOfParent;
	}
	/**
	 * @return the listOfAddress
	 */
	public List<AddressBean> getListOfAddress() {
		return listOfAddress;
	}
	/**
	 * @param listOfAddress the listOfAddress to set
	 */
	public void setListOfAddress(List<AddressBean> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
	

}
