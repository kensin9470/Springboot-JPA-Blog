package com.cos.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니구요.
//특정 어노테이션이 불터있는 클래스 파일들을 new 해서 (Ioc) 스프링 컨테이너에 관리해줍니다.
@RestController 
public class BlogControllerTest {
	

//drop user cos;
//-- 유저이름@아이피주소
//create user 'cos'@'%' identified by 'cos1234';
//-- ON DB이름.테이블명
//-- TO 유저이름@아이피주소
//GRANT ALL PRIVILEGES ON *.* TO 'cos'@'%';
//CREATE DATABASE blog;
//use blog;
	
//	[client]
//	default-character-set=utf8
//
//	[mysql]
//	default-character-set=utf8
//
//	[mysqld]
//	collation-server = utf8_unicode_ci
//	init-connect='SET NAMES utf8'
//	init_connect='SET collation_connection = utf8_general_ci'
//	character-set-server=utf8
	
//	show variables like 'c%';
	
//	spring:
//		  datasource:
//		    driver-class-name: com.mysql.cj.jdbc.Driver
//		    url: jdbc:mysql://localhost:3306/blog?serverTimezone=Asia/Seoul
//		    username: cos
//		    password: cos1234	
 /**
  * todo
  * Git 셋팅
  * @return
  */
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
