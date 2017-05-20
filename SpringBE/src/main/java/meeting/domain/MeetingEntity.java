package meeting.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import person.domain.PersonEntity;

@Entity
@Table(name="MEETING")
@Data
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
 public class MeetingEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="MEETING_DATE")
	private java.util.Date meeting_date;
	
	@Column(name="SYSTEM",nullable=false)
	private String system;
	
	@Column(name="GM_NAME", nullable=false)
	private String gm_name;
	
	@Column(name="GM_SURNAME", nullable=false)
	private String gm_surname;
	
	@ManyToMany
	private Set<PersonEntity> persons = new HashSet<PersonEntity>();
	
	@Column(name="FOOD")
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

