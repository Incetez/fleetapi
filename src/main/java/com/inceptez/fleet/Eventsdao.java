package com.inceptez.fleet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public class Eventsdao {

	@Autowired
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Events> getallevents(int input) 
	{
		return em.createNamedStoredProcedureQuery("event-proc").setParameter("seqno", input).getResultList();
		
	}
	
}
