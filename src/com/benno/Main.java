package com.benno;

public class Main {

    public static void main(String[] args) {
        TargetSaldo target = new TargetSaldo();

        target.setSaldo(3500000.0);
        target.setBunga(0.08);
        target.setTarget(6000000.0);
        target.hitungTarget();
    }
}
