package za.co.cc.food.entity;

import javax.persistence.Column;
import java.io.Serializable;

public class FoodRequest implements Serializable {

    private String foodName;
    private int servingSize;
    private String servingUnit;
    private int calories;
    private double protein;
    private double carbohydrate;
    private double fat;
    private double dietaryFibre;
    private double sodium;
    private double potassium;
    private double calcium;
    private double iron;
    private double magnesium;

    public static Food newFood(FoodRequest foodRequest) {
        return new Food.Builder(
                foodRequest.getFoodName(),
                foodRequest.getCalories(),
                foodRequest.getProtein(),
                foodRequest.getCarbohydrate(),
                foodRequest.getFat())
                .servingSize(foodRequest.getServingSize())
                .servingUnit(foodRequest.getServingUnit())
                .dietaryFibre(foodRequest.getDietaryFibre())
                .sodium(foodRequest.getSodium())
                .potassium(foodRequest.getPotassium())
                .calcium(foodRequest.getCalcium())
                .iron(foodRequest.getIron())
                .magnesium(foodRequest.getMagnesium())
                .build();
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(double carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getDietaryFibre() {
        return dietaryFibre;
    }

    public void setDietaryFibre(double dietaryFibre) {
        this.dietaryFibre = dietaryFibre;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getPotassium() {
        return potassium;
    }

    public void setPotassium(double potassium) {
        this.potassium = potassium;
    }

    public double getCalcium() {
        return calcium;
    }

    public void setCalcium(double calcium) {
        this.calcium = calcium;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(double magnesium) {
        this.magnesium = magnesium;
    }

    @Override
    public String toString() {
        return "FoodRequest{" +
                "foodName='" + foodName + '\'' +
                ", servingSize=" + servingSize +
                ", servingUnit='" + servingUnit + '\'' +
                ", calories=" + calories +
                ", protein=" + protein +
                ", carbohydrate=" + carbohydrate +
                ", fat=" + fat +
                ", dietaryFibre=" + dietaryFibre +
                ", sodium=" + sodium +
                ", potassium=" + potassium +
                ", calcium=" + calcium +
                ", iron=" + iron +
                ", magnesium=" + magnesium +
                '}';
    }
}
