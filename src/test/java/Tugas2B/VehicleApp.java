package Tugas2B;

import java.util.Scanner;

public class VehicleApp {
    public static void main(String[] args) {
        HondaJazz hondaJazz = new HondaJazz();
        ToyotaFortuner fortuner = new ToyotaFortuner();
        SuzukiKatana katana = new SuzukiKatana();

        System.out.println("Daftar mobil :");
        System.out.println("1. Honda Jazz");
        System.out.println("2. Toyota Fortuner");
        System.out.println("3. Suzuki Katana");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor untuk melihat informasi mobil : ");
        int result = input.nextInt();

        if(result == 1){
            System.out.println("\n=========================================================");
            System.out.println("Informasi kendaraan");
            System.out.println("=========================================================");
            hondaJazz.nama = "Honda Jazz";
            hondaJazz.produsen = "Honda";
            hondaJazz.roda = 4;
            hondaJazz.kapasitasTangki = 42;
            hondaJazz.transmisi = "5-speed manual, 5-speed otomatis, CVT / CVT 7";
            hondaJazz.bentukKerangka = "Hatchback 5 pintu";
            hondaJazz.panjang = "1.485 mm (58,5 in)";
            hondaJazz.lebar = "1.693 mm (66,7 in)";
            hondaJazz.tinggi = "1.485 mm (58,5 in)";
            hondaJazz.beratKosong = "1.084 kg (2.390 pon) for 1.4 L LS with manual transmission";

            hondaJazz.cetakNama();
            hondaJazz.cetakProdusen();
            hondaJazz.bergerak();
            hondaJazz.belok();
            hondaJazz.roda();
            hondaJazz.cetakKapasitasTangki();
            hondaJazz.cetakTransmisi();
            hondaJazz.cetakBentukKerangka();
            hondaJazz.cetakDimensi();

        } else if (result == 2) {

            System.out.println("\n=========================================================");
            System.out.println("Informasi kendaraan");
            System.out.println("=========================================================");
            fortuner.nama = "Toyota Fortuner";
            fortuner.produsen = "Toyota";
            fortuner.roda = 4;
            fortuner.kapasitasTangki = 80;
            fortuner.transmisi = "5-speed manual, 4-speed automatic, 5-speed automatic";
            fortuner.bentukKerangka = "5-door SUV";
            fortuner.panjang = "4,705 mm (185.2 in)";
            fortuner.lebar = "1,840 mm (72.4 in)";
            fortuner.tinggi = "1,850 mm (72.8 in)";
            fortuner.jarakRoda = "2,750 mm (108.3 in)";
            fortuner.beratKosong = "1,710–1,980 kg";

            fortuner.cetakNama();
            fortuner.cetakProdusen();
            fortuner.roda();
            fortuner.cetakKapasitasTangki();
            fortuner.cetakTransmisi();
            fortuner.cetakBentukKerangka();
            fortuner.cetakDimensi();

        } else if (result == 3) {

            System.out.println("\n=========================================================");
            System.out.println("Informasi kendaraan");
            System.out.println("=========================================================");
            katana.nama = "Suzuki Katana / Suzuki Jimny";
            katana.produsen = "Suzuki";
            katana.roda = 4;
            katana.kapasitasTangki = 40;
            katana.transmisi = "5-speed manual, 4-speed automatic";
            katana.bentukKerangka = "2-pintu wagon, 2-pintu konvertibel";
            katana.panjang = "3.395 mm (133,7 in)";
            katana.lebar = "1.475 mm (58,1 in)";
            katana.tinggi = "1.680–1.705 mm (66,1–67,1 in)";
            katana.jarakRoda = "2.250 mm (88,6 in)";

            katana.cetakNama();
            katana.cetakProdusen();
            katana.roda();
            katana.cetakKapasitasTangki();
            katana.cetakTransmisi();
            katana.cetakBentukKerangka();
            katana.cetakDimensi();
        } else {
            System.out.println("Pilihan tidak ada di dalam daftar");
        }
    }
}