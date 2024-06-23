public class Candidato {
    private String Nome;

    private double nota;
    public Candidato(String nome, double nota){
        this.Nome= nome;
        this.nota = nota;
    }

    public String getNome() {
        return Nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String toString() {
        return "Candidato{" +
                "Nome='" + Nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
