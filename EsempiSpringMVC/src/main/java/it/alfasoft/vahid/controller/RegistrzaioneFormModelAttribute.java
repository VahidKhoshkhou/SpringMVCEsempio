package it.alfasoft.vahid.controller;

import it.alfasoft.vahid.model.Cliente;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrzaioneFormModelAttribute {

	
	@RequestMapping(value="/formCliente_2.html",method=RequestMethod.GET)
	public ModelAndView chidereForm(){
		
		ModelAndView model=new ModelAndView("RegistrazioneModelAttribute/RegistrzaioneFormModelAttribute");
		
		return  model;
	}
	
	

	// prendere i dati automaticamente tramite @ModelAttribute 
	@RequestMapping(value="/registraCliente_2.html",method=RequestMethod.POST)
	public ModelAndView RegistraForm(@Valid @ModelAttribute("c") Cliente cliente,BindingResult bind){
		
		
		if(bind.hasErrors()){
		
		ModelAndView model=new ModelAndView("RegistrazioneModelAttribute/RegistrzaioneFormModelAttribute");

	  
		return  model;
		
		}
		
		ModelAndView model=new ModelAndView("RegistrazioneModelAttribute/HomePageCliente");

		  
		return  model;
		
	}
	
	
@ModelAttribute	
public Model OggettoComune(Model model){
		
		

	    model.addAttribute("headerMessage", "Alfasoft");
		return  model;
	}

}
