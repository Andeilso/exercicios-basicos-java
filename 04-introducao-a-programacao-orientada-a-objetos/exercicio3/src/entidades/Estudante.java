package entidades;

public class Estudante {
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularNotaFinal(){
        return nota1 + nota2 + nota3;
    };

    public void estudanteAprovadoOuReprovado(){
        double notaFinal = calcularNotaFinal();

        System.out.printf("Nota final = %.2f%n", notaFinal);

        if(notaFinal >= 60.0){
            System.out.println("O estudante " + nome + " passou.");
        } else {
            System.out.println("O estudante " + nome + " não passou.");
            System.out.println("Faltaram " + (60.0 - notaFinal) + " pontos para passar.");
        }
    };
}
