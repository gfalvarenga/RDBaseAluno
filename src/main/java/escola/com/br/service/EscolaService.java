package escola.com.br.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import escola.com.br.model.Aluno;
import escola.com.br.model.Eventos;
import escola.com.br.model.Materia;
import escola.com.br.model.NotaDetalhes;
import escola.com.br.model.PontosOlimpiadasMes;
import escola.com.br.model.TurmaOlimpiadas;

@Service
public class EscolaService {

    private List<Eventos> eventosList;
    private List<Aluno> alunoList;
    private List<TurmaOlimpiadas> turmaOlimpiada;
    private Map<String, List<String>> mapaNota = new HashMap<>();

    public EscolaService() {

        eventosList = new ArrayList<>();
        alunoList = new ArrayList<>();
        turmaOlimpiada = new ArrayList<>();

        List<PontosOlimpiadasMes> pontosA = new ArrayList<>();
        pontosA.add(new PontosOlimpiadasMes("01", "0"));
        pontosA.add(new PontosOlimpiadasMes("02", "8"));
        pontosA.add(new PontosOlimpiadasMes("03", "12"));
        pontosA.add(new PontosOlimpiadasMes("04", "7"));
        pontosA.add(new PontosOlimpiadasMes("05", "7"));
        pontosA.add(new PontosOlimpiadasMes("06", "14"));
        pontosA.add(new PontosOlimpiadasMes("07", "6"));
        pontosA.add(new PontosOlimpiadasMes("08", "4"));
        pontosA.add(new PontosOlimpiadasMes("09", "11"));
        pontosA.add(new PontosOlimpiadasMes("10", "9"));
        pontosA.add(new PontosOlimpiadasMes("11", "17"));
        pontosA.add(new PontosOlimpiadasMes("12", "0"));

        List<PontosOlimpiadasMes> pontosB = new ArrayList<>();
        pontosB.add(new PontosOlimpiadasMes("01", "0"));
        pontosB.add(new PontosOlimpiadasMes("02", "6"));
        pontosB.add(new PontosOlimpiadasMes("03", "8"));
        pontosB.add(new PontosOlimpiadasMes("04", "4"));
        pontosB.add(new PontosOlimpiadasMes("05", "7"));
        pontosB.add(new PontosOlimpiadasMes("06", "10"));
        pontosB.add(new PontosOlimpiadasMes("07", "6"));
        pontosB.add(new PontosOlimpiadasMes("08", "20"));
        pontosB.add(new PontosOlimpiadasMes("09", "15"));
        pontosB.add(new PontosOlimpiadasMes("10", "23"));
        pontosB.add(new PontosOlimpiadasMes("11", "12"));
        pontosB.add(new PontosOlimpiadasMes("12", "0"));

        List<PontosOlimpiadasMes> pontosC = new ArrayList<>();
        pontosC.add(new PontosOlimpiadasMes("01", "0"));
        pontosC.add(new PontosOlimpiadasMes("02", "5"));
        pontosC.add(new PontosOlimpiadasMes("03", "10"));
        pontosC.add(new PontosOlimpiadasMes("04", "15"));
        pontosC.add(new PontosOlimpiadasMes("05", "5"));
        pontosC.add(new PontosOlimpiadasMes("06", "10"));
        pontosC.add(new PontosOlimpiadasMes("07", "5"));
        pontosC.add(new PontosOlimpiadasMes("08", "10"));
        pontosC.add(new PontosOlimpiadasMes("09", "15"));
        pontosC.add(new PontosOlimpiadasMes("10", "10"));
        pontosC.add(new PontosOlimpiadasMes("11", "15"));
        pontosC.add(new PontosOlimpiadasMes("12", "0"));

        TurmaOlimpiadas turmaA = new TurmaOlimpiadas();
        turmaA.setTurma("A");
        turmaA.setPontosMes(pontosA);

        TurmaOlimpiadas turmaB = new TurmaOlimpiadas();
        turmaB.setTurma("B");
        turmaB.setPontosMes(pontosB);

        TurmaOlimpiadas turmaC = new TurmaOlimpiadas();
        turmaC.setTurma("C");
        turmaC.setPontosMes(pontosC);

        turmaOlimpiada.add(turmaA);
        turmaOlimpiada.add(turmaB);
        turmaOlimpiada.add(turmaC);

        List<String> nota0 = new ArrayList<>();
        nota0.add("0");
        nota0.add("0");
        nota0.add("0");
        mapaNota.put("0", nota0);

        List<String> nota10 = new ArrayList<>();
        nota10.add("20");
        nota10.add("0");
        nota10.add("10");
        mapaNota.put("10", nota10);

        List<String> nota20 = new ArrayList<>();
        nota20.add("30");
        nota20.add("10");
        nota20.add("20");
        mapaNota.put("20", nota20);

        List<String> nota30 = new ArrayList<>();
        nota30.add("20");
        nota30.add("40");
        nota30.add("30");
        mapaNota.put("30", nota30);

        List<String> nota40 = new ArrayList<>();
        nota40.add("60");
        nota40.add("20");
        nota40.add("40");
        mapaNota.put("40", nota40);

        List<String> nota50 = new ArrayList<>();
        nota50.add("70");
        nota50.add("30");
        nota50.add("50");
        mapaNota.put("50", nota50);

        List<String> nota60 = new ArrayList<>();
        nota60.add("60");
        nota60.add("40");
        nota60.add("100");
        mapaNota.put("60", nota60);

        List<String> nota70 = new ArrayList<>();
        nota70.add("70");
        nota70.add("80");
        nota70.add("50");
        mapaNota.put("70", nota70);

        List<String> nota80 = new ArrayList<>();
        nota80.add("60");
        nota80.add("100");
        nota80.add("80");
        mapaNota.put("80", nota80);

        List<String> nota90 = new ArrayList<>();
        nota90.add("95");
        nota90.add("80");
        nota90.add("100");
        mapaNota.put("90", nota90);

        List<String> nota100 = new ArrayList<>();
        nota100.add("100");
        nota100.add("100");
        nota100.add("100");
        mapaNota.put("100", nota100);

        List<String> nota65 = new ArrayList<>();
        nota65.add("60");
        nota65.add("70");
        nota65.add("65");
        mapaNota.put("65", nota65);

        List<String> nota75 = new ArrayList<>();
        nota75.add("95");
        nota75.add("55");
        nota75.add("75");
        mapaNota.put("75", nota75);

        List<String> nota85 = new ArrayList<>();
        nota85.add("90");
        nota85.add("80");
        nota85.add("85");
        mapaNota.put("85", nota85);

        List<Materia> materiaList1 = new ArrayList<>();
        materiaList1.add(new Materia("Portugues", "POR", "80", "60", "70", "65"));
        materiaList1.add(new Materia("Matematica", "MAT", "80", "70", "90", "85"));
        materiaList1.add(new Materia("Ciencia", "CIN", "60", "60", "80", "50"));
        materiaList1.add(new Materia("Geografia", "GEO", "70", "40", "60", "80"));
        Aluno aluno1 = new Aluno("157236", "Ana Teresa", materiaList1, "A");

        List<Materia> materiaList2 = new ArrayList<>();
        materiaList2.add(new Materia("Portugues", "POR", "50", "40", "75", "60"));
        materiaList2.add(new Materia("Matematica", "MAT", "90", "75", "80", "75"));
        materiaList2.add(new Materia("Ciencia", "CIN", "70", "50", "80", "60"));
        materiaList2.add(new Materia("Geografia", "GEO", "40", "30", "60", "70"));
        Aluno aluno2 = new Aluno("157354", "Alan Cerqueira", materiaList2, "A");

        List<Materia> materiaList3 = new ArrayList<>();
        materiaList3.add(new Materia("Portugues", "POR", "60", "50", "80", "70"));
        materiaList3.add(new Materia("Matematica", "MAT", "70", "70", "60", "70"));
        materiaList3.add(new Materia("Ciencia", "CIN", "60", "50", "80", "50"));
        materiaList3.add(new Materia("Geografia", "GEO", "60", "70", "40", "65"));
        Aluno aluno3 = new Aluno("157823", "Bernardo Brito", materiaList3, "A");

        List<Materia> materiaList4 = new ArrayList<>();
        materiaList4.add(new Materia("Portugues", "POR", "80", "30", "60", "20"));
        materiaList4.add(new Materia("Matematica", "MAT", "80", "70", "60", "50"));
        materiaList4.add(new Materia("Ciencia", "CIN", "60", "60", "60", "50"));
        materiaList4.add(new Materia("Geografia", "GEO", "50", "50", "40", "80"));
        Aluno aluno4 = new Aluno("158232", "Bernardo Brito", materiaList4, "A");

        List<Materia> materiaList5 = new ArrayList<>();
        materiaList5.add(new Materia("Portugues", "POR", "80", "80", "70", "65"));
        materiaList5.add(new Materia("Matematica", "MAT", "80", "100", "90", "85"));
        materiaList5.add(new Materia("Ciencia", "CIN", "60", "60", "80", "50"));
        materiaList5.add(new Materia("Geografia", "GEO", "70", "90", "60", "80"));
        Aluno aluno5 = new Aluno("158650", "Camila Alves", materiaList5, "B");

        List<Materia> materiaList6 = new ArrayList<>();
        materiaList6.add(new Materia("Portugues", "POR", "60", "50", "80", "70"));
        materiaList6.add(new Materia("Matematica", "MAT", "80", "70", "60", "50"));
        materiaList6.add(new Materia("Ciencia", "CIN", "70", "50", "50", "50"));
        materiaList6.add(new Materia("Geografia", "GEO", "70", "40", "60", "80"));
        Aluno aluno6 = new Aluno("159320", "Daniela Fram", materiaList6, "B");

        List<Materia> materiaList7 = new ArrayList<>();
        materiaList7.add(new Materia("Portugues", "POR", "40", "60", "20", "80"));
        materiaList7.add(new Materia("Matematica", "MAT", "90", "90", "100", "40"));
        materiaList7.add(new Materia("Ciencia", "CIN", "60", "70", "70", "50"));
        materiaList7.add(new Materia("Geografia", "GEO", "60", "70", "30", "50"));
        Aluno aluno7 = new Aluno("159651", "Emanuela Roger", materiaList7, "B");

        List<Materia> materiaList8 = new ArrayList<>();
        materiaList8.add(new Materia("Portugues", "POR", "20", "40", "60", "60"));
        materiaList8.add(new Materia("Matematica", "MAT", "60", "70", "80", "50"));
        materiaList8.add(new Materia("Ciencia", "CIN", "60", "70", "60", "60"));
        materiaList8.add(new Materia("Geografia", "GEO", "60", "50", "40", "50"));
        Aluno aluno8 = new Aluno("159851", "Flavia Cunha", materiaList8, "B");

        List<Materia> materiaList9 = new ArrayList<>();
        materiaList9.add(new Materia("Portugues", "POR", "50", "40", "70", "60"));
        materiaList9.add(new Materia("Matematica", "MAT", "90", "70", "60", "70"));
        materiaList9.add(new Materia("Ciencia", "CIN", "70", "50", "80", "60"));
        materiaList9.add(new Materia("Geografia", "GEO", "40", "30", "60", "70"));
        Aluno aluno9 = new Aluno("160243", "Gustavo Mota", materiaList9, "C");

        List<Materia> materiaList10 = new ArrayList<>();
        materiaList10.add(new Materia("Portugues", "POR", "80", "50", "60", "20"));
        materiaList10.add(new Materia("Matematica", "MAT", "80", "30", "60", "50"));
        materiaList10.add(new Materia("Ciencia", "CIN", "60", "40", "60", "50"));
        materiaList10.add(new Materia("Geografia", "GEO", "50", "60", "40", "80"));
        Aluno aluno10 = new Aluno("160443", "Maria Clara", materiaList10, "C");

        List<Materia> materiaList11 = new ArrayList<>();
        materiaList11.add(new Materia("Portugues", "POR", "80", "60", "70", "40"));
        materiaList11.add(new Materia("Matematica", "MAT", "10", "30", "30", "40"));
        materiaList11.add(new Materia("Ciencia", "CIN", "30", "40", "60", "60"));
        materiaList11.add(new Materia("Geografia", "GEO", "60", "60", "60", "60"));
        Aluno aluno11 = new Aluno("162030", "Patricia Mulan", materiaList11, "C");

        List<Materia> materiaList12 = new ArrayList<>();
        materiaList12.add(new Materia("Portugues", "POR", "70", "70", "70", "70"));
        materiaList12.add(new Materia("Matematica", "MAT", "70", "70", "70", "70"));
        materiaList12.add(new Materia("Ciencia", "CIN", "70", "70", "70", "70"));
        materiaList12.add(new Materia("Geografia", "GEO", "100", "100", "100", "100"));
        Aluno aluno12 = new Aluno("165231", "Silvia Alves", materiaList12, "C");

        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);
        alunoList.add(aluno4);
        alunoList.add(aluno5);
        alunoList.add(aluno6);
        alunoList.add(aluno7);
        alunoList.add(aluno8);
        alunoList.add(aluno9);
        alunoList.add(aluno10);
        alunoList.add(aluno11);
        alunoList.add(aluno12);

        Eventos evento1 = new Eventos("primeiro", "05/02", "Inicio das aulas");
        Eventos evento2 = new Eventos("primeiro", "20/03", "Festa da primavera");
        Eventos evento3 = new Eventos("primeiro", "28/03", "Apresentacao de Pascoa");
        Eventos evento4 = new Eventos("segundo", "15/04", "Concelho de classe");
        Eventos evento5 = new Eventos("segundo", "23/04", "Aniversario do colegio");
        Eventos evento6 = new Eventos("segundo", "10/05", "Visita das maes");
        Eventos evento7 = new Eventos("segundo", "20/06", "Festa Junina");
        Eventos evento8 = new Eventos("segundo", "01/07", "Inicio das Ferias");
        Eventos evento9 = new Eventos("terceiro", "15/07", "Volta as aulas");
        Eventos evento10 = new Eventos("terceiro", "10/08", "Visita dos pais");
        Eventos evento11 = new Eventos("terceiro", "07/09", "Festa da Independencia");
        Eventos evento12 = new Eventos("quarto", "20/09", "Dia da leitura");
        Eventos evento13 = new Eventos("quarto", "12/10", "Dia da leitura");
        Eventos evento14 = new Eventos("quarto", "15/11", "Visita ao forte");
        Eventos evento15 = new Eventos("quarto", "02/12", "Inicio das ferias");

        eventosList.add(evento1);
        eventosList.add(evento5);
        eventosList.add(evento10);
        eventosList.add(evento14);
        eventosList.add(evento6);
        eventosList.add(evento7);
        eventosList.add(evento2);
        eventosList.add(evento3);
        eventosList.add(evento9);
        eventosList.add(evento11);
        eventosList.add(evento12);
        eventosList.add(evento4);
        eventosList.add(evento8);
        eventosList.add(evento13);
        eventosList.add(evento15);

    }

    public List<Eventos> getEventos() {
        return eventosList;
    }

    public List<Aluno> getNotas() {
        return alunoList;
    }

    public List<NotaDetalhes> getNotasDetalhe(String matricula, String bimestre) {
        List<NotaDetalhes> result = new ArrayList<>();
        if (matricula == null || bimestre == null) {
            return result;
        }

        matricula = matricula.trim();
        Aluno alunoAtual = null;
        for (Aluno aluno : alunoList) {
            if (matricula.equals(aluno.getMatricula())) {
                alunoAtual = aluno;
            }
        }

        if (alunoAtual == null) {
            return result;
        }

        for (Materia mat : alunoAtual.getNotas()) {
            NotaDetalhes nota = new NotaDetalhes();
            List<String> notas = null;
            nota.setCodigoMateiria(mat.getCodigoMateiria());
            nota.setMateria(mat.getMateria());
            if (bimestre.equalsIgnoreCase("primeiro")) {
                notas = mapaNota.get(mat.getPrimeiro());
            } else if (bimestre.equalsIgnoreCase("segundo")) {
                notas = mapaNota.get(mat.getSegundo());
            } else if (bimestre.equalsIgnoreCase("terceiro")) {
                notas = mapaNota.get(mat.getTerceiro());
            } else if (bimestre.equalsIgnoreCase("quarto")) {
                notas = mapaNota.get(mat.getQuarto());
            }
            if (notas != null) {
                nota.setProva1(notas.get(0));
                nota.setProva2(notas.get(1));
                nota.setConselho(notas.get(2));
                result.add(nota);
            }
        }

        return result;
    }

    public List<TurmaOlimpiadas> getOlimpiadas() {
        return turmaOlimpiada;
    }

}
