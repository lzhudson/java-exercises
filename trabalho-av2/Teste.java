public class Teste{
	public static void main(String args[]){
		Ator at1 = new Ator("Lucas","Barão do Rio Branco","987665578","1111111","67858588","sem experiência");

		Filme f1 = new Filme("Annabelle 3",150,"2019","BluRay",at1);
		Filme f2 = new Filme("avengers infinity war",200,"2018","BluRay",at1);
		Filme f3 = new Filme("Scooby-Doo",120,"2009","HD",at1);

		Copia c1 = new Copia(1,3,f1);
		Copia c2 = new Copia(2,5,f2);
		Copia c3 = new Copia(3,10);
		c3.adicionaFilme(f3);
	

		Socio s1 = new Socio("João","Caucaia","99999999","111111","543216","11/11/2019");
	
		Locacao loc1 = new Locacao(1,"11/11/2019",c1,s1);

		System.out.println(at1);
		System.out.println(f1);
		System.out.println(c1);
		System.out.println(s1);
		System.out.println(loc1);
	}
}