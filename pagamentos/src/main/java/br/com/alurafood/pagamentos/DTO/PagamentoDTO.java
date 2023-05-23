package br.com.alurafood.pagamentos.DTO;

import br.com.alurafood.pagamentos.model.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record PagamentoDTO(Long id,BigDecimal valor,String nome,String numero,String expiracao,String codigo,Status status,Long pedidoId,
        Long formaDePagamentoId
) {
}
