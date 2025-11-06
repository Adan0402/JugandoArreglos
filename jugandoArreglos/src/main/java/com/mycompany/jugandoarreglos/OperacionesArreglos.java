package com.mycompany.jugandoarreglos;

public class OperacionesArreglos {
    
    public float calcularSuma(float[] num) {
        if (num == null)
            return 0f;

        float suma = 0f;
        for (int i = 0; i < num.length; i++) {
            suma = suma + num[i];
        }
        return suma;
    }

    public float calcularPromedio(float[] num) {
        if (num == null || num.length == 0)
            return 0f;

        float suma = calcularSuma(num);
        float promedio = suma / num.length;
        return promedio;
    }

    public int contarMayoresQueLimite(float[] num, float limite) {
        int contador = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > limite) {
                contador++;
            }
        }
        return contador;
    }

    public float[] invertirArreglo(float[] num) {
        float[] invertido = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            invertido[i] = num[num.length - 1 - i];
        }
        return invertido;
    }

    public float[] obtenerValoresAbsolutos(float[] num) {
        float[] absolutos = new float[num.length];
        for (int i = 0; i < num.length; i++) {
            absolutos[i] = Math.abs(num[i]);
        }
        return absolutos;
    }
}

