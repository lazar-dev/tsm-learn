package com.company.hw_11.task_3;

public class ProducerShop implements Runnable {
    private int count;
    private String toyName;
    private Shop shop;

    public ProducerShop(int count, String toyName, Shop shop) {
        this.count = count;
        this.toyName = toyName;
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            shop.addToys(this.toyName);
        }
    }
}
