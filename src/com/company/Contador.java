package com.company;

public class Contador {

    private int numero1, numero2;

    public void contar(int num1, int num2){
        try {
            int result = num2 - num1;

            if(result < 0){
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            for(int i = 1; i <= result; i++){
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
