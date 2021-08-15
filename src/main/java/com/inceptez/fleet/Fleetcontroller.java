package com.inceptez.fleet;

import java.util.List;

import javax.persistence.Convert;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.JsonbHttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Fleetcontroller 
{
	@Autowired
	Eventsdao edao;
	
	@Autowired
	Eventsrepo repo;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(path= "/events/{seqno}",produces=MediaType.APPLICATION_JSON_VALUE)
	public  List<Events> getallevents(@PathVariable(name= "seqno") int seqno) {
		logger.debug("Getting events data for the seqid= {}.", seqno);
		return  edao.getallevents(seqno);
		
	}
	@GetMapping(path= "/curevents/{seqno}",produces=MediaType.APPLICATION_JSON_VALUE)
	public  List<Events> getcurrentevents(@PathVariable(name= "seqno") int seqno) {
		logger.debug("Getting events data for the seqid= {}.", seqno);
		return  repo.getcurrentevents(seqno);		
	}
	
}
