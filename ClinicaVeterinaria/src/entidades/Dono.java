package entidades;

import java.util.List;

public class Dono {

        private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
	private List<Animal> animal;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getCpf() {
                return cpf;
        }

        public void setCpf(String cpf) {
                this.cpf = cpf;
        }

        public String getTelefone() {
                return telefone;
        }

        public void setTelefone(String telefone) {
                this.telefone = telefone;
        }

        public String getEndereco() {
                return endereco;
        }

        public void setEndereco(String endereco) {
                this.endereco = endereco;
        }

        public List<Animal> getAnimal() {
                return animal;
        }

        public void setAnimal(List<Animal> animal) {
                this.animal = animal;
        }
        
        

}
