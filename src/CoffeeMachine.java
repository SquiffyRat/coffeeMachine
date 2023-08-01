import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);

    void run() {
        System.out.println("커피 머신이 가동되었습니다.");
        System.out.println();
        System.out.println("현재 커피머신 상태:");
        boolean isRun = true;
        while(isRun) {

            System.out.println("남은 재료와 돈 상태:");
            System.out.println("물: " + CurrentMachine.getWater());
            System.out.println("우유: " + CurrentMachine.getMilk());
            System.out.println("원두: " + CurrentMachine.getCoffeeBean());
            System.out.println("일회용 컵: " + CurrentMachine.getCup());
            System.out.println("돈: " + CurrentMachine.getMoney());

            System.out.println("옵션을 선택하세요");
            System.out.println("(1. 구매, 2. 채우기, 3. 가져가기, 4. 종료):");
            int selectNumber = Integer.parseInt(scanner.nextLine());

            switch (selectNumber) {

                case 1:
                    selectC();
                    break;
                case 2:
                    fill();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    isRun = false;
                    System.out.println("커피머신이 종료되었습니다.");
                    break;
            }
        }

    }
    void selectC() {
        System.out.println("어떤 커피를 구매하시겠습니까 ?");
        System.out.println("1. 에스프레소 (가격 : 4000원)");
        System.out.println("2. 라떼 (가격 : 7000원)");
        System.out.println("3. 카푸치노 (가격 : 6000원)");
        int menuC = Integer.parseInt(scanner.nextLine());
        switch (menuC) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }

    void fill() {
        System.out.println("추가할 물의 양을 입력하세요");
        int fillWater = Integer.parseInt(scanner.nextLine());
        if (fillWater < 0) {
            System.out.println("유효하지 않은 입력값");
            System.out.println();
        } else {
            CurrentMachine.setWater(CurrentMachine.getWater() + fillWater);
        }
        System.out.println("추가할 우유의 양을 입력하세요");
        int fillMilk = Integer.parseInt(scanner.nextLine());
        if (fillMilk < 0) {
            System.out.println("유효하지 않은 입력값");
            System.out.println();
        } else {
            CurrentMachine.setMilk(CurrentMachine.getMilk() + fillMilk);
        }
        System.out.println("추가할 원두의 양을 입력하세요");
        int fillCoffeeBean = Integer.parseInt(scanner.nextLine());
        if (fillCoffeeBean < 0) {
            System.out.println("유효하지 않은 입력값");
            System.out.println();
        } else {
            CurrentMachine.setCoffeeBean(CurrentMachine.getCoffeeBean() + fillCoffeeBean);
        }
        System.out.println("추가할 일회용 컵의 양을 입력하세요");
        int fillCup = Integer.parseInt(scanner.nextLine());
        if (fillCup < 0) {
            System.out.println("유효하지 않은 입력값");
            System.out.println();
        } else {
            CurrentMachine.setCup(CurrentMachine.getCup() + fillCup);
        }
    }

    void withdraw() {
        System.out.println("얼마만큼의 액수를 빼내시겠습니까? >");
        int takingMoney = Integer.parseInt(scanner.nextLine());
        if (CurrentMachine.getMoney() - takingMoney >= 0) {
            CurrentMachine.setMoney(CurrentMachine.getMoney() - takingMoney);
            System.out.println("돈을 꺼내기 : " + takingMoney + "원");
            System.out.println();
        } else {
            System.out.println("커피머신 내에 그만큼의 돈이 없습니다.");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine);
        coffeeMachine.run();
    }
}
