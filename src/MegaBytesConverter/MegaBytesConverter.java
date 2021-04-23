package MegaBytesConverter;

/**
 * @Author pankaj
 * @create 4/23/21 6:14 PM
 */

public class MegaBytesConverter {
    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
         }
         public static void printMegaBytesAndKiloBytes(int kiloBytes) {
             if (kiloBytes < 0)
                 System.out.println("Invalid Value");
             else {
                 int megaBytes = kiloBytes / 1024;
                 int kiloReminder = kiloBytes % 1024;
                 System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + kiloReminder + " KB");
             }
         }
}
