package com.company.javarush;

/*
Солнечная система — наш дом
*/

public class SolarSystem {

    public static long age = 4_568_200_000L;

    public static int planetsCount = 8;

    public static int starsCount = 1;

    public static String starName = "Солнце";

    public static int galacticCenterDistance = 27170;


    public static void main(String[] args) {
        System.out.println(String.format("Человечество живет в Солнечной системе.\n" +
                        "Ее возраст около %d лет.\n" +
                        "В Солнечной системе %d известных планет.\n" +
                        "Как и большинство звездных систем, состоит из %d звезды.\n" +
                        "Звезды по имени %s.\n" +
                        "Расстояние к центру галактики составляет %d световых лет.\n" +
                        "Каждый обитатель Солнечной системы должен знать эту информацию!"
                , age, planetsCount, starsCount, starName, galacticCenterDistance));
    }
}
