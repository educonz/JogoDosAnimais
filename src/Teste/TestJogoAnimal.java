package Teste;

import org.junit.Test;

import Animal.AnimalNaoViveNaAgua;
import Animal.AnimalViveAgua;
import Classe.Acao;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestJogoAnimal {
	
	@Test
	public void testAnimalMacaco()
	{
		Assert.assertEquals(new Acao().ProcurarAnimalPadrao(new AnimalNaoViveNaAgua(), new InteragirPerguntaTrueTest()), true);
	}
	
	@Test
	public void testAnimalTubarao()
	{
		Assert.assertEquals(new Acao().ProcurarAnimalPadrao(new AnimalViveAgua(), new InteragirPerguntaTrueTest()), true);
	}
	
	@Test
	public void testAnimalNaoAprendidoAgua()
	{
		Assert.assertEquals(new Acao().ProcurarAnimais(new AnimalViveAgua(), new InteragirPerguntaFalseTest()), false);
	}
	
	@Test
	public void testAnimalNaoAprendido()
	{
		Assert.assertEquals(new Acao().ProcurarAnimais(new AnimalNaoViveNaAgua(), new InteragirPerguntaFalseTest()), false);
	}
	
	@Test
	public void testBaleia()
	{
		Assert.assertEquals(new Acao().ProcurarAnimais(new AnimalViveAgua(), new InteragirPerguntaTrueTest()), true);
	}
	
	@Test
	public void testLeao()
	{
		Assert.assertEquals(new Acao().ProcurarAnimais(new AnimalNaoViveNaAgua(), new InteragirPerguntaTrueTest()), true);
	}
}
