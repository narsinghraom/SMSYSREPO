package com.eessn.sm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.ParentBean;
import com.eessn.sm.bean.StudentBean;
import com.eessn.sm.dao.DataDao;
import com.eessn.sm.json.Response;
import com.eessn.sm.request.DummyObject;
import com.eessn.sm.request.RequestSharedObject;



public class DataServiceImplementation implements DataService {
	@Autowired  
	DataDao dataDao;
		

	public int updateStudentDetails(StudentBean studentBean) {
		// TODO Auto-generated method stub
		return dataDao.updateStudentDetails(studentBean);
	}

	public int deleteStudentDetails(String firstname) {
		// TODO Auto-generated method stub
		return dataDao.deleteStudentDetails(firstname);
	}

	

	
	
	
	
	public List<StudentBean> search(String searchElement) {
		// TODO Auto-generated method stub
		return dataDao.search(searchElement);
	}

	public List<AddressBean> searchAddress(String searchElement) {
		// TODO Auto-generated method stub
		return dataDao.searchAddress(searchElement);
	}

	public List<StudentBean> searchClass(String searchElement) {
		// TODO Auto-generated method stub
		return dataDao.searchClass(searchElement);
	}

	public int insert(AddressBean addressbean) {
		// TODO Auto-generated method stub
		return dataDao.insert(addressbean);
	}

	public List<String> getNameList(String name) {
		// TODO Auto-generated method stub
		Response response=new Response();
		DummyObject responseObject=RequestSharedObject.getRequestSharedObject().getDummyObject();
		/*return dataDao.getNameList(name);*/
		return null;
	}

	public Response searchByName(String studentname,String classname) {
		/*// TODO Auto-generated method stub
		return dataDao.searchByName(studentname,classname);*/
		Response response=new Response();
		
		//this is the common line of object creation to get response object.
		//so in any service implementation this object creation is same to get the response object.
		DummyObject responseObject=RequestSharedObject.getRequestSharedObject().getDummyObject();
		
		//to get student Details
		List<StudentBean> studentResponse=responseObject.getListOfStudents();
		for(StudentBean studentBean:studentResponse)
			
		{
			if(studentBean !=null && studentname!=null)
			{
				if(studentBean.getFirstName().equals(studentname))
				{
					response.setStudentBean(studentBean);
				}
				
			}
			if(studentBean !=null && studentname!=null)
			{
				if(studentBean.getAdmissionSought().equals(classname))
				{
					response.setStudentBean(studentBean);
				}
				
			}
			
		}
		
		//to get Parent Details
		List<ParentBean> parentResponse=responseObject.getListOfParents();
		for(ParentBean parentBean : parentResponse)
		{
			if(parentBean != null && (response.getStudentBean()!=null)){
				//here you can check with row refid and row mapid then that object you can add in resonse
				/*sample ill write
				 * 
				 * if(parenntBean.getRefId()==(response.getStudentBean().getMappingId())){
				 * response.setParentBean(parentBean);
				 * }
				 * 
				*/
				
			}
		}
		//to get address details you can continue on this
		List<AddressBean> adressResponse=responseObject.getListOfAddressBeans();
		for(AddressBean addressBean : adressResponse)
		{
			if(addressBean != null && (response.getParentBean()!=null)){
				//here you can check with row refid and row mapid then that object you can add in resonse
				/*sample ill write
				 * 
				 * if(addressBean.getRefId()==(response.getParentBean().getMappingId())){
				 * response.setParentBean(parentBean);
				 * }
				 * 
				*/
				
			}
		}
		
		
		return response;
		
		
	}

	public List<StudentBean> getAdmissionSoughtList(String admissionSought) {
		// TODO Auto-generated method stub
		return dataDao.getAdmissionSoughtList(admissionSought);
	}

	public List<StudentBean> getName(String name) {
		// TODO Auto-generated method stub
		return dataDao.getName(name);
	}

	public List<String> getLastNameList(String lastname) {
		// TODO Auto-generated method stub
		return dataDao.getLastNameList(lastname);
	}

	public List<StudentBean> getLastName(String lastname) {
		// TODO Auto-generated method stub
		return dataDao.getLastName(lastname);
	}

	public List<StudentBean> getFathername(String fathername) {
		// TODO Auto-generated method stub
		return dataDao.getFathername(fathername);
	}

	public int insertStudentDetails(StudentBean studentBean,ParentBean parentBean,AddressBean addressBean) {
		// TODO Auto-generated method stub
		return dataDao.insertStudentDetails(studentBean,parentBean,addressBean);
	}

	public List<StudentBean> getAdmissionId(String admissionId) {
		// TODO Auto-generated method stub
		return dataDao.getAdmissionId(admissionId);
	}

	public List<StudentBean> getvalues() {
		// TODO Auto-generated method stub
		return dataDao.getvalues();
	}

	public List<Object[]> getpaymentvalues() {
		// TODO Auto-generated method stub
		return dataDao.getpaymentvalues();
	}

	public List<StudentBean> getAdmissionId(int admissionId) {
		// TODO Auto-generated method stub
		return dataDao.getAdmissionId(admissionId);
	}

	public Response searchByClassOrName(String studentName, String studentClass) {
		// TODO Auto-generated method stub
		return dataDao.searchByClassOrName(studentName, studentClass);
	}

	

}
 

	
	

	

