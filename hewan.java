class Kendaraan {

    String merk;

    void tahun_pembuatan() {
        System.out.println("Tanggal Pembuatan");
    }
}

class Mobil extends Kendaraan {

    Mobil() {

        merk = "Ford";

    }

    void tahun_pembuatan() {

        System.out.println("17 Agustus 1945!");

    }

}

class Motor extends Kendaraan {

    Motor() {

        merk = "Supra";

    }

    void tahun_pembuatan() {

        System.out.println("10 November 1945");

    }

}

class Merek {

    public static void main(String[] args) {

        Mobil mbl = new Mobil();

        Motor mtr = new Motor();

        System.out.println("Merk Mobil: " + mbl.merk);

        mbl.tahun_pembuatan();

        System.out.println("Merk Motor: " + mtr.merk);

        mtr.tahun_pembuatan();

    }

}