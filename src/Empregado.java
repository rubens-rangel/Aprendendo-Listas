public class Empregado {
    private String Nome;
    private int Id;
    private double Salario;
    private double porcentagem;

    public Empregado(Integer id, String nome, Double salario) {
        this.Id = Id;
        this.Nome = nome;
        this.Salario = Salario;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getSalario() {
        return Salario;
    }
    public double setSalario() {
        return Salario;
    }

    public void AumentoSalario(double Porcentagem) {
        Salario += Salario * porcentagem/100;
    }


}