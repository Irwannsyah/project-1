import javax.swing.*;

class Tampilan extends JFrame{
  Tampilan(){
    setTitle("GetUSeerInformation");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400, 800);
    setResizable(false);
    setLayout(null);
    setLocation(500, 500);

    JLabel jlb1 = new JLabel("Biodata");
    jlb1.setBounds(50,30,250,50);
    add(jlb1);

    //nama awal
    JLabel last = new JLabel("last Name");
    last.setBounds(50,60,150,50);
    this.add(last);
    JTextField fld1 = new JTextField("");
    fld1.setBounds(160, 70,150,30);
    this.add(fld1);
    //nama awal
    JLabel first = new JLabel("First Name");
    first.setBounds(50,100,150,50);
    add(first);
    JTextField fld2 = new JTextField("");
    fld2.setBounds(160, 110,150,30);
    add(fld2);
    //alamat
    JLabel Adres = new JLabel("Adress");
    Adres.setBounds(50, 140, 150, 50);
    add(Adres);
    JTextField fld3 = new JTextField("");
    fld3.setBounds(160, 150, 150, 30);
    add(fld3);

    //kota
    JLabel kota = new JLabel("City");
    kota.setBounds(50, 180, 150, 50);
    add(kota);
    JTextField fld4 = new JTextField("");
    fld4.setBounds(160, 190, 150, 30);
    add(fld4);

    JLabel negara = new JLabel("State");
    negara.setBounds(50, 220, 150, 50);
    add(negara);
    JTextField fld5 = new JTextField("");
    fld5.setBounds(160, 230, 150, 30);
    add(fld5);

    JLabel zp = new JLabel("Zip");
    zp.setBounds(50, 260, 150, 50);
    add(zp);
    JTextField fld6 = new JTextField("");
    fld6.setBounds(160, 270, 150, 30);
    add(fld6);

    JButton sbm = new JButton("Submit");
    sbm.setBounds(90, 330, 90, 40);
    add(sbm);

    JButton cnc = new JButton("Cancel");
    cnc.setBounds(190, 330, 90, 40);
    add(cnc);


  }
  public static void main (String args[]){
    Tampilan tmp = new Tampilan();
    tmp.setVisible(true);
  }
}

		