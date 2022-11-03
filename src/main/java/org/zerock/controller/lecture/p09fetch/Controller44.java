package org.zerock.controller.lecture.p09fetch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.lecture.JavaBean20;
import org.zerock.domain.lecture.JavaBean21;
import org.zerock.domain.lecture.JavaBean22;

@Controller
@RequestMapping("ex44")
public class Controller44 {
	
	@RequestMapping("sub")
	public void method() {
		
	}
	
	@PostMapping("sub01")
	public void method01(String name, String address) {
		System.out.println("1번 메소드 일함");
		System.out.println(name);
		System.out.println(address);
	}
	
	@PostMapping("sub02")
	public void method02(@RequestBody String data) {
		System.out.println("2번 메소드 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub03")
	public void method03(@RequestBody JavaBean20 data) {
		System.out.println("3번 메소드 일함");
		System.out.println(data);
	}
	
	@PostMapping("sub04")
	public void method04(@RequestBody JavaBean21 data) {
		System.out.println(data);
	}
	
	@PostMapping("sub05")
	public void method05(@RequestBody JavaBean22 data) {
		System.out.println(data);
	}
}











