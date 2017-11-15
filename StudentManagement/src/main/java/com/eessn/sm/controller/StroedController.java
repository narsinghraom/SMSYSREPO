package com.eessn.sm.controller;

import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.eessn.sm.bean.AddressBean;
import com.eessn.sm.bean.ParentBean;
import com.eessn.sm.bean.StudentBean;
import com.eessn.sm.json.Response;
import com.eessn.sm.service.DataService;

@Controller
public class StroedController {
	@Autowired
	DataService dataservice;

	static StudentBean studentBean;
	static AddressBean addressBean;
	static ParentBean parentBean;

	@RequestMapping(value = "/stroedStudentDetails", method = RequestMethod.POST)
	public ModelAndView stroedStudentDetails(
			@ModelAttribute StudentBean studentbean) {
		ModelAndView model = new ModelAndView();

		StroedController.studentBean = studentbean;
//		model.addObject("studentbean", studentbean);
		model.setViewName("Registration");

		return model;

	}

	@RequestMapping(value = "/stroedparentDetails", method = RequestMethod.POST)
	public ModelAndView stroedParentDetails(
			@ModelAttribute ParentBean parentbean) {

		ModelAndView model = new ModelAndView();
		StroedController.parentBean = parentbean;
		model.addObject("parentbean", parentbean);
		model.setViewName("Registration");
		return model;

	}

	@RequestMapping(value = "/storedaddressDetails", method = RequestMethod.POST)
	public ModelAndView stroedAddressDetails(
			@ModelAttribute AddressBean addressbean) {
		/*StroedController.studentBean.setAddressBean(addressbean);
		StroedController.studentBean.setParentBean(parentBean);*/
		dataservice.insertStudentDetails(studentBean, parentBean, addressbean);
		ModelAndView model = new ModelAndView();
		model.setViewName("Registration");

		return model;

	}

	@RequestMapping(value = "/searchElement", method = RequestMethod.POST)
	public ModelAndView searchElements(
			@RequestParam("serchelement") String serchelement,
			@RequestParam("searchelementradio") String searchcriteria,
			@ModelAttribute AddressBean addressbean, HttpServletRequest request) {
		List<StudentBean> listobjofstudent = null;
		List<AddressBean> listobjofaddress = null;

		ModelAndView model = new ModelAndView();
		Response response=null;
		if (searchcriteria.equals("lastname")) {
			listobjofstudent = dataservice.search(serchelement);
		} else if (searchcriteria.equals("class")) {
			listobjofstudent = dataservice.searchClass(serchelement);
		} else if (searchcriteria.equals("address")) {
			listobjofaddress = dataservice.searchAddress(serchelement);

		}

		model.addObject("serchelement", listobjofstudent);

		model.addObject("serchelementadress", listobjofaddress);
		model.setViewName("Search");
		return model;
	}

	@RequestMapping(value = "/studentview", method = RequestMethod.POST)
	public ModelAndView StudentView(
			@RequestParam("studentname") String studentname,
			@RequestParam("classsearch") String classsearch) {
		ModelAndView model = new ModelAndView();
		Response response=null;
		response = dataservice.searchByClassOrName(studentname, classsearch);
		model.addObject("responseObject", response);
		model.setViewName("StudentViewResult");
		return model;

	}

}
