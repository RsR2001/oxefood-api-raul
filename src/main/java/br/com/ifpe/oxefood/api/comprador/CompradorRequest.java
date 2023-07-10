package br.com.ifpe.oxefood.api.comprador;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.comprador.Comprador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CompradorRequest {

   @NotNull(message = "O Nome é de preenchimento obrigatório")
   @NotBlank(message = "O Nome é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome deverá ter no máximo {max} caracteres")
   private String nome;

   private String enderecoComercial;

   private String enderecoResidencial ;

   private Double comissao;

   private Boolean trabahoHomeOffice ;

   private int qtdComprasMediasMes;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate contratadoEm;

   public Comprador build() {

       return Comprador.builder()
               .nome(nome)
               .enderecoComercial(enderecoComercial)
               .enderecoResidencial(enderecoResidencial)
               .comissao(comissao)
               .trabahoHomeOffice(trabahoHomeOffice)
               .qtdComprasMediasMes(qtdComprasMediasMes)
               .contratadoEm(contratadoEm)
               .build();
   }
}