package javaday01;

public class DataType_01 {

	public static void main(String[] args) {
		// boolean 변수를 만들어서 값을 저장
		boolean isNum = true;
		//변수의 값을 출력
		System.out.println("isNum:" + isNum);

		int age = 50;
		System.out.println("나이:" + age);
		
		char ch = 'A';
		int c = 'A';
		System.out.println("ch:" + ch); //char를 출력하므로 A로 출력
		System.out.println("ch:" + c); //int를 출력하므로 65로 출력
		
		//자동 형 변환
		double d = 10; //10을 10.0으로 변환해서 저장
		System.out.printf("d:%f\n", d);
		
		//숫자의 표현범위가 int 보다 작은 변수에
		//저장 가능한 정수 리터럴를 대입하면 형 변환해서 대입합니다.
		//표현범위가 더 큰 정수는 대입이 안되고 변수에 있는 데이터도 대입이 안됩니다.
		short s = 3000; //3000이라는 상수는 short 표현 범위 내라서 대입이 가능
		//아래 문장은 에러
		//s = 65535; //65535는 short 표현범위 밖이라서 대입이 불가능
		
		int n = 3000;
		//s = n; //같은 3000이지만 변수에 저장된 3000은 int 3000이라서 더 큰 데이터라서
		//역시 에러가 발생합니다.
		
		
		//자바는 산술연산(+, -, *, /, %)을 할 때 2개의 자료형이 다르면
		//더 큰 자료형으로 변환해서 연산을 하고 int 보다 작으면 int 로 변환해서 연산
		//2개의 자료형이 같으면 결과도 동일한 자료형으로 리턴
		
		double result = 10 / 3;
		//결과는 3.3이 아니고 3.0
		//정수 / 정수 결과가 정수
		System.out.println("result:" + result);
		
		//int 보다 작은 자료형의 연산은 int로 변환해서 처리하기 때문에
		//산술영ㄴ산의 결과가 최소 자료형은 int
		//short s1 = 300;
		//short s2 = 100;
		//short s3 = s1 + s2;
		//위 구문은 에러
		//short + short 이지만 결과는 int
		//산술 연산의 최소단위는 int
		//cpu 의 정수 최소 처리 단위가 int		
		
		
	
		
	}

}

