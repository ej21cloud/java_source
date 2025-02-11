package pack;

public class Test6if {

	public static void main(String[] args) {
		// 조건 판단문 if
		System.out.println("뭔가를 수행 후 if문 만나기");
		int num = 7;
		
		if(num >= 5) { 
			System.out.println("크구나");
			System.out.println("진짜로 크네");
		}
		
		System.out.println("계속1");
		
		if(num >= 5) { // 조건이 true
			System.out.println("크구나");
			System.out.println("진짜로 크네");
		}else { // 조건이 false
		System.out.println("크지 않네");
	}
	
	System.out.println("계속 2");
	int jumsu = 66;
	
	if(jumsu >= 70) {   // 다중 if
		if(jumsu >= 90) {
		System.out.println("우수");
	}else {
		if(jumsu >= 50) {
			System.out.println("저조");
		}else {
			System.out.println("매우 저조");
	}
	}
	}
}
	
	System.out.println("계속3");
	int jumsu2 = 66;
	String result = "";
	
	if(jumsu2 >= 90) {
		result = "수";
	}else if(jumsu2 >= 80) {
		result = "우";
	}else if(jumsu2 >= 70) {
		result = "미";
	}else if(jumsu2 >= 70) {
		result = "양";
	}else if(    // if(jumsu2 < 50) 생략 권장
		result = "가"
		
}
System.out.println("평가 결과는 " + "result");
}

