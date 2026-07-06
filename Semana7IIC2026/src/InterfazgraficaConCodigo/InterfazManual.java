
package InterfazgraficaConCodigo;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class InterfazManual extends JFrame{
    
    
    public InterfazManual(){
        iniciarComponentes();
    }
    
    public void iniciarComponentes(){
        
        setLayout(new FlowLayout());
        setSize(400, 400);
        JButton boton1 = new JButton("Click");
        
        add(boton1);
        

    }
    
    
    
    
}
