/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

import java.util.Random;

/**
 *
 * @author Mad Malware
 */
    public class Inimigo { 
        
    private String name; 
    int dano;
    int hp;
    private int maxHp;
        
    public Inimigo(String name, int maxHp, int dano) { 
        this.name = name; 
        this.maxHp = maxHp; 
        this.hp = maxHp; 
        this.dano = dano; 
    } 
    
    public int ataque() { 
        Random rand = new Random(); 
        int ataque = rand.nextInt(this.dano) + 1; 
        return ataque; 
    }
    
    public void Info(){
        System.out.println("Status do inimigo: ");
        System.out.println("Hp: " + this.hp + "/" + this.maxHp + ".");
        System.out.println("Força: "+ this.dano);
    }
    
    public int getmaxHp(){ 
        return maxHp; 
    } 
    
    public String getname(){ 
        return name; 
    }    
    
    public int getdano(){ 
        return dano; 
    }
    
    public int gethp(){ 
        return hp; 
    }
    
    public void setHp(int hp) {
        this.hp = hp;
    }
}
