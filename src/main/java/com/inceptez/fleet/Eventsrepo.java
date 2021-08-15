package com.inceptez.fleet;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface Eventsrepo extends JpaRepository<Events, Integer> 
{
	@Query(value = "CALL Getcurrentevent(:seqno);", nativeQuery = true)
    List<Events> getcurrentevents(@Param("seqno") Integer seqno);
}

