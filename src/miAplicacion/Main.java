package miAplicacion;

import recursos.*;

/**
 * Main class that demonstrates the use of `Portatil` and `Sobremesa` classes.
 * Creates instances of these classes, which likely represent types of
 * computers, and sets
 * various attributes, such as processor type, RAM, and physical
 * characteristics.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Create a portable computer (laptop) and set its specifications
        Portatil portatil = new Portatil();
        portatil.setProcesador("micro-noseque"); // Set the processor type
        portatil.setRAM(4); // Set RAM in GB
        portatil.setPeso(5); // Set weight in kg

        // Create a desktop computer and set its specifications
        Sobremesa sobremesa = new Sobremesa();
        sobremesa.setCaja("Enorme"); // Set the case size/type
        sobremesa.setProcesador("Super"); // Set the processor type
        sobremesa.setRAM(18); // Set RAM in GB
    }
}
