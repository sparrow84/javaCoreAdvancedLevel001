package com.company;

import lombok.Data;

@Data
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
}
