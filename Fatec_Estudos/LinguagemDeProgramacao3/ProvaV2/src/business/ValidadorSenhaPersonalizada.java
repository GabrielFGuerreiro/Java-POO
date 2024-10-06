package business;

public class ValidadorSenhaPersonalizada implements IValidadorSenha
{
    private int comprimento;
    private boolean temMaiuscula, temMinuscula, temNumero, temEspeciais;

    public ValidadorSenhaPersonalizada(int comprimento, boolean temMaiuscula, boolean temMinuscula, boolean temNumero, boolean temEspeciais)
    {
        this.comprimento = comprimento;
        this.temMaiuscula = temMaiuscula;
        this.temMinuscula = temMinuscula;
        this.temNumero = temNumero;
        this.temEspeciais = temEspeciais;
    }
    
    @Override
    public boolean validarSenha(String senha)
    {
        //Verificação caracter por caracter. Se o critério NÃO foi selecionado, mas há um caracter correspondete,
        //então o retorno será FALSE.
        //Ex: user NÃO marcou a opção de número, porém a senha colocada foi "abcd123", retornando FALSE.
        for(char c : senha.toCharArray())
        {
            if(!temMaiuscula && Character.isUpperCase(c))
                return false;

            if(!temMinuscula && Character.isLowerCase(c))
                return false;

            if(!temNumero && Character.isDigit(c))
                return false;
        
            if(!temEspeciais && "!@#$%^&*()".contains(String.valueOf(c)))
                return false;
        }

        //Verificação string toda. Se o critério foi selecionado, mas NÃO há um caracter correspondete,
        //então o retorno será FALSE.
        //Ex: user marcou a opção de especial, porém a senha colocada foi "123ABCde", retornando FALSE. 
        if(senha.length() != comprimento)
            return false;

        if(temMaiuscula && !senha.matches(".*[A-Z].*"))
            return false;

        if(temMinuscula && !senha.matches(".*[a-z].*"))
            return false;

        if(temNumero && !senha.matches(".*[0-9].*"))
            return false;

        if(temEspeciais && !senha.matches(".*[!@#\\$%^&*()].*"))
            return false;

        return true;
    }
}