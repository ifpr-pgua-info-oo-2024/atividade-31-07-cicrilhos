import java.nio.file.SimpleFileVisitor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno extends Pessoa{
    private String nivel;

    public Aluno (String nome, String nascimento, String genero, double altura, double peso,  String nivel) throws ParseException{
        super(nome, nascimento, genero, altura, peso);
        this.nivel = nivel;
    }
    public Aluno(String nome, String nascimento, String nivel) throws ParseException{
        this(nome, nascimento, "", 0, 0, nivel);
      
  
    }

    public String getNivel(){
        return nivel;
    }
    public void setNivel(String nivel){

    }
    @Override
    public String toString() {
        return super.toString() +" nivel ="+nivel;
    }
  
    

    
}
