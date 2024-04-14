package org.modul_4.codelab.kendaraan.khusus;

import org.modul_4.codelab.kendaraan.Kendaraan;
import org.modul_4.codelab.kendaraan.util.ShootAble;

public class Tank extends Kendaraan implements ShootAble{
    @Override
    public void Start() {
        System.out.println("Menyalakan " + this.getName() + " tank");
    }

    @Override
    public void Stop() {
        System.out.println("Mematikan tank " + this.getName());
    }

    @Override
    public void Brake() {
        System.out.println("Tank berhenti");
    }

    @Override
    public void Shoot(String vehicle) {
        System.out.println("Tank menembak " + vehicle);
    }
}
