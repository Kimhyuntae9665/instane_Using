package chapter01;

import java.util.Scanner;

public class chapter01 {

//	회원가입 프로세스를 사용한 변수 및 조건문 활용
//	1. 사용자로부터 이메일, 비밀번호,비밀번호 확인, 닉네임, 주소,상세주소를 입력받음
//	2. 모든 값이 입력됐는지 검증
//	2-1 하나라도 입력이 되지 않으면 "모두 입력하세요" 출력 
//	3. 비밀번호와 비밀번호 확인이 사로 같은지 검증 
//	3-1. 서로 같지 않으면 "비밀번호가 서로 다릅니다" 출력 후 프로그램 종료 
//	4.입력받은 데이터를 메모리에 저장 및 출력 후 프로그램 종료 
	public static void main(String[] args) {
//		1. 사용자로부터 이메일, 비밀번호,비밀번호 확인, 닉네임, 주소,상세주소를 입력받음
		Scanner sc = new Scanner(System.in);
		String email;
		String Password;
		String Password_check;
		String nick_name;
		String Address;
		String Detail_address;
		
		System.out.println("이메일: ");
		email = sc.nextLine();
		System.out.println("비밀번호: ");
		Password = sc.nextLine();
		System.out.println("비밀번호 확인: ");
		Password_check = sc.nextLine();
		System.out.println("닉네임 :");
		nick_name = sc.nextLine();
		System.out.println("주소: ");
		Address = sc.nextLine();
		System.out.println("상세주소: ");
		Detail_address = sc.nextLine();
	    
	    
//		2. 모든 값이 입력됐는지 검증
		
		
		
//		2-1 하나라도 입력이 되지 않으면 "모두 입력하세요" 출력 
		if(email.isEmpty()||Password.isEmpty()||Password_check.isEmpty()||nick_name.isEmpty()||Address.isEmpty()||Detail_address.isEmpty()) {
			System.out.println("모두 입력하세요");
			return;
		}
		
//		3. 비밀번호와 비밀번호 확인이 사로 같은지 검증 
		
//		3-1. 서로 같지 않으면 "비밀번호가 서로 다릅니다" 출력 후 프로그램 종료 
		
		if(!Password.equals(Password_check)) {
			System.out.println("비밀번호가 서로 다릅니다.");
			return;
		}
		
//		4.입력받은 데이터를 메모리에 저장(변수에 저장하기 ) 및 출력 후 프로그램 종료 
		System.out.println("이메일 : "+email + " /닉네임 : "+ nick_name);
		
	}

}
