package clases;

import java.util.Scanner;

public class Operaciones {

        //Objeto Scanner
        private Scanner entrada = new Scanner(System.in);

        //Variables
        private int Opcion;
        private double Valor1, Valor2, Resultado;

        private void PedirDatos() {
                
                System.out.println("");
                System.out.println("¿Qué operacion deseas realizar?");
                System.out.println("[1] Suma");
                System.out.println("[2] Resta");
                System.out.println("[3] Multiplicacion");
                System.out.println("[4] Division");
                System.out.println("[5] Potencia");
                System.out.println("[6] Raiz cuadrada");
                System.out.println("[7] Salir");
                System.out.println("");
                Opcion = entrada.nextInt();

                if (Opcion == 6) {

                        System.out.println("");
                        System.out.print("Dame el valor: ");
                        Valor1 = entrada.nextDouble();
                        System.out.println("");

                } else if (Opcion == 7) {

                        //System.out.println("Cerrando programa...");
                        
                } else if (Opcion == 5) {

                        System.out.println("");
                        System.out.print("Dame el primer valor: ");
                        Valor1 = entrada.nextDouble();

                        System.out.println("");
                        System.out.print("Dame el valor del exponente: ");
                        Valor2 = entrada.nextDouble();
                        System.out.println("");

                } else if (Opcion >= 1 && Opcion <= 4) {
                        
                        System.out.println("");
                        System.out.print("Dame el primer valor: ");
                        Valor1 = entrada.nextDouble();
                        
                        System.out.println("");
                        System.out.print("Dame el segundo valor: ");
                        Valor2 = entrada.nextDouble();
                        System.out.println("");

                } else {
                        
                        System.out.println("");
                        System.out.println("Opreacion no valida.");
                }
        }

        private void Calculo() {

                PedirDatos();

                switch (Opcion) {
                        case 1:
                                Resultado = Valor1 + Valor2;
                                break;

                        case 2:
                                Resultado = Valor1 - Valor2;
                                break;

                        case 3:
                                Resultado = Valor1 * Valor2;
                                break;

                        case 4:
                                Resultado = Valor1 / Valor2;
                                break;

                        case 5:
                                Resultado = Math.pow(Valor1, Valor2);
                                break;

                        case 6:
                                Resultado = Math.sqrt(Valor1);
                                break;

                        default:

                                break;
                }
        }

        public void Resultado() {

                Calculo();

                if (Opcion <= 6 && Opcion >= 1) {

                        //System.out.println("");
                        System.out.println("El resultado de tu operacion es: " + Resultado);

                        Resultado();
                } else if (Opcion == 7) {

                        System.out.println("Cerrando programa...");

                } else {
                        Resultado();
                }
        }
}
