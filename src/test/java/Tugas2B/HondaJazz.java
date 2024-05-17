package Tugas2B;

public class HondaJazz extends Car {
    String nama;
    String produsen;
    String beratKosong;

    public void cetakNama(){
        System.out.println("Nama Mobil : " + nama);
    }

    public void cetakProdusen(){
        System.out.println("Produsen : " + produsen);
    }

    @Override
    public void cetakDimensi() {
        super.cetakDimensi();
        System.out.println("Berat Kosong " + beratKosong);
    }
}