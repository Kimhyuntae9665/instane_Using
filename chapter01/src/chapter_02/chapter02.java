package chapter_02;

// class : ��ü�� �����ϴ� ���赵 /���� 
class SmartPhone{
//	�ɹ����� 
	String mynation;
	String myos;
	String myowner;
	String mytelNumber;
	
	
	String yournation;
	String youros;
	String yourowner;
	String yourtelNumber;
	
	
	
	
//	�޼���
	void mytel(String toTelNumber) {
//		��ȭ��ȣ�� ���̸� '��ȭ��ȣ�� �Է��ϼ���'
		if(toTelNumber.isEmpty()) { //�� �� Ȯ�� �Ҷ��� isEmpty() �Լ� ��� 
			System.out.println("��ȭ ��ȣ�� �Է��ϼ���");
		}
//		���� �ƴϸ� 'ToTelNumber'�� ��ȭ���Դϴ�.
		System.out.println(toTelNumber+ "�� ��ȭ���Դϴ�");
		
	}

	void mysend_Message(String toTelNumber,String message_content) {
		System.out.println(toTelNumber+"��"+message_content+"�� �����ϴ�.");
	}
}

public class chapter02 {

	public static void main(String[] args) {
//		 �ν��Ͻ� ���� �� ���� 
		 SmartPhone myPhone; //���� ���� ����  
		 myPhone = new SmartPhone();// ��ü ���� 
		 SmartPhone yourPhone = new SmartPhone(); //�������� ���� �� ��ü ���� 
		 
		 System.out.println(myPhone);
		 System.out.println(yourPhone);
		 
		 
//		 instance�� �Ӽ�(�ɹ� ����)�� ���� 
		 myPhone.mynation = "Korea";
		 myPhone.myos = "android";
		 myPhone.myowner = "������";
		 myPhone.mytelNumber = "010-1111-1111";
	 
		 System.out.println(myPhone.mynation);
		 System.out.println(myPhone.myos);
		 System.out.println(myPhone.myowner);
		 System.out.println(myPhone.mytelNumber);
		 
//		 �ν��Ͻ��� ����� ���(�޼��带 ȣ��)
		 myPhone.mytel("010-3328-9854");
		 
		 SmartPhone hiSmartPhone = new SmartPhone(); //���������� type�� ��ü�� type�� ���ƾ� �Ѵ�.
		 yourPhone.mynation = "United State";
		 
		 hiSmartPhone = yourPhone; // yourPhone �������� �� ��ü���� �޸� �ּҰ� �־��� hisSmartPhone���� yourPhone�� �޸� �ּҰ� ���� 
//		 hisSmartPhone�� POinter�� youerPhone�� �޸𸮸� ����ġ���� �ٲ��.
		 
		 System.out.println(hiSmartPhone); //�� instance �� pointing �޸� �ּҰ� ��������. 
//		 chapter_02.SmartPhone@379619aa
		 System.out.println(yourPhone);// �� instance �� pointing �޸� �ּҰ� ��������.
//		 chapter_02.SmartPhone@379619aa
		 
		 System.out.println(hiSmartPhone.mynation);
		 
		 yourPhone.mynation = "United Kingdom"; //yourPhone�� nation�� �ٲٸ� hisPhone�� ���� ���� ����Ű�� ������ hisPhone�� �ٲ�� �ȴ�
		 System.out.println(hiSmartPhone.mynation);
		 
		 
		 
		 

	}

}
