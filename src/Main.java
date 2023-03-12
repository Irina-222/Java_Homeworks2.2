public class Main {
    public static void main(String[] args) {
        int balance = 570;
        int addAmount = 1024;
        int total = (balance + addAmount);

        int bonus;
        if (addAmount > 1000) {
            bonus = (addAmount / 100);
            total = total + bonus;
        } else {
            bonus = 0;
        }

        System.out.println("Итоговый баланс: " + total);
        System.out.println("Бонусы: " + bonus);
    }

}