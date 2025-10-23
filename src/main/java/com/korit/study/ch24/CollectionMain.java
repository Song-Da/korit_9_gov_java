package com.korit.study.ch24;

import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        // 문자열을 담을 수 있는 ArrayList 생성;
        List<String> list = new ArrayList<>(); // 여기도 업캐스팅인 List<> 가 가능하다. 왜? 같은 인터페이스니까.
        // 대입되어지는 자료형이 담는 것과 서로 다르면 무조건 업캐스팅이며 얘가 얘를 상속하고 있구나, 그럼?
        // 나중에 다운 캐스팅도 할 수 있겠구나 하고 가능성을 넓혀야 한다. 잘 알아두기.

        // 값을 추가
        list.add("문자열 값1");
        list.add("문자열 값2");

        // 값을 가져오기
        String str1 = list.get(0);
        String str2 = list.get(1);

        // 값을 수정
        String str3 = list.set(1, "문자열 값3"); // 1번 인덱스 위치의 값을 오른쪽으로 바꾸겠다. 타겟 인덱스 설정이 꼭 필요하고 Value 가 필요함
        System.out.println(str3);

        // 값 삭제
        boolean removed = list.remove("문자열 값1"); 
        String str4 = list.remove(0); // 위치 삭제, 인덱스 지우는 건 list 가 더 빠름
        System.out.println(removed); // true 는 삭제 되었다는 뜻
        System.out.println(str4); // 0 번 인덱스가 삭제돼서 숫자가 끌어당겨지고 1 인덱스 자리에 있는 3이 나왔다.
        // 0번 인덱스 - 10 1번 인덱스 - 20 중 인덱스 하나를 제거한다는 뜻은
        // -1 을 시켜서 그 위치로 자리를 옮겨주는 행위. 중간에 걸 지웠다면 30, 40 이 있는데
        // 20 을 지웠다면 10은 그대로 있고 나머지 30, 40 이 다음 인덱스로 -1 돼서 들어감.
        // 현재 위치로부터 나보다 작은 녀석은 마이너스를 하지 않고 그대로 두고 큰 녀석은 마이너스를 하고 옮겨줌.
        // 값을 제거한다는 건 지정된 걸 제외하고 값을 옮겨준다는 뜻. 삭제X 자리 옮김O

        // 리스트의 크기 (사이즈)
        int size = list.size(); // 값을 가지고 오는 게 아니라 size 로 호출해서 동적으로 늘어남.
        // 이 녀석이 총 몇개의 노드를 가지고 있고 그걸 체크해서 값을 리턴해준다고 함?
        // size 는 전체 안에 든 데이터의 개수를 리턴해온다.

        // 리스트 안에 값이 포함되어 있는지 확인 (boolean)
        list.add("10"); // 0
        list.add("20"); // 1
        list.add("30"); // 2
        list.add("30"); // 3
        list.add("30"); // 4
        System.out.println(list.contains("50")); // << 리턴 값으로 boolean 을 가지고 옴.

        // 리스트 안에서 값이 위치하고 있는 Index 를 찾기
        int indexOf30 = list.indexOf("30"); // 30 이 위치하고 있는 인덱스 번호 | 앞에서부터 찾음 | 여기가 2
        System.out.println(indexOf30);
        // 앞에서부터 처음으로 찾은 녀석의 인덱스를 가져옴. 리스트는 값의 중복을 허용하기 때문에!!
        // 당장에 indexOf 를 많이 쓰진 않겠지만 자를 때 자주 쓰일 가능성이 높음.


        // 중간에 위치하고 있는 데이터 30의 index 를 찾는 방법
        int start = list.indexOf("30") + 1; // start 가 3. 왜? 위에 indexOf30 에 2 index 니까.
        indexOf30 = -1; // 위와 별개
        for (int i = start; i < list.size(); i++) { // start 가 3 last.size 가 5
            if (list.get(i).equals("30")) { // i 는 3 이 안에 든 것과 같냐?
                indexOf30 = i; // i 안에 3 다시 for 첫부분으로 되돌아가 +1 해주고 4 로 차례 시작
                break; // 맨마지막을 찾을 거라면 브레이크를 안 걸어줘도 됨.
            }
        }
        // 이 로직을 쓰면 가운데 있는 걸 찾을 수 있음.
        // 이를 효율적으로 쓰려면 앞에서 찾고 뒤에서부터 찾고를 잘 해야 함. 시간 복잡도... 
        System.out.println(indexOf30);
        
        // 리스트 자르기
        List<String> subList = list.subList(list.indexOf("30") + 1, list.size()); // n 번 인덱스 "부터" n 번 인덱스 "전까지"
        subList.indexOf("30");
        subList.add("40");
        System.out.println(subList); // 실제 객체가 존재하는 ArrayList... 새로운 어레이리스트가 됨.

        LinkedList<String> linkedList = new LinkedList<>(); // 맨 앞의 저걸 List 로 바꿀 수 있음. 업캐스팅.
        linkedList.add("10");
        linkedList.add("20");
        linkedList.add("30");
        linkedList.add("40");
        linkedList.indexOf("30");

        // 자른 변수는 만약에 기존 변수가 100 의 메모리에 있었다면 자른 건 200 의 메모리에 새로 생성이 됨. 기존 것이 사라지는 게 아니라
        // 새로 만들어져서 기존의 것은 계속 유지가 됨.

        // Set (집합)
        Set<String> strSet = new HashSet<>();

        // 값 추가
        strSet.add("나");
        strSet.add("가");
        strSet.add("다");
        System.out.println(strSet);

        // 값 조회 (i 를 증가시키는 for 문을 쓸 수가 없다. get 메서드 사용이 불가하니까. 왜? 인덱스가 없으니까.)
//        for (int i = 0; i < strSet.size(); i++) {
//            strSet.
//        }

        // for each 를 쓰게 되면 무조건 전체 순회 및 하나씩 가져옴. 값을 가지고 온다는 건 Set 에서 반복을 돌려야 한다.
        String r1 = null;
        String setSearchValue = "다";
        for (String s : strSet) {
        if (s.equals(setSearchValue)) {
            r1 = s;
            break; // 찾았으면 반복 돌릴 필요가 없으니까. 이런 식으로 값을 하나씩 들고옴.
        }}
        System.out.println(r1);
        if (strSet.contains(setSearchValue)) {
            r1 = setSearchValue;
        }
        System.out.println(r1);
        // 내가 set 에서 contains 가 포함되어 있는지 확인하고 결과값을 r1 에 대입
        // 단일 값일 때 쓸 수 있음.


        // 값 삭제
        strSet.remove("나");
        System.out.println(strSet);

        // 값 수정
        strSet.remove("다"); // 삭제하고
        strSet.add("라"); // 그 자리에 추가함.

        // 리스트 -> 세트
        List<String> a = new ArrayList<>();
        a.add("가");
        a.add("가");
        a.add("나");
        a.add("나");
        a.add("다");
        a.add("라");
        Set<String> b = new HashSet<>();
        for (String s : a) {
            b.add(s);
        }
        System.out.println(b); // 출력 순서는 상관이 없다. 중복 제거가 된 상태로 추력
        Set<String> c = new HashSet<>();
        c.addAll(a); // addAll 로 구현되어 있는 것.
        System.out.println(c);

        // 세트 -> 리스트
        List<String> d = new ArrayList<>();
        d.addAll(c);

        // Map(키 + 값 쌍 -> 집합)
        Map<String, String> strMap = new HashMap<>(); // Value 의 값도 스트링, 나중에는 오브젝트라는 것도 많이 씀. 그러니까 이것저것 많이 들어올 수 있음. list 도 넣을 수 있고. 응용식?

        // 값 추가
        strMap.put("a", "김준일");
        strMap.put("b", "김준이");
        strMap.put("c", "김준삼");
        strMap.put("d", "김준사");
        strMap.put("d", "김준오"); // Key 값 중복이 안 됨. 절대 중복일 수가 없음. 나중에 get 을 쓸 때 문제가 생김. 만약에 이렇게 쓴다면 코드의 뒤에 있는게 덮어씀. 즉, 수정의 의미가 있음.
        System.out.println(strMap);

        // 값 조회
        String mapValue = strMap.get("c"); // Value 를 가지고 옴.
        System.out.println(mapValue);
        String mapValue2 = strMap.getOrDefault("g", "기본값"); // g 라는 Key 값은 없기 때문에 기본값 나옴
        System.out.println(mapValue2);

        // 값 수정
//        strMap.put("g", "김준육"); // 이러면 수정이 아니라 추가가 됨.
        strMap.put("a", "김준육"); // 이래야 수정이 됨.
        System.out.println(strMap);

        // 값 삭제
        System.out.println(strMap.remove("a"));
        System.out.println(strMap.remove("a")); // null 반환
        strMap.remove("a"); // 이게 하나 더 있는 채로 출력해도 오류는 나지 않음.
        System.out.println(strMap);
        System.out.println(strMap.remove("b", "김준육")); // 일치하지 않아서 false 를 반환함.
        System.out.println(strMap.remove("b", "김준이")); // Value 까지 일치해야 정상적으로 지워진다.
        System.out.println(strMap);
        /*
        c=김준상 <<< 이게 한묶음으로 침.
        이게 무슨 자료형일까? 알 수가 없으니까 섣불리 값을 넣을 수 없다.
        Map 은 ent. 키 밸류 한쌍으로 묶여있는 건 모두 entry 라고 칭함.
         */

        /*
        클래스명 앞에 . 이 붙는 게 있었나?
        이런 System.out 은 클래스가 아닌데. 이런 경우는 한 번도 없었음
        Entry 는 Map 안에 들어있음. 이를 내부 클래스라고 함. 인터페이스 안에 인터페이스가 있고...
         */
        // Map 을 반복 작업하는 방법: Map 자료형을 Entry 가 들어있는 Set 자료형으로 형변환
        System.out.println(strMap.entrySet()); // Map 에서 Set 으로 바꿨고 대괄호가 나옴. 반복이 되나
        for (Map.Entry<String, String> entry : strMap.entrySet()) { // 엔트리 하나만 봅는 게 아니라
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }

        Set<String> valuesSet = new HashSet<>();
        valuesSet.addAll(strMap.values());

    }
}

/**
 * List<E> 는 순서가 있고 중복을 허함. 배열을 생각하면 될 듯...
 * Set<E> 은 순서가 없다. 인덱스 번호가X 그리고 중복도X (중복이 되면 안 되는 상황)
 * Map<K, V>
 * index 도 중복이 될 수 없는 건 유일한 Key 값
 * 책꽂이는 책을 순서대로 넣어둘 수 있음. 각각 나누어져 있으니까 <<< List (순서!)
 * 주머니는 한 번 흔들면 섞이므로 순서가 없음. 순서가 중요하지 않다는 게 중요. 순회는 가능 <<< Set (중복!)
 * Map 은 Key 와 Value 가 한쌍!! 순서가 없다. 이는 Set 과 같음. 순서가 필요없다는 건 중복이 안 되는 게 더 중요
 * 이때 Key 는 중복을 허용하지 않지만 값은 중복이 될 수 있다. >>> 학생 이름이 모두 홍길동이지만 자리는 a, b, c 알파벳으로
 * 다르게 되어있음. 그럼? 한쌍은 중복이 아닌 값.
 * 한쌍은 entry 로 Map 은 엔트리들의 집합. 순서가 중요치 않고 키 중복은 안되지만 값은 가능.
 * 자료형 2개를 받아서 어떤 자료형으로 저장될 거라는 걸 명시 2개의 제네릭 타입을 받음.
 *
 * ArrayList 는 class 고 AbstractList 로
 * set 은 세팅도 있고 집합의 개념도 있다. 한 묶음 같은 것.
 * remove boolean 은 지워진 값을 true, false 로...
 * int index 는 번호를 적어서 지웠습니다 String 이 출력?
 *
 * contains 는 왜? 쓰는가 하면 포함되어 있는지 아닌지를 확인하기 위해서...
 * 왜 인터페이스를 쓰나?
 *
 * 어레이리스트는 배열을 쓰고 링크드리스트는 안 보이는 로드라는 개념이 있음.
 * 자료 구조 자체가 다름. 어레이리스트니까 배열을 쓴 리스트, 링크드리스트는 선형 리스트라고도 하는데
 * 서로 데이터들이 링킹 즉, 연결되어 있음. 얘 다음과 이전의 정보를 가지고 있음.
 * 연결된 정보를 하나의 노드라고 하는데 제일 앞에 있는 걸 헤드. 제일 끝에 있는 걸 테일.
 * 중간중간에 있는 건 노드들. 헤드는 다음 노드의 주소를 가지고 있고 실제 데이터 값도 가지고 있음.
 * 헤드라고 하는 값을 가지고 있으면 여기가 0번 인덱스
 * 제일 끝의 노드인 꼬리가 트루로 되어 있으면 노드의 제일 끝.
 * 중간에는 헤드와 테일이 false 로 되어있을 것.
 * List 로 업캐스팅이 가능함!! 왜? 같은 인터페이스니까. 하지만 가능한 추상화를 하여
 * 각자의 기능을 사용하는 게 좋다. 앞으로 자주 인터페이스를 사용할 것.
 *
 *
 * - - - - -
 *
 *
 * 웬만하면 자료형을 List 를 쓰기로 했는데.
 *
 * 집합이란? 벤다이어그램을 생각하면 됨.
 * A - 1 2 3
 * B - 2 3 4 5
 * 여기서 겹치는 교집합 부분을 2, 3
 * A 에서 뺀 걸 
 * A 와 B 를 모두 합치면 차집합
 *
 * 벤다이어그램을 중복 제거가 되어 있어야 함.
 *
 *
 * HashSet 은 하나의 방법. Hash 라는 알고리즘을 적용시킨 기능.
 * HashSet 을 왜 많이 쓸까?
 * 동일한 값을 넣을 수 없고 같은 데이터구나 매칭을 해서 하나만 넣게 됨. 즉, 중복 제거가 됨. 기존의 값이 있다면 덮어쓰는 개념
 * 나, 가, 다 처럼 내가 순서를 바꾸더라도 동일하게 값이 들어감. 순서가 인덱스대로 들어가지 않고 Set 자료형은 애초에 순서가 없지만
 * 이게 정렬이 된 상태임. 그럼? 정렬 기준이 뭔가 하면 Hash 값에 의해서 정렬이 일어나고 있음.
 * 어찌 보면 순서가 있다라고 생각을 해도 됨.
 * Hash 라는 개념을 Set 과 그냥 붙인 느낌.
 * 해시 코드 값이 있으니까 코드 값을 보고 정렬을 시킨다.
 *
 * 1. 중복이 안 됨. 하지만 새시 값에 의해 정렬이 되고 있음. 그런데 순서가 없다는 건 인덱스 번호가 없다는 것. 특정 값을 딱 가져오라 할 수가 없음.
 *
 * Set 에서는 조회의 개념이 조금 다름
 * 반복을 돌리면서 이것과 같은 값이 있는지 봄
 * 
 * Set 에서 값을 수정한다는 건 무슨 뜻일까?
 * [가, 나, 다] 여기에 나 자리에 라를 수정하고 싶디는 건 나를 지우고 새로 넣어주는 것. remove 와 add 를 동시에 하게 되면 수정이 됨.
 * list 를 가져와서 Set 으로 바꿔주고 중복을 제거한 뒤 다시 list 로 바꿔줘서 편하게 쓸 수 있게 되어야 함. 왔다갔다...
 * 매개 변수에 콜렉션이 있으면, 상속받고 있으면 다 가능함. 공통으로 뭔갈 할 수 있게 함.
 *
 * List 로 되어있는 게 Collection 을 바꿔줄 수 있음. 아래로 다운 캐스팅 된 기능을 쓸 수 없음.
 *
 * Map 은 컬렉션을 상속받지 않고 Map 의 인터페이스가 최상위.
 * containsKey, containsValue 는 이 키가 포함되어 있니, 값이 포함되어 있니
 * get 은 있긴 함. Key 값은 겹칠 수 없다.
 * Map 에서는 put 이 add 의 기능을 함.
 * remove 또한 있는데 이는? 값으로 지우는 건 없고 Key 값으로 지움.
 * Map 을 쓰면 좋은 점은 우리가 Key 값을 정할 수 있다. 연결된 순서가 없다.
 *
 *
 * - - - - -
 *
 *
 * Collection 은 왜 쓰는가?
 * => 배열과 collection 은 단순하게 흩뿌려진 값을 묶겠다는 의미.
 * ex) 반찬통이 있는데 여기에 김치를 넣고 콩나물도 넣고 그러면 안 되고 관련있는 것들끼리 담아둬야 찾아먹기 좋다.
 *     오브젝트를 쓰면 그냥 다 섞인 짬통이 됨. 그냥 반찬이네 먹는 것과 김치네 하고 먹는 것과의 차이.
 * 뭘 하기 위해 묶는 걸까?
 * 배열, 리스트, 세트 등 반복을 하기 위해서 묶는 것.
 * Map 은 어떻게 반복을 돌리는 걸까?
 *
 * 중괄호를 열면 자료형 Map
 * 대괄호를 열면 자료형 List 또는 배열
 * Set 은 Set 이라 명명
 *
 * 배열도 알아야 하고 List 도 알아야 함. 아예 안 쓴다는 게 아님.
 *
 */