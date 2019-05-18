package com.xworkz.tourism.service.searchplace;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tourism.dao.searchplace.SearchPlaceDAOImpl;
import com.xworkz.tourism.dto.addplace.AddPlaceDTO;
import com.xworkz.tourism.entity.addplace.AddPlaceEntity;
import com.xworkz.tourism.entity.searchplace.SearchPlaceEntity;
import com.xworkz.tourism.exception.ControllerException;
import com.xworkz.tourism.exception.SearchDAOException;
import com.xworkz.tourism.exception.SearchServiceException;
import com.xworkz.tourism.util.searchplace.SearchDataUtil;
@Component
public class SearchPlaceServiceImpl implements SearchPlaceService {
	@Autowired
	private SearchPlaceDAOImpl searchplaceDAO;
	@Autowired
	private SearchDataUtil placeutil;

	public SearchPlaceServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public SearchPlaceEntity searchplace(String place) throws SearchServiceException {

		System.out.println("invoke searchplace from service layer");
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																									
		boolean validplace = false;

		System.out.println("start validation of entered place\n");

		boolean valid = validatePlace(place);
		if (valid) {
			System.out.println(" entered place is valid\n");
			SearchPlaceEntity searchplaceEntity = new SearchPlaceEntity();
			SearchPlaceEntity searchplaceEntity1 = new SearchPlaceEntity();
			BeanUtils.copyProperties(place,searchplaceEntity);
			try {
				searchplaceEntity1 =searchplaceDAO.searchbyplace(place);
			} catch (SearchDAOException e) {
				
				System.out.println("Exception raised in SearchPlaceServiceImpl: "+e.getMessage());
				throw new SearchServiceException("EXcetion occurred in searchplaceserviceimpl: "+e.getMessage());

			}
			return searchplaceEntity1;
		} else
			System.out.println("Data is Invalid Data\n");

		return null;
	}

	private boolean validatePlace(String place) {
		if (place != null) {
			boolean validplace = placeutil.isValidPlace(place);
			if (validplace) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out.println("place not found");
		}

		return true;
	}
}
