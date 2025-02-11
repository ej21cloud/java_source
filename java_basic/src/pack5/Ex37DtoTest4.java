package pack5;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ex37DtoTest4 {
	private ArrayList<E>
	
	public void insertData(String[] datas) {
		for(int i = 0; i < datas.length; i++) {
			StringTokenizer tok = new StringTokenizer(datas[i], ",");
			int sabun = Integer.parseInt(tok.nextToken());
			String name = tok.nextToken();
			int salary = Interger.parseInt(tok.nextToken());
			
		}
	}
	
	public void showData() {
		System.out.println("사번");
	}
	public static void main(String[] args) {
		String[] datas = new String[2];
		datas[0] = "1,강나루,1500000,2005";
		datas[1] = "2,홍길동,1200000,2006";
		
		Ex38DtoTest4 test4 = new Ex38DtoTest4();
		test4.insertData(datas);
		test4.showData();
	}
	
}
