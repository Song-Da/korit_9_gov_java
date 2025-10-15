package com.korit.study.ch03;

import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerId = "";
        String productCode = "";
        String productName = "";
        int quantity = 0;
        int unitPrice = 0;
        int zipCode = 0;
        String shippingAddress = "";



        System.out.print("고객 ID를 입력하세요: ");
        customerId = scanner.next();
        System.out.print("상품 코드를 입력하세요: ");
        productCode = scanner.next();
        scanner.nextLine();
        System.out.print("상품명을 입력하세요: ");
        productName = scanner.nextLine();
        System.out.print("수량을 입력하세요: ");
        quantity = scanner.nextInt(); // stock
        System.out.print("단가를 입력하세요: ");
        unitPrice = scanner.nextInt();
        System.out.print("우편번호를 입력하세요: ");
        zipCode = scanner.nextInt();
        scanner.nextLine();
        System.out.print("배송 주소를 입력하세요: ");
        shippingAddress = scanner.nextLine();


        int allPrice = unitPrice * quantity;
        int deliveryFee = (30000 < unitPrice) ? 0 : 3000;
        String deliveryFeeText = (deliveryFee == 0) ? "무료" : deliveryFee + "원";
        int totalPayment = allPrice + deliveryFee;


        System.out.println("=== 주문 확인서 ===");
        System.out.println("고객 ID: " + customerId);
        System.out.println("상품 정보:");
        System.out.println(" - 상품코드: " + productCode);
        System.out.println(" - 상품명: " + productName);
        System.out.println(" - 단가: " + unitPrice + "원 x " + quantity + "개 = " + allPrice + "원");
        System.out.println("배송 정보: ");
        System.out.println(" - 우편번호: " + zipCode);
        System.out.println(" - 주소: " + shippingAddress);
        System.out.println(" - 배송비: " + deliveryFeeText);
        System.out.println("총 결제 금액: " + totalPayment + "원");

        scanner.close();
    }
}

// 서울시 강남구 테헤란로 123 ABC 빌딩 456호
// 삼항연산자 연습 많이 해야할 듯... 계산하는 게 어려우면 연산자를 더 열심히 하기... 분리해서 공부 해야 함