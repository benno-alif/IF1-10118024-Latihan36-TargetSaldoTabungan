package com.benno;
import java.text.DecimalFormat;

public class TargetSaldo {
    DecimalFormat satuan = new DecimalFormat();

    private Double saldo, bunga, target;

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void setBunga(Double bunga) {
        this.bunga = bunga;
    }

    public void setTarget(Double target) {
        this.target = target;
    }

    public void hitungTarget(){
        int i = 1;
        while (true){
            saldo += (saldo * bunga);
            System.out.println("Saldo di bulan ke-" + i + " Rp " + satuan.format(saldo));
            i++;

            if(saldo >= target){
                break;
            }
        }
    }
}
