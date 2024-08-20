public class Main {
    public static void main (String[] args) {
        Cursos curso1 = new Cursos();
        cursos1.modalidade = "Presencial";
        curso1.periodos = 4;
        curso1.turno = "noturno";
        curso1.nome = "Téc. Enfermagem";  

        Cursos curso2 = new Cursos("Presencial", 2, "noturno", "Téc. Enfermagem")
        System.out.println(curso2.modalidade + curso2.periodos + curso2.turno + curso2.nome);
    }
}