public class CreditPaymentService {
    public double calculate(double amount, double months) {
        double percent = 9.99;
        double monthlyPercent = percent / 12 / 100;
        return Math.round(amount * ((monthlyPercent * Math.pow((1 + monthlyPercent), months)) / (((Math.pow((1 + monthlyPercent), months))) - 1)));
    }
}
