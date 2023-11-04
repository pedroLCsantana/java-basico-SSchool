package e01;
public class Pessoa
{
    private String primeiroNome;
    private String ultimoNome;

    private byte idade;
    private Aniversario dataAniversario;

    private String endereco;

    private String telefone;

    // CONSTRUTORES
    public Pessoa(){
        
    }

    protected Pessoa(String primeiroNome, String ultimoNome){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    protected Pessoa(String primeiroNome, String ultimoNome, int dia, int mes, int ano){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;

        setDataAniversario(dia, mes, ano);
    }

    // GETTERS

    public String getPrimeiroNome(){
        return this.primeiroNome;
    }

    public String getUltimoNome(){
        return this.ultimoNome;
    }

    public byte getIdade(){
        return this.idade;
    }

    public Aniversario getDataAniversario(){
        return this.dataAniversario;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getTelefone(){
        return this.telefone;
    }


    // SETTERS

    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }

    public void setUltimoNome(String ultimoNome){
        this.ultimoNome = ultimoNome;
    }

    private void setIdade(){
        if(dataAniversario != null){
            this.idade = dataAniversario.calcularIdade();
        }else{
            System.out.println("Informe antes a data de aniversario");
        }
        
    }

    public void setDataAniversario(int dia, int mes, int ano){
        Aniversario niver = new Aniversario();
        niver.setDia((byte)dia);
        niver.setMes((byte)mes);
        niver.setAno((short)ano);

        this.dataAniversario = niver;
        setIdade();
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void info()
    {
        System.out.println("--------------------------------------");

        if(primeiroNome != null || ultimoNome != null)
        {
            System.out.println("Nome: "+getPrimeiroNome()+" "+getUltimoNome());
        }
        else
        {
            System.out.println("Nome não imformado");
        }

        if(idade != 0)
        {
            System.out.println("Data de aniversario: "+dataAniversario.getDia()+"/"+dataAniversario.getMes()+"/"+dataAniversario.getAno());
            System.out.println("Idade: "+idade+" anos");
        }
        else
        {
            System.out.println("Data de aniversario não informada");
        }

        
        if(telefone != null)
        {
            System.out.println("Telefone: "+telefone);
        }
        else
        {
            System.out.println("Telefone não informado");
        }

        
        if(endereco != null)
        {
            System.out.println("Endereço: "+endereco);
        }
        else
        {
            System.out.println("Endereço não informado");
        }

        System.out.println("--------------------------------------");
        
    }
}