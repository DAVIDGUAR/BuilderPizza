/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author david
 */
public class PizzaBuildermain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pizza obx1 = new PizzaBuilder(100, 50, 5).setGrQueso(100).setTipoAceite("girasol").setMlAceite(20).setGrTomate(50).createPizza();

        System.out.println("Pizza obx1" + obx1.toString());

        PizzaBuilder pzbd1 = new PizzaBuilder(75, 30, 4);
        pzbd1.setGrQueso(50);
        pzbd1.setGrTomate(30);
        pzbd1.setMlAceite(8);
        pzbd1.setGrPinha(5);
        Pizza newYork = pzbd1.createPizza();

        System.out.println("Pizza New York" + newYork.toString());

        PizzaBuilder pzdb2 = new PizzaBuilder(50, 30, 5);

        Pizza newOrleand = pzdb2.createPizza();

        System.out.println(" New Orleand" + newOrleand.toString());
    }

}
