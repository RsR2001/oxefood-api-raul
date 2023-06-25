package br.com.ifpe.oxefood.api.cliente;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

   private String nome;

   private String cpf;
   
   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;
   
   private String foneCelular;

   private String foneFixo;

   public Cliente build() {

       return Cliente.builder()
               .nome(nome)
               .cpf(cpf)
               .dataNascimento(dataNascimento)
               .foneCelular(foneCelular)
               .foneFixo(foneFixo)
               .build();
   }
}
