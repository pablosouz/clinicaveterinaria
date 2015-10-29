package entidades;

public class Animal  {

	private int id;
	private String nome;
	private String raca;
	private double peso;
	private double batimentoCardiaco;
	private String situacaoPelagem;
	private double temperatura;
	private String situacaoOrelha;
	private String situacaoGengiva;
	private Dono dono;
	private Consulta consulta;

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

        public double getPeso() {
                return peso;
        }

        public void setPeso(double peso) {
                this.peso = peso;
        }

        public double getBatimentoCardiaco() {
                return batimentoCardiaco;
        }

        public void setBatimentoCardiaco(double batimentoCardiaco) {
                this.batimentoCardiaco = batimentoCardiaco;
        }

        public String getSituacaoPelagem() {
                return situacaoPelagem;
        }

        public void setSituacaoPelagem(String situacaoPelagem) {
                this.situacaoPelagem = situacaoPelagem;
        }

        public double getTemperatura() {
                return temperatura;
        }

        public void setTemperatura(double temperatura) {
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
                this.dono = dono;
        }

        public Consulta getConsulta() {
                return consulta;
        }

        public void setConsulta(Consulta consulta) {
                this.consulta = consulta;
        }
        

	public void cadastrarAnimal() {

	}

	public void consultarAnimal() {

	}

	public void alterarAnimal() {

	}

	public void excluirAnimal() {

	}

}
