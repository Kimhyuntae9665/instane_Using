package chapter01;

import java.util.Scanner;

public class chapter01 {

//	ȸ������ ���μ����� ����� ���� �� ���ǹ� Ȱ��
//	1. ����ڷκ��� �̸���, ��й�ȣ,��й�ȣ Ȯ��, �г���, �ּ�,���ּҸ� �Է¹���
//	2. ��� ���� �Էµƴ��� ����
//	2-1 �ϳ��� �Է��� ���� ������ "��� �Է��ϼ���" ��� 
//	3. ��й�ȣ�� ��й�ȣ Ȯ���� ��� ������ ���� 
//	3-1. ���� ���� ������ "��й�ȣ�� ���� �ٸ��ϴ�" ��� �� ���α׷� ���� 
//	4.�Է¹��� �����͸� �޸𸮿� ���� �� ��� �� ���α׷� ���� 
	public static void main(String[] args) {
//		1. ����ڷκ��� �̸���, ��й�ȣ,��й�ȣ Ȯ��, �г���, �ּ�,���ּҸ� �Է¹���
		Scanner sc = new Scanner(System.in);
		String email;
		String Password;
		String Password_check;
		String nick_name;
		String Address;
		String Detail_address;
		
		System.out.println("�̸���: ");
		email = sc.nextLine();
		System.out.println("��й�ȣ: ");
		Password = sc.nextLine();
		System.out.println("��й�ȣ Ȯ��: ");
		Password_check = sc.nextLine();
		System.out.println("�г��� :");
		nick_name = sc.nextLine();
		System.out.println("�ּ�: ");
		Address = sc.nextLine();
		System.out.println("���ּ�: ");
		Detail_address = sc.nextLine();
	    
	    
//		2. ��� ���� �Էµƴ��� ����
		
		
		
//		2-1 �ϳ��� �Է��� ���� ������ "��� �Է��ϼ���" ��� 
		if(email.isEmpty()||Password.isEmpty()||Password_check.isEmpty()||nick_name.isEmpty()||Address.isEmpty()||Detail_address.isEmpty()) {
			System.out.println("��� �Է��ϼ���");
			return;
		}
		
//		3. ��й�ȣ�� ��й�ȣ Ȯ���� ��� ������ ���� 
		
//		3-1. ���� ���� ������ "��й�ȣ�� ���� �ٸ��ϴ�" ��� �� ���α׷� ���� 
		
		if(!Password.equals(Password_check)) {
			System.out.println("��й�ȣ�� ���� �ٸ��ϴ�.");
			return;
		}
		
//		4.�Է¹��� �����͸� �޸𸮿� ����(������ �����ϱ� ) �� ��� �� ���α׷� ���� 
		System.out.println("�̸��� : "+email + " /�г��� : "+ nick_name);
		
	}

}
