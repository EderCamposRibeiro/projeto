package br.cnj.projeto.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_processo")
@Data
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_processo")
    private Long idProcesso;

    @Column(name = "nr_prcesso")
    private String numeroPrcesso;

    @Column(name = "nr_processo_origem")
    private String numeroProcessoOrigem;

    @Column(name = "ds_complemento")
    private String Complemento;

    @Column(name = "dt_inicio")
    private LocalDateTime dataInicio;

    @Column(name = "id_jppm")
    private Long idJppm;

    @Column(name = "dt_fim")
    private LocalDateTime dataFim;

    @Column(name = "nr_duracao")
    private Integer duracao;

    @Column(name = "mm_actor_id")
    private Long mmActorId;

    @Column(name = "ds_mm_usu_cadastro_processo")
    private String usuarioCadastro;

    @Column(name = "id_pk_tb_processo_pg")
    private Long idPkTbProcessoPg;

    @Column(name = "id_sessao_pg")
    private Long idSessaoPg;

    @Column(name = "nr_processo_temp")
    private Long numeroProcessoTemp;

}
