package br.com.fiap.banco;

import java.io.Serializable;

//padrão de JavaBeans
public class Conta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	
	/**
	 * Classe que abstrai uma Conta Bancária
	 * @author gabriel
	 * @version 1.0
	 */
	

	//construtor padrão - famoso xuxu (sem sabor, sem cheiro)
	//APIs esperam um construtor padrão sem métodos!
	public Conta () {
		
	}
	
	/**
	 * Realiza um depósito na conta corrente
	 * @param agencia o número da agência
	 * @param numero da conta
	 * @param saldo valor a ser depositdo
	 * @return o número do protocolo de confirmação
	 */
	
	
	//construtor para criar ojetos
	public Conta (int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	//get e set
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Apresenta o valor ao Saldo da Conta
	 * @param valor que será depositado
	 */
	
	//métodos sem retornos
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return valor do Saldo da Conta
	 */
	
	//método com retorno
	public double getSaldo() {
		return this.saldo;
	}
	
}
