public class Outfit {

    // fields that represent parts of an outfit
    private String shirt;

    private String pants;

    private String shoes;

    // asserts that builder is part of outfit
    Outfit(Builder builder) {
        this.shirt = builder.shirt;
        this.pants = builder.pants;
        this.shoes = builder.shoes;
    }

    Outfit() {}

    // gets and sets all the outfit parts
    public String getShirt() {
        return shirt;
    }
    public String getPants() {
        return pants;
    }
    public String getShoes() {
        return shoes;
    }
    public void setShirt(String shirt) {
        this.shirt = shirt;
    }
    public void setPants(String pants) {
        this.pants = pants;
    }
    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    // creates static class builder which puts together the parts of the outfit
    public static class Builder{
        private String shirt;
        private String pants;
        private String shoes;

        public Builder() {} 

        // returns accessories
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

        // creates method build which builds outfit
        public Outfit build() {
            return new Outfit(this);
        }
    }
}
