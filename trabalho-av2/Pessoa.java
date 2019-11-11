public class Pessoa{
	protected String nome;
	protected String endereco;
	protected String telefone;
	protected String rg;
	protected String cpf;

	Pessoa(){

	}
	Pessoa(String nome,String endereco,String telefone,String rg,String cpf){
		setNome(nome);
		setEndereco(endereco);
		setTelefone(telefone);
		setRg(rg);
		setCpf(cpf);
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	public void setRg(String rg){
		this.rg = rg;
	}
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	public String getNome(){
		return this.nome;
	}
	public String getEndereco(){
		return this.endereco;
	}
	public String getTelefone(){
		return this.telefone;
	}
	public String getRg(){
		return this.rg;
	}
	public String getCpf(){
		return this.cpf;
	}
	public String toString(){
		return "\nNome: " + getNome() + "\nEndereco: " + getEndereco() + "\nTelefone: " + getTelefone() + "\nRg: "+ getRg() + "\nCpf: " + getCpf();
	}
}