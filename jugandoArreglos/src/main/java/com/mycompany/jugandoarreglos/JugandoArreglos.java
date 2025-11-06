
package com.mycompany.jugandoarreglos;

import java.util.Arrays;

public class JugandoArreglos {

    public static void main(String[] args) {
        OperacionesArreglos op=new OperacionesArreglos();
        
        float[] pesos={12f, 45f, 3.5f};
        float sum=op.calcularSuma(pesos);
        System.out.println("la suma es "+sum);
        
        
        float promedio = op.calcularPromedio(pesos);
        System.out.println("El promedio es: " + promedio);
        
        float limite = 5f;
        int mayores = op.contarMayoresQueLimite(pesos, limite);
        System.out.println("Cantidad de elementos mayores que " + limite + ": " + mayores);
        
        
        float[] invertido = op.invertirArreglo(pesos);
        System.out.println("Arreglo original: " + Arrays.toString(pesos));
        System.out.println("Arreglo invertido: " + Arrays.toString(invertido));
        
        float[] valores = {2f, -3f, -4f, 5f};
        float[] absolutos = op.obtenerValoresAbsolutos(valores);
        System.out.println("Arreglo original: " + Arrays.toString(valores));
        System.out.println("Arreglo con valores absolutos: " + Arrays.toString(absolutos));
    }
}
    