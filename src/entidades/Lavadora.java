/*  */
package entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomesticos {
    
    protected int carga;
    
    

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergético, double peso) {
        super(precio, color, consumoEnergético, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    public void crearLavadora() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar carga");
        carga = sc.nextInt();
        super.crearElectrodomestico();
//        precioFinalLavadora();
    }
    
    
//    public void precioFinalLavadora() {
//        precio = (carga > 30) ? precio += 500 : precio;
//    }
    

    @Override
    public void precioFinal() {
        super.precioFinal();
        precio = (carga > 30) ? precio += 500 : precio;
    }

    @Override
    public String toString() {
        return super.toString() + "carga=" + carga + '}';
    }
    
    
    
    
}
