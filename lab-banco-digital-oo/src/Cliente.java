import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {

	private String nome;
    private String cpf;
    private String telefone;
    private String endereco;


}
