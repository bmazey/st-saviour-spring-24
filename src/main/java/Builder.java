public class Builder {


public String brand;
public String model;
public String id;
public String color;
public int year;

// Car class 
public class Car {
    private final String brand;
    private final String model;
    private int year;
    private String color;
    private String id;

    // Private constructor 
    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.id = builder.id;
    }

    // Builder class to build a Car 
    public static class Builder {
        private final String brand;
        private final String model;
        private int year;
        private String color;
        private String id;

        // Builder constructor with required parameters
        public Builder(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        // Method to set parameter 
        public Builder year(int year) {
            this.year = year;
            return this;
        }

        // Method to set parameter
        public Builder color(String color) {
            this.color = color;
            return this;
        }

        // Method to set parameter 
        public Builder id(String id) {
            this.id = id;
            return this;
        }
    }
}
}
