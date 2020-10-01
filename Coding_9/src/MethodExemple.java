public class MethodExemple {


    public static void main(String[] args) {
        // TODO: 2020/10/02

//        String a = "Hello";
//        String b = "Takano";
//
//        System.out.println(a + b);

        MethodExemple methodExemple = new MethodExemple();  // Class 생성
//        methodExemple.StrCombine("Hello", "Takano"); // Method 실행 (String type 2개를 넘겨 줌.)

        String bbb = methodExemple.StrTakano("Hello", "Takano");

        System.out.println( bbb );
    }

    // 메소드 만든 것
    // 메소드를 만드는 이유
    // 1. 유지보수를 위해서
    // 2. 가독성이 좋아지니까
    // 3. 캡슐화 ( 여러 곳에서 중복된 코드를 작성할 필요가 없어짐 )
    public void StrCombine (String a, String b) { // void는 실행형 메소드.
        String result = a + b;
        System.out.println(result);
    }

    public String StrTakano(String Taka, String no) { // Return형 메소드
        String result = Taka + no;
        return result;
    }

}
