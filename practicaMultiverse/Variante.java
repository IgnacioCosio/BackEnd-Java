public class Variante extends Spiderman implements Poderes{

    public Variante(String nombre, String alias, String genero, String universo, String edoCivil, String ocupacion) {
        super(nombre, alias, genero, universo, edoCivil, ocupacion);
    }

    @Override
    public void RemolinoTelarana(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Remolino de Telaraña\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Remolino Telaraña.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void SentidoAracnido(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Sentido Arácnido\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("SentidoAracnido.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void MartilloHam(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Martillo Ham\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Spiderham.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void Agilidad(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Agilidad\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Spiderman 2099.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void Superfuerza(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Superfuerza\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Superfuerza.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void Telarana(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Lanzar Telarañas\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Telaraña.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void TrepaMuros(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Trepar Muros\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Trepa Muros.gif");
        s.setBounds(420,25,700,720);
    }

    @Override
    public void Cosmico(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Helvetica", 28, Colors.BlueHorizon);
        s.out("Poder: Manipulación de Materia\n", "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("Cosmico.gif");
        s.setBounds(420,25,700,720);
    }
}
