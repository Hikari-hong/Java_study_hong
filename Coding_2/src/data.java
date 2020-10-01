public class data {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            char var1  = '홍'; // 한 글자의 한글 or 영문 가능 <문자>
            String var2 = "타카노"; // 여러글자의 문자열 가능

            byte var3 = -128; // -128 ~ +127까지 숫자가 가능하다. 1byte 사용형 <정수형>
            short var4 = -32768; // -32768 ~ +32767까지 숫자가 가능하다.
            int var5 = 999999999; // -21억 ~ +21억까지 숫자가 가능하다.
            long var6 = 999999999; // 여러숫자의 입력가능. 8byte 사용

            float var7 = 0.5f; // 4byte 사용. 소숫점 선언후 후첨으로 f가 붙는다. <실수형>
            double var8 = 0.000005; // 소숫점 선언.

            boolean isStart = false; // true or false를 입력하여 조건식에서 많이 사용한다. <>

            System.out.println(var1);
            System.out.println(var2);

            System.out.println(var3);
            System.out.println(var4);
            System.out.println(var5);
            System.out.println(var6);

            System.out.println(var7);
            System.out.println(var8);
            System.out.println(isStart);

        }
}
