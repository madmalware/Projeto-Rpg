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
public class Player{

    Story story = new Story();
    private Inventario<Item> inventario;
    //Inventario inventario = new Inventario();
   
    private String name;
    private int maxHp;
    private int hp, xp, dano;
   
    public Player(String name){
        this.name = name;
        this.maxHp = 20;
        this.hp = maxHp;
        this.xp = 0;
        this.dano = 3;
        this.inventario = new Inventario<>();
    }
   
    public void Info(){
        GameLogic.Titulo("Seu status: ");
        System.out.println("Hp: " + this.hp + "/" + this.maxHp + ".");
        System.out.println("Xp: "+ this.xp);
        System.out.println("Força: "+ this.dano);
        
        Item armaEquipada = inventario.getItemEquipado();
    
        if (armaEquipada != null) {
            System.out.println("Arma equipada: " + armaEquipada.getName());
        } else {
            System.out.println("Arma equipada: Nenhuma arma equipada.");
        }
        
        System.out.println();
    }
        
   
    public int ataque() {
        Random rand = new Random();
        int ataque = rand.nextInt(this.dano) + 1;
        return ataque;
    }
    
    public int Curar(){
        return this.hp = maxHp;
    }
    
    
    public String getName() {
        return name;
    }


    /**
     * @return the maxHp
     */
    public int getMaxHp() {
        return maxHp;
    }

    /**
     * @param maxHp the maxHp to set
     */
    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the xp
     */
    public int getXp() {
        return xp;
    }

    /**
     * @param xp the xp to set
     */
    public void setXp(int xp) {
        this.xp = xp;
    }

    /**
     * @return the dano
     */
    public int getDano() {
        return dano;
    }

    /**
     * @param dano the dano to set
     */
    public void setDano(int dano) {
        this.dano = dano;
    }
    
}