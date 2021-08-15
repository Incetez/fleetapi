package com.inceptez.fleet;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;



@Entity 
@Table(name= "events")
@NamedStoredProcedureQueries(value= {
		@NamedStoredProcedureQuery(name= "event-proc", procedureName= "Getcurrentevent", parameters= {
				@StoredProcedureParameter(mode= ParameterMode.IN, name= "seqno", type= Integer.class)
		})
})


public class Events {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="`eventid`")
	@Id
	int eventid; 
	
	@Column(name="`driverid`")
	String driverid; 
	
	public String getDriverid() {
		return driverid;
	}
	public void setDriverid(String driverid) {
		this.driverid = driverid;
	}
	public String getTruckid() {
		return truckid;
	}
	public void setTruckid(String truckid) {
		this.truckid = truckid;
	}
	String truckid;
	String eventtype;
	float longitude;
	float latitude;
	String routename;
	String eventts;
	String miles;
	
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	
	public String getEventType() {
		return eventtype;
	}
	public void setEventType(String eventType) {
		this.eventtype = eventType;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public String getRouteName() {
		return routename;
	}
	public void setRouteName(String routeName) {
		this.routename = routeName;
	}
	public String getEventts() {
		return eventts;
	}
	public void setEventts(String eventts) {
		this.eventts = eventts;
	}
	public String getMiles() {
		return miles;
	}
	public void setMiles(String miles) {
		this.miles = miles;
	}
	
	
	
}
