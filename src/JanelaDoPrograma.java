import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author thiag
 */
public class JanelaDoPrograma extends JFrame{
    
    AreaDeTexto areaDeTexto;
    AreaDeTexto areaDeTexto2;
    AreaDeBotoes areaDeBotoes;
    
    public JanelaDoPrograma(){
        super("Calculadora");
        super.setSize(600, 500);
        super.setLayout(new BorderLayout());
        
        areaDeTexto = new AreaDeTexto();
        areaDeBotoes = new AreaDeBotoes();
        
        super.add(areaDeTexto, BorderLayout.PAGE_START);
        super.add(areaDeBotoes, BorderLayout.CENTER);
        
        areaDeBotoes.setInterface(new ICalculo(){
            @Override
            public void editaCalculo(String txt) {
                String expr = areaDeTexto.retornaTexto();
                String numbers = "[0-9]*";
                if(txt.matches(numbers)){
                    expr += txt;
                    areaDeTexto.escreveTexto(expr);
                }else if(txt.equals("Limpar")){
                    areaDeTexto.escreveTexto("");
                }else{
                    if (txt.equals("=")){
                        if(expr.split(" ").length >= 3){
                            expr = realizaCalculo(expr);
                            areaDeTexto.escreveTexto(expr);
                        }
                    } else{
                        expr += " " + txt + " ";
                        areaDeTexto.escreveTexto(expr);
                    }
                }
            }
            
        });
        
        //define o que fazer ao clicar em fechar
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //torna o frama visivel
        super.setVisible(true);
    }
    
    private String realizaCalculo(String e){
        double resultado = 0;
        String v[] = e.split(" ");
        
        switch (v[1]){
            case "+":
                resultado = Double.parseDouble(v[0]) + Double.parseDouble(v[2]);
                break;
            case "*":
                resultado = Double.parseDouble(v[0]) * Double.parseDouble(v[2]);
                break;
            case "-":
                resultado = Double.parseDouble(v[0]) - Double.parseDouble(v[2]);
                break;
            case "/":
                resultado = Double.parseDouble(v[0]) / Double.parseDouble(v[2]);
                break;
            }
        if(v.length>3){
            int cont = v.length-1;
            
            for(int i = 3; i <= cont; i+=2){
                switch (v[i]){
                    case "+":
                        resultado += Double.parseDouble(v[i+1]);
                        break;
                    case "*":
                        resultado *= Double.parseDouble(v[i+1]);
                        break;
                    case "-":
                        resultado -= Double.parseDouble(v[i+1]);
                        break;
                    case "/":
                        resultado /= Double.parseDouble(v[i+1]);
                        break;
                    }
                }
        }
                      
        return String.valueOf(resultado);
    }

}
