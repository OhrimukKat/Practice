  import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
        import java.awt.Graphics2D;
        import java.awt.geom.Rectangle2D;
        import java.util.logging.Level;
        import java.util.logging.Logger;


public class NewJFrame extends javax.swing.JFrame { //JFrame-описывает окошко в винде
    static Maze maze;


    public NewJFrame() {
        initComponents();
        this.maze = new Maze(canvas1,10,10);
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() { //метод инициализации кнопок и полей

//JLabel- текст с иконкой
// JSpinner-Счетчик, позволяет выбрать значение из некоторого набора, который можно «прокручивать» в обе стороны
// JButton-кнопка
        canvas1 = new java.awt.Canvas();//создает объект меню
        jButton1 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);//закрываем наше окно(нажимаем крестик)
//addWindowListener-реагирует на оконные(свернуть,открыть,закрыть окно...) события
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
//windowActivated -Данный метод у слушателя будет вызываться каждый раз, когда окно будет становиться активным
// (при нажатии на крестик не вызывается,тольк при переходе с одного окна на другое)
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
//windowOpened - Вызывается у слушателя как только окно открывается, точнее после того как окно открылось.
                formWindowOpened(evt);
            }
        });


        canvas1.addMouseListener(new java.awt.event.MouseAdapter() { //добавляем слушателя к компоненту при
            // помощи метода addMouseListener и прослушивать события.
//MouseListene - чтобы обработать события от мыши.
//Нужен нам для определения координат этого курсора в начале перемещения.
            public void mouseClicked(java.awt.event.MouseEvent evt) {
// mouseClicked - выполнен щелчок мышкой на наблюдаемом объекте(Если позиция курсора не меняется между зажатием и отпусканием кнопки,
// то mouseClicked срабатывает, если же зажали кнопку,
// сменили положение курсора — передвинули его куда-нибудь,
// но не убрали с компонента а затем отпустили, то mouseClicked не вызовется)
                canvas1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
//mouseReleased - кнопка мыши отпущена в момент, когда курсор находится над наблюдаемым объектом
                canvas1MouseReleased(evt);
            }
        });
        canvas1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
 //MouseMotionListener - помогает отслеживать изменение координат курсора мыши при выполнении операции перемещения дискеты
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                canvas1MouseDragged(evt);//Операция переноса объектов: пользователь нажимает клавишу мыши,
                // перемещает курсор и затем отпускает клавишу мыши
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                canvas1MouseMoved(evt);//Перемещение курсора мыши
            }
        });


        jButton1.setLabel("Paint");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        jSpinner1.setValue(10);
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });


        jLabel1.setText("height");


        jLabel2.setText("width");


        jSpinner2.setValue(10);
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });


        jButton2.setLabel("Go");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });


        jButton3.setText("Clear");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });


        jSpinner3.setValue(100);
        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
// Для этого чтобы получать извещения об изменении значения регулятора(при выборе ширины например)
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });


        jLabel3.setText("delay");


        jButton4.setLabel("rand");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());//создаем окно
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(//создаем горизонтальную группу
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING) //соответствует выравниванию по левому
                        // краю в измерении по горизонтали. Также отметьте, что мы не определяем разрывы, предполагая,
                        // что функция автовставки разрыва включается.
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()//создание группы объектов, выравнивание по ширине
                                .addContainerGap()//добавляем разрыв(место от левого края)
                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                //добавили наш лабиринт с шириной 510 пикселей
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)//добавили следующую группу
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)//добавили разрыв
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2)
                                                .addGap(84, 84, 84))

                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jButton1)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jButton2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton3)
                                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 66, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(99, 99, 99)
                                                .addComponent(jButton4)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup( //разграничения вертикальное (сверху вниз)
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jButton4)
                                                .addGap(41, 41, 41)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton1)
                                                        .addComponent(jButton2)
                                                        .addComponent(jButton3))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(18, Short.MAX_VALUE))
        );


        pack();
    }// </editor-fold>//GEN-END:initComponents

    //метод обработки нажатия на jButton1
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        maze.paint();
    }//GEN-LAST:event_jButton1MouseClicked

    //метод изменения значений на  jSpinner1
    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged

    }//GEN-LAST:event_jSpinner1StateChanged

    //метод изменения значений на  jSpinner2
    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged

    }//GEN-LAST:event_jSpinner2StateChanged


    private void canvas1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseMoved

    }//GEN-LAST:event_canvas1MouseMoved


    private void canvas1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseDragged

    }//GEN-LAST:event_canvas1MouseDragged


    private void canvas1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseClicked

    }//GEN-LAST:event_canvas1MouseClicked


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    //метод обработки нажатия на jButton2
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

    }//GEN-LAST:event_jButton2MouseClicked


    private void canvas1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvas1MouseReleased

    }//GEN-LAST:event_canvas1MouseReleased


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:


    }

    //метод обработки нажатия на jButton3
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }


    private void formWindowActivated(java.awt.event.WindowEvent evt) {
    }


    private void formWindowOpened(java.awt.event.WindowEvent evt) {
    }

    //метод изменения значений на  jSpinner1
    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {
        //maze.set_delay((int) this.jSpinner3.getValue());
    }


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    //метод обработки нажатия на jButton4
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

    }//GEN-LAST:event_jButton4MouseClicked



    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
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
        java.awt.EventQueue.invokeLater(new Runnable() {//запускает окно
            public void run() {//делает окно видимым
                new NewJFrame().setVisible(true);
            }//делает окно видимым
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    // End of variables declaration//GEN-END:variables
}


