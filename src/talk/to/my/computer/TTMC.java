/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talk.to.my.computer;

public class TTMC {
    public static Main Window = new Main();
    
    public static void main(String[] args) {
        Window.setVisible(true);
        Window.Print("Hello young adventurer what is your name:");
        Player bob = new Player("Bob");
        System.out.print(Read());
    }
    
        public static String Read(){
        if(Main.Command == null){
            Read();
        }
        return Main.Command;
        //Main.Command = null ;
    }
    
}
