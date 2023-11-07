package Prototype.sample3;

import Prototype.sample3.framework.Product;

public class UnderLinePen implements Product {
    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    // コピーコンストラクタ
    public UnderLinePen(UnderLinePen prototype) {
        this.ulchar = prototype.ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new UnderLinePen(this);
    }
}
