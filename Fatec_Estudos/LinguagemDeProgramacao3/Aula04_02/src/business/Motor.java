package business;

public class Motor
{
    private int potencia;
    private String tipo;

   public Motor(int potencia, String tipo)
   {
     if (potencia < 50 || potencia > 500)
     {
          throw new IllegalArgumentException("Potência deve ser entre 50 e 500.");
     }

     this.potencia = potencia;
     this.tipo = tipo;
   }

   @Override
   public String toString()
   {
     return String.format("Motor: [Potência: %d, Tipo: %s]", potencia, tipo);
   }
}