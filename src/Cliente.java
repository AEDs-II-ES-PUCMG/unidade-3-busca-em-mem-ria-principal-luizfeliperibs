import java.util.Objects;

public class Cliente {
    
    int ultimoId = 10_100;
    int documento;
    String nome;

    public void Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
	public int hashCode() {
		return Objects.hash(this.documento);
	}
	
	@Override
	public String toString() {
		return (this.nome + " -- " + this.documento);
	}

}
