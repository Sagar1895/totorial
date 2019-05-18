package com.xworkz.tourism.dao.addplace;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tourism.entity.addplace.AddPlaceEntity;
import com.xworkz.tourism.exception.DAOException;

@Component
public class AddPlaceDAOImpl implements AddPlaceDAO {

	@Autowired
	private SessionFactory sessionfactory;
	
	public AddPlaceDAOImpl() {
		System.out.println(this.getClass().getSimpleName() + " created");
	}

	
	public Integer save(AddPlaceEntity entity) throws DAOException {
		
		Session session=null;
		Transaction transaction=null;
		System.out.println("'invoked save in dao,should implement jpa");
		System.out.println("entity \t" + entity);
		try {
			
			session = sessionfactory.openSession();
			transaction = session.beginTransaction();
		Serializable id=session.save(entity);
		System.out.println("primary key for entity is::"+id);
			transaction.commit();
			return (Integer)id;
		} catch (Exception e) {
			transaction.rollback();	
			System.out.println("Exception raised in AddPlaceDaoImpl: "+e.getMessage());
			throw new DAOException("EXcetion occurred in AddplaceDAOImpl: "+e.getMessage());
		//	transaction.rollback();	
		}finally {
			session.close();
		}
		
	}

}
