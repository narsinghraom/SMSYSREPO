package com.eessn.sm.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.ParentBean;
import com.eessn.sm.bean.StudentBean;
import com.eessn.sm.json.Response;

public class DataDaoImplementation implements DataDao {
	@Autowired
	SessionFactory sessionFactory;

	
	
	
	 public int insertStudentDetails(StudentBean studentBean,ParentBean parentBean,AddressBean addressBean) {
		System.out.println(studentBean.getAdimissionId()+""+parentBean.getFatherFirstName()+" "+addressBean.getPrensent_city());
		 
		 Session session=sessionFactory.openSession();
		 /*studentBean.setAddressBean(addressBean);		 
		 studentBean.setParentBean(parentBean);*/
	 session.save(studentBean);
	return 0;
		  }
	 

	public int updateStudentDetails(StudentBean studentBean) {
		Session session = sessionFactory.openSession();
		Query query = session
				.createQuery("update StudentTable set firstName:firstName,middleName:middleName,lastName:lastName,dateOfBirth:dateOfBirth,gender:gender,AdnissionSought:AdnissionSought");
		query.setParameter("firstName", studentBean.getFirstName());
		query.setParameter("middleName", studentBean.getMiddleName());
		query.setParameter("lastName", studentBean.getLastName());
		query.setParameter("dateOfBirth", studentBean.getDateOfBirth());
		query.setParameter("gender", studentBean.getGender());
		query.setParameter("AdnissionSought", studentBean.getAdmissionSought());
		int result = query.executeUpdate();
		return result;
	}

	public int deleteStudentDetails(String firstname) {
		Session session = sessionFactory.openSession();
		Query query = session
				.createQuery("delete from StudentTable where firstname=:firstname ");
		query.setParameter("firstname", firstname);
		int result = query.executeUpdate();
		return result;
	}

	
	 public int insertParentDetails(ParentBean parentbean) {
	 
	 Session session=sessionFactory.openSession(); 
	 session.save(parentbean);
	 return 0;
	 }
	  
	  public int insertaddressDetails(AddressBean addressbean) { Session
	  session=sessionFactory.openSession(); session.save(addressbean);
	 
	
	  return 0; }
	 

	@SuppressWarnings("unchecked")
	public List<StudentBean> search(String searchElement) {
		Session session = sessionFactory.openSession();
		List<StudentBean> listofStudent = session.createQuery(
				"from StudentBean s where s.lastName like '" + searchElement
						+ "%'").list();

		return listofStudent;
	}

	@SuppressWarnings("unchecked")
	public List<AddressBean> searchAddress(String searchElement) {
		Session session = sessionFactory.openSession();
		List<AddressBean> listofadreess= session.createQuery(
				"from AddressBean a where a.residential_city like '"
						+ searchElement + "%' ").list();
		return listofadreess;
	}

	@SuppressWarnings("unchecked")
	public List<StudentBean> searchClass(String searchElement) {
		Session session = sessionFactory.openSession();
		List<StudentBean> listofclass = session.createQuery(
				"from StudentBean s where s.admissionSought like '"
						+ searchElement + "%'").list();
		return listofclass;
	}

	public int insert(AddressBean addressbean) {
		Session session = sessionFactory.openSession();
		session.save(addressbean);
		return 0;
	}

	public List<String> getNameList(String name) 
	{
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<String> studentlist=session.createQuery("select z.firstName from StudentBean z where z.firstName like '"+name+"%'").list();
		return studentlist;
	
	}

	public List<StudentBean> searchByName(String studenename,String classname) {
	Session session=sessionFactory.openSession();
	@SuppressWarnings("unchecked")
	List<StudentBean> nameList=null;
	
	Query query=session.createQuery("from StudentBean s where s.admissionSought=:admissionSought and s.firstName =:firstName");
		query.setParameter("admissionSought", classname);
		query.setParameter("firstName", studenename);
		nameList=query.list();
	
		return nameList;
	}
	

	public List<StudentBean> getAdmissionSoughtList(String admissionSought) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> studentlist=session.createQuery("from StudentBean z where z.admissionSought like '"+admissionSought+"%'").list();
		return studentlist;
	}

	public List<StudentBean> getName(String name) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> studentNamelist=session.createQuery("from StudentBean z where z.firstName like '"+name+"%'").list();
		return studentNamelist;
	}

	public List<String> getLastNameList(String lastname) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<String> studentLastNamelist=session.createQuery("select z.lastName from StudentBean z where z.lastName like '"+lastname+"%'").list();
		return studentLastNamelist;
	}

	public List<StudentBean> getLastName(String lastname) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> studentlastName=session.createQuery("from StudentBean z where z.lastName like '"+lastname+"%'").list();
		return studentlastName;
	}

	

	public List<StudentBean> getFathername(String fathername) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		
		List<StudentBean> getfathername=session.createQuery("from StudentBean z where z.fatherFirstName like '"+fathername+"%'").list();
		return getfathername;
	}


	public List<StudentBean> getAdmissionId(String admissionId) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> studentAdmissonId=session.createQuery("from StudentBean s where s.admissionId like '"+admissionId+"%'").list();
		return studentAdmissonId;
	}


	public List<StudentBean> getvalues() {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> fathernamelist=session.createQuery("SELECT studentbean.parentId, parentbean.fatherFirstName, studentbean.firstName FROM StudentBean studentbean INNER JOIN ParentBean parentbean ON studentbean.parentId=parentbean.parentId").list();
		return fathernamelist ;
	}


	public List<Object[]> getpaymentvalues() {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<Object[]> listobje=(List<Object[]>) session.createQuery("select studentbean.admissionSought,parentbean.fatherFirstName from studentbean INNER JOIN parentbean where studentbean.firstName=studentbean.firstName");                            
		return listobje;
	}


	/*public List<StudentBean> getAdmissionId(int admissionId) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> studentAdmissonId=session.createQuery("select studentbean.firstName,studentbean.admissionSought,parentbean.fatherFirstName from StudentBean studentbean INNER JOIN ParentBean parentbean ON studentbean.rowMappingId=:"
				+ "parentbean.rowrefId where studentbean.adimissionId like '"+admissionId+"%'").list();
		return studentAdmissonId;
	}*/
	
	public List<StudentBean> getAdmissionId(int admissionId) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<StudentBean> studentAdmissonId=session.createQuery("select s.firstName,s.admissionSought,p.fatherFirstName from StudentBean s JOIN"
				+ " ParentBean p on p.rowrefId=s.rowMappingId where s.adimissionId=1000").list();
		
		return studentAdmissonId;
	}


	public Response searchByClassOrName(String studentName, String studentClass) {
		Response responseObj=new Response();
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		Query query =session.createQuery("from StudentBean s where s.firstName=:firstName and s.admissionSought=:admissionSought");
		query.setParameter("firstName", studentName);
		query.setParameter("admissionSought", studentClass);
		List<StudentBean> studentList =query.list();
		if(studentList!=null && !studentList.isEmpty())
		{
		for(StudentBean studentBean:studentList)
		{
			if(studentBean !=null)
			{
				Query parentQuery=session.createQuery("from ParentBean p where p.rowrefId=:rowrefId");
				parentQuery.setParameter("rowrefId", studentBean.getRowMappingId());
				List<ParentBean> parentList=parentQuery.list();
				for(ParentBean parentBean: parentList){
					if(parentBean!=null)
					{
						Query addressQuery=session.createQuery("from AddressBean a where a.rowrefId=:rowrefId");
						addressQuery.setParameter("rowrefId", parentBean.getRowMappingId());
						List<AddressBean> addressList=addressQuery.list();
						responseObj.setListOfAddress(addressList);
					}
				}
				responseObj.setListOfParent(parentList);
				
			}
			
		}
		responseObj.setListOfStudent(studentList);
		}
		return responseObj;
	}
	

	/*public List<ParentBean> getfatherName(String name) {
		Session session=sessionFactory.openSession();
		@SuppressWarnings("unchecked")
		List<ParentBean> fathernamelist=session.createQuery("from ParentBean z where z.fatherFirstName like '"+name+"%'").list();
		return fathernamelist;
	}*/

	
	

	

}
