import java.util.Scanner;

public class CoffeeMachine {
    Scanner scanner = new Scanner(System.in);

    void run() {
        boolean isRun = true;
        while(isRun) {
            System.out.println("커피 머신이 가동되었습니다.");
            System.out.println();
            System.out.println("현재 커피머신 상태:");
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
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    isRun = false;
                    System.out.println("커피머신이 종료되었습니다.");
                    break;
            }
        }

    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        System.out.println(coffeeMachine);
        coffeeMachine.run();
    }
}
