/**
 * 틀
 */

public class User {

    String name;    // 이름
    int age;        // 나이
    String hobby;   // 취미

    // 클래스의 생성자
//    public User (String _name, int _age, String _hobby) {
//        this.name = _name;
//        this.age = _age;
//        this.hobby = _hobby;
//    }

    // 디폴트 생성자
    public User() {}

    /* cmd + N(Win OS 는 Alt + Insert) 의 Constructor 시 */
    public User(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    //
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //
    public User(String name) {
        this.name = name;
    }

    //
    public User(int age) {
        this.age = age;
    }

    /* 개터 세터 영역 */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
