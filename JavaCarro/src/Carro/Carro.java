package Carro;

public class Carro {
 String marca;
 String modelo;
 int numPassageiros;
 double capCombustivel;
 double consumoCombustivel;
 
 
 void exibirAutonomia() {
	 System.out.println("Autonomia do carro �: "+ capCombustivel* consumoCombustivel+"km");
 }
 
}
