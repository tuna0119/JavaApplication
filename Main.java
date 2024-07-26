package org.example;

public class Main {
    public static void main(String[] argv){
        Pair<String> pair1 = new Pair<>("test1","test2");
        Pair<String> pair2 = new Pair<>("test3","test4");
        Pair<Pair<String>>pairPair = new Pair<>(pair1,pair2);
        Quadruple q = Quadruple.getQuadrupleBy(pairPair);

        Fruits f = new Fruits(100,"Japan","青");
        Apple apple = new Apple(200,"Canada","黄");
        System.out.println(apple.price);
        System.out.println(apple.madeIn);
        System.out.println(apple.color);
        System.out.println(f.price);
        System.out.println(f);
        System.out.println(q);
    }
}
