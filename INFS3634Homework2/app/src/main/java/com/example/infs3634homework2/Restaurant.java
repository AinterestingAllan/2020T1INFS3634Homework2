package com.example.infs3634homework2;

import java.util.ArrayList;

// Model : Restaurant class
public class Restaurant {
    static private ArrayList<Restaurant> restaurants = new ArrayList<>();

    // 餐厅属性
    private int id;
    private String name;
    private double rank;
    // 可以拓展 根据自己的需要。。。

    // 构造方法
    public Restaurant(int id, String name, double rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }

    static {
        restaurants.add(new Restaurant(1,"刘安餐厅1", 4.9));
        restaurants.add(new Restaurant(2,"刘安餐厅2", 4.6));
        restaurants.add(new Restaurant(3,"刘安餐厅3", 4.9));
        restaurants.add(new Restaurant(4,"刘安餐厅4", 4.9));
        restaurants.add(new Restaurant(5,"刘安餐厅5", 4.9));
        restaurants.add(new Restaurant(6,"刘安餐厅6", 4.8));
        restaurants.add(new Restaurant(7,"刘安餐厅7", 3.5));
        restaurants.add(new Restaurant(8,"刘安餐厅8", 4.9));
        restaurants.add(new Restaurant(9,"刘安餐厅9", 4.9));
        restaurants.add(new Restaurant(9,"刘安餐厅10", 4.9));
    }

    // alt + insert

    // 以后如果要调用我们的餐厅数据则需要 Restaurant.getRestaurants() 恒等于 Restaurant.restaurants
    public static ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    // 问题： 如果我想知道刘安餐厅7的rank应该怎么获得？
    // Restaurant.getRestaurants().get(6).getRank() 恒等于 3.5（double类型）+""

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRank() {
        return rank;
    }

    public void setRank(double rank) {
        this.rank = rank;
    }
}
