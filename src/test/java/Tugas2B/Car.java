package Tugas2B;

public class Car extends Vehicle{
    int roda;
    int kapasitasTangki;
    String transmisi;
    String bentukKerangka;
    String panjang;
    String lebar;
    String tinggi;

    @Override
    public void roda() {
        System.out.println("Jumlah roda : " + roda + " roda");
    }

    public void cetakKapasitasTangki(){
        System.out.println("Kapasitas Tangki : " + kapasitasTangki + " Liter");
    }

    public void cetakTransmisi(){
        System.out.println("Transmisi : " + transmisi);
    }

    public void cetakBentukKerangka(){
        System.out.println("Bentuk Kerangka : " + bentukKerangka);
    }

    public void cetakDimensi(){
        System.out.println("Panjang : " + panjang);
        System.out.println("Tinggi : " + tinggi);
        System.out.println("Lebar : " + lebar);
    }
}
