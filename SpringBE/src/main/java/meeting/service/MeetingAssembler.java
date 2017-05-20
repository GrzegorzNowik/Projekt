package meeting.service;

import org.springframework.stereotype.Component;

import meeting.api.MeetingDto;
import meeting.domain.MeetingEntity;

@Component
public class MeetingAssembler {

	public MeetingEntity toEntity(MeetingDto meetingdto){
		MeetingEntity meetingentity = new MeetingEntity();
		
		meetingentity.setId(meetingdto.getId());
		meetingentity.setMeeting_date(meetingdto.getMeeting_date());
		meetingentity.setSystem(meetingdto.getSystem());
		meetingentity.setGm_name(meetingdto.getGm_name());
		meetingentity.setGm_surname(meetingdto.getGm_surname());
		meetingentity.setPersons(meetingdto.getPersons());
		meetingentity.setFood(meetingdto.getFood());
		
		return meetingentity;	
	}
	
	public MeetingDto toDto(MeetingEntity meetingentity){
		MeetingDto meetingdto = new MeetingDto();
		
		meetingdto.setId(meetingentity.getId());
		meetingdto.setMeeting_date(meetingentity.getMeeting_date());
		meetingdto.setSystem(meetingentity.getSystem());
		meetingdto.setGm_name(meetingentity.getGm_name());
		meetingdto.setGm_surname(meetingentity.getGm_surname());
		meetingdto.setPersons(meetingentity.getPersons());
		meetingdto.setFood(meetingentity.getFood());
		
		return meetingdto;	
	}
}
