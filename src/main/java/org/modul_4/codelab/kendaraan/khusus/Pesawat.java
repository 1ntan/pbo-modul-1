package org.modul_4.codelab.kendaraan.khusus;

import org.modul_4.codelab.kendaraan.Kendaraan;
import org.modul_4.codelab.kendaraan.util.Flyable;

public class Pesawat extends Kendaraan implements Flyable {
    @Override
    public void Start() {
        System.out.println("Menyalakan pesawat " + this.getName());
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan mesin pesawat " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Pesawat berhenti");

    }

    @Override
    public void fly() {
        System.out.println("Pesawat " + this.getName() + " lepas landas");
    }
}
