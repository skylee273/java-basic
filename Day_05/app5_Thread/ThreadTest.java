package Day_05.app5_Thread;

public class ThreadTest {
    public static void main(String[] args) {
        /**
         *  1) 프로세스 (Process)
         *      - 실행중인 프로그램 ( 메모리에 로드 + CPU 처리)
         *      - 멀티 태스킹 : 하나의 CPU에서 여러 개의 프로세스가 실행되는 것.
         *       - 이러한 프로세스는 각각 자원 및 메모리 영역을 갖는다. ( 공유 안됨 )
         *      - 멀티 프로세스 : 여러개의 CPU 이용하여 처리
         *
         *  2) 스레드 (Thread)
         *      - 프로세스 안에서 동작하는 세부적인 작업 단위
         *      - 여러 스레드가 모여서 하나의 프로세스를 이룬다.
         *      - 병렬처리가 가능하다.
         *      - 데이터를 공유할 수 있음
         *      - 가장큰 특징 2가지
         *          - 병행처리
         *          - 데이터 공유
         *      - 멀티 스레드 : 하나의 프로세스안에 여러 개의 스레드가 실행되고 있는 것.
         *
         *   3) 스레드 장점 및 단점
         *      - 자원공유 가능
         *      - 병행처리
         *      - 스레드 제어가 어렵다.
         *
         *   4) 자바에서 스레드 생성방법
         *      - Runnable 인터페이스
         *      - Thread 클래스 ( Runnable 인터페이스를 implement 한것 )
         *      - Myclass : Thread 상속 : 스레드가 됨
         *      - Myclass : Runnable 인터페이스 : 아직 스레드가 되진 않음 -> 스레드가 되게끔 추가적인 작업 필요
         *      - 확정을 위해서는 Runnable 인터페이스를 사용하는것 좋다.
         *
         *   5) main 스레드가 백그라운드로 실행중
         *
         *   6) 스레드 상태(state)
         *                      스케줄러
         *   시작 ---> Runnable 상태 ---> Running 상태(run() 실행) ---> dead
         *   start() ->
         *
         *   7) 스레드는 우선권을 갖는다.
         *      10 (max)
         *
         *      5 (normal)
         *      - main 에서 만들어지는 스레드는 기본적 5를 가짐
         *      1 (min)
         *
         */
    }
}