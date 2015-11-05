package entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

@Entity
public class Dono implements Serializable {

        @Id @GeneratedValue
        private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
        @OneToMany
	private List<Animal> animal = new ArrayList<Animal>();

        public Dono() {
                
        }
        
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
        
        public void cadastrarDono(String nome, String cpf, String telefone, String endereco) {
      try{                        
                EntityManagerFactory factory = Persistence.createEntityManagerFactory("sistema");
                EntityManager em = factory.createEntityManager();

                Dono dono = new Dono(); 
                dono.setNome(nome);
                dono.setCpf(cpf);
                dono.setTelefone(telefone);
                dono.setEndereco(endereco);
                        
                em.getTransaction().begin();
                em.persist(dono);
                em.getTransaction().commit();

                em.close();
                factory.close();

                JOptionPane.showMessageDialog(null, "Dono cadastrado com sucesso!");
                        
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao Cadastrar! \n ERROR: " + ex.getMessage());
         }
      
                this.nome = nome;
                this.cpf = cpf;
                this.telefone = telefone;
                this.endereco = endereco;
        }
}


