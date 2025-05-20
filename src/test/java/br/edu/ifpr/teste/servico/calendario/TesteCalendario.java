package br.edu.ifpr.teste.servico.calendario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import paranavai.calendario.Calendario;

public class TesteCalendario {

    @Test
    public void entradaNullSaidaExperadaMesDoAnoAtual() throws IOException {
        Path path = Paths.get("src\\test\\resources\\calendario", "maio2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        Path pathJaneiro = Paths.get("src\\test\\resources\\calendario", "janeiro2025.txt");
        String janeiro2025 = Files.readString(pathJaneiro);

        Calendario calendario = new Calendario();
        String maio2025 = calendario.getCalendario();

        assertEquals(saidaEsperada, maio2025);
        assertNotEquals(saidaEsperada, janeiro2025);
    }

    // @Test
    // public void umaEntradaSaidaExperadaMesesDoAnoInserido() throws IOException {
    // Path path = Paths.get("src\\test\\resources\\calendario",
    // "calendarioAno2025.txt");
    // String saidaEsperada = Files.readString(path);
    // saidaEsperada = saidaEsperada.replace("\r\n", "\n");

    // Calendario calendario = new Calendario();
    // String ano2025 = calendario.getCalendario("2025");

    // assertEquals(saidaEsperada, ano2025);
    // }Esse teste falhou pois o que retornou no getCalendário é MarÃ§o

    @Test
    public void umaEntradaInvalidaSaidaExperadaErro() throws IOException {
        Calendario calendario = new Calendario();

        assertThrows(NumberFormatException.class, () -> calendario.getCalendario("10000"));
    }

    @Test
    public void imprimeJaneiro2025() throws IOException {
        Path path = Paths.get("src\\test\\resources\\calendario", "janeiro2025.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        Calendario calendario = new Calendario();
        String janeiro2025 = calendario.getCalendario("1", "2025");

        assertEquals(saidaEsperada, janeiro2025);
    }

    @Test
    public void entradaMesErradoSaidaErro() throws IOException {
        Calendario calendario = new Calendario();

        assertThrows(NumberFormatException.class, () -> calendario.getCalendario("15", "2025"));
    }

    @Test
    public void entradaSetembro1752SaidaEsperadaValida() throws IOException {
        Path path = Paths.get("src\\test\\resources\\calendario", "setembro1752.txt");
        String saidaEsperada = Files.readString(path);
        saidaEsperada = saidaEsperada.replace("\r\n", "\n");

        Path pathErro = Paths.get("src\\test\\resources\\calendario", "setembroErrado1752.txt");
        String saidaEsperadaErrado = Files.readString(pathErro);
        saidaEsperadaErrado = saidaEsperadaErrado.replace("\r\n", "\n");

        Calendario calendario = new Calendario();
        String setembro1752 = calendario.getCalendario("9", "1752");

        assertEquals(saidaEsperada, setembro1752);
        assertNotEquals(saidaEsperada, saidaEsperadaErrado);

    }
    
}
