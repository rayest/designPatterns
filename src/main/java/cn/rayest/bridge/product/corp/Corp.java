package cn.rayest.bridge.product.corp;

import cn.rayest.bridge.product.product.Product;

public abstract class Corp {
    private Product product;

    protected Corp(Product product) {
        this.product = product;
    }

    public void makeMoney(){
        this.product.produce();
        this.product.sell();
    }
}
