package com.solid_example.models;

import com.solid_example.interfaces.Cleanse;

/**
 * @author Ryan
 * @description 세척 직원 클래스
 *
 *              SOLID 원칙 - SRP : 단일 책임 원칙(Single responsibility principle)
 *                                모든 클래스는 하나의 책임만 가져야 한다.
 *
 *                                세척 직원 클래스는 세척을 담당한다.
 */
public class CleanseStaff implements Cleanse {

    String name;

    public CleanseStaff(String name) {
        this.name = name;
    }

    @Override
    public void cleaning() {

    }

    @Override
    public void washingDishes() {

    }

    @Override
    public String toString() {
        return "CleanseStaff{" +
                "name='" + name + '\'' +
                '}';
    }
}
