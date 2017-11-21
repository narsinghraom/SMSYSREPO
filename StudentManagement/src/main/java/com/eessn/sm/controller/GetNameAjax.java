package com.eessn.sm.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;




import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.StudentBean;
import com.eessn.sm.json.JsonResponse;
import com.eessn.sm.json.Response;
import com.eessn.sm.service.DataService;
import com.google.gson.Gson;

@Controller
@RequestMapping("/GetNameAjax")
public class GetNameAjax 
{
	@Autowired
	DataService dataservice;
	@RequestMapping(value="/getName",method=RequestMethod.GET)
	public @ResponseBody
	void getname(@RequestParam("term") String fname,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<String> ListStringName=dataservice.getNameList(fname);
		String  result=new Gson().toJson(ListStringName);
		response.getWriter().write(result);
	}

	@RequestMapping(value="/getData",method=RequestMethod.GET)
	public @ResponseBody
	void getAdnissionSought(@RequestParam("term") String admissionSought,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<StudentBean> ListStringAdnissionSought=dataservice.getAdmissionSoughtList(admissionSought);


		String result=new Gson().toJson(ListStringAdnissionSought);
		response.getWriter().write(result);
		
	}
	@RequestMapping(value="/getNameData",method=RequestMethod.GET)
	public @ResponseBody
	void getName(@RequestParam("term") String firstName,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<StudentBean> ListStringName=dataservice.getName(firstName);
		
	    String result=new Gson().toJson(ListStringName);
		response.getWriter().write(result);
		
	}
	@RequestMapping(value="/getlastName",method=RequestMethod.GET)
	public @ResponseBody
	void getlastname(@RequestParam("term") String lastname,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<String> ListStringName=dataservice.getLastNameList(lastname);
		String  result=new Gson().toJson(ListStringName);
		response.getWriter().write(result);
	}
	
	
	@RequestMapping(value="/getAddressList",method=RequestMethod.GET)
	public @ResponseBody
	void getAddressList(@RequestParam("term") String address,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<String> ListAddressName=dataservice.getAddressList(address);
		String  result=new Gson().toJson(ListAddressName);
		response.getWriter().write(result);
	}
	
	
	@RequestMapping(value="/getAddressListData",method=RequestMethod.GET)
	public @ResponseBody
	void getAddressListData(@RequestParam("term") String addressCity,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<AddressBean> adressList=dataservice.getAddressCity(addressCity);
		
	    String result=new Gson().toJson(adressList);
		response.getWriter().write(result);
		
	}
	
	
	
	@RequestMapping(value="/getLastNameData",method=RequestMethod.GET)
	public @ResponseBody
	void getLastNameData(@RequestParam("term") String lastName,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<StudentBean> ListStringName=dataservice.getLastName(lastName);
		
	    String result=new Gson().toJson(ListStringName);
		response.getWriter().write(result);
		
	}

	@RequestMapping(value="/getclass",method=RequestMethod.GET)
	public @ResponseBody
	void getclassData(@RequestParam("term") String admissionSought,HttpServletRequest request,HttpServletResponse response) throws IOException{
		List<StudentBean> ListStringAdnissionSought=dataservice.getAdmissionSoughtList(admissionSought);


		String result=new Gson().toJson(ListStringAdnissionSought);
		response.getWriter().write(result);
		
	}
	
	
	@RequestMapping(value="/getfnameData", method = RequestMethod.GET)
	public @ResponseBody
	void getfnameData(@RequestParam("term") String fname,@RequestParam("term") String lname, HttpServletRequest request,HttpServletResponse response) throws IOException {
	
		JsonResponse jsonResponse=new JsonResponse();
		
		Response responseobj=new Response();
		
		responseobj=(Response) dataservice.searchByFirstName(fname, lname);		
		/*Iterator<Response> iterator=getNameList.iterator();
		while(iterator.hasNext())
		{
			jsonResponse.setStatus("SUCCESS");
			responseobj=(Response)iterator.next();
			jsonResponse.setResultObject(responseobj);
		}*/
			
			String result = new Gson().toJson(jsonResponse);
			 response.getWriter().write(result);
			
		}
	
	
	@RequestMapping(value="/getAdmissionId", method = RequestMethod.GET)
	public @ResponseBody
	void getAdmissionId(@RequestParam("term") int admissionid,HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println(admissionid);
		JsonResponse jsonResponse=new JsonResponse();
		StudentBean studentBean=new StudentBean();
		/*int adimissionId=Integer.parseInt(admissionid);*/
		
		List<StudentBean> getadmission=dataservice.getAdmissionId(admissionid);
		System.out.println(getadmission);
		Iterator<StudentBean> iterator=getadmission.iterator();
		while(iterator.hasNext())
		{
			jsonResponse.setStatus("SUCCESS");
			studentBean=(StudentBean)iterator.next();
			jsonResponse.setResultObject(studentBean);
		}
			
			String result = new Gson().toJson(jsonResponse);
			 response.getWriter().write(result);
			
		}
			

}
