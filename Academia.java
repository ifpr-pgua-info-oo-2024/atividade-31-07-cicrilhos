public class Academia{
    private String nome = "Cirilo's Academy"; 
    private String endereco =  "Avenida Bento Munhoz da Rocha Neto, 255";
    private String telefone = "+ 55 (41)988838955";

    public Academia(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

}