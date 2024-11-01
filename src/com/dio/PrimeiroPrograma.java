package com.dio;
import com.dio.modelo.*;
import com.dio.modelo.pessoas.*;
public class PrimeiroPrograma {
	
public static  float media(float nota1, float nota2,float nota3, float nota4) {
	
		float media = (nota1 + nota2 + nota3 + nota4)/4;
	return media;
	}


public static String AprovaReprova(float media) {
	if (media >= 7) {
		return  "Aprovado";
	}else {
		return  "Reprovado";
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Imc_Alunos imc2 = new Imc_Alunos(); 
		   Pessoas pessoas = new Pessoas(); // Usando o construtor sem parâmetros
		
	        // Definindo o nome usando setNome
	      pessoas.setNome("Rafael Morales");
	      pessoas.setIdade(42);
		//String nome = "Rafael Morales";
	    String resultadoImc =  imc2.controleImc();
		float media = media(5,5,5,5);
		System.out.printf("%s, sua idade é %s  Sua média é: %.2f você está %s %s ",pessoas.getNome(), pessoas.getIdade(),media, AprovaReprova(media), resultadoImc);

	}

}
