import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class eks extends JFrame {
  public eks(){
    setTitle("aplikasi perhitungan");
    setSize(600, 300);
    setResizable(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);





     Scanner input = new Scanner(System.in);
     
    System.out.print("Nama anda? ");
    String nama = input.nextLine();
    System.out.println("Semangat Pagi, " + nama);
  }
  public static void main(String args[]){
    eks contoh = new eks();

    contoh.setVisible(true);
   
  }
}