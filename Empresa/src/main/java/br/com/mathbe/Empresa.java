/**
 * 
 */
package br.com.mathbe;

/**
 * @author rudsonkiyoshi
 *
 */
public class Empresa {

	private final int codigo;
	
	private final String nome;

	
	public int getCodigo() {
		return codigo;
	}


	public String getNome() {
		return nome;
	}


	public Empresa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
	public boolean fazAlgo() {
		return true;
	}
	
}
