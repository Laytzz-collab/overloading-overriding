package overriding;

public class BangunDatar {
    public double luas, keliling;

    public void hitungLuas(){
        luas = 0;
    }

    public void hitungKeliling(){
        keliling = 0;
    }

    public void tampilData(){
        System.out.println("LUAS = "+luas);
        System.out.println("KELILING = "+keliling);
    }
}
