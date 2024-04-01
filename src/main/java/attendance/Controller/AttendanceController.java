package attendance.Controller;

import attendance.Domain.Attendance;
import attendance.Service.AttendanceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AttendanceController {
    private final AttendanceService service;
    public AttendanceController(AttendanceService service){
        this.service = service;
    }
    @GetMapping("/index")
    public String welcome(){
        return "welcome to attendance management";
    }
    @GetMapping("/getAll")
    public List<Attendance> getAll(){
        return service.getAllAttendance();
    }
    @PostMapping("/create/{no}/{total}/{bool}")
    public void createAttendance(@PathVariable int no,@PathVariable int total, @PathVariable boolean bool){
//        return no+" "+total+" "+bool+" ";?
        service.createAttendance(no,total,bool);
    }
}