package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задача 6");
        var weightOfTheFirstBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeight =  weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        var difference = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
        System.out.println("Разница между весами бойцов " + difference + " кг");
        System.out.println("Задача 7");
        var difference1 = weightOfTheSecondBoxer - weightOfTheFirstBoxer; //1
        System.out.println("Разница между весами бойцов " + difference + " кг");
        var difference2 = weightOfTheSecondBoxer % weightOfTheFirstBoxer; //2
        System.out.println("Разница между весами бойцов " + difference + " кг");
        System.out.println("Задача 8");
        var allTheTime = 640; //1
        var timeOne = 8;
        var person = allTheTime / timeOne;
        System.out.println("Всего работников в компании — " + person + " человек");
        person = person + 94;
        allTheTime = person * timeOne;
        System.out.println("Если в компании работает " + person + " человек, то всего " + allTheTime + " часов работы может быть поделено между сотрудниками");
    }
}
