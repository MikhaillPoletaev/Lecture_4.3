public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double amount = 1000000;
        double months = 12;
        double monthsTwo = 24;
        double monthsThree = 36;
        double payment = service.calculate(amount, months);
        double paymentTwo = service.calculate(amount, monthsTwo);
        double paymentThree = service.calculate(amount, monthsThree);
        System.out.println("Ежемесячная плата:" + payment);
        System.out.println();
        System.out.println("Ежемесячная плата:" + paymentTwo);
        System.out.println();
        System.out.println("Ежемесячная плата:" + paymentThree);
    }
}