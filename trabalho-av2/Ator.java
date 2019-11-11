public class Ator extends Pessoa{
	private String experiencia;

	Ator(){

	}	
	Ator(String nome,String endereco,String telefone,String rg,String cpf,String experiencia){
		super(nome,endereco,telefone,rg,cpf);
		setExperiencia(experiencia);

	}
	public void setExperiencia(String experiencia){
		this.experiencia = experiencia;
	}
	public String getExperiencia(){
		return this.experiencia;
	}

}