package meeting.api;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;
import person.domain.PersonEntity;

@Data
public class MeetingDto {
	
	private int id;
	private java.util.Date meeting_date;
	private String system;
	private String gm_name;
	private String gm_surname;
	private Set<PersonEntity> persons = new HashSet<PersonEntity>();
	private String food;
	
	public void setId(int id2) {
		this.id=id2;
	}
	public void setMeeting_date(java.util.Date date2){
		this.meeting_date=date2;
	}
	public void setSystem(String system2){
		this.system = system2;
	}
	public void setGm_name(String gm_name2){
		this.gm_name=gm_name2;
	}
	public void setGm_surname(String gm_surname2){
		this.gm_surname=gm_surname2;
	}
	public void setPersons(Set<PersonEntity> persons2){
		this.persons=persons2;
	}
	public void setFood(String food2){
		this.food=food2;
	}
	
	public int getId(){
		return id;
	}
	public java.util.Date getMeeting_date(){
		return meeting_date;
	}
	public String getSystem(){
		return system;
	}
	public String getGm_name(){
		return gm_name;
	}
	public String getGm_surname(){
		return gm_surname;
	}
	public Set<PersonEntity> getPersons(){
		return persons;
	}
	public String getFood(){
		return food;
	}

}
