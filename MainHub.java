public class MainHub {
    public static void main(String[] args) {
        // Menampilkan Identitas
        System.out.println("Nama: Pilippo Andoni");
        System.out.println("NIM : 253303621245");
        System.out.println("----------------------------------");

        // Upcasting: Instansiasi SmartLamp ke dalam wadah SmartDevice
        SmartDevice lampu = new SmartLamp("192.168.1.10");

        // Memanggil method turnOn()
        lampu.turnOn();

        // Downcasting: Mengubah tipe kembali ke SmartLamp agar bisa memanggil connectWifi()
        // // DOWNCASTING: Dilakukan karena SmartDevice tidak memiliki method connectWifi()
        SmartLamp lampuFisik = (SmartLamp) lampu;
        lampuFisik.connectWifi();
    }
}