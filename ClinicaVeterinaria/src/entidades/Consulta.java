package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consulta implements Serializable {

        @Id @GeneratedValue
	private int id;
	private int codigoAnimal;
	private Date dia;
	private String motivo;
	private int codigoConsulta;
	private Veterinario veterinario;
	private Animal animal;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public int getCodigoAnimal() {
                return codigoAnimal;
        }

        public void setCodigoAnimal(int codigoAnimal) {
                this.codigoAnimal = codigoAnimal;
        }

        public Date getDia() {
                return dia;
        }

        public void setDia(Date dia) {
                this.dia = dia;
        }

        public String getMotivo() {
                return motivo;
        }

        public void setMotivo(String motivo) {
                this.motivo = motivo;
        }

        public int getCodigoConsulta() {
                return codigoConsulta;
        }

        public void setCodigoConsulta(int codigoConsulta) {
                this.codigoConsulta = codigoConsulta;
        }

        public Veterinario getVeterinario() {
                return veterinario;
        }

        public void setVeterinario(Veterinario veterinario) {
                this.veterinario = veterinario;
        }

        public Animal getAnimal() {
                return animal;
        }

        public void setAnimal(Animal animal) {
                this.animal = animal;
        }

	public void marcarConsulta() {

	}

	public void consultarConsulta() {

	}

	public void alterarConsulta() {

	}

	public void cancelarConsulta() {

	}

	public void gerarReceita() {

	}

	public void gerarRecibo() {

	}

}
