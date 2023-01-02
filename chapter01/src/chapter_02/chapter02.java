package chapter_02;

// class : 객체를 생성하는 설계도 /기준 
class SmartPhone{
//	맴버변수 
	String mynation;
	String myos;
	String myowner;
	String mytelNumber;
	
	
	String yournation;
	String youros;
	String yourowner;
	String yourtelNumber;
	
	
	
	
//	메서드
	void mytel(String toTelNumber) {
//		전화번호가 빈값이면 '전화번호를 입력하세요'
		if(toTelNumber.isEmpty()) { //빈 값 확인 할때는 isEmpty() 함수 사용 
			System.out.println("전화 번호를 입력하세요");
		}
//		빈값이 아니면 'ToTelNumber'에 전화중입니다.
		System.out.println(toTelNumber+ "에 전화중입니다");
		
	}

	void mysend_Message(String toTelNumber,String message_content) {
		System.out.println(toTelNumber+"에"+message_content+"를 보냅니다.");
	}
}

public class chapter02 {

	public static void main(String[] args) {
//		 인스턴스 선언 및 생성 
		 SmartPhone myPhone; //참조 변수 선언  
		 myPhone = new SmartPhone();// 객체 생성 
		 SmartPhone yourPhone = new SmartPhone(); //참조변수 선언 및 객체 생성 
		 
		 System.out.println(myPhone);
		 System.out.println(yourPhone);
		 
		 
//		 instance의 속성(맴버 변수)에 접근 
		 myPhone.mynation = "Korea";
		 myPhone.myos = "android";
		 myPhone.myowner = "서지훈";
		 myPhone.mytelNumber = "010-1111-1111";
	 
		 System.out.println(myPhone.mynation);
		 System.out.println(myPhone.myos);
		 System.out.println(myPhone.myowner);
		 System.out.println(myPhone.mytelNumber);
		 
//		 인스턴스의 기능을 사용(메서드를 호출)
		 myPhone.mytel("010-3328-9854");
		 
		 SmartPhone hiSmartPhone = new SmartPhone(); //참조변수의 type과 객체의 type이 같아야 한다.
		 yourPhone.mynation = "United State";
		 
		 hiSmartPhone = yourPhone; // yourPhone 참조변수 그 자체에는 메모리 주소가 있었다 hisSmartPhone에는 yourPhone의 메모리 주소가 담긴다 
//		 hisSmartPhone의 POinter가 youerPhone의 메모리를 가르치도록 바뀐다.
		 
		 System.out.println(hiSmartPhone); //두 instance 의 pointing 메모리 주소가 같아졌다. 
//		 chapter_02.SmartPhone@379619aa
		 System.out.println(yourPhone);// 두 instance 의 pointing 메모리 주소가 같아졌다.
//		 chapter_02.SmartPhone@379619aa
		 
		 System.out.println(hiSmartPhone.mynation);
		 
		 yourPhone.mynation = "United Kingdom"; //yourPhone의 nation을 바꾸면 hisPhone도 같은 곳을 가르키기 때문에 hisPhone도 바뀌게 된다
		 System.out.println(hiSmartPhone.mynation);
		 
		 
		 
		 

	}

}
