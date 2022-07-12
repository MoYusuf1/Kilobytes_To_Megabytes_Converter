public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remainingKilobytes;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            remainingKilobytes = kiloBytes % 1024;
            megaBytes = kiloBytes / 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        }

    }

}
