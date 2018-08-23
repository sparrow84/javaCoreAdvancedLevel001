package com.company;

//import lombok.Data;
// Lombok почемуто не работает!
// Использование аннотаций в идее включил,
// плагин поставил, в мавен зависимостях
// прописал, сама библиотека подтянулась.
// А воз и ныне там =(

import java.util.Random;

//@Data
public class Member {
    private static int id;
    private String name;
    protected boolean win;

    public Member(String name) {
        this.id += 1;
        this.name = name;
    }

    @Override
    public String toString () {
        return "Member: " + name + "  (id: " + id + ")";
    }

    public boolean overcomeObstacle(Obstacle obstacle) {

        int i = new Random().nextInt(1);

        return i == 1 ? true : false;
    }
}
