public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int topUpBalance = 1560;
        int priceOfOneBonus = 100;

        int bonus;
        if (topUpBalance > 1_000) {
            bonus = topUpBalance / priceOfOneBonus;
        } else {
            bonus = 0;
        }
        int balance = initialBalance + topUpBalance + bonus;
        System.out.println(balance);
        System.out.println(bonus);
    }
}
