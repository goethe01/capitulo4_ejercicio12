package com.mycompany.cap3_ejeresuelto12;
import java.util.Scanner;
public class Cap3_ejeResuelto12 {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        String nombre;
        int num_horas, val_hora, horas_extra, hExtraExeden, pago_total;
        
        System.out.println("DAME EL NOMBRE DEL TRABAJADOR");
        nombre = entrada.nextLine();
        
        System.out.println("DAME EL NUMERO DE HORAS TRABAJADAS");
        num_horas = entrada.nextInt();
        
        System.out.println("VALOR DE LA HORA TRABAJADA");
        val_hora = entrada.nextInt();
        
        if(num_horas > 40){
        horas_extra = num_horas-40;
        if(horas_extra > 8){
        hExtraExeden = horas_extra-8;
        pago_total = 40*val_hora + 16*val_hora + hExtraExeden*(3*val_hora);
        }else{
            pago_total = 40* val_hora + horas_extra*(2*val_hora);
        }}else{
            pago_total = num_horas*val_hora;
        }
        System.out.println("EL TRABAJADOR "+ nombre + " DEVENGO: $"+ pago_total);
    }
}
