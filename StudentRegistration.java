public class StudentRegistration {

    public static void register(String nama, int umur) 
            throws InvalidNameException, InvalidAgeException {

        // validasi nama
        if (nama.isEmpty()) {
            throw new InvalidNameException("Nama tidak boleh kosong!");
        }

        // validasi umur
        if (umur < 16 || umur > 60) {
            throw new InvalidAgeException("Umur tidak memenuhi syarat Universitas!");
        }

        // jika lolos
        System.out.println("Pendaftaran Mahasiswa " + nama + " Berhasil!");
    }
}
