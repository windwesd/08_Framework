package edu.kh.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

// Spring Security 자동 설정을 실행 시 포함하지 않음
// -> Security 제공 로그인 페이지가 비활성화
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class StudyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyProjectApplication.class, args);
	}

}
