package com.juliano.smartparkingapi.veiculos.domain;


import com.juliano.smartparkingapi.cliente.domain.ClienteDomain;
import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "veiculos")
public class VeiculosDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteDomain cliente;

    @Column(unique = true, nullable = false)
    private String placa;

    @Column
    private String modelo;

    @Column
    private String cor;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoVeiculo tipo;

}
