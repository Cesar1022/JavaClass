public class Hello   {
    //1 MB = 1024 KB
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes>0) {
            int megaBytes = kiloBytes/1024;
            int res=kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + res + " KB");
        }else{
            System.out.println("Invalid Value");
        }
    }

}
