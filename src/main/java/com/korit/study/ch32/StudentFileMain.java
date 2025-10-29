package com.korit.study.ch32;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class StudentFileMain {
    public static void main(String[] args) {
//        StringBuilder fileContent = new StringBuilder();
//        try (FileReader fileReader = new FileReader("student.txt")) {
//            int readDate;
//            while ((readDate = fileReader.read()) != -1) {
//                fileContent.append((char) readDate);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String updatedContent = fileContent.toString()
//                .replace("이름: 김준일", "이름: 송다빈")
//                .replace("나이: 34", "나이: 24");
//
//        try (FileWriter fileWriter = new FileWriter("student.txt")) {
//            fileWriter.write(updatedContent);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        final String FILE_NAME = "student.txt";

        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            StringBuilder builder = new StringBuilder();
            while (true) {
                int readData = fileReader.read();
                if (readData == -1) {
                    break;
                }
                builder.append((char) readData);
            }
            fileReader.close();

            FileWriter fileWriter = new FileWriter(FILE_NAME);

            Map<String, String> modifyDataMap = Map.of(
                    "나이", "34",
                    "이름", "김준삼",
                    "학교", "동의대학교"
            );

            List<String> readLineList = new ArrayList<>();
            readLineList.addAll(Arrays.asList(builder.toString().split("\n")));

            readLineList.stream().map(line -> {
                        AtomicReference<String> stringAtomicReference = new AtomicReference<>(line);
                        modifyDataMap.entrySet().forEach(entry -> {
                            if (stringAtomicReference.get().contains(entry.getKey())) {
                                stringAtomicReference.set(
                                        String.format("%s: %s", entry.getKey(), entry.getValue())
                                );
                            }
                        });
                        return stringAtomicReference.get();
                    })
                    .toList()
                    .forEach(line -> {
                        try {
                            fileWriter.write(line + "\n");

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
            fileWriter.close();
            System.out.println("내용 수정 완료");

        } catch (FileNotFoundException e) {
            System.out.println("파일 못 찾았어요");
        } catch (IOException e) {
            System.out.println("파일 내부의 내용을 읽지 못했습니다.");
        }
    }
}

/**
 * StringBuilder 로 잡고 변수명을 정한 후 선언한다.
 * try 에 리더기를 넣어서 읽어낼 파일의 이름을 적고 int 로 수를 잡아서
 *
 * 아토믹레버펀스는 동시성을 띄움. 아토믹 인티저 불리언 등 기본자료형에 대한 건 있지만 string 은 없음 왜?
 * 객체 타입이라서 스트링 객체를 담을 수 잇는
 */

//학번: 20251029
//이름: 김준일
//나이: 34
//코리아아이티아카데미 자바 수업중