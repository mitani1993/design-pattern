package Prototype.sample2;

import Prototype.sample2.framework.Manager;
import Prototype.sample2.framework.Product;

public class Main {
    public static void main(String[] args) {
        // 準備
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        // 登録
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成と使用
        Product p1 = manager.create("strong message");
        p1.use("Hello, world.2");

        Product p2 = manager.create("warning box");
        p2.use("Hello, world.2");

        Product p3 = manager.create("slash box");
        p3.use("Hello, world.2");
    }
}
