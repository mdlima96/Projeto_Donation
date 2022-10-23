package com.projectspring.itemdonation.models;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TB_REQUISICAO")
public class RequisicaoModel implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(nullable = false)
    private UUID pessoaId;
    @Column(nullable = false)
    private Integer intencaoId;
    @Column(nullable = false)
    private boolean isStatus;
}
