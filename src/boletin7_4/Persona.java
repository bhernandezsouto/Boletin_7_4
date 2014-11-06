/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_4;
import javax.swing.JOptionPane;
public class Persona {
    private String nombre;
    private float peso;
    public Persona (){
        
    }
    public Persona (int a){
        String respuesta = JOptionPane.showInputDialog("Introduce nombre");
        nombre = respuesta;
        respuesta = JOptionPane.showInputDialog("Introduce peso");
        peso = Float.parseFloat(respuesta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public void comparaPeso (Persona un,Persona dos){
        if (un.getPeso() >= dos.getPeso()){
            JOptionPane.showMessageDialog(null, "La persona de nombre: " + un.getNombre() + " pesa mas y la diferencia de peso"
                    + " con la persona que se le comparo es de: " + (un.getPeso()-dos.getPeso()));                                 
        }
        else JOptionPane.showMessageDialog(null, "La persona de nombre: " + dos.getNombre() + " pesa mas y la diferencia de peso"
                    + " con la persona que se le comparo es de: " + (dos.getPeso()-un.getPeso()));
    }
}
