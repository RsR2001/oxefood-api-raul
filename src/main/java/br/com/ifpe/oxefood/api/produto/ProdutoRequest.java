package br.com.ifpe.oxefood.api.produto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.ifpe.oxefood.modelo.produto.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoRequest {

   private Long idCategoria;

   @NotNull(message = "O Codigo de preenchimento obrigatório")
   @NotBlank(message = "O Codigo de preenchimento obrigatório")
   private String codigo;

   @NotNull(message = "O titulo é de preenchimento obrigatório")
   @NotBlank(message = "O titulo é de preenchimento obrigatório")
   @Length(max = 100, message = "O titulo deverá ter no máximo {max} caracteres")
   private String titulo;

   private String descricao;

   private Double valorUnitario;

   private Integer tempoEntregaMinimo;

   private Integer tempoEntregaMaximo;

   public Produto build() {

      return Produto.builder()
            .codigo(codigo)
            .titulo(titulo)
            .descricao(descricao)
            .valorUnitario(valorUnitario)
            .tempoEntregaMinimo(tempoEntregaMinimo)
            .tempoEntregaMaximo(tempoEntregaMaximo)
            .build();
   }
}