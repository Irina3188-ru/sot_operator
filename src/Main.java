//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initial_balance = 100;
        int top_up_balance = 1560;
        int one_rub_bonus = 100;

        int bonus;
        if (top_up_balance > 1_000)
        {
            bonus = top_up_balance / one_rub_bonus;
        } else {
            bonus  = 0;}
        int balance = initial_balance + top_up_balance + bonus;
            System.out.println(balance);
            System.out.println(bonus);
        }
    }
