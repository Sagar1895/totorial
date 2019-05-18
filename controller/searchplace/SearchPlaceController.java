package com.xworkz.tourism.controller.searchplace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.tourism.entity.searchplace.SearchPlaceEntity;
import com.xworkz.tourism.exception.ControllerException;
import com.xworkz.tourism.exception.SearchControllerException;
import com.xworkz.tourism.exception.SearchServiceException;
import com.xworkz.tourism.service.searchplace.SearchPlaceServiceImpl;

@Controller
@RequestMapping("/view/searchplace")
public class SearchPlaceController {
	@Autowired
	private SearchPlaceServiceImpl searchbyplace;

	public SearchPlaceController() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	@RequestMapping("/searchPlace")
	public String onsearch(@RequestParam String place, Model model) throws SearchControllerException {

		System.out.println("invoke onsearch");
		System.out.println("search place is::" + place);
		SearchPlaceEntity searchPlaceEntity;
		try {
			searchPlaceEntity = searchbyplace.searchplace(place);
		} catch (SearchServiceException e) {
			System.out.println("Exception raised in OnSearchplacecontroller: "+e.getMessage());
			throw new SearchControllerException("EXcetion occurred in onsearchplacecontroller: "+e.getMessage());

		}
		if (searchPlaceEntity != null) {
			model.addAttribute("Id", "id is::" + searchPlaceEntity.getId());
			model.addAttribute("Country", "country name is::" + searchPlaceEntity.getCountry());
			model.addAttribute("State", "state name is::" + searchPlaceEntity.getState());
			model.addAttribute("Description", "description is::" + searchPlaceEntity.getDescription());
			model.addAttribute("Popular", "popular for::" + searchPlaceEntity.getPopular());
			model.addAttribute("Season", "best season for visit is::" + searchPlaceEntity.getSeason());
		}

		else {
			model.addAttribute("error", "place not found");
		}
		model.addAttribute("searchEntity", searchPlaceEntity);

		return "../searchplace/SearchPlace";
	}

}
