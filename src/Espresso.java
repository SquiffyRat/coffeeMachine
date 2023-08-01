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

    public void EspressoA() {
        if (CurrentMachine.getWater() < WaterC()) {
            System.out.println("물이 부족합니다.");
        } else if (CurrentMachine.getCoffeeBean() < CoffeeBeanC()) {
            System.out.println("원두가 부족합니다.");
        } else if (CurrentMachine.getMilk() <MilkC()) {
            System.out.println("우유가 부족합니다.");
        } else if (CurrentMachine.getCup() < 1){
            System.out.println("컵이 없습니다.");
        } else {
            CurrentMachine.setWater(CurrentMachine.getWater()-WaterC());
            CurrentMachine.setCoffeeBean(CurrentMachine.getCoffeeBean()-CoffeeBeanC());
            CurrentMachine.setMilk(CurrentMachine.getMilk()-MilkC());
            CurrentMachine.setCup(CurrentMachine.getCup() -1);
            CurrentMachine.setMoney(CurrentMachine.getMoney()+cost());
            System.out.println("커피를 구매하셨습니다. 감사합니다.");
            System.out.println("에스프레소가 준비되었습니다. 맛있게 드세요!");
        }
    }
    public static void EspressoM() {
        Espresso M = new Espresso();
        M.EspressoA();
    }
}
