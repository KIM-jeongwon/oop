package com.kabank.web.controller;

import java.util.Scanner;

import com.kabank.web.service.AccountService;
import com.kabank.web.service.Memberservice;

public class Portal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("[MENU] 0.종료 1.회원가입 2.계좌개설");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료합니다.");
				return;
			case 1 :
				Memberservice memberservice = new Memberservice();
				
				System.out.println("이름");
				memberservice.setName(scanner.next());
				System.out.println("주민번호");
				memberservice.setSsn(scanner.next());
				memberservice.setCustomNum();
				memberservice.setGender();
				memberservice.setAge();
				System.out.println(
						 "[고객번호]" +memberservice.getCustomNum()
						+"[이름]" +memberservice.getName()
						+"[나이]" +memberservice.getAge()
						+"[성별]" +memberservice.getGender()
						);
				break;
			case 2 : 
				AccountService accountService = new AccountService();
				System.out.println("이름");
				String name = scanner.next();
				accountService.setAccountNum();
				System.out.println(
						"[이름]" +name
					   +"[계좌번호]" +accountService.getAccountNum() 
						);
				break;
			
			}
		}
	}
}
