package exemplo10;

public class Prefeitura 
{
    public static void main(String[] args)
    {
        Bairro_de_Santos b = new Bairro_de_Santos(); //1
        Logradouro l = new Logradouro(); //2
        Regiao_de_Santos r = new Regiao_de_Santos(); //3
        Cidade_de_Santos c = new Cidade_de_Santos(); //4

        /*classe de hierarquia mais inferior dá acesso a todos os atributos das classes a cima*/
        b.setBairro("Jardim Radio Clube");
        b.setRegiao(("Zona Noroeste"));
        b.setRua("Álvaro Guimarães");
        b.setPopulacao(100000);
        System.out.println("\n\nBAIRRO: "+b.getBairro()+"\nREGIÃO: "+b.getRegiao()+"\nRUA: "+b.getRua()+
        "\nPOPULAÇÃO: "+b.getPopulacao());

        l.setBairro("Campo Grande");
        l.setRegiao(("Zona Leste"));
        l.setPopulacao(80000);
        l.setTipolog("Rua e número");
        l.setLocallog("Rua das Flores, número 123");
        System.out.println("\n\nBAIRRO: "+l.getBairro()+"\nREGIÃO: "+l.getRegiao()+
        "\nPOPULAÇÃO: "+l.getPopulacao());
        
        //não da acesso aos atributos da classe inferior

        r.setRegiao("Zona leste");
        r.setBairro("Marapé");
        r.setPopulacao(99000);
        System.out.println("\n\nBAIRRO: "+r.getBairro()+"\nREGIÃO: "+r.getRegiao()+
        "\nPOPULAÇÃO: "+r.getPopulacao());
    
        c.setRegiao("Zona leste");
        c.setPopulacao(20000);
        System.out.println("\n\nREGIÃO: "+c.getRegiao()+
        "\nPOPULAÇÃO: "+c.getPopulacao());
    }
}

/*    -REPRESENTAÇÂO VISUAL DA ESTRUTURA DE HERANÇA-
                 Super classe/classe-mãe:
                     Cidade_de_Santos
                           ^
                           |herença
                           |                                                           
                 Subclasse/classe-filha:                                          
                    Região_de_Santos                     Aplicação  -O|      
                 ^                  ^                     Prefeitura             
                 |      herença     |            
                 |                  |
                Subclasses/classes-filha:
         Bairro_de_Santos       Logradouro
     */
