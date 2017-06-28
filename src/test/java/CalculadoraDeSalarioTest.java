import model.CalculadoraDeSalario;
import model.Cargo;
import model.Funcionario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadoraDeSalarioTest {

    CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
    double salario;

    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {

        Funcionario desenvolvedor =
                new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);

        salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(1500.0 * 0.9, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioParaDesenvolvedorComSalarioAcimaDoLimite() {

        Funcionario desenvolvedor =
                new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);

        salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

    @Test
    public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {

        Funcionario desenvolvedor =
                new Funcionario("Mauricio", 500.0, Cargo.DBA);

        salario = calculadora.calculaSalario(desenvolvedor);

        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}