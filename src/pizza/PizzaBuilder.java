/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

public class PizzaBuilder {

    private int grHarina;
    private int mlAgua;
    private int grSal;
    private int mlAceite = 20;
    private String tipoAceite = "oliva";
    private int grTomate = 50;
    private int grQueso = 100;
    private String tipoQueso = "mozzarella";
    private int grPinha = 0;

    public PizzaBuilder(int grHarina, int mlAgua, int grSal) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
    }

    public PizzaBuilder setGrHarina(int grHarina) {
        this.grHarina = grHarina;
        return this;
    }

    public PizzaBuilder setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
        return this;
    }

    public PizzaBuilder setGrSal(int grSal) {
        this.grSal = grSal;
        return this;
    }

    public PizzaBuilder setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
        return this;
    }

    public PizzaBuilder setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
        return this;
    }

    public PizzaBuilder setGrTomate(int grTomate) {
        this.grTomate = grTomate;
        return this;
    }

    public PizzaBuilder setGrQueso(int grQueso) {
        this.grQueso = grQueso;
        return this;
    }

    public PizzaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public PizzaBuilder setGrPinha(int grPinha) {
        this.grPinha = grPinha;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(grHarina, mlAgua, grSal, mlAceite, tipoAceite, grTomate, grQueso, tipoQueso, grPinha);
    }

}
