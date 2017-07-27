package com.rafalrudzinski.whichanimalareyou.model;


public class Animal {
    private String name;
    private int imageId;
    private int napsRating;
    private int sportsRating;
    private int readingRating;
    private int spicyFoodRating;
    private int travelRating;
    private int coldWeatherRating;
    private int flyingRating;
    private int cashRating;

    public Animal(String name, int imageId, int napsRating, int sportsRating, int readingRating, int spicyFoodRating, int travelRating, int coldWeatherRating, int flyingRating, int cashRating) {
        this.name = name;
        this.imageId = imageId;
        this.napsRating = napsRating;
        this.sportsRating = sportsRating;
        this.readingRating = readingRating;
        this.spicyFoodRating = spicyFoodRating;
        this.travelRating = travelRating;
        this.coldWeatherRating = coldWeatherRating;
        this.flyingRating = flyingRating;
        this.cashRating = cashRating;
    }

    public Animal(int napsRating, int sportsRating, int readingRating, int spicyFoodRating, int travelRating, int coldWeatherRating, int flyingRating, int cashRating) {
        this.napsRating = napsRating;
        this.sportsRating = sportsRating;
        this.readingRating = readingRating;
        this.spicyFoodRating = spicyFoodRating;
        this.travelRating = travelRating;
        this.coldWeatherRating = coldWeatherRating;
        this.flyingRating = flyingRating;
        this.cashRating = cashRating;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public int getNapsRating() {
        return napsRating;
    }

    public int getSportsRating() {
        return sportsRating;
    }

    public int getReadingRating() {
        return readingRating;
    }

    public int getSpicyFoodRating() {
        return spicyFoodRating;
    }

    public int getTravelRating() {
        return travelRating;
    }

    public int getColdWeatherRating() {
        return coldWeatherRating;
    }

    public int getFlyingRating() {
        return flyingRating;
    }

    public int getCashRating() {
        return cashRating;
    }
}
