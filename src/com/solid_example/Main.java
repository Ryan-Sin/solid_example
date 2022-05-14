package com.solid_example;


import com.solid_example.models.*;

/**
 * @author Ryan
 * @description SOLID 원칙 - SRP : 단일 책임 원칙(Single responsibility principle)
 *                                모든 클래스는 하나의 책임만 가져야 한다.
 *
 *                                Main 클래스는 프로젝트 실행에 대한 책임을 갖는다.
 *                                나의 책임이라는 것은 모호합니다. 책임이 클수도 있고, 작을수 있다.
 *                                중요한 기준은 변경입니다. 변경이 있을 때 문제가 생긴다면 그건 단일 책임원칙을 잘 따른 부분이 압니다.
 */
public class Main {

    public static void main(String[] args) {

        Manager ryanManger =  new Manager("Ryan");// 매니저
        Chef frodoChef = new Chef("Frodo ");// 주방장

        HallStaff tubeHallStaff = new HallStaff("Tube"); //홀직원
        KitchenStaff muziKitchenStaff = new KitchenStaff("muzi"); //주방직원

        CalculationStaff apeachCalculationStaff = new CalculationStaff("Apeach "); //계산 직원
        CleanseStaff neoCleanseStaffr = new CleanseStaff("Neo");// 세척 직원

        /**
         * @author Ryan
         * @description SOLID 원칙 - LSP - 리스코프 치환 원칙(Liskov substitution principle)
         *                                객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
         *
         *                                인터페이스로 설정했기 때문에 하위 구현체가 변경되도 규약을 지킬수 있습니다.
         */
        Schedule monday = new Schedule("월요일", tubeHallStaff, muziKitchenStaff, neoCleanseStaffr, apeachCalculationStaff);
        Schedule tuesday = new Schedule("화요일", ryanManger, frodoChef, tubeHallStaff, ryanManger);

        System.out.println("monday = " + monday);
        System.out.println();
        System.out.println("tuesday = " + tuesday);

    }
}
