package javaday01;

public class DataType02 {

	public static void main(String[] args) {
		double r = 10 / 4;
		System.out.println("r:" + r); //정수 /정수는 정수 2.0
		
		r = (double)10 / 4;
		//10을 실수로 변경했기 때문에 실수/정수 는 실수로 결과를 리턴
		
		//실수 / 실수 한 결과를 정수로 저장하고자 하는 경우에는 int로 변환
		int result = (int)(10.3/5.2);
		System.out.println("result:" + result);
		
		double d = 18.75;
		//d를 소수 첫째자리에서 반올림해서 정수로 변환
		int n = (int)(d + 0.5);
		System.out.println("n:" + n);
		
		
		//일의 자리에서 반올림
		
		n = (int)(d*0.1 + 0.5) * 10;
		System.out.println("n:" + n);
		
		//소수 둘째 자리에서 반올림해서 출력
		//반올림할 자리를 소수 첫째 자리로 보내기
		double x = (int)(d*10 +0.5) / 10.0;
		System.out.println("x:" + x);

	}

}
