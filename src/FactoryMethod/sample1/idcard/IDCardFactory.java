package FactoryMethod.sample1.idcard;

import FactoryMethod.sample1.framework.Factory;
import FactoryMethod.sample1.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "を登録しました。");
    }
}
