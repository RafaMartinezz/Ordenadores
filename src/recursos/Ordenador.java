package recursos;

/**
 * Represents a general computer with basic specifications, such as processor
 * type and RAM.
 * This class serves as a base class that other specific computer types (e.g.,
 * laptop, desktop)
 * may extend to inherit these common properties.
 */
public class Ordenador {
    private String procesador; // Processor type (e.g., "Intel", "AMD Ryzen")
    private int ram; // RAM size in GB

    /**
     * Retrieves the processor type of the computer.
     *
     * @return A string representing the processor type.
     */
    public String getProcesador() {
        return procesador;
    }

    /**
     * Sets the processor type for the computer.
     *
     * @param procesador The processor type to set.
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * Retrieves the amount of RAM in GB.
     *
     * @return An integer representing the amount of RAM.
     */
    public int getRAM() {
        return ram;
    }

    /**
     * Sets the amount of RAM for the computer.
     *
     * @param ram The RAM size in GB to set.
     */
    public void setRAM(int ram) {
        this.ram = ram;
    }
}
