import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException{
    
            Academia academia1 = new Academia("Joca Academy", "Rua caju, 288", "+55 (41)98843-7655");
            Academia academia2 = new Academia("Tony Academy", "Rua Caja", "+55 (41)98876-6778");


            System.out.println(academia1.getNome()+ " - " +academia1.getEndereco()+ " - "+ academia1.getTelefone());
            System.out.println(academia2.getNome()+ " - " +academia2.getEndereco()+ " - "+ academia2.getTelefone());

            academia1.setNome("Geleia ");
            academia1.setEndereco("Rua paris");
            academia1.setTelefone("+55 (41)98877-9887 ");

            academia2.setNome("Diacho ");
            academia2.setEndereco("Rua franca ");
            academia2.setTelefone("+55 (41)98876-8776");

            System.out.println(academia1.getNome()+ " - " +academia1.getEndereco()+ " - "+ academia1.getTelefone());
            System.out.println(academia2.getNome()+ " - " +academia2.getEndereco()+ " - "+ academia2.getTelefone());

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            Date data1 = formato.parse ("23/11/2003");
            Date data2 = formato.parse ("06/06/1973");
            Date data3 = formato.parse("28/01/2008");
            Date data4 = formato.parse("05/10/2009");
            Date data5 = formato.parse("25/12/2007");
            Date data6 = formato.parse("29/02/2006");

            academia1.alunos.add(new Aluno("Miguel","iniciante", data1,"homem", 1.80, 59.5));
            academia1.alunos.add(new Aluno("Tony","intermediario", data2,"homem",1.69, 60.0));
            academia1.alunos.add(new Aluno("Gabriel","Lindo", data3, "gostoso",1.70, 55.4));

            academia2.alunos.add(new Aluno("Roblox","Marombeiro", data4, "sigma", 1.90, 100.0));
            academia2.alunos.add(new Aluno("Rhuan","Frango", data5, "beta", 1.76, 80.0));
            academia2.alunos.add(new Aluno("Joca","Monstro", data6, "Nerd", 1.65, 70.0));

            for(Aluno aluno : academia1.getAluno()){
                System.out.println(aluno.toString());
            }
            for(Aluno aluno : academia2.getAluno()){
                System.out.println(aluno.toString());
            }
    }
}
