package jdbc;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Pessoa {

    private int codigo;
    private String nome;

}
