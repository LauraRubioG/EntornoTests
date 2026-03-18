import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test; // La pieza "Test"
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MiPrimerTest {

    @Test // Le dice a IntelliJ: "¡Ejecútame!"
    public void miPrimeraPrueba() {
        int suma = 2 + 2;
        assertEquals(4, suma); // (Esperado, Real)
    }

    @Test
    @DisplayName("El nombre de usuario no puede estar vacío")
    public void deberia_RetornarFalso_cuando_NombreUsuarioEstaVacio() {
        // Arrange
        String nombre = "";

        // Act
        boolean esValido = nombre.length() > 0;

        // Assert
        assertFalse(esValido, "El nombre vacío se aceptó como válido");
    }

    @Test
    public void nombredelaclase(){
        //aranque es decir, ponemos las variables
        //accion
        //tenemos que poner el assert
    }

    @Test
    public void deberia_Aceptar_edad18(){
      int edad = 18;
      Boolean esvalido = edad >=16;
      assertTrue(esvalido, "El sistema deberia aceptar la edad");
    }

    @Test
    @DisplayName ("Edad Incorrecta")
    public void deveria_Rechazar_Edad12{
        int edad = 12;
        Boolean edadValida = edad >=16;
        assertFalse(esValido, "El sistema deberia rechazar la edad");
    }
}