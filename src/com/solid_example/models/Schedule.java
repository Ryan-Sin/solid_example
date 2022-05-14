package com.solid_example.models;

import com.solid_example.interfaces.Calculation;
import com.solid_example.interfaces.Cleanse;
import com.solid_example.interfaces.Cook;
import com.solid_example.interfaces.Serving;


/**
 * @author Ryan
 * @description SOLID 원칙 - DIP : 프로그래머는 "추상화에 의존해야하며, 구체화(구현체)에 의존하면 안된다." 의존성 주입 원칙을 따르는 방법중 하나입니다.
 *
 *                                Serving, Cook, Cleanse, Calculation 은 특정 클래스가 아닌 Interface 입니다.
 *                                구체화(구현체)에 의존하지 않고 추상화에 의존하고 있습니다.
 *
 *                                이렇게 설정했기 때문에 해당 인터페스를 implements 한 클래스는 다형성에 의해 의존관계가 성립됩니다.
 */
public class Schedule {
    private String day; // 근무 요일
    private Serving serving; // 서빙직원
    private Cook cook; // 요리직원
    private Cleanse cleanse; // 세척직원
    private Calculation calculation; // 계산 직원

    public Schedule(String day, Serving serving, Cook cook, Cleanse cleanse, Calculation calculation) {
        this.day = day;
        this.serving = serving;
        this.cook = cook;
        this.cleanse = cleanse;
        this.calculation = calculation;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "day='" + day + '\'' +
                ", serving=" + serving +
                ", cook=" + cook +
                ", cleanse=" + cleanse +
                ", calculation=" + calculation +
                '}';
    }
}
