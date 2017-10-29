package veterinaria;

public class Perro {
    private int chip;
    private String nombre;
    private String raza;
    
    public int getChip() {
        return chip;
    }

    public void setChip(int unChip) {
        chip = unChip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String unaRaza) {
        raza = unaRaza;
    }
    
    public Perro(int unChip, String unNombre, String unaRaza){
        this.setChip(unChip);
        this.setNombre(unNombre);
        this.setRaza(unaRaza);
    }
    
    @Override
    public String toString(){
        return "Chip: " + this.getChip() + " - Nombre: " + this.getNombre() + " - Raza: " + this.getRaza();
    }
}