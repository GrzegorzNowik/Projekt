package meeting.service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import meeting.api.MeetingDto;
import meeting.domain.MeetingEntity;
import meeting.domain.MeetingRepository;

@Service
public class MeetingService {

	@Autowired
	private MeetingRepository meetingRepository;
	
	@Autowired
	private MeetingAssembler meetingAssembler;
	
	public List<MeetingDto> getMetingByDate(String date){
		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date meetingDate = null;
		try {
			meetingDate = dateFormat.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<MeetingEntity> temporaryList = meetingRepository.findMeetingByDate(meetingDate);	
	
		return  meetingAssembler.toDto(temporaryList);
	}
}
