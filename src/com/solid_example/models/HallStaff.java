package com.solid_example.models;

import com.solid_example.interfaces.Cleanse;
import com.solid_example.interfaces.Serving;

/**
 * @author Ryan
 * @description 홀직원
 *
 *              SOLID 원칙 - SRP : 단일 책임 원칙(Single responsibility principle)
 *                                모든 클래스는 하나의 책임만 가져야 한다.
 *
 *                                홀직원 클래스는 서빙과 청소를 할수 있다.
 *
 *                          OCP : 개방 - 패쇄 원칙(Open/closed principle)
 *  *                             소프트웨어 요소는 확장에는 열려 있지만, 수정에는 닫혀 있어야 한다.
 */
public class HallStaff implements Serving, Cleanse {

    String name;

    public HallStaff(String name) {
        this.name = name;
    }

    @Override
    public void cleaning() {

    }

    @Override
    public void washingDishes() {

    }

    @Override
    public void toServeFood(Food food) {

    }

    @Override
    public void removeFood() {

    }

    @Override
    public String toString() {
        return "HallStaff{" +
                "name='" + name + '\'' +
                '}';
    }
}
