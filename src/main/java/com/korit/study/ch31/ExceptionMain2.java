//package com.korit.study.ch31;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.List;
//
//public class ExceptionMain2 {
//    public static void main(String[] args) {
//        throw IOException {
//            List<String> names = List.of("김준일", "김준이");
//            try {
//                print(null, 3);
//            } catch (IOException e) {
//
//            } catch (NullPointerException e) {
//                System.out.println("리스트 변수에 null 이 들어가 있어");
//            } catch (IndexOutOfBoundsException e) {
//                System.out.println("배열 크기 넘었어");
//            } catch (Exception e) {
//                System.out.println("최정적으로 모든 예외 처리");
//            } finally {
//                System.out.println("프로그램 정상 종료");
//
//            }
//        }
//    }
//    public static void print(List<String> names, int size) throws
//            IOException,
//            NullPointerException,
//            IndexOutOfBoundsException {
//
//        System.out.println(names.size());
//        for (int i = 0; i < size; i++) {
//            System.out.println(names.get(i));
//        }
//
//    }
//}
