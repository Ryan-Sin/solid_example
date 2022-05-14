package com.solid_example.models;

import com.solid_example.interfaces.Cleanse;
import com.solid_example.interfaces.Cook;

/**
 * @author Ryan
 * @description 주방장 클래스
 *
 *              SOLID 원칙 - SRP : 단일 책임 원칙(Single responsibility principle)
 *                                모든 클래스는 하나의 책임만 가져야 한다.
 *
 *                                주방장 클래스는 주방을 총괄하면서 다른 주방직원에 업무를 도와줄 수 있다.
 *
 *                          OCP : 개방 - 패쇄 원칙(Open/closed principle)
 *  *                             소프트웨어 요소는 확장에는 열려 있지만, 수정에는 닫혀 있어야 한다.
 */
public class Chef implements Cook, Cleanse {

    String name;

    public Chef(String name) {
        this.name = name;
    }

    @Override
    public void cleaning() {

    }

    @Override
    public void washingDishes() {

    }

    @Override
    public Food cooking(String order) {
        return null;
    }

    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                '}';
    }
}
