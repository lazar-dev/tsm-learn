package com.company.hw_11.task_3;

public class Task_3 {
    public static void main(String[] args) throws InterruptedException {
        Shop myShop = new Shop();

        ProducerShop catToys = new ProducerShop(50,"Cat Toys",myShop);
        ProducerShop dogToys = new ProducerShop(100, "Dog Toys", myShop);

        Thread producerCatToys = new Thread(catToys);
        Thread producerDogToys = new Thread(dogToys);

        producerCatToys.start();
        producerDogToys.start();
        producerCatToys.join();
        producerDogToys.join();

        System.out.println(myShop.toString());
        System.out.println(myShop.getSize());

    }
}
