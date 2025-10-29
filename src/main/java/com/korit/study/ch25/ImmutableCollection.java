package com.korit.study.ch25;

import com.korit.study.ch24.Board;
import com.korit.study.ch24.Comment;
import com.korit.study.ch24.Writer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 불변 컬렉션
public class ImmutableCollection {
    public static void main(String[] args) {
//        List<String> iList = new ArrayList<>(); // << 리스트란 이게 정상이다.
        List<String> iList = List.of("김준일", "김준이");
//        iList.add("김준삼"); <<< 이거 때문에 오류남. 왜? add 는 불가하니까.
        System.out.println(iList);
        Map<String, List<String>> iMap = Map.of( // 이걸 쓰면 쌔빠지게 add 를 하지 않아도 됨. 그러나 수정이 안됨. 값 추가, 삭제 또한 불가함.
                "k1", List.of("김준일", "김준이"),
                "k2", List.of("김준삼", "김준사"),
                "k3", List.of("김준오", "김준육"),
                "k4", List.of("김준칠", "김준팔", "김준구")
        );

        List<Board> boards = new ArrayList<>();
        boards.add(new Board("제목1", new Writer("김준일", 32), "내용1",
                List.of(
                        new Comment(new Writer("김준이", 32), "댓글1"),
                        new Comment(new Writer("김준이", 32), "댓글1")
                )));

        System.out.println(iMap);
        System.out.println(boards);
    }

}

/**
 * 컬렉션은 묶어두는 것. 객체든 데이터든 List, Set, Map 등 어떤 특정한 자료로 여러 데이터를 하나로 묶는 행위.
 * 불변 컬렉션이란? 불변 = 변하지 않는 것. 즉, 값이 변하지 않는 묶음?
 * 값을 빼거나 추가할 수 없다는 뜻?
 * List 를 생성하고 값을 넣고 삭제하는 게 가능해야 불변이라는 형태를 만들 수 있지 않나? 값을 추가해야 불변을 쓸 수 있지 않나?
 * 그럼 이게 List 인 게 맞나? add 를 써서 계속 늘어나는데 애초에 불변이라는 게 가능한가? 라는 의문
 * 불변은 애초에 값이 존재해야 불변이라는 걸 말할 수 있지 않나?
 *
 * 불변은 static 이 of(E e1, E e2, E e3 ...) << 제한이 없다는 뜻, 많다는 얘기이다.
 * 배열을 쓰는 것처럼 중괄호를 열어서 계속 늘리는 게 가능하다.
 * 
 * elements.length 는 배열처럼 쓸 수 있다는 것 같은데
 * 그냥사실 의미는 몰라도되고 여러개가 들어갈 수 있다는 기능만 알아두기
 *
 * add, remove, set(값을 바꾸는 행위) 가 안됨. 왜? 불변인데 왜 그러냐?
 * get 은 꺼내올 수 있음. 이를 읽기 전용이라고 함. 문서 열었는데 수정이 안 되게끔 읽기 전용으로 되어있는 게 그거...
 * 바뀔 일이 없을 때만 쓰는 게 불변 컬렉션
 * 그저 전달하는 용도로만 상황에 맞춰서 쓰는 게 좋다.
 * 불변 컬렉션은 머르겠는뎅
 *
 *
 */