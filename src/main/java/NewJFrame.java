


import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;

public class NewJFrame extends JFrame {
    //JFrame-описывает окошко в винде
    static Maze maze;


    public NewJFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setLocationRelativeTo(null);

        this.maze = new Maze(canvas1,10,10);

        setVisible(true);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() { //метод инициализации кнопок и полей

//JLabel- текст с иконкой
// JSpinner-Счетчик, позволяет выбрать значение из некоторого набора, который можно «прокручивать» в обе стороны
// JButton-кнопка
        canvas1 = new Canvas();//создает объект меню
        jButton1 = new JButton();
        jSpinner1 = new JSpinner();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jSpinner2 = new JSpinner();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jSpinner3 = new JSpinner();
        jLabel3 = new JLabel();
        jButton4 = new JButton();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//закрываем наше окно(нажимаем крестик)
//addWindowListener-реагирует на оконные(свернуть,открыть,закрыть окно...) события
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent evt) {
//windowActivated -Данный метод у слушателя будет вызываться каждый раз, когда окно будет становиться активным
// (при нажатии на крестик не вызывается,тольк при переходе с одного окна на другое)
                formWindowActivated(evt);
            }
            @Override
            public void windowOpened(WindowEvent evt) {
//windowOpened - Вызывается у слушателя как только окно открывается, точнее после того как окно открылось.
                formWindowOpened(evt);
            }

            @Override
            public void windowStateChanged(WindowEvent e) {
                super.windowStateChanged(e);
                canvas1.setLocation(getCurrentWidthMid(),0);
                maze.paint();
            }
        });


        canvas1.addMouseListener(new MouseAdapter() { //добавляем слушателя к компоненту при
            // помощи метода addMouseListener и прослушивать события.
//MouseListene - чтобы обработать события от мыши.
//Нужен нам для определения координат этого курсора в начале перемещения.

            public void mouseReleased(MouseEvent evt) {
//mouseReleased - кнопка мыши отпущена в момент, когда курсор находится над наблюдаемым объектом
                canvas1MouseReleased(evt);
            }
        });


        jButton1.setLabel("Paint");
        jButton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });


        jSpinner1.setValue(10);
        jSpinner1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });


        jLabel1.setText("height");


        jLabel2.setText("width");


        jSpinner2.setValue(10);
        jSpinner2.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });


        jButton2.setLabel("Go");
        jButton2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });


        jButton3.setText("Clear");
        jButton3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });


        jSpinner3.setValue(100);
        jSpinner3.addChangeListener(new ChangeListener() {
            // Для этого чтобы получать извещения об изменении значения регулятора(при выборе ширины например)
            public void stateChanged(ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });


        jLabel3.setText("delay");


        jButton4.setLabel("rand");

        jButton4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        textf = new JTextArea();
        textf.setFont(new java.awt.Font("Arial", Font.ITALIC | Font.BOLD, 12));
        textf.setBackground(Color.YELLOW);
        textf.setForeground(Color.BLACK);
        textf.setEditable(false);
        textf.setPreferredSize(new Dimension(100,530));
        canvas1.setPreferredSize(new Dimension(510, 530));
        canvas1.setLocation(getCurrentWidthMid(),0);
        JPanel p = new JPanel(new FlowLayout());

        p.add(canvas1);
        p.add(textf);

        setPreferredSize(new Dimension(700,700));

        GridBagLayout gbl = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(gbl);
        gbc.anchor = GridBagConstraints.LINE_END;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.weighty = 0;


        gbc.gridx = 0;
        gbc.gridwidth = 4;
        gbc.weightx = 1;

        gbc.gridy = 0;

        gbc.gridwidth = 4;
        gbl.setConstraints(p, gbc);
        add(p);

        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbl.setConstraints(jButton1, gbc);
        add(jButton1);

        gbc.gridx = 1;
        gbl.setConstraints(jButton2, gbc);
        add(jButton2);

        gbc.gridx = 2;
        gbl.setConstraints(jButton3, gbc);
        add(jButton3);


        gbc.fill = GridBagConstraints.BELOW_BASELINE;
        gbc.anchor = GridBagConstraints.PAGE_END;

        gbc.gridy = 3;
        gbc.gridx = 0;

        gbl.setConstraints(jLabel1, gbc);
        add(jLabel1);

        gbc.gridx = 1;
        gbl.setConstraints(jLabel3, gbc);
        add(jLabel3);


        gbc.gridx = 2;
        gbl.setConstraints(jLabel2, gbc);
        add(jLabel2);


        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.gridy = 4;
        gbc.gridx = 0;

        gbl.setConstraints(jSpinner1, gbc);
        add(jSpinner1);

        gbc.gridx = 1;
        gbl.setConstraints(jSpinner3, gbc);
        add(jSpinner3);

        gbc.gridx = 2;
        gbl.setConstraints(jSpinner2, gbc);
        add(jSpinner2);
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridy = 2;
        gbc.gridx = 3;
        gbc.gridheight = 3;
        gbl.setConstraints(jButton4, gbc);
        add(jButton4);

        pack();

        canvas1.repaint();

    }// </editor-fold>//GEN-END:initComponents

    int getCurrentWidthMid(){
        int CurMid = (this.getWidth() - 510)/2;

        return CurMid;
    }

    private void jButton1MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        maze.paint();
    }//GEN-LAST:event_jButton1MouseClicked


    private void jSpinner1StateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        maze.set_height((int) this.jSpinner1.getValue());
    }//GEN-LAST:event_jSpinner1StateChanged


    private void jSpinner2StateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        maze.set_width((int) this.jSpinner2.getValue());
    }//GEN-LAST:event_jSpinner2StateChanged



    private void jButton2MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        textf.setText("");
        maze.go_maze();
        this.jButton3.setEnabled(true);
        this.jButton2.setEnabled(false);
    }//GEN-LAST:event_jButton2MouseClicked


    private void canvas1MouseReleased(MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased
        // TODO add your handling code here:
        maze.on_mouse_clicked(evt.getX(),evt.getY());
    }//GEN-LAST:event_canvas1MouseReleased



    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        maze.paint();
        validate();
        repaint();
    }

    @Override
    public void repaint() {
        maze.paint();
    }

    private void jButton3MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        textf.setText("");
        maze.clear();
        this.jButton2.setEnabled(true);
        this.jButton3.setEnabled(false);
    }//GEN-LAST:event_jButton3MouseClicked

    private void formWindowActivated(WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        maze.paint();
    }//GEN-LAST:event_formWindowActivated


    private void formWindowOpened(WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        maze.paint();
    }//GEN-LAST:event_formWindowOpened


    private void jSpinner3StateChanged(ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        // TODO add your handling code here:
        maze.set_delay((int) this.jSpinner3.getValue());
    }//GEN-LAST:event_jSpinner3StateChanged



    private void jButton4MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        maze.bad_rand_generarion();
    }//GEN-LAST:event_jButton4MouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame();
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static JTextArea textf;
    private Canvas canvas1;
    private JButton jButton1,jButton2,jButton3,jButton4;
    private JLabel jLabel1,jLabel2,jLabel3;
    private javax.swing.JSpinner jSpinner1,jSpinner2,jSpinner3;

    // End of variables declaration//GEN-END:variables
}


