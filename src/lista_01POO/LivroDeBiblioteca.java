package lista_01POO;

public class LivroDeBiblioteca extends Livro{
    private boolean estaEmprestado;
    private String nomeLeitor;
    private String dataDevolucao;

    public LivroDeBiblioteca(String titulo, String autor, String editora, int anoPublicacao, int numeroPaginas) {
        super(titulo, autor, anoPublicacao, numeroPaginas, editora);
        this.estaEmprestado = false;
        this.nomeLeitor = "";
        this.dataDevolucao = "";
    }

    public Boolean estaEmprestado() {
        return estaEmprestado;
    }

    public String getNomeLeitor() {
        return nomeLeitor;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void emprestar(String leitor, String dataDevolucao) {
        if(!estaEmprestado){
            this.estaEmprestado = true;
            this.nomeLeitor = leitor;
            this.dataDevolucao = dataDevolucao;
            System.out.println("Livro : " + getTitulo() + " emprestado para " + leitor);
        } else {
            System.out.println("Erro: Este livro ja foi emprestado para " + nomeLeitor + " !");
        }
    }

    public void devolver(String leitor, String dataDevolucao) {
        if(estaEmprestado) {
            this.estaEmprestado = false;
            this.nomeLeitor = "";
            this.dataDevolucao = "";
            System.out.println("Livro '" + getTitulo() + "' devolvido a biblioteca com Sucesso!");
        } else {
            System.out.println("Aviso: Este livro ja está disponível na biblioteca!");
        }
    }

    public void exibirStatusBiblioteca() {
        exibirInformacao();
        if(estaEmprestado) {
            System.out.println("Status: Emprestado para " + nomeLeitor);
            System.out.println("Data limite para devolução: " + dataDevolucao);
        } else {
            System.out.println("Status: Disponível para emprestimo!");
        }
        System.out.println("___________________________");

    }
}
