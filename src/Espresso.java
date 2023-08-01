public class Espresso implements CoffeeC{


    @Override
    public int cost() {
        return 4000;
    }

    @Override
    public int WaterC() {
        return 250;
    }

    @Override
    public int CoffeeBeanC() {
        return 16;
    }

    @Override
    public int MilkC() {
        return 0;
    }
}
