package br.ufc.dc.tpi.banco;
import br.ufc.dc.tpi.banco.contas.*;
import br.ufc.dc.tpi.banco.usuario.*;

public class Main {
	public static void main(String[] args) {
		// Criando o Banco
		BancoVector banco;
		banco = new BancoVector();
		// Criando o user
		Usuario Ademir;
		Ademir = new Usuario("Ademir Mirassol Jacinto", "666.666.666-66", "20072007077-5", 1912);
		// Criando a conta
		Conta conta_ademir;
		conta_ademir = new Conta("7777-7", Ademir);
		// Cadastrando a conta no banco
		banco.cadastrar(conta_ademir);
		
		// Testando funcionalidades
		
		banco.creditar("7777-7", 1500);
		
		System.out.println("");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Conta Bancária de " + conta_ademir.GetNome());
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Número de " + conta_ademir.GetNome() + ": " + conta_ademir.GetNumero());
		System.out.println("Saldo: " + banco.saldo("7777-7"));
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.println("Dados: ");
		conta_ademir.GetDados();
	}
}

