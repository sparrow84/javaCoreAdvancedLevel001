package com.company;

/*
Добавить класс Team, который будет содержать название команды,
массив из четырех участников (в конструкторе можно сразу
указывать всех участников ), метод для вывода информации о
членах команды, прошедших дистанцию, метод вывода информации
обо всех членах команды.
 */

public class Team {
    private String teamName;
    protected Member[] teamMember;

    public Team(String teamName){
        this.teamName = teamName;

        teamMember = new Member[4];

        for (int i = 0; i < teamMember.length; i++) {
            teamMember[i] = new Member("Member_" + i);
        }

    }

    public void showWinMembers() {
        for (Member m : teamMember) {
            if (m.win) {
                System.out.println(m);
            }
        }
    }

    public void showTeamInfo(){
        for (Member m : teamMember) System.out.println(m);
    }
}
