package overriding;

public class Lingkaran extends BangunDatar{
    public double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public void hitungLuas(){
        luas = 3.14*jariJari*jariJari;
    }

    public void hitungKeliling(){
        keliling = 2*3.14*jariJari;
    }

    public void tampilData(){
        System.out.println("JARI-JARI = "+jariJari);
        super.tampilData();
    }
}
