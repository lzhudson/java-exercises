public class Socio extends Pessoa{
	private String dataAdesao;

	Socio(){

	}
	Socio(String nome,String endereco,String telefone,String rg,String cpf,String dataAdesao){
		super(nome,endereco,telefone,rg,cpf);
		setDataAdesao(dataAdesao);
	}
	public void setDataAdesao(String dataAdesao){
		this.dataAdesao = dataAdesao;
	}
	public String getDataAdesao(){
		return this.dataAdesao;
	}
	public String toString(){
		return String.format("%s\n Data de Adesão: %s\n",super.toString(),getDataAdesao());
	}
}