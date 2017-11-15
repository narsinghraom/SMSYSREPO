package com.eessn.sm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller

public class HomeController
{
	Logger log=Logger.getLogger(getClass());
	@RequestMapping(value="/")
	
public ModelAndView openWelcomePage()
{
	System.out.println("welcome page");
	log.info("openHome() was started ");
	log.info("openHome() was stopped ");
	ModelAndView model=new ModelAndView();
	model.setViewName("Welcome");
	return model;
	
	
}
	@RequestMapping(value="/StudentsMangement",method=RequestMethod.GET)
	public ModelAndView openStudentManagementPage(){
		ModelAndView model=new ModelAndView();
		model.setViewName("StudentsManagement");
		return model;
	}
	
	@RequestMapping(value="/Registration",method=RequestMethod.GET)
	public ModelAndView openRegistrationPage(){
		ModelAndView model=new ModelAndView();
		model.setViewName("Registration");
		return model;
	}
	
	@RequestMapping(value="/SchoolManagementSystem",method=RequestMethod.GET)
	public ModelAndView openSchoolManagmentPage(){
		ModelAndView model=new ModelAndView();
		model.setViewName("SchoolManagementSystem");
		return model;
	}
	@RequestMapping(value="/StudentSearch",method=RequestMethod.GET)
	public ModelAndView StudentSearchPage(){
		ModelAndView model=new ModelAndView();
		model.setViewName("StudentSearch");
		return model;
	}
	
	@RequestMapping(value="/StudentView",method=RequestMethod.GET)
	public ModelAndView StudentView(){
		ModelAndView model=new ModelAndView();
		model.setViewName("StudentView");
		return model;
	}
	
	@RequestMapping(value="/Search",method=RequestMethod.GET)
	public ModelAndView Search(){
		ModelAndView model=new ModelAndView();
		model.setViewName("Search");
		return model;
	}
	
	@RequestMapping(value="/Feepayment",method=RequestMethod.GET)
	public ModelAndView FreePayment(){
		ModelAndView model=new ModelAndView();
		model.setViewName("Feepayment");
		return model;
	}
	
	
}
