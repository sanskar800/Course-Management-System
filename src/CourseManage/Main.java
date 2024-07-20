/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseManage;

import javax.swing.JFrame;
/**
 *
 * @author HP
 */  class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HomePage mainrun = new HomePage();
                       mainrun.setVisible(true);
                       mainrun.pack();
                       mainrun.setLocationRelativeTo(null);
//                       mainrun.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
}
