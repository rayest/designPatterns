package cn.rayest.bridge.product.product.impl;

import cn.rayest.bridge.product.product.Product;

public class House extends Product {
    @Override
    public void produce() {
        System.out.println("建造房子");
    }

    @Override
    public void sell() {
        System.out.println("卖房子");
    }
}
