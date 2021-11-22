public class Venda {
    private  Produto produto;

    private int desconto;
    private int quantidadedeitens;
    private int valor;

    public void efetuarDesconto(int percent_desc) {
       int desconto =produto.getValorVenda() * 100 / percent_desc ;
        int valor_com_desconto =produto.getValorVenda()  - desconto  ;
        if (produto.getValorCusto()>valor_com_desconto){
            this.valor=valor_com_desconto;
      }}
    public void calcularValor() {
            int seila= produto.getValorVenda() * quantidadedeitens / desconto;
            this.valor=seila;
        }
    public void imprimir(){
        System.out.println("quantidade de itens: "+this.getQuantidadedeitens());
        System.out.println("codigo do produto: "+this.produto.getCodigo());
        System.out.println("descricao: "+this.produto.getDescricao());
        System.out.println("valor de venda: "+this.produto.getValorVenda());
        System.out.println("promocao: "+this.produto.isPromocao());
        System.out.println("desconto: "+this.desconto);
        System.out.println("valor: "+this.valor);
        }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }



    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadedeitens() {
        return quantidadedeitens;
    }

    public void setQuantidadedeitens(int quantidadedeitens) {
        this.quantidadedeitens = quantidadedeitens;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Venda(Produto produto, int desconto, int quantidadedeitens) {
        this.produto = produto;
        this.desconto = desconto;
        this.quantidadedeitens = quantidadedeitens;
    }
}
