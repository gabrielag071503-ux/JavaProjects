package lista_01POO;

public class LivroDeLivraria extends Livro{
     private double preco;
     private int quantidadeEstoque;

     public LivroDeLivraria(String titulo, String autor, String editora,
                            int anoPublicacao, int numeroPaginas,int quantidadeEstoque, int preco) {
        super(titulo, autor, anoPublicacao, numeroPaginas, editora);
         this.preco = preco;
         this.quantidadeEstoque = quantidadeEstoque;
     }

     public double getPreco() {
         return preco;
     }

     public void setPreco(double preco) {
         this.preco = preco;
     }

     public int getQuantidadeEstoque() {
         return quantidadeEstoque;
     }

     public void setQuantidadeEstoque(int quantidadeEstoque) {
         this.quantidadeEstoque = quantidadeEstoque;
     }

     public void venderExemplar() {
         if (quantidadeEstoque > 0) {
             quantidadeEstoque--;
             System.out.println("Venda realizada com sucesso!Restam " +  quantidadeEstoque + " unidades em estoque");
         } else {
             System.out.println("Não existe unidades do produto em Estoque!");
         }
     }

     public void exibirEtiquetaVenda() {
         exibirInformacao();
         System.out.printf("Preço de venda: R$ %.2f%n ", preco);
         System.out.println("Restam " + quantidadeEstoque + " unidades em estoque");
         System.out.println("_________________________________");
     }







}
