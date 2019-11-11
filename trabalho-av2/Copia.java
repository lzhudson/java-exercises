import java.util.ArrayList;
public class Copia{
	private int codigo;
	private int quantidade;
	private ArrayList<Filme> listaFilme = new ArrayList<>();

	Copia(){

	}
	Copia(int codigo,int quantidade){
		setCodigo(codigo);
		setQuantidade(quantidade);
	}
	Copia(int codigo,int quantidade,Filme filme){
		setCodigo(codigo);
		setQuantidade(quantidade);
		this.listaFilme.add(filme);
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
	public int getCodigo(){
		return this.codigo;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	public String toString(){
		return String.format("\nCódigo: %s\nQuantidade: %s",getCodigo(),getQuantidade());
	}
	public ArrayList<Filme> getFilme(){
		return this.listaFilme;
	}
	public void adicionaFilme(Filme filme){
		this.listaFilme.add(filme);
	}
	public void listasFilmes(){
		for(Filme filme:listaFilme){
			System.out.println(filme);
		}
	}

}