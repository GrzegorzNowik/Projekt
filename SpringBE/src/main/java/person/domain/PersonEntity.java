package person.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import meeting.domain.MeetingEntity;

@Entity
@Table(name="PERSON")
@Data
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {
	
	@Id
	@OneToMany(mappedBy="personEntity")
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="SURNAME")
	private String surname;
	
	@Column(name="PHONE_NUMBER")
	private String phone_number;
	
	@ManyToMany
	private Set<MeetingEntity> meetings = new HashSet<MeetingEntity>();
	
	public void setId(int id2){
		this.id=id2;
	}
	public void setName(String name2){
		this.name=name2;
	}
	public void setSurname(String surname2){
		this.surname=surname2;
	}
	public void setPhoneNumber(String phone_number2){
		this.phone_number=phone_number2;
	}
	public void setMeetings(Set<MeetingEntity> meetingentity){
		this.meetings=meetingentity;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getSurname(){
		return surname;
	}
	public String getPhone_number(){
		return phone_number;
	}
	public Set<MeetingEntity> getMeetings(){
		return meetings;
	}
}
