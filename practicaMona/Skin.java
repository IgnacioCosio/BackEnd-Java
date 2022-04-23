package practicaMona;

public class Skin extends Mona {
    public Skin(String nombre, int numero, String vestimenta, String actividad) {
        super(nombre, numero, vestimenta, actividad);
    }

    public static void main(String[] args) {
        Mona mon1 = new Mona("Ironcat", 24, "Traje de Iron Man", "Chasquear dedos");
        Mona mon2 = new Mona("Snow Octocat", 72, "Traje blanco camuflaje de nieve", "Snowboarding");
        Mona mon3 = new Mona("Megacat", 60, "Armadura Azul", "Disparar Bláster");
        Mona mon4 = new Mona("Bear Cavalry", 43, "Guerrero", "Andar en oso");
        Mona mon5 = new Mona("X-tocat", 35, "Guepardo", "Rasguñar");
        Mona mon6 = new Mona("Stormtroopocat", 84, "Trooper", "Proteger al Imperio");

        System.out.println(mon1.showMessage());
        System.out.println(mon2.showMessage());
        System.out.println(mon3.showMessage());
        System.out.println(mon4.showMessage());
        System.out.println(mon5.showMessage());
        System.out.println(mon6.showMessage());
    }
}

