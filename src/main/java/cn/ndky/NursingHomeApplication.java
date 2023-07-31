package cn.ndky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.ndky.mapper")
public class NursingHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(NursingHomeApplication.class, args);
    }

}
