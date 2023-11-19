public class Karyawan {
    private String nama;
    private int id;
    private int gaji;
    // Constructor
    public Karyawan(String nama, int gaji, int id) {

        this.nama = nama;

        this.gaji = gaji;

        this.id = id;

        

    }
   // Getter untuk nama

    public String getNama() {

        return nama;

    }
    // Setter untuk nama
    public void setNama(String nama) {

        this.nama = nama;

    }
    // Getter untuk gaji
    public int getGaji() {

        return gaji;

    }
    // Setter untuk gaji

    public void setGaji(int gaji) {

        if (gaji > 0) {

            this.gaji = gaji;

        }

    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        if (id > 0){
            this.id = id;
        }
    }
}

class irwansyah {
    public static void main (String args[]){
        Karyawan krwn1 = new Karyawan("adi", 30000000, 1000);
        System.out.println(krwn1.getNama());
        System.out.println(krwn1.getGaji());
        System.out.println(krwn1.getId());
    }
}