package practicaMona;

public class Mona {
    private String nombre;
    private int numero;
    private String vestimenta;
    private String actividad;

    public Mona(String nombre, int numero, String vestimenta, String actividad) {
        this.nombre = nombre;
        this.numero = numero;
        this.vestimenta = vestimenta;
        this.actividad = actividad;
    }

    public String getNombre() { return nombre; }
    public int getNumero() { return numero; }
    public String getVestimenta() { return vestimenta; }
    public String getActividad() { return actividad; }

    public boolean setNombre(String nombre) {
        if (!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
            return true;
        }else
            return false;
    }

    public boolean setVestimenta(String vestimenta) {
        if(!vestimenta.isEmpty()) {
            this.vestimenta = vestimenta;
            return true;
        }else
            return false;
    }

    public boolean setActividad(String actividad) {
        if(!actividad.isEmpty()) {
            this.actividad = actividad;
            return true;
        }else
            return false;
    }

    public String showMessage() {
        return "Nombre: " + nombre +
                "\nNúmero: #" + numero +
                "\nVestimenta: " + vestimenta +
                "\nActividad: " + actividad + "\n";
    }
}
