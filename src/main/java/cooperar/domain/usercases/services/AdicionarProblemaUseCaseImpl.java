package cooperar.domain.usercases.services;

import cooperar.domain.entites.Obra;
import cooperar.domain.entites.Problema;
import cooperar.domain.usercases.interfaces.AdicionarProblemaUseCase;

public class AdicionarProblemaUseCaseImpl implements AdicionarProblemaUseCase {
    private Obra obra;

    public AdicionarProblemaUseCaseImpl(Obra obra) {
        this.obra = obra;
    }

    public void execute(Problema problema) {
        if (problema != null) {
            obra.adicionarProblema(problema);
        }
    }

}
