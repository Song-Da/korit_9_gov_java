package com.korit.study.ch23;

import java.util.ArrayList;

class User {
    // 캡슐화 안 했음 (private). 그러므로 getter, setter 도 해줄 필요가X
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class VipUser extends User {
    public VipUser(String username, String password) {
        super(username, password);
    }
}

class GoldUser extends User {
    public GoldUser(String username, String password) {
        super(username, password);
    }
}

public class WildcardMain {
    public static void main(String[] args) {
        WildcardMain main = new WildcardMain(); // 1)클래스 객체를 생성하고
//        ArrayList<String> names = new ArrayList<>();
//        names.add("김준일");
//        names.add("김준이");
//        names.add("김준삼");
//        main.printAll(names); // 오브젝트를 썼지만 그러나 보낼 수가 없음.

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("test1", "1234"));
        users.add(new User("test2", "56778"));
        users.add(new User("test3", "1111"));
        main.printAll(users);

        ArrayList<VipUser> vipUsers = new ArrayList<>();
        vipUsers.add(new VipUser("vip1", "1234"));
        vipUsers.add(new VipUser("vip2", "5678"));
        vipUsers.add(new VipUser("vip3", "1111"));
        main.printAll(vipUsers);

        ArrayList<GoldUser> goldUsers = new ArrayList<>();
        goldUsers.add(new GoldUser("vip1", "1234"));
        goldUsers.add(new GoldUser("vip2", "5678"));
        goldUsers.add(new GoldUser("vip3", "1111"));
        main.printAll(goldUsers);
    }

//    public void printAll(ArrayList<?> list) { // 2)이 안에 든 printAll 을 호출한다.
////        list.get(0); // 그런데 여기에 어떤 자료형일 거라 단정 짓는다면 쓸 수 없다. String a = list.get(0);
//        for (Object s : list) { // list 도 배열이 아니지만 for each 가 가능함. 앞으로 나올 컬렉션들 모두 for each 가 가능!
//            System.out.println(s);
//        }
//    }

//    public void printAll(ArrayList<User> list) {
//        for (User s : list) {
//            System.out.println(s);
//    }
//}

    public void printAll3(ArrayList<String > list) { // 2)이 안에 든 printAll 을 호출한다.
//        list.get(0); // 그런데 여기에 어떤 자료형일 거라 단정 짓는다면 쓸 수 없다. String a = list.get(0);
        for (String s : list) { // list 도 배열이 아니지만 for each 가 가능함. 앞으로 나올 컬렉션들 모두 for each 가 가능!
            System.out.println(s);
        }
    }

    public void printAll(ArrayList<? extends User> list) { // extends 는 상속과 관련. User 라는 것과 관련된 게 들어올 것이다.
        for (User s : list) {
            System.out.println(s);
        }
    }
}

/**
 * 와일드 카드 >>> ? 기호
 * 어떤 타입인지 알 수 없다. 즉, 모든 타입을 유추하여 받을 수 있는 방법
 * 상한 경계 와일드 카드 : extends >>> ? extends User
 * 최대 업캐스팅 가능한 범위를 User 로 하겠다. 즉, 상한선을 정하겠다 라는 의미
 * 하한 경계 와일드 카드 : super >>> ? super GoldUser
 * 해당 객체부터 상위로 모든 범위를 지정하겠다. 즉, Object 부터 GoldUser 객체까지 하한선을 정하겠다는 의미.
 */

/**
 * printAll 이 빨간줄이 뜬 이유는 static 이 없어서.
 * static 없는 메서드는 instance 메서드임. 호출을 해야 한다.
 *
 * 유저 객체를 닮을 수 있는 ArrList
 * 제네릭은 클래스를 정의하는 위치에만 쓸 수 있음. 
 *
 * ArrayList 와 Object 는 어레이리스트 자체가 오브젝트와 연관이 되어있어서 충돌이 일어나
 * 바꿀거라면 통째로 바꾸며 ArrayList
 * Generinc 타입이 뭐가 들어올지 모르겠다면 <?> 를 쓰는 와일드 카드를 넣어준다.
 * 뭐가 들어있는지는 모르겠지만 어레이리스트가 변수로 들어올 예정이라는 뜻.
 *
 * capture of ? 는 포착하다. 여기에 들어올 자료형이 무엇인지 포착해서 알아서 그 자료형으로 리턴해주겠다는 뜻.
 * 와일드 카드를 쓰게 되면 오브젝트를 사용할 수밖에 없음. 하지만 대충 뭐가 들어올지 안다면 유저와 스트링 클래스의
 * 공통점은 오브젝트, 객체라는 것. 그럴 때는 와일드 카드를 사용.
 * 와일드 카드를 쓰게 되면 다운 캐스팅을 해줘야 한다.
 * 
 * super 부모 객체
 *
 * 만약에 어레이리스트 안에 super 에 GoldUser 을 넣으면?
 * 어떤 자형인지는 잘 모르겠지만 골드 유저가 들어있을 거라 예측하고 골드 유저도 되고 부모인 유저도 된다
 * 했더니 for 안의 User 에 빨간줄이 뜨는데 무조건 오브젝트로 해줘야 함. 유저의 부모는 오브젝트이기 때문에
 * extends 는 왜 되냐? 제일 꼭대기가 User이기 때문에...
 *
 *
 *
 *
 */