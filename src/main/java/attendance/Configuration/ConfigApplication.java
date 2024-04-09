package attendance.Configuration;

import attendance.Domain.Attendance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApplication {
    @Bean
    Attendance attendance(){
        Attendance at = new Attendance(9,32,false);
        return at;
    }
    @Bean
    String index(){
        return "introduction to beans";
    }
}
