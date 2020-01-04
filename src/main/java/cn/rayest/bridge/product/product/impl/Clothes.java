package cn.rayest.bridge.product.product.impl;

import cn.rayest.bridge.product.product.Product;

public class Clothes extends Product {
    @Override
    public void produce() {
        System.out.println("生产衣服");
    }

    @Override
    public void sell() {
        System.out.println("卖衣服");
    }
}
