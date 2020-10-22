package academy.learnprogramming.section04;

public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(0);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remaingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaingKiloBytes + " KB");
        }
    }
}
