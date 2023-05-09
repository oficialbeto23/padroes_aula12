import com.manoelcampos.modelo.Paciente;

public class Principal {
    public static void main(String[] args) {
        var paciente =
                Paciente.builder()
                .nome("Manoel")
                .sexo('M')
                .peso(80)
                .cidade("Palmas")
                .uf("TO")
                .cpf("99999999999")
                .build();
        System.out.println(paciente);


    }
}
