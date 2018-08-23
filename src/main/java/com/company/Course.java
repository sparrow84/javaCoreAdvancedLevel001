package com.company;

/*
Добавить класс Course (полоса препятствий),
в котором будут находиться массив препятствий и метод,
который будет просить команду пройти всю полосу;
 */

public class Course {
    private int obstacleCount = 9;
    private Obstacle[] obstacle;

    public Course() {
        obstacle = new Obstacle[obstacleCount];

        for (int i = 0; i < obstacle.length; i++) {
            obstacle[i] = new Obstacle();
        }
    }

    public void toRunDistance() {
        //
    }
}
