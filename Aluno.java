import java.nio.file.SimpleFileVisitor;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
    private String nome;
    private String nivel;
    private Date nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno(String nome, String nivel, Date nascimento, String genero, double altura, double peso){
        this.nome = nome;
        this.nivel = nivel;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }
    public Aluno(String nome, String nivel, Date nascimento){
        this(nome, nivel, nascimento, "",0,0);
      
  
    }

    public String getNome(){
        return nome;
    }
    public String getNivel(){
        return nivel;
    }
    public Date getNascimento(){
        return nascimento;
    }
    public String getGenero(){
        return genero;
    }
    public double getAltura(){
        return altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNivel(String nivel){

    }
    public void setNascimento(Date nascimento){

    }
    public void setGenero(String genero){

    }
    public void setAltura(double altura){

    }
    public void setPeso(double peso){

    }

    @Override
    public String toString() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Aluno [nome=" + nome + ", nivel=" + nivel + ", nascimento=" + nascimento + ", genero=" + genero
                + ", altura=" + altura + ", peso=" + peso + "]";
    }

    


}
