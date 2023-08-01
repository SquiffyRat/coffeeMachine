public class Cappuccino implements CoffeeC{

    @Override
    public int cost() {
        return 6000;
    }

    @Override
    public int WaterC() {
        return 200;
    }

    @Override
    public int CoffeeBeanC() {
        return 12;
    }

    @Override
    public int MilkC() {
        return 100;
    }
}
