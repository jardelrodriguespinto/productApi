package br.com.product.product.model;

import br.com.product.product.enums.Status;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class Pedido extends BaseEntity
{
    private Status status;
    private List<Produto> itens;
    private BigDecimal valorTotal;
}
