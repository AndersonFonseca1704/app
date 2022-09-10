package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class panelentradadatos extends JPanel 
{
      //------------------
    //Atributos 
    //------------------

    private panelentradadatos miPanelEntrada;

    //-----------------
    //Metodos
    //-----------------

    //Metodo constructor
    public panelentradadatos()
    {
    }
    this.setBackground(Color.GREEN);
    //Definir contenedor de panel
    this.setLayout(null);
    this.setBackground(colo.WHITE);
    //Crear y agregar etiqueta para el titulo
    lbTitulo = new JLabel("MAYOR 3 ENTEROS", JLabel.CENTRE);
    lbTitulo.setFont(new Font("Arial",Font.BOLD, 20));
    lbTitulo.ForeGround(color.BLUE);
    lbTitulo.setBounds(10,10,480,20);
    this.add(lbTitulo);
    
    //borde y titulo
    TitledBorder border = BorderFactory.createTitledBorder("Datos Entrada");
    borde.setTitleColor(color.BLUE);
    this.setBorder(borde);
  }


