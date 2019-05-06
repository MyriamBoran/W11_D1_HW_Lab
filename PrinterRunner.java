public class Runner {
    public static void main(String[] args) {
        Printer printer = new Printer(30);
        printer.print(20, 15);
        printer.refillPrinter(10);
        System.out.println(printer.getTonerVolume());
        System.out.println(printer.getPaperLeft());

    }
}
