package escola.com.br.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import escola.com.br.model.Aluno;
import escola.com.br.model.Eventos;
import escola.com.br.model.NotaDetalhes;
import escola.com.br.model.TurmaOlimpiadas;
import escola.com.br.service.EscolaService;

@RestController
public class EscolaController {

    private final EscolaService escolaService;

    public EscolaController(EscolaService escolaService) {
        this.escolaService = escolaService;
    }

    @GetMapping("/api/v1/eventos")
    public List<Eventos> getEventos() {
        return escolaService.getEventos();
    }

    @GetMapping("/api/v1/notas")
    public List<Aluno> getNotas() {
        return escolaService.getNotas();
    }

    @GetMapping("/api/v1/notasdetalhes")
    public List<NotaDetalhes> getNotasDetalhe(@RequestParam String matricula, @RequestParam String bimestre) {
        return escolaService.getNotasDetalhe(matricula, bimestre);
    }

    @GetMapping("/api/v1/olimpiadas")
    public List<TurmaOlimpiadas> getOlimpiadas() {
        return escolaService.getOlimpiadas();
    }

}
