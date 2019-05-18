package com.xworkz.tourism.dao.searchplace;

import com.xworkz.tourism.entity.searchplace.SearchPlaceEntity;
import com.xworkz.tourism.exception.SearchDAOException;

public interface SearchPlaceDAO {
	
	public SearchPlaceEntity  searchbyplace(String place) throws SearchDAOException;

}
