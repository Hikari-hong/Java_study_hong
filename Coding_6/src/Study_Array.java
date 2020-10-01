public class Study_Array {
    public static void main(String[] args) {
        // TODO: 2020/10/02
        String a = "a";
        int b = 1;

        int arrayInt[] = new int[10]; // 0부터 9까지의 수를 담고 있음.
        for (int i = 0; i<arrayInt.length; i++) {
            System.out.println(i);
        }


        int arrayInt2[] = {1,3,5,7,9};
        for (int i = 0; i<arrayInt2.length; i++) {
            System.out.println(i);
        }


        int arrayInt3[] = {1,3,5,7,9};
        for (int i = 0; i<arrayInt3.length; i++) {
            System.out.println(arrayInt3[i]);
        }


        String arraystr[] = {"a","b","c","d","e"};
        for (int i = 0; i<arraystr.length; i++) {
            System.out.println(arraystr[i]);
        }

    }
}
