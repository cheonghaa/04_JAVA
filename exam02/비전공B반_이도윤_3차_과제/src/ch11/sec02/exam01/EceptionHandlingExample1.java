package ch11.sec02.exam01;

public class EceptionHandlingExample1 {
    public static void printLength(String data) {

        try {
            int result = data.length();
            System.out.println("문자 수: " + result);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("[마무리 실행]\n");
        }

    }
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");
    }

    // 프로그램의 문제점 :
    // 이 코드는 예외 처리를 따로 하지 않은 코드 입니다.
    // 따라서 코드를 실행시켰을 때 정확한 오류가 무엇인지 파악하기 어렵습니다.
    // 그리고 예외 처리를 하지 않았을 경우, 프로그램이 비정상적으로 종료될 수 있기에 꼭 예외처리를 해주어야 합니다.


}
