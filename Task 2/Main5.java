class Printer {
    public void printdata(String text) {
        System.out.println("printing text:" + text);
    }
    public void printdata(int number) {
        System.out.println("printing number:" + number);
    }
    
}
public class Main5{
    public static void main(String[] args){
        Printer myprinter = new Printer();
        myprinter.printdata("hello world!");
        myprinter.printdata(42);
    }
}

