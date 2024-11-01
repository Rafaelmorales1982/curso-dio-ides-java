package com.dio.modelo;

public class Imc_Alunos {
	
	public float imc(float peso, double altura ) {
		
		double imc = peso/(altura * altura);
		
		return (float) imc ;
	}
	float imcAlunos = imc(80, 1.72);
	
	public String controleImc() {
	
		
		if( imcAlunos <= 19) {
			return ": Seu IMC está Peso Ideal  "+String.format ("%.2f",imcAlunos);
		}else {
			return ": Seu IMC está Sobrepeso "+String.format ("%.2f",imcAlunos);
		}
	}
	
}
