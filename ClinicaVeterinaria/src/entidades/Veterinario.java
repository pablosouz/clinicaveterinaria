package entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Veterinario implements Serializable {

        @Id @GeneratedValue
	private int id;
	private String nomeVeterinario;
	private String crmv;
	private String telefone;
	private String endereco;
	private Consulta consulta;

        public String getNomeVeterinario() {
                return nomeVeterinario;
        }

        public void setNomeVeterinario(String nomeVeterinario) {
                this.nomeVeterinario = nomeVeterinario;
        }

        public String getCrmv() {
                return crmv;
        }

        public void setCrmv(String crmv) {
                this.crmv = crmv;
        }

        public Consulta getConsulta() {
                return consulta;
        }

        public void setConsulta(Consulta consulta) {
                this.consulta = consulta;
        }
        
        
	public void cadastrarVeterinario() {

	}

	public void consultarVeterinario() {

	}

	public void alterarVeterinario() {

	}

	public void excluirVeterinario() {

	}

}
