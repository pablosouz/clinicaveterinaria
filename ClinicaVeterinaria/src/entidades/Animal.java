package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

@Entity
public class Animal implements Serializable  {

        @Id @GeneratedValue
	private int id;
	private String nome;
	private String raca;
	private String peso;
	private String batimentoCardiaco;
	private String situacaoPelagem;
	private String temperatura;
	private String situacaoOrelha;
	private String situacaoGengiva;
        @ManyToOne
	private Dono dono;
	private Consulta consulta;
        private String observacao;

        public Animal() {
                
        }
        
        public int id() {
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

        public String getRaca() {
                return raca;
        }

        public void setRaca(String raca) {
                this.raca = raca;
        }

        public String getPeso() {
                return peso;
        }

        public void setPeso(String peso) {
                this.peso = peso;
        }

        public String getBatimentoCardiaco() {
                return batimentoCardiaco;
        }

        public void setBatimentoCardiaco(String batimentoCardiaco) {
                this.batimentoCardiaco = batimentoCardiaco;
        }

        public String getSituacaoPelagem() {
                return situacaoPelagem;
        }

        public void setSituacaoPelagem(String situacaoPelagem) {
                this.situacaoPelagem = situacaoPelagem;
        }

        public String getTemperatura() {
                return temperatura;
        }

        public void setTemperatura(String temperatura) {
                this.temperatura = temperatura;
        }

        public String getSituacaoOrelha() {
                return situacaoOrelha;
        }

        public void setSituacaoOrelha(String situacaoOrelha) {
                this.situacaoOrelha = situacaoOrelha;
        }

        public String getSituacaoGengiva() {
                return situacaoGengiva;
        }

        public void setSituacaoGengiva(String situacaoGengiva) {
                this.situacaoGengiva = situacaoGengiva;
        }

        public Dono getDono() {
                return dono;
        }

        public void setDono(Dono dono) {
                this.dono= dono;
        }

        public Consulta getConsulta() {
                return consulta;
        }

        public void setConsulta(Consulta consulta) {
                this.consulta = consulta;
        } 

        public String getObservacao() {
                return observacao;
        }

        public void setObservacao(String observacao) {
                this.observacao = observacao;
        }
        
        
        public void cadastrarAnimal(String nome,String raca, String peso, String batimentoCardiaco, String situacaoPelagem,	 String temperatura, String situacaoOrelha, String situacaoGengiva,String observacao) {

        try{        
                EntityManagerFactory factory = Persistence.createEntityManagerFactory("sistema");
                EntityManager em = factory.createEntityManager();

                Animal animal = new Animal();
                
                animal.setNome(nome);
                animal.setRaca(raca);
                animal.setPeso(peso);
                animal.setBatimentoCardiaco(batimentoCardiaco);
                animal.setSituacaoPelagem(situacaoPelagem);
                animal.setTemperatura(temperatura);
                animal.setSituacaoOrelha(situacaoOrelha);
                animal.setSituacaoGengiva(situacaoGengiva);
                animal.setObservacao(observacao);
                
                em.getTransaction().begin();
                em.persist(animal);
                em.getTransaction().commit();

                em.close();
                factory.close();
                
                JOptionPane.showMessageDialog(null, "Animal cadastrado com sucesso!");        
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Erro ao cadastrar Animal \n ERROR:"+ex.getMessage());
        }
                
                
	}

	public void consultarAnimal() {

	}

	public void alterarAnimal() {

	}

	public void excluirAnimal() {

	}


}
