package FactoryMethod.sample1;

import FactoryMethod.sample1.framework.Factory;
import FactoryMethod.sample1.framework.Product;
import FactoryMethod.sample1.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Hiroshi Yuki");
        Product card2 = factory.create("Tomura");
        Product card3 = factory.create("Hanako Sato");
        card1.use();
        card2.use();
        card3.use();
    }
}
