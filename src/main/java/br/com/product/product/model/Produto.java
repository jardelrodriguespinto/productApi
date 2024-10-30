package br.com.product.product.model;

import br.com.product.product.enums.Status;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Produto extends BaseEntity
{
    private String nome;
    private int quantidade;
    private BigDecimal preco;
}
