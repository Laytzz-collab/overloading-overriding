package overloading;

public class SegiEmpat extends BangunDatar{
    public double panjang, lebar, diagonal;

    public void hitungLuas(){
        luas = panjang*lebar;
    }

    public void hitungLuas(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        luas = panjang*lebar;
    }

    public void hitungKeliling(){
        keliling = 2*(panjang+lebar);
    }

    public void hitungKeliling(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        keliling = 2*(panjang+lebar);
    }

    public void hitungDiagonal(){
        diagonal = Math.sqrt((panjang*panjang)+(lebar*lebar));
    }

    public void hitungDiagonal(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
        diagonal = Math.sqrt((panjang*panjang)+(lebar*lebar));
    }

    public void tampilData(){
        System.out.println("PANJANG = "+panjang);
        System.out.println("LEBAR = "+lebar);
        System.out.println("DIAGONAL= "+diagonal);
        super.tampilData();
    }
}
