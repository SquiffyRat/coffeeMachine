public class Latte implements CoffeeC{



    @Override
    public int cost() {
        return 7000;
    }

    @Override
    public int WaterC() {
        return 350;
    }

    @Override
    public int CoffeeBeanC() {
        return 20;
    }

    @Override
    public int MilkC() {
        return 75;
    }

    public void LatteA() {
        if (CurrentMachine.getWater() < WaterC()) {
            System.out.println("물이 부족합니다.");
        } else if (CurrentMachine.getCoffeeBean() < CoffeeBeanC()) {
            System.out.println("원두가 부족합니다.");
        } else if (CurrentMachine.getMilk() <MilkC()) {
            System.out.println("우유가 부족합니다.");
        } else {
            CurrentMachine.setWater(CurrentMachine.getWater()-WaterC());
            CurrentMachine.setCoffeeBean(CurrentMachine.getCoffeeBean()-CoffeeBeanC());
            CurrentMachine.setMilk(CurrentMachine.getMilk()-MilkC());
            CurrentMachine.setCup(CurrentMachine.getCup() -1);
            CurrentMachine.setMoney(CurrentMachine.getMoney()+cost());

        }
    }
    public static void LatteM() {
        Latte M = new Latte();
        M.LatteA();
    }

}
