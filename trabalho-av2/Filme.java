import java.util.ArrayList;
public class Filme{
	private String titulo;
	private int duracao;
	private String anoLancamento;
	private String formato;
	private ArrayList<Ator> listaAtor = new ArrayList<>();
	Filme(){

	}
	Filme(String titulo,int duracao,String anoLancamento,String formato,Ator ator){
		setTitulo(titulo);
		setDuracao(duracao);
		setAnoLancamento(anoLancamento);
		setFormato(formato);
		this.listaAtor.add(ator);
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	public  void setDuracao(int duracao){
		this.duracao = duracao;
	}
	public void setAnoLancamento(String ano){
		this.anoLancamento = ano;
	}
	public void setFormato(String formato){
		this.formato = formato;
	}
	public String getTitulo(){
		return this.titulo;
	}
	public int getDuracao(){
		return this.duracao;
	}
	public String getAnoLancamento(){
		return this.anoLancamento;
	}
	public String getFormato(){
		return this.formato;
	}
	public String toString(){
		return "\nTitulo: "+getTitulo() + "\nDuração: "+getDuracao()+"\nAno de Lançamento: "+getAnoLancamento()+"\nFormato: "+getFormato();
	}
	public ArrayList<Ator> getAtor(){
		return this.listaAtor;
	}
	public void adicionaAtor(Ator ator){
		this.listaAtor.add(ator);
	}
	public void listasAtores(){
		for(Ator ator:listaAtor)
				System.out.println(ator);
	}

}