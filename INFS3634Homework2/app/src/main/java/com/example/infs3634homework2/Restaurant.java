package com.example.infs3634homework2;

import java.util.ArrayList;

// Model : Restaurant class
public class Restaurant {

    static Restaurant currDetailRest = null;

    // 所有的餐厅
    static private ArrayList<Restaurant> restaurants = new ArrayList<>();

    // 用户收藏的餐厅
    static private ArrayList<Restaurant> collRestaurants = new ArrayList<>();

    // 餐厅属性
    private int id;
    private String name;
    private double rank;
    private int image;
    private boolean light = false;
    // 可以拓展 根据自己的需要。。。

    // 构造方法
    public Restaurant(int id, String name, double rank, int image) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.image = image;
    }

    static {
        restaurants.add(new Restaurant(1,"刘安餐厅1", 4.9, R.drawable.r1));
        restaurants.add(new Restaurant(2,"刘安餐厅2", 4.6, R.drawable.r2));
    }

    // alt + insert


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    // 以后如果要调用我们的餐厅数据则需要 Restaurant.getRestaurants() 恒等于 Restaurant.restaurants
    public static ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    // Restaurant.getCollRestaurants()
    public static ArrayList<Restaurant> getCollRestaurants() {return collRestaurants;}

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

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
