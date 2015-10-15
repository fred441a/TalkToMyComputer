/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talk.to.my.computer;

import javax.swing.*;
        
public class Monster {
    String Name;
    int Healt = (int) Math.round(Math.random()*1000);
    int Damage = (int)Math.round(Math.random()*100);
    int Speed = (int) Math.round(Math.random()*10);
    private final JLabel HealtL;
    private final JLabel DamageL;
    private final JLabel SpeedL;
    private final JPanel DashBoard;
    
    public Monster(){
        this.Name = "bob";
        HealtL = new JLabel();
        DamageL = new JLabel();
        SpeedL = new JLabel();
        DashBoard = new JPanel();
        HealtL.setText("Healt:" + Healt);
        DamageL.setText("Damage:" + Damage);
        SpeedL.setText("Speed:" + Speed);
        HealtL.setIcon(new ImageIcon("Q:\\Frederik\\Documenter\\NetBeansProjects\\talk to my computer\\Resourses\\Heart.png"));
        DamageL.setIcon(new ImageIcon("Q:\\Frederik\\Documenter\\NetBeansProjects\\talk to my computer\\Resourses\\Damage.png"));
        SpeedL.setIcon(new ImageIcon("Q:\\Frederik\\Documenter\\NetBeansProjects\\talk to my computer\\Resourses\\Speed.png"));
        DashBoard.add(HealtL);
        DashBoard.add(DamageL);
        DashBoard.add(SpeedL);
        TTMC.Window.MonsterTab.addTab(Name, DashBoard);
    }
}
