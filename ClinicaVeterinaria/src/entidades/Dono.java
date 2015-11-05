package entidades;

import Utilidades.Util;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.swing.JOptionPane;

@Entity
public class Dono implements Serializable {

        @Id 
        private String cpf;
	private String nome;	
	private String telefone;
	private String endereco;
        @OneToMany(mappedBy = "dono")
        private List<Animal> animals;
       	

        public Dono() {
                
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

        public List<Animal> getAnimals() {
                return animals;
        }

        public void setAnimals(List<Animal> animals) {
                this.animals = animals;
        }

        
        
        public void cadastrarDono(String nome, String cpf, String telefone, String endereco) {
      try{
                Dono dono = new Dono();
                
                dono.setNome(nome);
                dono.setCpf(cpf);
                dono.setTelefone(telefone);
                dono.setEndereco(endereco);
                
                Util.persistir(dono);

                JOptionPane.showMessageDialog(null, "Dono cadastrado com sucesso!");
                        
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar! \n ERROR: " + ex.getMessage());
         }
      
                this.nome = nome;
                this.cpf = cpf;
                this.telefone = telefone;
                this.endereco = endereco;
        }
        
        public void cadastrarAnimalDono (Animal animal){
                animals.add(animal);
                animal.setDono(this);
        }
        
        
}


