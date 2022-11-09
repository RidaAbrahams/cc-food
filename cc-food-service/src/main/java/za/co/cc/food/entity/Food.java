package za.co.cc.food.entity;

import javax.persistence.*;

@Entity(name = "t_food")
@Table(name = "t_food")
@NamedQuery(name = Food.FIND_ALL_FOOD, query = "select f from t_food f order by f.foodName")
public class Food {

    public static final String FIND_ALL_FOOD = "findAllFood";
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "food_name", nullable = false)
    private String foodName;

    @Column(name = "serving_size", nullable = false)
    private int servingSize;

    @Column(name = "serving_unit", nullable = false)
    private String servingUnit;

    @Column(name = "calories", nullable = false)
    private int calories;

    @Column(name = "protein", nullable = false)
    private double protein;

    @Column(name = "carbohydrate", nullable = false)
    private double carbohydrate;

    @Column(name = "fat", nullable = false)
    private double fat;

    @Column(name = "dietary_fibre", nullable = true)
    private double dietaryFibre;

    @Column(name = "sodium", nullable = true)
    private double sodium;

    @Column(name = "potassium", nullable = true)
    private double potassium;

    @Column(name = "calcium", nullable = true)
    private double calcium;

    @Column(name = "iron", nullable = true)
    private double iron;

    @Column(name = "magnesium", nullable = true)
    private double magnesium;

    public Food() {
    }

    private Food(Builder builder) {
        foodName = builder.foodName;
        servingSize = builder.servingSize;
        servingUnit = builder.servingUnit;
        calories = builder.calories;
        protein = builder.protein;
        carbohydrate = builder.carbohydrate;
        fat = builder.fat;
        dietaryFibre = builder.dietaryFibre;
        sodium = builder.sodium;
        potassium = builder.potassium;
        calcium = builder.calcium;
        iron = builder.iron;
        magnesium = builder.magnesium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public static class Builder {
        // Required parameters
        public String foodName;
        private final int calories;
        private final double protein;
        private final double carbohydrate;
        private final double fat;

        // Optional parameters - initialised to default values
        private int servingSize = 100;
        private String servingUnit = "g";
        private double dietaryFibre = 0;
        private double sodium = 0;
        private double potassium = 0;
        private double calcium = 0;
        private double iron = 0;
        private double magnesium = 0;

        public Builder(String foodName, int calories, double protein, double carbohydrate, double fat) {
            this.foodName = foodName;
            this.calories = calories;
            this.protein = protein;
            this.carbohydrate = carbohydrate;
            this.fat = fat;
        }

        public Builder servingSize(int value) {
            servingSize = value;
            return this;
        }
        public Builder servingUnit(String value) {
            servingUnit = value;
            return this;
        }
        public Builder dietaryFibre(double value) {
            dietaryFibre = value;
            return this;
        }
        public Builder sodium(double value) {
            sodium = value;
            return this;
        }
        public Builder potassium(double value) {
            potassium = value;
            return this;
        }
        public Builder calcium(double value) {
            calcium = value;
            return this;
        }
        public Builder iron(double value) {
            iron = value;
            return this;
        }
        public Builder magnesium(double value) {
            magnesium = value;
            return this;
        }

        public Food build() {
            return new Food(this);
        }
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
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
