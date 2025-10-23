//package com.korit.study.ch22;
//
//import com.korit.study.ch22.dto.SignupDto;
//import com.korit.study.ch22.repository.UserRepository;
//import com.korit.study.ch22.service.SignupService;
//
//import java.util.Scanner;
//
//public class SignupMain {
//
//    public static void main(String[] args) {
////        String prevPassword = "test1234";
////        String currentPassword = "test1234";
////        long prevPasswordHashcode = Integer.toUnsignedLong(Objects.hash(prevPassword));
////        long currentPasswordHashcode = Integer.toUnsignedLong(Objects.hash(currentPassword)) ;
////        long encodedPassword = prevPasswordHashcode * 10l; // 10 은 정수 long 타입으로 변형. 하지만 생략해도 괜찮음. 업캐스팅 돼서 자동변환이 됨. 그러나 되도록이면 기재하는 편이 낫다.
////        System.out.println(prevPasswordHashcode);
////        System.out.println(currentPasswordHashcode);
////        System.out.println(encodedPassword);
////        System.out.println(encodedPassword / 10l);
//
//
//        SignupService signupService = SignupService.getInstance(); // 클래스명 . 찍으면 static 이라 적힌 건 다 언급이 가능하구나 (하지만 private 는 접근이 불가)
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("[회원가입, 로그인]");
//            System.out.println("1. 회원가입");
//            System.out.println("2. 로그인");
//            System.out.println("3. 가입된 회원 전체 조회");
//            System.out.println("q. 종료");
//            System.out.print("선택 >> ");
//            String selectedMenu = scanner.nextLine();
//
//            if ("q".equalsIgnoreCase(selectedMenu)) {
//                System.out.println("프로그램 종료 중...");
//                break;
//            } else if ("1".equals(selectedMenu)) { // IgnoreCase 는 알파벳이 아니기 때문에 그냥 이퀄스 사용
//                System.out.println("[ 회원가입 ]");
//                SignupDto signupDto = new SignupDto();
//                while (true) {
//                    System.out.print("사용자 이름: ");
//                    signupDto.setUsername(scanner.nextLine());
//                    if (signupService.isValidDuplicatedUsername(signupDto.getUsername())) {
//                        break;
//                    }
//                    System.out.println("이미 사용중인 사용자 이름입니다.");
//                }
//
//                while (true) {
//                    System.out.print("비밀번호: ");
//                    signupDto.setPassword(scanner.nextLine());
//                    if (signupService.isValidPassword(signupDto.getPassword())) {
//                        break;
//                    }
//                    System.out.println("비밀번호는 공백일 수 없습니다. 다시 입력하세요.");
//                }
//
//                while (true) {
//                    System.out.print("비밀번호 확인: ");
//                    signupDto.setConfirmPassword(scanner.nextLine());
//                    if (signupService.isValidConfirmPassword(signupDto.getPassword(), signupDto.getConfirmPassword())) {
//                        break;
//                    }
//                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
//                }
//
//                signupService.signup(signupDto);
//                System.out.println("<< 회원가입 완료 >>");
//
//            } else if ("2".equals(selectedMenu)) {
//                System.out.println("[ 로그인 ]");
//                SignupDto signupDto = new SignupDto();
//                while (true) {
//                    System.out.print("사용자 이름: ");
//                    signupDto.setUsername(scanner.nextLine());
//                    if (!signupService)
//                }
//
//                System.out.print("비밀번호: ");
//
//                // SigninDto 를 생성하여 로그인 정보 입력 받음 (공백 확인)
//                // 유효성 검사 완료 후 signin() 호출
//
//            } else if ("3".equals(selectedMenu)) {
//                System.out.println("[ 가입된 회원 전체 조회 ]");
//                System.out.println(UserRepository.getInstance().toString());
//            }
//        }
//
//        System.out.println("프로그램 종료 완료");
//    }
//}
///**
// * 텍스트가 동일하니까 값이 똑같이 나왔다.
// * long 뒤에 붙은 . 뒤에 붙은 건 전부 클래스
// * toUnsignedLong - long 인데 음수가 아닌 양수로만 표현하겠다는 의미. int 로 다 표현되는 걸
// * 원리와 순서를 이해하고 다시 타이핑 해보길...
// *
// * 변수명들이 여기서 다 사용되어 버리면 다른 곳에서는 재사용할 수가 없음
// *
// * 집 가서 보기
// *
// */