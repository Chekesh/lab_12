public class Main {
    public static void main(String[] args) {
        String IP="255.2.0.23";
        boolean result_2 = IP.matches("((\\d|1?\\d\\d|2([0-4]\\d|5[0-5]))\\.){3}(\\d|1?\\d\\d|2([0-4]\\d|5[0-5]))");
        if (result_2){
            System.out.println("Номер "+IP+" верно");

        }
        else{
            System.out.println("Номер "+IP+" не верно");
        }
    }
}