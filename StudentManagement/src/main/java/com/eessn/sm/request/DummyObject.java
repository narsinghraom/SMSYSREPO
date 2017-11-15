package com.eessn.sm.request;

import java.util.List;

import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.ParentBean;
import com.eessn.sm.bean.StudentBean;

/*
 * This class is used to store all dummy values in a object for test purpose.
*/
public class DummyObject {
	//this is a non-static block which is used to assign all the mmmobjects here.
	{
		//list 10 student details
		listOfStudents.add(new StudentBean(1, "vanaja", "rani", "nalla", "18-12-1990", "female", "LKG", "SSVN", 10, 10) );
		listOfStudents.add(new StudentBean(2, "shaliaja", "rani", "nalla", "10-12-1989", "female", "UKG", "SSVNSKD", 11, 11) );
		listOfStudents.add(new StudentBean(3, "avinash", "kumar", "nalla", "28-12-1998", "female", "first Class", "EREWRW", 12, 11) );
		listOfStudents.add(new StudentBean(4, "sonali", "rajesh", "nalla", "8-1-1990", "female", "Second Class", "SFGFG", 12, 12) );
		listOfStudents.add(new StudentBean(5, "sonu", "rani", "mahankali", "3-06-1995", "female", "Third Class", "ERTRYTY", 13, 13) );
		listOfStudents.add(new StudentBean(6, "honey", "cutey", "manhankali", "18-12-2000", "female", "Fourth Class", "SSFJGFKKVN", 14, 14) );
		listOfStudents.add(new StudentBean(7, "poojitha", "rao", "muthyala", "18-12-2003", "female", "Fivth Class", "QRER", 15, 15) );
		listOfStudents.add(new StudentBean(8, "harshith", "rani", "muthyala", "18-12-2005", "male", "LKG", "ERTUYU", 16, 16) );
		listOfStudents.add(new StudentBean(9, "anikheth", "kumar", "police", "18-12-2009", "male", "LKG", "TYYUYU", 17, 17) );
		listOfStudents.add(new StudentBean(10, "saikheth", "kumar", "police", "18-12-2013", "male", "LKG", "UYIOIO", 18, 18) );
		
		//list 10 parent details
		listOfParents.add(new ParentBean(1, "arujun", "kumar", "nalla", "govt", "tenthclass", "eshwari", "bai", "nalla", "houdewife", "UKG", 3434344, 4352426, 10, 10));
		listOfParents.add(new ParentBean(2, "arujun", "kumar", "nalla", "govt", "tenthclass", "eshwari", "bai", "nalla", "houdewife", "UKG", 3434344, 4352426, 11, 11));
		listOfParents.add(new ParentBean(3, "arujun", "kumar", "nalla", "govt", "tenthclass", "eshwari", "bai", "nalla", "houdewife", "UKG", 3434344, 4352426, 12, 11));
		listOfParents.add(new ParentBean(4, "rajesh", "kumar", "nagnoor", "electrical", "tenthclass", "renuka", "madhavi", "nagnoor", "houdewife", "UKG", 3434344, 4352426, 12, 12));
		listOfParents.add(new ParentBean(5, "laxmaih", "kumar", "mahankali", "conrator", "tenthclass", "barathamma", "bai", "mahankali", "houdewife", "UKG", 3434344, 4352426, 13, 13));
		listOfParents.add(new ParentBean(6, "laxmaih", "kumar", "mahankali", "conrator", "tenthclass", "barathamma", "bai", "mahankali", "houdewife", "UKG", 3434344, 4352426, 14, 14));
		listOfParents.add(new ParentBean(7, "shashi", "rao", "muthyala", "privateworinkg", "tenthclass", "shailaja", "bai", "muthayala", "houdewife", "b.com", 3434344, 4352426, 15, 15));
		listOfParents.add(new ParentBean(8, "shashi", "rao", "muthyala", "privateworinkg", "tenthclass", "shailaja", "bai", "muthayala", "houdewife", "b.com", 3434344, 4352426, 16, 16));
		listOfParents.add(new ParentBean(9, "raju", "kumar", "police", "employee", "tenthclass", "babitha", "bai", "police", "houdewife", "UKG", 3434344, 4352426, 17, 17));
		listOfParents.add(new ParentBean(10, "raju", "kumar", "police", "employee", "tenthclass", "babitha", "bai", "police", "houdewife", "UKG", 3434344, 4352426, 18, 18));
		//list 10 address Details
		//call parameterised constructor to pass all the values, it should be in 10 values object
		listOfAddressBeans.add(new AddressBean());
	}
private static List<StudentBean> listOfStudents;
private static List<ParentBean> listOfParents;
private static List<AddressBean> listOfAddressBeans;
/**
 * @return the listOfStudents
 */
public List<StudentBean> getListOfStudents() {
	return listOfStudents;
}
/**
 * @param listOfStudents the listOfStudents to set
 */
public static void setListOfStudents(List<StudentBean> listOfStudents) {
	DummyObject.listOfStudents = listOfStudents;
}
/**
 * @return the listOfParents
 */
public List<ParentBean> getListOfParents() {
	return listOfParents;
}
/**
 * @param listOfParents the listOfParents to set
 */
public static void setListOfParents(List<ParentBean> listOfParents) {
	DummyObject.listOfParents = listOfParents;
}
/**
 * @return the listOfAddressBeans
 */
public static List<AddressBean> getListOfAddressBeans() {
	return listOfAddressBeans;
}
/**
 * @param listOfAddressBeans the listOfAddressBeans to set
 */
public static void setListOfAddressBeans(List<AddressBean> listOfAddressBeans) {
	DummyObject.listOfAddressBeans = listOfAddressBeans;
}


	
}
