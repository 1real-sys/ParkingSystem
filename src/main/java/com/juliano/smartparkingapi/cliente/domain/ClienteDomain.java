package com.juliano.smartparkingapi.cliente.domain;

import com.juliano.smartparkingapi.veiculos.domain.VeiculosDomain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.juliano.smartparkingapi.clienteMensalista.domain.ClienteMensalistaDomain;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
// JPA
@Entity
@Table(name = "clientes")

public class ClienteDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String telefone;

    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private ClienteMensalistaDomain clienteMensalista;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<VeiculosDomain> veiculos;

    @PrePersist
    private void prePersist() {
        if (this.dataCadastro == null) {
            this.dataCadastro = LocalDateTime.now();
        }
    }


}
