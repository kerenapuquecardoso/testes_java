package br.edu.ifpr.teste.servico.irpf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import imposto.renda.SimuladorImpostoRenda;

public class TesteSimuladorImpostoRenda {

    @Test
    public void entradaMenor() {
        double entrada = 150.23;
        double reultado = SimuladorImpostoRenda.calcularImposto(entrada);

        assertEquals(0, reultado);
    }

    @Test
    public void entradaComAliquotaEmSeteEMeio() throws IOException {
       double entrada = 2826.65;
        double reultado = SimuladorImpostoRenda.calcularImposto(entrada);

        assertEquals(69.20025, reultado);
        assertNotEquals(69.19, reultado);
    }

    @Test
    public void entradaComAliquotaEmQuinze() throws IOException {
       double entrada = 3000.00;
        double reultado = SimuladorImpostoRenda.calcularImposto(entrada);

        assertNotEquals(95.20, reultado);
        assertEquals(95.20249999999999, reultado);
    }

    @Test
    public void entradaComAliquotaEmVinteDoisEMeio() throws IOException {
       double entrada = 3751.06;
        double reultado = SimuladorImpostoRenda.calcularImposto(entrada);

        assertEquals(207.86, reultado);
    }

    @Test
    public void entradaComAliquotaEmVinteSeteEMeio() throws IOException {
       double entrada = 7000.00;
        double reultado = SimuladorImpostoRenda.calcularImposto(entrada);
        
        assertNotEquals(1055.64, reultado);
        assertEquals(1055.633, reultado);
    }
}
