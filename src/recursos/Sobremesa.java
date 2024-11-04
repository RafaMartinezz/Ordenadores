package recursos;

/**
 * Represents a desktop computer with a specific attribute for the case type.
 * Extends the `Ordenador` class to inherit common computer attributes, like
 * processor and RAM.
 */
public class Sobremesa extends Ordenador {
    private String caja; // Type or size of the computer case (e.g., "Mini", "Mid-Tower", "Full-Tower")

    /**
     * Retrieves the type of case for the desktop computer.
     *
     * @return A string representing the case type.
     */
    public String getCaja() {
        return caja;
    }

    /**
     * Sets the type of case for the desktop computer.
     *
     * @param caja The type or size of the case to set (e.g., "Mini", "Mid-Tower",
     *             "Full-Tower").
     */
    public void setCaja(String caja) {
        this.caja = caja;
    }
}
