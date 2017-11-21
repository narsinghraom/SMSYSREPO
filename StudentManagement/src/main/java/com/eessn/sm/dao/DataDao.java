package com.eessn.sm.dao;

import java.util.List;

import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.ParentBean;
import com.eessn.sm.bean.StudentBean;
import com.eessn.sm.json.Response;


public interface DataDao 
{
	
	public int insert(AddressBean addressbean);
	 public int insertStudentDetails(StudentBean studentBean,ParentBean parentBean,AddressBean addressBean);
	public int updateStudentDetails(StudentBean studentBean);
	public int deleteStudentDetails(String firstname);
    public List<StudentBean> search(String searchElement);
    public List<StudentBean> searchClass(String searchElement);
    public List<AddressBean> searchAddress(String searchElement);
    public List<String> getNameList(String firstname);
    public List<StudentBean> getAdmissionSoughtList(String admissionSought);
    public List<StudentBean> searchByName(String studentname,String classname);
    public List<StudentBean> getName(String name);
    public List<String> getLastNameList(String lastname);
    public List<StudentBean> getLastName(String lastname);
    public List<String> getAddressList(String residential_city );
    public List<AddressBean> getAddressCity(String residential_city);
    public List<StudentBean> getFathername(String fathername);
    public List<StudentBean> getAdmissionId(String admissionId);
    
   public List<StudentBean> getvalues();
  

    public List<StudentBean> getAdmissionId(int admissionId);
    
    public Response searchByClassOrName(String studentName,String studentClass);
    
    public Response searchByFirstName(String studentFname,String studentLname);
    
    
   
	

}
