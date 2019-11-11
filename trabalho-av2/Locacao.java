import java.util.ArrayList;
public class Locacao{
	private int codigo;
	private String dataLoc;
	private ArrayList<Copia> listaCopia = new ArrayList<>();
	private ArrayList<Socio> listaSocio = new ArrayList<>();

	Locacao(){

	}
	Locacao(int codigo,String dataLoc,Copia cop,Socio socio){
		setCodigo(codigo);
		setDataLoc(dataLoc);
		this.listaCopia.add(cop);
		this.listaSocio.add(socio);
	}
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	public int getCodigo(){
		return this.codigo;
	}
	public void setDataLoc(String data){
		dataLoc = data;
	}
	public String getDataLoc(){
		return dataLoc;
	}
	public String toString(){
		return String.format("\nCódigo: %s\nData de Locação: %s",getCodigo(),getDataLoc());
	}
	public ArrayList<Copia> getCopia(){
		return this.listaCopia;
	}
	public void adicionaCopia(Copia copia){
		this.listaCopia.add(copia);
	}
	public void listasCopia(){
		for(Copia copia:listaCopia)
				System.out.println(copia);
	}
	public ArrayList<Socio> getSocio(){
		return this.listaSocio;
	}
	public void adicionaSocio(Socio socio){
		this.listaSocio.add(socio);
	}
	public void listaSocio(){
		for(Socio socio:listaSocio)
				System.out.println(socio);
	}

}