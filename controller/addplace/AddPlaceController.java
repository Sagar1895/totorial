package com.xworkz.tourism.controller.addplace;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.tourism.dto.addplace.AddPlaceDTO;
import com.xworkz.tourism.service.addplace.AddPlaceService;

@Component
@RequestMapping("/")
public class AddPlaceController {

	@Autowired
	private AddPlaceService addPlaceService;

	public AddPlaceController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping("/addPlace")
	public String onAddPlace(AddPlaceDTO addPlaceDTO) {
		System.out.println("invoked onAddPlace from controller");
		System.out.println("addPlaceDTO :\t" + addPlaceDTO);
		addPlaceService.save(addPlaceDTO);
		return "AddPlace";
	}

}
