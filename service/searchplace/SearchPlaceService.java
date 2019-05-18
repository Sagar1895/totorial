package com.xworkz.tourism.service.searchplace;


import com.xworkz.tourism.entity.searchplace.SearchPlaceEntity;
import com.xworkz.tourism.exception.SearchServiceException;

public interface SearchPlaceService {
		
		public SearchPlaceEntity searchplace(String place) throws SearchServiceException;

}
