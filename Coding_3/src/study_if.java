public class study_if {

    // 실행함수 (메인함수)
    public static void main(String[] args) {
        // TODO Auto-generated method stud
        String takano = "잘생겼다";
        int a = 1;

        if(takano == "못생겼다") { // 만약에 ()라면... 중괄호 내부를 실행.
            System.out.print("정답입니다.");
        }
        else if(takano == "잘생겼다") {
            System.out.println("잘생겼다..");
        }
        else if(takano == "잔생겼다") {
            System.out.print("정답입니다.");
        }
        else if(takano == "생겼다") {
            System.out.print("정답입니다.");
        }


        if(a == 0) {
            System.out.print("a는 0 입니다.");
        }
        else if (a == 1) {
            System.out.println("a는 1 입니다.");
        }


        // and 연산자 , or 연산자
        if(a == 0 && a == 1) { // and 연산자 사용
           System.out.println("TEST");
        }

        if(a == 0 || a == 1) { // or 연산자 사용
           System.out.println("TEST2");
        }


    }
}
