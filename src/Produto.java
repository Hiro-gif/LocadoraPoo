public class Produto {
    private  int codigo;
    private String  descricao;
    private int valorVenda;
    private int valorCusto;
    private boolean promocao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }

    public int getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(int valorCusto) {
        this.valorCusto = valorCusto;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

    public Produto(int codigo, String descricao, int valorVenda, int valorCusto, boolean promocao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }
}
