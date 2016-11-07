package it.alfasoft.vahid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EsempioEccezioni {

	
	@RequestMapping(value="/aaa",method=RequestMethod.GET)
	public ModelAndView bbbbb() throws NullPointerException{
		
		ModelAndView model=new ModelAndView("gestioneEccezioni/Eccezione");
		
		int a =0;
		
		if(a==0)
		throw new NullPointerException();
		
		return model;
	}
	
	
	
}
