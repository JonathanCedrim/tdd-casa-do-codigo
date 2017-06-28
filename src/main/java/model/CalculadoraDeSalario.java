package model;

public class CalculadoraDeSalario {
    public double calculaSalario(Funcionario funcionario) {

        if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)) {
            if (funcionario.getSalario() > 3000) {
                return funcionario.getSalario() * 0.8;
            }
            return funcionario.getSalario() * 0.9;
        }

        if(funcionario.getSalario() > 2500.0) {
            return funcionario.getSalario() * 0.75;
        }
        return funcionario.getSalario() * 0.85;
    }
}
