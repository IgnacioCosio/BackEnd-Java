package practicaHarry;

public class Mago {
    private String nombre;
    private String genero;
    private String casa;
    private String boggart;
    private String patronus;
    private String varita;

    public Mago( String nombre, String genero, String casa, String boggart, String patronus, String varita) {
        this.nombre = nombre;
        this.genero = genero;
        this.casa = casa;
        this.boggart = boggart;
        this.patronus = patronus;
        this.varita = varita;
    }

    public String getNombre() { return nombre; }
    public String getGenero() { return genero; }
    public String getCasa() { return casa; }
    public String getBoggart() { return boggart; }
    public String getPatronus() { return patronus; }
    public String getVarita() { return varita; }

    public boolean setNombre(String nombre) {
        if(!nombre.isEmpty()) {
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero) {
        if(!genero.isEmpty()) {
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa) {
        if(!casa.isEmpty()) {
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart) {
        if(!boggart.isEmpty()) {
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus) {
        if(!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public boolean setVarita(String varita) {
        if(!varita.isEmpty()) {
            this.varita = varita;
            return true;
        }else
            return false;
    }

    public String showMessage() {
        return "Nombre: " + nombre +
                "\nGénero: " + genero +
                "\nCasa: " + casa +
                "\nBoggart: " + boggart +
                "\nPatronus: " + patronus +
                "\nVarita: " + varita + "\n";
    }
}

class TestMago {
    public static void main(String[] args) {
        Mago m1 = new Mago("Harry Potter", "Masculino", "Gryffindor", "Dementor", "Ciervo", "Varita de Endrino");
        Mago m2 = new Mago("Hermione Granger", "Femenino", "Gryffindor", "Fracaso", "Nutria", "Vid, 10 ¾, nervio de corazón de dragón");
        Mago m3 = new Mago("Ron Wesley", "Masculino", "Gryffindor", "Araña Gigante", "Jack Russell Terrier", "Castaño, 23,4 cm, nervio de dragón");
        Mago m4 = new Mago("Albus Dumbledore", "Masculino", "Gryffindor", "Cuerpo de Ariana", "Fénix", "Saúco, núcleo de pelo de cola de Thestral");
        Mago m5 = new Mago("Severus Snape", "Masculino", "Slytherin", "Lord Voldemort", "Cierva", "Madera");

        System.out.println(m1.showMessage());
        System.out.println(m2.showMessage());
        System.out.println(m3.showMessage());
        System.out.println(m4.showMessage());
        System.out.println(m5.showMessage());
    }
}