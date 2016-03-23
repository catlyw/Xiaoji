package com.example.cat.xiaoji;

/**
 * Created by cat on 16-3-23.
 */
public class Fruit {
    private  String name;
    private int  imageId;
    public Fruit(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;

    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
