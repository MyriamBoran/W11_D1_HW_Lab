public class Runner {
    public static void main(String[] args) {
        Calculator calc = new Calculator(1, 2);
        System.out.println(calc.add());
        System.out.println(calc.substract());
        System.out.println(calc.multiply());
        System.out.println(calc.divide());
    }
}
