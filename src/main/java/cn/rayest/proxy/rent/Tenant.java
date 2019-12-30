package cn.rayest.proxy.rent;

import cn.rayest.proxy.rent.impl.Rent;

public class Tenant implements Rent {
    private String username;

    public Tenant(String username) {
        this.username = username;
    }

    @Override
    public void rentOneRoom() {
        System.out.println(this.username + " 租房子");
    }
}
