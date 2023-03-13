package kr.dobi.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
src/main/java : 패키지와 클래스 파일
src/main/resource 
-static : css/js 파일
-templates : html파일(표준)
-application.properties : 환경설정파일
-pom.xml : Maven 라이브러리 설정파일
*
* 크게 설정 할일
* 1. 시큐리티 설정
* 2. mybatis 설정 확인
* 3. 트랜잭션 설정
* 4. 멀티파트 설정  스프링 부트 multipartResolver 자동 등록됨 따로 설정할 필요 없음
* 5. 메시지 설정
* 6. aspect 설정
* 7. 타일즈 설정
* 
*/
@SpringBootApplication
public class SpringBoardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoardApplication.class, args);
	}

}
