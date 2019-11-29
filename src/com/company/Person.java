package com.company;

public class Person implements Soldier, Cook { //implements - имплементировать/реализовать
    @Override
    public void shoot() {
        System.out.println("Стреляю");
    }

    @Override
    public void cook() {
        System.out.println("Готовим");
    }
}
