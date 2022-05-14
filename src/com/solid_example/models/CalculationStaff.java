package com.solid_example.models;

import com.solid_example.interfaces.Calculation;

/**
 * @author Ryan
 * @description 계산 직원 클래스
 *
 *              SOLID 원칙 - SRP : 단일 책임 원칙(Single responsibility principle)
 *                                모든 클래스는 하나의 책임만 가져야 한다.
 *
 *                                계산직원 클래스는 계산을 담당한다.
 */
public class CalculationStaff implements Calculation {

    String name;

    public CalculationStaff(String name) {
        this.name = name;
    }

    @Override
    public int makeCalculation(int money) {
        return 0;
    }

    @Override
    public String toString() {
        return "CalculationStaff{" +
                "name='" + name + '\'' +
                '}';
    }
}
