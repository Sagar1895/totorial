package com.xworkz.tourism.dao.addplace;

import com.xworkz.tourism.entity.addplace.AddPlaceEntity;
import com.xworkz.tourism.exception.DAOException;

public interface AddPlaceDAO {

	public Integer save(AddPlaceEntity entity) throws DAOException;

}
