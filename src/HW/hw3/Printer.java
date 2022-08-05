package HW.hw3;

public class Printer {
    private int inkLevel;
    private  int pagesPrinted;
    private int pagesLeft;
    private String printerType;
    private int total_paper;


    public Printer(int inkLevel, int pagesPrinted, int pagesLeft, String printerType, int total_paper){
        this.inkLevel=inkLevel;
        this.pagesPrinted=pagesPrinted;
        this.pagesLeft=pagesLeft;
        this.printerType=printerType;
        this.total_paper=total_paper;

    }
    public String getPrinterType(){
        return printerType;
    }
    public void setPrinterType(String printerType) {

        if (printerType.equals("duplex")) {
            System.out.println("this is a duplex printer");
        }
        else {
            System.out.println("this is a regular printer");

        }

    }

    // pagePrinted  56 57 .. 99
    // pageleft     44 43 .. 1

    public void printAPage(int x){
        if(this.pagesLeft > 0 && this.pagesLeft >= x  ) {
            this.pagesPrinted = this.pagesPrinted + x;
            this.pagesLeft = this.pagesLeft - x;
            System.out.println("new page left is:" + this.pagesLeft);
        }
        else if (pagesLeft==0){
            System.out.println("out of paper");
        }
        else {
            System.out.println("no enough paper");
        }
    }

    public int getPagesLeft() {
        return pagesLeft;
    }
    public void setPagesLeft(int pagesLeft) {
        this.pagesLeft = pagesLeft;
    }

    public int getPagesPrinted() {

        return pagesPrinted;
    }

    public void setPagesPrinted(int pagesPrinted) {
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(int inkLevel) {
        if (inkLevel < 20 ){
            System.out.println(inkLevel+"%" + ", Low ink level, please refill the ink to maximum");
        }
        else {
            System.out.println(inkLevel+"%" + " Save ink level");
        }
    }

    public void fillInkLevel(int addingInkLevel){
        if( this.inkLevel + addingInkLevel <= 100) {
            this.inkLevel = this.inkLevel + addingInkLevel;
            System.out.println("new ink level is: " + this.inkLevel + "%");
         } else {
            System.out.printf("Ink level overload. Aborting this operation");
        }
    }
}
