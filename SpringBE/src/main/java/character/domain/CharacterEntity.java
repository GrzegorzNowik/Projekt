package character.domain;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import person.domain.PersonEntity;

@Entity
@Table(name="PERSON")
@Data
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@NoArgsConstructor
@AllArgsConstructor
public class CharacterEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	
	@Column(name="CHARACTER_NAME",nullable=false)
	private String character_name;
	
	@Column(name="CHARACTER_SURNAME")
	private String character_surname;

	@ManyToOne
	@JoinColumn(name="person_id",nullable=false)
	private PersonEntity personEntity;
	
	@Column(name="RASE")
	private String rase;
	
	@Column(name="CLASE")
	private String clase;
	
	@Column(name="LEVEL")
	private Integer level;
	
	public void setId(int id2){
		this.id=id2;
	}
	public void setCharacter_name(String name){
		this.character_name=name;
	}
	public void setCharacter_surname(String surname){
		this.character_surname=surname;
	}
	public void setPersonEntity(PersonEntity personentity2){
		this.personEntity=personentity2;
	}
	public void setRase(String rase2){
		this.rase=rase2;
	}
	public void setClase(String clase2){
		this.clase=clase2;
	}
	public void setLevel(Integer level2){
		this.level = level2;
	}
	
	public int getId(){
		return id;
	}
	public String getCharacter_name(){
		return character_name;
	}
	public String getCharacter_surname(){
		return character_surname;
	}
	public PersonEntity getPersonsEntity(){
		return personEntity;
	}
	public String getRace(){
		return rase;
	}
	public String getClase(){
		return clase;
	}
	public Integer getLevel(){
		return level;
	}
	
}
