package br.com.mathbe;

import org.junit.Test;

public class EmpresaTest {
	
	@Test
	public void testeFazAlgo() {
		
		Empresa e = new Empresa(15, "mathbe");
		
		//cobertura de 65% do codigo
		org.junit.Assert.assertEquals(true, e.fazAlgo());
		
	}
	
	@Test
	public void testeNome() {
		
		Empresa e = new Empresa(15, "mathbe");
		
		//cobertura de + 17% do codigo
		org.junit.Assert.assertEquals("mathbe", e.getNome());
		
	}

}
