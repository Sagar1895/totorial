package com.xworkz.tourism.dao.searchplace;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.tourism.entity.searchplace.SearchPlaceEntity;
import com.xworkz.tourism.exception.SearchDAOException;
@Component
public class SearchPlaceDAOImpl implements SearchPlaceDAO {
	@Autowired
	private SessionFactory factory;

	public SearchPlaceEntity searchbyplace(String place) throws SearchDAOException {
		System.out.println("Calling DAO");
		String qry="select entity from SearchPlaceEntity as entity where entity.place=:places";
        Session session=null;
        Transaction transaction=null;
        SearchPlaceEntity entity=null;
		
		try
		{
			session = factory.openSession();
			transaction = session.beginTransaction();
			Query query = session.createQuery(qry);
			query.setParameter("places",place );
			 entity=(SearchPlaceEntity) query.uniqueResult();
			 System.out.println("everything may be ok right now");
			 System.out.println("return entity:"+entity);
			 
		}
		catch(HibernateException e)
		{
			System.out.println("Exception raised in SerchPlaceDAOImpl: "+e.getMessage());
			throw new SearchDAOException("EXcetion occurred in AddPlaceController: "+e.getMessage());

		}
		return entity;
	}


		
	}

	
		
		



