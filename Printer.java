public class Printer {
   private int paperLeft;
   private int tonerVolume;

    public Printer(int paper){
        this.paperLeft = paper;
        this.tonerVolume = 66;
    }

    public int getPaperLeft(){
        return paperLeft;
    }

    public void print(int numberPages, int numberCopies){
        int printPaper = numberPages * numberCopies;
        if (printPaper <= paperLeft && printPaper <= tonerVolume){
            paperLeft -= printPaper;
            tonerVolume -= printPaper;
        }
    }

    public void refillPrinter(int refill){
        paperLeft += refill;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

}
