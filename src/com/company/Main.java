package com.company;

public class Main {

    public static void main(String[] args) {
//	Soldier soldier = new Soldier(); создать объект не можем
        Person person = new Person();
        person.shoot();
        person.cook();

        Soldier soldier = person;//неявное (автоматическое)
        ((Cook)soldier).cook();//явное
        Cook cook;
    }
}
