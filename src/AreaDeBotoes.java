
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class AreaDeBotoes extends JPanel implements ActionListener {
    
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btnMais = new JButton("+");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btnMenos = new JButton("-");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnMultiplicacao = new JButton("*");
    JButton btnLimpar = new JButton("Limpar");
    JButton btn0 = new JButton("0");
    JButton btnIgual = new JButton("=");
    JButton btnDivisao = new JButton("/");
    
    ICalculo inter;

    
    public AreaDeBotoes(){
        Dimension d = getPreferredSize();
        d.width = 300;
        setPreferredSize(d);
        
        Border bordaExterna = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border bordaInterna = BorderFactory.createTitledBorder("");
        
        setBorder(BorderFactory.createCompoundBorder(bordaExterna, bordaInterna));
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btnMais.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btnMenos.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnMultiplicacao.addActionListener(this);
        btnLimpar.addActionListener(this);
        btn0.addActionListener(this);
        btnIgual.addActionListener(this);
        btnDivisao.addActionListener(this);
        
        setLayout(new GridBagLayout());
        
        GridBagConstraints gc = new GridBagConstraints();
        
        //primeira linha
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.fill = GridBagConstraints.BOTH;
        gc.anchor = GridBagConstraints.LINE_END;
        add(btn1, gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn2, gc);
        gc.gridx = 2;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn3, gc);
        gc.gridx = 3;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btnMais, gc);
        
        //outra linha
        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(btn4, gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn5, gc);
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn6, gc);
        gc.gridx = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btnMenos, gc);
        
        //outra linha
        gc.gridx = 0;
        gc.gridy = 2;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(btn7, gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn8, gc);
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn9, gc);
        gc.gridx = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btnMultiplicacao, gc);
        
        //outra linha
        gc.gridx = 0;
        gc.gridy = 3;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_END;
        add(btnLimpar, gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btn0, gc);
        gc.gridx = 2;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btnIgual, gc);
        gc.gridx = 3;
        gc.anchor = GridBagConstraints.LINE_START;
        add(btnDivisao, gc);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton pressed = (JButton) e.getSource();
        
        btnMais.addActionListener((event) -> {
            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);
        });
        btnMenos.addActionListener((event) -> {
            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);
        });
        btnMultiplicacao.addActionListener((event) -> {
            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);
        });
        btnDivisao.addActionListener((event) -> {
            btnMais.setEnabled(false);
            btnMenos.setEnabled(false);
            btnMultiplicacao.setEnabled(false);
            btnDivisao.setEnabled(false);
        });
        
        btn1.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn2.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn3.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn4.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn5.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn6.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn7.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn8.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn9.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        btn0.addActionListener((event) -> {
            btnMais.setEnabled(true);
            btnMenos.setEnabled(true);
            btnMultiplicacao.setEnabled(true);
            btnDivisao.setEnabled(true);
        });
        inter.editaCalculo(pressed.getText());
    }
    
    
    public void setInterface(ICalculo i){
        this.inter = i;
    }
}
