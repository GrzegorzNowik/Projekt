package meeting.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MeetingRepository extends JpaRepository<MeetingEntity,Long>{
	
	@Query("SELECT me FROM MeetingEntity me where me.meeting_date = :date")
	List<MeetingEntity> findMeetingByDate(@Param("date") java.util.Date date);
}
