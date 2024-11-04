package recursos;

/**
 * Represents a laptop (portable computer) with specific attributes such as
 * weight.
 * Extends the `Ordenador` class to inherit common computer attributes, like
 * processor and RAM.
 */
public class Portatil extends Ordenador {
    private double peso; // Weight of the laptop in kilograms

    /**
     * Retrieves the weight of the laptop.
     *
     * @return The weight of the laptop in kilograms.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Sets the weight of the laptop.
     *
     * @param peso The weight in kilograms to set for the laptop.
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
