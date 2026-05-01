public class Main {
    public static void main(String[] args) {
        // Array nama dan umur untuk testing
        String[] names = {
            "Rizky", "Sari", "Joko", "Maya", "Tian", 
            "Umar", "Vina", "Wawan", "Xena", "Yudi"
        };
        int[] ages = {10, 15, 16, 25, 30, 45, 60, 61, 70, 100};
        
        System.out.println("=== TEST PENDAFTARAN MAHASISWA ===\n");
        
        for (int i = 0; i < names.length; i++) {
            try {
                StudentRegistration.register(names[i], ages[i]);
                System.out.println("✅ " + names[i] + " (" + ages[i] + ") → BERHASIL");
            } catch (InvalidNameException e) {
                System.out.println("❌ " + names[i] + " → " + e.getMessage());
            } catch (InvalidAgeException e) {
                System.out.println("❌ " + names[i] + " (" + ages[i] + ") → " + e.getMessage());
            }
        }
        
        System.out.println("\n=== TEST EKSTRA ===");
        
        // Test nama kosong
        try {
            StudentRegistration.register("", 20);
        } catch (Exception e) {
            System.out.println("❌ Nama kosong → " + e.getMessage());
        }
        
        // Test nama dengan spasi
        try {
            StudentRegistration.register("   ", 25);
        } catch (Exception e) {
            System.out.println("❌ Nama spasi → " + e.getMessage());
        }
    }
}