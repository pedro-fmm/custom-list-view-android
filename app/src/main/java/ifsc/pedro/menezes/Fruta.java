package ifsc.pedro.menezes;

import java.math.BigDecimal;

public class Fruta {

    private String nome, descricao;
    private int imagem, codigo;
    private double preco;

    public Fruta(String nome, String descricao, int imagem, double preco, int codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.imagem = imagem;
        this.preco = preco;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}