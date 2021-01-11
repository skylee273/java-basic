package com.app3_변수;

public class VariableTest2 {

	// 프로그램의 시작점 역할(starting point)
	// 반드시 public static void main(String[] args) 형태
	public static void main(String[] args) {

		/*
		 *  변수
		 *  1. 목적: 데이터 저장
		 *  2. 종류
		 *   
		 *     - 기본형 변수: 기본형 데이터를 저장한 변수
		 *        ==> 변수에 가면 실제 기본데이터 저장되어 있다.
		 *     
		 *     - 참조형 변수: 참조형 데이터를 저장한 변수
		 *       ==> 변수에 가면 실제 데이터가 저장된 주소값이 저장되어 있다.
		 *       ==> 클래스,배열,인터페이스의 값의 주소값 저장되고 크기는 항상 4byte이다.
		 *  
		 *  3. 문법
		 *  
		 *    가. 변수 선언 : 메모리에 데이터를 저장할 영역만들고 영역에 이름지정
		 *    
		 *       데이터형 변수명;
		 *       
		 *       예>  int num;
		 *       
		 *           String name;
		 *           
		 *   나. 변수 초기화
		 *        변수명 = 값;
		 *        
		 *       예>  num = 10;
		 *           name = "홍길동";
		 *     
		 * 
		 * 4. 선언위치에 따른 변수 3가지 종류 (*****)
		 * 
		 *  가. 로컬변수
		 *   - 메서드안에서 선언된 변수 
		 *   - 메서드 호출시 생성 ~ 메서드 작업끝나면 제거
		 *   - stack 메모리에 저장
		 *   - 주의할점: 사용전에 반드시 초기화 필수 
		 *   
		 *  나. 인스턴스 변수
		 *   - 메서드 밖에서 선언된 변수
		 *   - 객체생성(new) ~ 객체소멸시 제거
		 *   - heap 메모리에 저장
		 *   - 자동 초기화 ( 정수: 0, 실수: 0.0 , 논리:false,  참조형: null )
		 *   
		 *  다. 클래스 변수(static 변수)
		 *  - 메서드 밖에서 선언된 변수 + static
		 *  - 프로그램실행시 ~  프로그램 종료시 제거 
		 *  - method area 메모리에 저장
		 * - 자동 초기화 ( 정수: 0, 실수: 0.0 , 논리:false,  참조형: null )
		 */
		
		 int num=0; //로컬변수. 반드시 초기화
		 System.out.println(num);
		
	}

}
