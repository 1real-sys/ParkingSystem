package com.juliano.smartparkingapi.clienteMensalista.domain;


import com.juliano.smartparkingapi.cliente.domain.ClienteDomain;
import com.juliano.smartparkingapi.veiculos.domain.VeiculosDomain;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes_mensalistas")
public class ClienteMensalistaDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false, unique = true)
    private ClienteDomain cliente;

    @Column(name = "modelo_veiculo")
    private String modeloVeiculo;

    @Column(name = "valor_mensalidade", nullable = false)
    private BigDecimal valorMensalidade;

    @Column(name = "dia_vencimento", nullable = false)
    private Integer diaVencimento;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = true;


    @PrePersist
    private void prePersist() {
        if (this.ativo == null) {
            this.ativo = true;
        }
    }
}
