package com.shebshi.www.HouseRating.controller;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shebshi.www.HouseRating.domain.PropertyReview;
//import com.shebshi.www.HouseRating.form.PropertyReviewForm;
import com.shebshi.www.HouseRating.service.PropertyReviewService;

public class PropertyReviewController {

	private static final Logger logger = LoggerFactory
			.getLogger(PropertyReviewController.class);

	
	private PropertyReviewService propertyReviewService;
	private String errorMessage;


	@RequestMapping(value = "/propertyReviewInsert", method = RequestMethod.POST)
	public String create(
			@Valid @ModelAttribute("propertyReview") PropertyReview propertyReview,
			BindingResult result, Model model) {

		errorMessage = "";
		
		if (result.hasErrors()) {
			errorMessage = "Error adding new propertyeview";
			model.addAttribute("error", errorMessage);
			return "propertyReviewInsert";
		}
		
		addNewPropertyReview(propertyReview);
		return "redirect:/propertyReviewList";

	}
	
	@RequestMapping(value = "/proprtyReviewUpdate", method = RequestMethod.POST)
	public String update(
			@Valid @ModelAttribute("propertyReview") PropertyReview propertyReview,
			BindingResult result, Model model) {
		PropertyReview prop = propertyReviewService.findPropertyReview(propertyReview.getId());
		errorMessage = "";
		
		
		if (result.hasErrors()) {
			errorMessage = "Error while updating property";
			model.addAttribute("error", errorMessage);
			return "propertyReviewUpdate";
		}
		
		if (prop == null){
			errorMessage = "Error while updating property Review";
			return "propertyUpdate";
		}

		updatePropertyReview(propertyReview);
		return "redirect:/propertyReviewlist";

	}


	@RequestMapping(value = "/proprtyReviewlist", method = RequestMethod.GET)
	public ModelAndView showResults() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("PropertyReviewlist");
		modelAndView.addObject("propertyReviewList", propertyReviewService.ListPropertyReviews());

		return modelAndView;

	}

	private void addNewPropertyReview(PropertyReview propertyReview) {
		propertyReviewService.createNewPropertyReview(propertyReview);
	}

	private void updatePropertyReview(PropertyReview propertyReview) {
		logger.info("Updated propertyReview " + propertyReview.getId());
		propertyReviewService.UpdatePropertyReview(propertyReview);
		
	}

}
