package view;

import java.util.ArrayList;

import business.Cliente;

public class Principal
{
    public static void main(String[] args)
    {
        ArrayList<Cliente> clientes = new ArrayList<>(); //Lista cliente
        new Formulario(clientes); 
    }    
}
