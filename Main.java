public class Main {
    
    public static void main(String[] args){
    
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

    }
}
