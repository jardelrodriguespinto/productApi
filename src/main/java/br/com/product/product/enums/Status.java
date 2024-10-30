package br.com.product.product.enums;

public enum Status
{
    NOVO("Novo"),
    EM_PROCESSAMENTO("Em processamento"),
    CONCLUIDO("Concluído");

    private String descricao;

    Status(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return this.descricao;
    }
}
