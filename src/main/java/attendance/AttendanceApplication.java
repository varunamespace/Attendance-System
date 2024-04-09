package attendance;

import attendance.Configuration.ConfigApplication;
import attendance.Domain.Attendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class AttendanceApplication implements CommandLineRunner {

	@Autowired
	private AttendanceRepository attendanceRepository;

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ConfigApplication.class);
		String s = context.getBean(String.class);
		System.out.println(s);
		SpringApplication.run(AttendanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try{
			List<Attendance> attendanceList = new ArrayList<>();
			attendanceList.add(new Attendance(1, 10, false));
			attendanceList.add(new Attendance(2, 10, false));
			attendanceRepository.save(new Attendance(3,15,true));
			attendanceRepository.saveAll(attendanceList);
		}catch (Exception e){
			System.out.println(e);
		}
	}
}
