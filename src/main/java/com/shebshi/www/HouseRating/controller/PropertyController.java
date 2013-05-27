package com.shebshi.www.HouseRating.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shebshi.www.HouseRating.domain.Property;

import com.shebshi.www.HouseRating.service.PropertyService;

public class PropertyController {

	private static final Logger logger = LoggerFactory
			.getLogger(PropertyController.class);

	@Autowired
	private PropertyService propertyService;
	private String errorMessage;



	@RequestMapping(value = "/propertyInsert", method = RequestMethod.POST)
	public String create(
			@Valid @ModelAttribute("property") Property property,
			BindingResult result, Model model) {
		
		logger.info("Inserted new Property --- ");
		errorMessage = "";
		
		if (result.hasErrors()) {
			errorMessage = "Error adding new property";
			model.addAttribute("error", errorMessage);
			return "propertyInsert";
		}
		
		addNewProperty(property);
		return "redirect:/propertyList";

	}
	
	@RequestMapping(value = "/proprtyUpdate", method = RequestMethod.POST)
	public String update(
			@Valid @ModelAttribute("property") Property property,
			BindingResult result, Model model) {
		Property prop = propertyService.findProperty(property.getShortCode());
		errorMessage = "";
		
		
		if (result.hasErrors()) {
			errorMessage = "Error while updating property";
			model.addAttribute("error", errorMessage);
			return "propertyUpdate";
		}
		
		if (prop == null){
			errorMessage = "Error while updating property";
			logger.info("Error while updating property " + property.getShortCode() );
			return "propertyUpdate";
		}

		updateProperty(property);
		
		return "redirect:/propertylist";

	}


	@RequestMapping(value = "/proprtylist", method = RequestMethod.GET)
	public ModelAndView showResults() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Propertylist");
		modelAndView.addObject("properties", propertyService.ListProperties());

		logger.info("Listing all properties. There are " + Integer.toString(propertyService.ListProperties().size()) );
		return modelAndView;

	}

	private void addNewProperty(Property property) {
		logger.info("Adding property " + property.getShortCode());
		propertyService.createNewProperty(property);
	}

	private void updateProperty(Property property) {
		logger.info("Updated property " + property.getShortCode());
		propertyService.UpdateProperty(property);
		
	}

}
