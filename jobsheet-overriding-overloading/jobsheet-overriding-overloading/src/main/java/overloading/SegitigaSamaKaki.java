package overloading;

public class SegitigaSamaKaki extends BangunDatar{
    public double alas, tinggi;

    public void hitungLuas(){
        luas = 0.5*alas*tinggi;
    }

    public void hitungLuas(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        luas = 0.5*alas*tinggi;
    }

    public void hitungKeliling(){
        double simir = Math.sqrt((0.5*alas*0.5*alas)+(tinggi*tinggi));
        keliling = (2*simir)+alas;
    }

    public void hitungKeliling(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        double simir = Math.sqrt((0.5*alas*0.5*alas)+(tinggi*tinggi));
        keliling = (2*simir)+alas;
    }

    public void tampilData(){
        System.out.println("ALAS = "+alas);
        System.out.println("TINGGI = "+tinggi);
        super.tampilData();
    }
}
