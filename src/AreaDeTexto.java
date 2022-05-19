
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AreaDeTexto extends JPanel{
    
    JTextField areaDeTexto;
    
    public AreaDeTexto(){
        setLayout(new BorderLayout());
        areaDeTexto = new JTextField(10);
        add(areaDeTexto);
        
        Dimension d = getPreferredSize();
        d.width = 200;
        d.height = 50;
        setPreferredSize(d);
    }
    
    public void escreveTexto(String txt){
        areaDeTexto.setText(txt);
    }
    
    public String retornaTexto(){
        return areaDeTexto.getText();
    }
}
