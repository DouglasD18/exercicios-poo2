package ordenacao;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class Pessoa implements Comparable {

    private String nome;

    private LocalDate dataDeNascimento;

    public Pessoa(String nome, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", idade=" + getIdade() + " anos" +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return Period.between(dataDeNascimento, LocalDate.now()).getYears();
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    @Override
    public int compareTo(Object pessoa) {
        if (pessoa instanceof Pessoa) {
            Comparator<Pessoa> comparatorPessoaPorIdadeENome = Comparator.comparing(Pessoa::getIdade)
                    .thenComparing(Pessoa::getNome);
            return comparatorPessoaPorIdadeENome.compare(this, (Pessoa) pessoa);
        }

        return 0;
    }
}
