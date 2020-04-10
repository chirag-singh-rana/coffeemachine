package main;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String a = "buy", b = "fill", c = "take", d = "remaining", e = "exit";
        Scanner sc = new Scanner(System.in);
        int f = 1;
        ArrayList<Integer> info = new ArrayList<>();
        info.add(1200);
        info.add(540);
        info.add(120);
        info.add(9);
        info.add(550);
        while (f == 1) {
            System.out.println("Write action(Buy,Fill,Take,Remaining,Exit)");
            String action = sc.nextLine();
            if (action.equals(a)) {
                System.out.println("What do you want to buy");
                System.out.println("1-Expresso, 2-Latte,3-cappuccino");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        if (info.get(0) > 250 && info.get(1) > 50 && info.get(2) > 16) {
                            System.out.println("here is your coffee");
                            info.set(0, info.get(0) - 250);
                            info.set(1, info.get(1) - 50);
                            info.set(2, info.get(2) - 16);
                            info.set(3, info.get(3) - 1);
                            info.set(4, info.get(4) + 4);
                            break;

                        } else {
                            System.out.println("insufficient item to make expresso coffee");
                            break;
                        }
                    case 2:
                        if (info.get(0) > 350 && info.get(1) > 75 && info.get(2) > 20) {
                            info.set(0, info.get(0) - 350);
                            info.set(1, info.get(1) - 75);
                            info.set(2, info.get(2) - 20);
                            info.set(3, info.get(3) - 1);
                            info.set(4, info.get(4) + 7);
                            System.out.println("here is your coffee");
                            break;
                        } else {
                            System.out.println("insufficient item to make Latte coffee");
                            break;
                        }
                    case 3:
                        if (info.get(0) > 200 && info.get(1) > 100 && info.get(2) > 12) {
                            info.set(0, info.get(0) - 200);
                            info.set(1, info.get(1) - 100);
                            info.set(2, info.get(2) - 12);
                            info.set(3, info.get(3) - 1);
                            info.set(4, info.get(4) + 6);
                            System.out.println("here is your coffee");
                            break;
                        } else {
                            System.out.println("insufficient item to make Latte coffee");
                            break;
                        }
                    default:
                        break;
                }
            }
            if (action.equals(b)) {
                System.out.println("Write how many ml of water do you want to add");
                int water = sc.nextInt();
                System.out.println("Write how many ml of milk do you want to add");
                int milk = sc.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add");
                int coffeeBeans = sc.nextInt();
                System.out.println("Write how many disposal cups of coffee do you want to add");
                int disposalCups = sc.nextInt();
                info.set(0, info.get(0) + water);
                info.set(1, info.get(1) + milk);
                info.set(2, info.get(2) + coffeeBeans);
                info.set(3, info.get(3) + disposalCups);

            }
            if (action.equals(c)) {
                System.out.println("I gave you" + info.get(4));
                info.set(4, 0);

            }
            if (action.equals(d)) {
                System.out.println("The Coffee machine has:");
                System.out.println(info.get(0) + "of water");
                System.out.println(info.get(1) + "of milk");
                System.out.println(info.get(2) + "of coffee beans");
                System.out.println(info.get(3) + "of disposal cups");
                System.out.println(info.get(4) + "of money");
            }
            if (action.equals(e)) {
                f = 0;
            }
        }
    }
}