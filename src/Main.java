public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("Сумма чисел 5 + 10 = " + calc.sum(5, 10));
        System.out.println("Умножение чисел 10 * 4 = " + calc.mult(10, 4));
        System.out.println("Число в степени 5 ^ 2 = " + calc.pow(5, 2));
    }
}