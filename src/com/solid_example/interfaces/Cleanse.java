package com.solid_example.interfaces;

/**
 * @author Ryan
 * @description SOLID 원칙 - ISP : 인터페이스 분리 원칙(Interface segregation principle)
 *                                하나의 인터페이스 보다는 특정 클라이언트를 위한 인터페이스를 여러 개 범용적으로 만드는게 좋다.
 *
 *                                세척이라는 인터페이스는 모든 클래스가 implements 해서 사용한다.
 *                                특정 클래스가 아닌 범용적으로 사용할 수 있게 한다.
 */
public interface Cleanse {
    void cleaning();
    void washingDishes();
}
