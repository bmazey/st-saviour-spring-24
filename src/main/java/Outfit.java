public class Outfit {

    //creates fields that represent outfit pieces
    private String shirt;

    private String pants;

    private String shoes;

    //assert that builder is a part of the outfit method, and class
    Outfit(Builder builder) {
        //the fields from the outfit class are carried over into this method
        this.shirt = builder.shirt;
        this.pants = builder.pants;
        this.shoes = builder.shoes;
    }

    Outfit() {}

    //setters and getters for all the outfit components
    public String getShirt() {
        return shirt;
    }

    public String getPants() {
        return pants;
    }

    public String getShoes() {
        return shoes;
    }

    //these getter methods assert that the shirt, pants, and shoes equal the same components from above
    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    //creates a static class within Outfit that puts together the components of an outfit
    public static class Builder {
        private String shirt;
        private String pants;
        private String shoes;

        public Builder() {}

        //returns the accesories using keyword this
        public Builder Shirt(String shirt) {
            this.shirt = shirt;
            return this;
        }

        public Builder Pants(String pants) {
            this.pants = pants;
            return this;
        }

        public Builder Shoes(String shoes) {
            this.shoes = shoes;
            return this;
        }

        //builds the entire outfit in a method 'build'
        public Outfit build() {
            return new Outfit(this);
        }
    }
}