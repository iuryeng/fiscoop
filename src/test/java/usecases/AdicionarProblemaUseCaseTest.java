package usecases;


import cooperar.domain.entites.Obra;
import cooperar.domain.entites.Problema;
import cooperar.domain.usercases.interfaces.AdicionarProblemaUseCase;
import cooperar.domain.usercases.services.AdicionarProblemaUseCaseImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AdicionarProblemaUseCaseTest {
    private AdicionarProblemaUseCase adicionarProblemaUseCase;
    private Obra obra;

    @BeforeEach
    public void setUp() {
        obra = new Obra("1");
        adicionarProblemaUseCase = new AdicionarProblemaUseCaseImpl(obra);
    }

    @Test
    public void adicionarProblema_DeveAdicionarProblemaNaObra() {
        Problema problema = new Problema("Descrição do problema", new Date(), "Alta", "Ação corretiva");

        adicionarProblemaUseCase.execute(problema);

        Assertions.assertEquals(1, obra.getProblemas().size());
        Assertions.assertEquals(problema, obra.getProblemas().get(0));
    }

    @Test
    public void adicionarProblema_ComProblemaNulo_NaoDeveAdicionarProblema() {
        adicionarProblemaUseCase.execute(null);

        Assertions.assertTrue(obra.getProblemas().isEmpty());
    }
}
