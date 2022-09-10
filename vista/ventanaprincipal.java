package vista;
import javax.swing.JFrame;

public class ventanaprincipal extends JFrame
{
    //------------------
    //Atributos 
  
    //Metodos
    //-----------------

    //Metodo constructor
    public ventanaprincipal()
    {

        //Definicion contenedor de ventana
        this.setLayout(null);
        //creacion y adicion de un panel Tipo PanelEntrada
        panelentradadatos panelentradadatos = new panelentradadatos();
        panelentradadatos.setBounds(10,10,480,200);
        this.add(panelentradadatos);

        // Caracteristicas de la ventana 
        this.setTitle("Mayor de 3 enteros");
        this.setSize(500,500);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    
}