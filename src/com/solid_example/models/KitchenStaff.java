package com.solid_example.models;

import com.solid_example.interfaces.Cook;

/**
 * @author Ryan
 * @description 주방직원
 *
 *              SOLID 원칙 - SRP : 단일 책임 원칙(Single responsibility principle)
 *                                모든 클래스는 하나의 책임만 가져야 한다.
 *
 *                                주방직원 클래스는 주방에서 요리를 하며 청소를 할수 있다.
 */
public class KitchenStaff implements Cook {

    String name;

    public KitchenStaff(String name) {
        this.name = name;
    }

    @Override
    public Food cooking(String order) {
        return null;
    }

    @Override
    public String toString() {
        return "KitchenStaff{" +
                "name='" + name + '\'' +
                '}';
    }
}
