package thiagothalesvalentinalara;

//Grupo: Thiago, Lara, Valentina e Thales

public class Pessoa {
    //Classe para receber as pessoas inseridas
    protected int validar;//Atributo de validação do objeto
    private String nome;//Atributo para o nome
    private int sexo;//Atributo para o sexo
    private float altura;//Atributo para a altura
    private float peso;//Atributo para o peso
    private int idade;//Atributo para a idade
    private int grupo;//Atributo para o grupo
    private String tipo;//Atributo para a hierarquia no grupo
    private static int numeroPessoas = 0;//Atributo estático com o número de pessoas criadas

    public String getNome() {//Método para retornar o atributo nome do objeto
        return this.nome;
    }
    
    public void setTipo(String tipo){//Define a hierarquia do objeto no grupo
        if (tipo.equals("Membro") || tipo.equals("Líder")){
            this.tipo = tipo;
        }
    }
    
    public String getTipo(){//Retorna a hierarquia do objeto no grupo
        return this.tipo;
    
    }
    
    public boolean setNome(String nome){//Método definir e validar o atributo nome
        int validarn = 0;//Variável de validação
        for (int f = 0; f<nome.length(); f++){//Verifica se o nome inserido inclui números
            if(nome.charAt(f)=='0' || nome.charAt(f)=='1' || nome.charAt(f)=='2' || nome.charAt(f)=='3' || nome.charAt(f)=='4' || nome.charAt(f)=='5' || nome.charAt(f)=='6' || nome.charAt(f)=='7' || nome.charAt(f)=='8' || nome.charAt(f)=='9'){
              validarn++;//Adiciona 1 à variável de verifição  
            }
        }
        if(validarn == 0 && !nome.isEmpty()){//Retorno para dado válido
            this.nome = nome;//Define o nome
            this.validar++;//Adiciona 1 à variável geral de validação
            return true;
        } else {//Retorno para dado inválido
            return false;
        }
    }
    
    public int getSexoI() {//Método para retornar o atributo sexo do objeto
        return this.sexo;
    }
    
    public boolean setSexo(int sexo){//Método definir e validar o atributo sexo
        if(sexo==0 || sexo==1){//Retorno para dado válido
            this.sexo = sexo;//Define o sexo
            this.validar++;//Adiciona 1 à variável geral de validação
            return true;
        } else {//Retorno para dado inválido
            return false;
        }
    }

    public float getAltura() {//Método para retornar o atributo altura do objeto
        return this.altura;
    }


    public boolean setAltura(float altura) {//Método definir e validar o atributo altura
        if (altura>0 && altura<3){//Retorno para dado válido
            this.altura = altura;//Define a altura
            this.validar++;//Adiciona 1 à variável geral de validação
            return true;
        } else {//Retorno para dado inválido
            return false;
        }
    }

    public float getPeso() {//Método para retornar o atributo peso do objeto
        return peso;
    }

    public boolean setPeso(float peso) {//Método definir e validar o atributo peso
        if (peso>0 && peso<500){//Retorno para dado válido
           this.peso = peso;//Define o peso
           this.validar++;//Adiciona 1 à variável geral de validação
           return true;
        } else {//Retorno para dado inválido
           return false;
        }
    }

    public int getIdade() {//Método para retornar o atributo idade do objeto
        return idade;
    }

    public boolean setIdade(int idade) {//Método definir e validar o atributo idade
        if (idade>0 && idade<150){//Retorno para dado válido
            this.idade = idade;//Define a idade
            this.validar++;//Adiciona 1 à variável geral de validação
            return true;
        } else {//Retorno para dado inválido
            return false;
        }
    }
    
    public Pessoa(){//Método construtor sem parâmetros
        
    }
    
    public Pessoa (String n, int i, int s, float a, float p){//Método construtor com parâmetros de Pessoa
        this.validar = 0;//Variável para validar o objeto criado
        if (!n.isEmpty()){//Verifica se o nome está vazio
            this.nome = n;//"nome" recebe "n"
            this.validar++;//Adiciona 1 à "validar"
        }
        if (i>0 && i<150){//Verifica se a idade é válida
            this.idade = i;//"idade" recebe "i"
            this.validar++;//Adiciona 1 à "validar"
        }
        if (s==0 || s==1){//Verifica se o sexo é válido
            this.sexo = s;//"sexo" recebe "s"
            this.validar++;//Adiciona 1 à "validar"
        }
        if (a>0 && a<3){//Verifica se a altura é válida
            this.altura = a;//"altura" recebe "a"
            this.validar++;//Adiciona 1 à "validar"
        }
        if (p>0 && p<500){//Verifica se o peso é válido
           this.peso = p;//"peso" recebe "p"
           this.validar++;//Adiciona 1 à "validar"
        }
        if (this.validar==5){//Verifica se todos os atributos são válidos
            numeroPessoas++;//Adiciona 1 ao total de pessoas
        }
    }//Obs.: não foi necessário utilizar no programa, mas a atividade pede que esse método exista
    
    public float calculaIMC(){//Método que realiza o cálculo de IMC
        return (this.getPeso()/(this.getAltura()*this.getAltura()));
    }
    
    public String classificaIMC(){//Método que classifica o IMC
        if(this.calculaIMC()<18.5){
            return "[Peso abaixo do normal!]";
        }else if (this.calculaIMC()>=18.5 && this.calculaIMC()<25){
            return "[Peso normal!]";
        }else if (this.calculaIMC()>=25 && this.calculaIMC()<30){
            return "[Sobrepeso!]";
        }else if (this.calculaIMC()>=30 && this.calculaIMC()<35){
            return "[Obesidade Grau 1!]";
        }else if (this.calculaIMC()>=35 && this.calculaIMC()<40){
            return "[Obesidade Grau 2!]";
        } else {
            return "[Obesidade Mórbida!]";
        }
    }
    
    public boolean validacao(){//Método para verificar validação do objeto Pessoa criado
        if (this.validar == 5){//Retorna "true" se todos os atributos forem válidos
            numeroPessoas++;
            return true;
        } else {//Retorna "false" se algum atributo for inválido
            return false;
        }
    }
    
    public static int getTotalPessoas(){//Método para obter o total de objetos Pessoa (somente os válidos)
        return numeroPessoas;
    }

    public int getGrupo() {//Método para obter o grupo do objeto Pessoa
        return grupo;
    }

    public void setGrupo(int grupo) {//Método para definir o grupo do objeto Pessoa
        this.grupo = grupo;
    } 
}
