public class JeweleryBuilder {

    private String gold;
    private String silver;
    private String gemstones;
    
    public JeweleryBuilder metalType(String gold, String silver) {
        this.gold = gold;
        this.silver = silver;
        return this;
    }

    public JeweleryBuilder gemstoneType(String gemstones) {
        this.gemstones = gemstones;
        return this;
    }
}
