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
}
