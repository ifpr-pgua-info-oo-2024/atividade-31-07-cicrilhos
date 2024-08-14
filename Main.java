import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

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

            Date nascimento = convertStringToDate("13/08/1998");
            Date secondDate = new Date();

            long diffInMillies = Math.abs(secondDate.getTime() - nascimento.getTime());
            long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

            academia1.alunos.add(new Aluno("Miguel","23/12/2003","homem",1.80,56.7 , "intermediario"));
            academia1.alunos.add(new Aluno("Tony","06/06/1973" ,"homem", 1.69, 60.0,"intermediario"));
            academia1.alunos.add(new Aluno("Gabriel","28/01/2008","lindo",1.70, 55.4, "incrivel"));

            academia2.alunos.add(new Aluno("Roblox","05/03/1977","sigma" , 1.90, 100.0, "Incrivel"));
            academia2.alunos.add(new Aluno("Rhuan","18/05/2007", "Homem", 1.76, 80.0, "beta"));
            academia2.alunos.add(new Aluno("Joca","15/11/2008", "Homem", 1.65, 70.0, "Troglodita"));

            for(Aluno aluno : academia1.getAluno()){
                System.out.println(aluno.toString());
            }
            for(Aluno aluno : academia2.getAluno()){
                System.out.println(aluno.toString());
            }
    }

    private static Date convertStringToDate(String string) {
        return null;
    }
}
