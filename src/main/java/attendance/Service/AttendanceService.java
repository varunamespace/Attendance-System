package attendance.Service;

import attendance.AttendanceRepository;
import attendance.Domain.Attendance;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AttendanceService {
    private final AttendanceRepository repository;
    public List<Attendance>getAllAttendance(){
        return repository.findAll();
    }
    public void createAttendance(int id,int totalLeaves,boolean todayLeave){
        repository.save(new Attendance(id,totalLeaves,todayLeave));
    }

}
