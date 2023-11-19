import javax.swing.*;

import java.awt.*;



public class latihan_2 extends JFrame {

    public latihan_2 () {

        setTitle("Contoh GUI dengan Container");
        setSize(600, 300);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        

        // Menggunakan layout manager BorderLayout pada JFrame

        setLayout(new BorderLayout());
        // Membuat dua panel
        JPanel panelAtas = new JPanel();
        JPanel panelBawah = new JPanel();



        // Menambahkan komponen-komponen ke panelAtas

        JLabel labelAtas = new JLabel("ini adalah aplikasi penghitung luas segitiga");

        panelAtas.add(labelAtas);

        add(panelAtas, BorderLayout.NORTH);



        // Menambahkan komponen-komponen ke panelBawah

        JButton tombolBawah = new JButton("Hitung");

        panelBawah.add(tombolBawah);

        add(panelBawah, BorderLayout.SOUTH);



  
    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            latihan_2 contoh = new latihan_2();

            contoh.setVisible(true);

        });

    }

}