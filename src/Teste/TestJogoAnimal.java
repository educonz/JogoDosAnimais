package Teste;

import org.junit.Test;

import Animais.Animal;
import Animais.Aprende;
import Animais.Habilidade;
import Animais.Vitoria;
import Interface.IInteragir;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestJogoAnimal {
	
	@Test
	public void testAnimalTubarao()
	{
		IInteragir interacao = new InteragirPerguntaTrueTest(); 
		Aprende aprende = new Aprende(interacao);
		Vitoria vitoria = new Vitoria(interacao);
		Animal AnimalAquatico = new Animal(aprende, vitoria, "Tubarão", interacao);
		Habilidade habilidade = new Habilidade(AnimalAquatico, null, "vive na água", interacao);
		habilidade.Executar(habilidade);
		Assert.assertEquals(habilidade.respostaSim.getDescricao(), "Tubarão");
	}
	
	@Test
	public void testAnimalBaleia()
	{
		InteragirPadrao interacaoTrue = new InteragirPerguntaTrueTest();
		interacaoTrue.SetAnimal("Baleia");
		interacaoTrue.SetHabilidade("mamifero");
		
		InteragirPadrao interacaoFalse = new InteragirPerguntaFalseTest();
		interacaoFalse.SetAnimal("Baleia");
		interacaoFalse.SetHabilidade("mamifero");
		
		Aprende aprende = new Aprende(interacaoTrue);
		Vitoria vitoria = new Vitoria(interacaoTrue);
		
		Animal AnimalAquatico = new Animal(aprende, vitoria, "Tubarão", interacaoFalse);
		Habilidade habilidade = new Habilidade(AnimalAquatico, null, "vive na água", interacaoTrue);
		habilidade.Executar(habilidade);
		
		Assert.assertEquals(((Habilidade)habilidade.respostaSim).respostaSim.getDescricao(), "Baleia");
	}
	
	@Test
	public void testAnimalGolfinho()
	{
		InteragirPadrao interacaoTrue = new InteragirPerguntaTrueTest();
		interacaoTrue.SetAnimal("Golfinho");
		interacaoTrue.SetHabilidade("gosta de gente");
		
		InteragirPadrao interacaoFalse = new InteragirPerguntaFalseTest();
		interacaoFalse.SetAnimal("Golfinho");
		interacaoFalse.SetHabilidade("gosta de gente");
		
		Aprende aprende = new Aprende(interacaoFalse);
		Vitoria vitoria = new Vitoria(interacaoFalse);
		
		Animal AnimalAquatico = new Animal(aprende, vitoria, "Tubarão", interacaoFalse);
		Habilidade habilidade = new Habilidade(AnimalAquatico, null, "vive na água", interacaoTrue);
		habilidade.Executar(habilidade);
	
		Animal AnimalAquatico2 = new Animal(aprende, vitoria, "Baleia", interacaoFalse);
		Habilidade habilidade2 = new Habilidade(AnimalAquatico2, null, "mamifero", interacaoTrue);
		habilidade.Executar(habilidade2);
		
		Habilidade h1 = (Habilidade)habilidade.respostaSim;
		Habilidade h2 = (Habilidade)h1.respostaNao;
		
		Assert.assertEquals(h2.respostaSim.getDescricao(), "Golfinho");
	}
	
	@Test
	public void testAnimalMacaco()
	{
		IInteragir interacao = new InteragirPerguntaTrueTest(); 
		Aprende aprende = new Aprende(interacao);
		Vitoria vitoria = new Vitoria(interacao);
		Animal animalTerrestre = new Animal(aprende, vitoria, "Macaco", interacao);
		Habilidade habilidade = new Habilidade(null, animalTerrestre, "vive na água", new InteragirPerguntaFalseTest());
		habilidade.Executar(habilidade);
		Assert.assertEquals(habilidade.respostaNao.getDescricao(), "Macaco");
	}
	
	@Test
	public void testAnimalLeao()
	{
		InteragirPadrao interacaoTrue = new InteragirPerguntaTrueTest();
		interacaoTrue.SetAnimal("Leão");
		interacaoTrue.SetHabilidade("tem juba");
		
		InteragirPadrao interacaoFalse = new InteragirPerguntaFalseTest();
		interacaoFalse.SetAnimal("Leão");
		interacaoFalse.SetHabilidade("tem juba");
		
		Aprende aprende = new Aprende(interacaoTrue);
		Vitoria vitoria = new Vitoria(interacaoTrue);
		
		Animal animalTerrestre = new Animal(aprende, vitoria, "Macaco", interacaoFalse);
		Habilidade habilidade = new Habilidade(null, animalTerrestre, "vive na água", interacaoFalse);
		habilidade.Executar(habilidade);
		
		Assert.assertEquals(((Habilidade)habilidade.respostaNao).respostaSim.getDescricao(), "Leão");
	}
}
