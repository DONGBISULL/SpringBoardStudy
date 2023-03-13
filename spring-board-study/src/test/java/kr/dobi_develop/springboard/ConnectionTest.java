package kr.dobi_develop.springboard;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

class ConnectionTest {

	@Test
	void test() {
		   try (
		            Connection con = DriverManager.getConnection(
		                    "jdbc:log4jdbc:mysql://localhost:3306/test_db?useUnicode=true&serverTimezone=Asia/Seoul&characterEncoding=UTF-8",
		                    "myuser",
		                    "test"
		            ))
		    {
		        System.out.println(con);
		    }
		    catch(Exception e) {

		    }
	}

}
