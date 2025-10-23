package com.korit.study.ch24;

import java.util.*;

public class BoardMain {
    public static void main(String[] args) {
        // 데이터를 이런식으로 주고 받기 때문에 자유자재로 다뤄야 하는 부분
        // 이거 풀어내고 만들어내기 못하면 아무것도 못함
// 게시판
        /**
         * [
         *      {
         *          "title": "게시판 제목1",              <<< String, String
         *          "writer": {                         <<< String, Map 이니까 Object
         *              "name": "김준일",                <<< String, String
         *              "age": 32                       <<< String, Integer 니까 Object
         *          },                                  <<< 여기까지가 중괄호면... Map 2의 끝?? 인가??
         *          "content": "게시판 내용1",            <<< String, String
         *          "comments": [                       <<< 여기는 뭐지? List 의 String 을 시작하는 부분?
         *              {
         *                  "writer": "김준이",          <<< 다시 Map 으로 String, String
         *                  "content": "댓글 내용1"       <<< String, String
         *              },
         *              {
         *                  "writer": "김준삼",
         *                  "content": "댓글 내용2"
         *              },
         *          ]
         *      },      <<< 여기까지가 Map
         *      {
         *          "title": "게시판 제목2",
         *          "writer": {
         *              "name": "김준사",
         *              "age": 34
         *          },
         *          "content": "게시판 내용2",
         *          "comments": [
         *              {
         *                  "writer": "김준오",
         *                  "content": "댓글 내용11"
         *              },
         *              {
         *                  "writer": "김준육",
         *                  "content": "댓글 내용22"
         *              },
         *          ]
         *      },
         * ]
         */

        // 대괄호 List 그 안에 중괄호 Map (풀지 못해도 되는데 부분적으로 이해하기)
        // 큰 부분부터 만들지 말고 안쪽의 자그마한 부분을 먼저 만들고 만든 작은 걸 담을 수 있는 List 를 만들고 다시 Map 을 만들고 그걸 다 담아줄 List 를 생성

//        Map<String, String> firstMap = new HashMap<>();
//        List<String> firstList = new ArrayList<>();
//
//        firstMap.put("title", "");
//        firstList.add(":");
//        firstMap.put("게시판 제목1", ""); // tlqkf뭐야ㅠㅠ
//
//        firstMap.put("wirter", "");
//        firstList.add("{");
//
//        System.out.println(firstMap);
//        System.out.println(firstList);
        // 왜 이렇게 생각하고 파려고 했는지 집 가서 ㅈㄴ 고민하기

//        Map<String, Object> writer1 = new LinkedHashMap<>(); // 이거 HashMap 대신 넣어준 이유가 얘는 순서가 없고 LinkedHashMap 이
//        writer1.put("name", "김준일");
//        writer1.put("age", 32);
//        // 아?? 이거 왜 이렇게 하나 싶더만 혹시 Integer 가 있으니까? 다시 또 세워주기 보다는 그냥 Object 로 퉁쳐서? Integer 까지?? 다 넣어준 건가? 효율적으로?
//
//        // 그 뭐냐 그건가?? 게시글 댓글 목록 List??
//        List<Map<String, Object>> comments1 = new ArrayList<>(); // 이게 그럼 그거임?
//
//        // 댓글1
//        Map<String, Object> comment1_1 = new LinkedHashMap<>();
//        comment1_1.put("writer", "김준이");
//        comment1_1.put("content", "댓글 내용1");
//        comments1.add(comment1_1);
//
//        // 댓글2
//        Map<String, Object> comment1_2 = new LinkedHashMap<>();
//        comment1_2.put("writer", "김준삼");
//        comment1_2.put("content", "댓글 내용2");
//        comments1.add(comment1_2);
        

            // 1. 게시글 전체 목록을 담을 최상위 List를 선언합니다. (List<Map<String, Object>>)
            List<Map<String, Object>> boardList = new ArrayList<>();

            // ----------------------------------------------------------------------
            // # 첫 번째 게시글 데이터 구성 시작

            // 1-1. 게시글 작성자 정보 Map을 생성합니다. (LinkedHashMap 사용)
            Map<String, Object> writer1 = new LinkedHashMap<>();
            writer1.put("name", "김준일");
            writer1.put("age", 32);

            // 1-2. 첫 번째 게시글의 댓글 목록 List를 생성합니다.
            List<Map<String, Object>> comments1 = new ArrayList<>();

            // 댓글 1 (LinkedHashMap 사용)
            Map<String, Object> comment1_1 = new LinkedHashMap<>();
            comment1_1.put("writer", "김준이");
            comment1_1.put("content", "댓글 내용1");
            comments1.add(comment1_1);

            // 댓글 2 (LinkedHashMap 사용)
            Map<String, Object> comment1_2 = new LinkedHashMap<>();
            comment1_2.put("writer", "김준삼");
            comment1_2.put("content", "댓글 내용2");
            comments1.add(comment1_2);


            // 1-3. 첫 번째 게시글 Map을 생성하고 모든 정보를 담습니다. (LinkedHashMap 사용)
            Map<String, Object> post1 = new LinkedHashMap<>();
            post1.put("title", "게시판 제목1");
            post1.put("writer", writer1);    // 작성자 Map을 통째로 넣음
            post1.put("content", "게시판 내용1");
            post1.put("comments", comments1); // 댓글 List를 통째로 넣음

            // 최종 게시글 목록에 추가
            boardList.add(post1);

            // ----------------------------------------------------------------------
            // # 두 번째 게시글 데이터 구성 시작

            // 2-1. 게시글 작성자 정보 Map을 생성합니다. (LinkedHashMap 사용)
            Map<String, Object> writer2 = new LinkedHashMap<>();
            writer2.put("name", "김준사");
            writer2.put("age", 34);

            // 2-2. 두 번째 게시글의 댓글 목록 List를 생성합니다.
            List<Map<String, Object>> comments2 = new ArrayList<>();

            // 댓글 1 (LinkedHashMap 사용)
            Map<String, Object> comment2_1 = new LinkedHashMap<>();
            comment2_1.put("writer", "김준오");
            comment2_1.put("content", "댓글 내용11");
            comments2.add(comment2_1);

            // 댓글 2 (LinkedHashMap 사용)
            Map<String, Object> comment2_2 = new LinkedHashMap<>();
            comment2_2.put("writer", "김준육");
            comment2_2.put("content", "댓글 내용22");
            comments2.add(comment2_2);

            // 2-3. 두 번째 게시글 Map을 생성하고 모든 정보를 담습니다. (LinkedHashMap 사용)
            Map<String, Object> post2 = new LinkedHashMap<>();
            post2.put("title", "게시판 제목2");
            post2.put("writer", writer2);    // 작성자 Map을 통째로 넣음
            post2.put("content", "게시판 내용2");
            post2.put("comments", comments2); // 댓글 List를 통째로 넣음

            // 최종 게시글 목록에 추가
            boardList.add(post2);

            // ----------------------------------------------------------------------
            // 데이터 출력 (확인용)
            System.out.println("--- 구성된 게시판 데이터 출력 (순서 보장) ---");
            System.out.println(boardList);

            // 특정 데이터 접근 예시 (첫 번째 게시글의 작성자 이름)
            String firstPostWriterName = (String) ((Map<?, ?>) boardList.get(0).get("writer")).get("name");
            System.out.println("\n첫 번째 게시글 작성자 이름: " + firstPostWriterName);

            // 두 번째 게시글의 첫 번째 댓글 내용
            String secondPostFirstCommentContent = (String) ((Map<?, ?>) ((List<?>) boardList.get(1).get("comments")).get(0)).get("content");
            System.out.println("두 번째 게시글 첫 번째 댓글 내용: " + secondPostFirstCommentContent);
        }
    }

/**
 * Map 을 객체로 만든다? 이 구조를 객체로 만든다... 왜 클래스를 써야 하나?
 * 클래스 객체 구조로 생각을 해보라는...? 뭘까
 * 이걸 어떻게 바꿔야 하는 거지 ㅋㅋ
 */