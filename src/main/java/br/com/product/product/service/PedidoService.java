package br.com.product.product.service;

import br.com.product.product.model.Pedido;
import br.com.product.product.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> findAll() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> findById(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido save(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public Pedido update(Long id, Pedido pedidoDetails) {
        return pedidoRepository.findById(id).map(pedido -> {
            pedido.setItens(pedidoDetails.getItens());
            pedido.setStatus(pedidoDetails.getStatus());
            pedido.setValorTotal(pedidoDetails.getValorTotal());
            return pedidoRepository.save(pedido);
        }).orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public void deleteById(Long id) {
        pedidoRepository.deleteById(id);
    }
}
