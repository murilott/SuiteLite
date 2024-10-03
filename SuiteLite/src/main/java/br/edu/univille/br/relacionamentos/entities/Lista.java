package br.edu.univille.br.relacionamentos.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Lista {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "criador_id")
    private Pessoa criador;
    
    @OneToMany
    @JoinColumn(name = "lista_id")
    private List<Musica> musicas;

    private long curtidas;
}
