package view;

import business.CamaraTermica;

public class Principal
{
    public static void main (String[] args)
    {
        CamaraTermica objCamaraFria = new CamaraTermica(-5, -1);

        System.out.println(String.format(
            "[Câmara fria] temp. mínima (°C): %.2f; temp. máxima (°C): %.2f. ",
            objCamaraFria.getTemperaturaMinima().getGrausCelsius(),
            objCamaraFria.getTemperaturaMaxima().getGrausCelsius()
        ));
        
        System.out.println(String.format(
            "[Câmara fria] temp. mínima (°F): %.2f; temp. máxima (°F): %.2f. ",
            objCamaraFria.getTemperaturaMinima().getGrausFahrenheit(),
            objCamaraFria.getTemperaturaMaxima().getGrausFahrenheit()
        ));
    }    
}
