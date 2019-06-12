package pizza;

/**
 *
 * @author david
 */
public class Pizza {

    //variables
    private int grHarina;
    private int mlAgua;
    private int grSal;
    private int mlAceite;
    private String tipoAceite;
    private int grTomate;
    private int grQueso;
    private String tipoQueso;
    private int grPinha;

    //constructor
    public Pizza(final int grHarina, final int mlAgua,
            final int grSal, final int mlAceite, final String tipoAceite,
            final int grTomate, final int grQueso, final String tipoQueso,
            final int grPinha) {
        this.grHarina = grHarina;
        this.mlAgua = mlAgua;
        this.grSal = grSal;
        this.mlAceite = mlAceite;
        this.tipoAceite = tipoAceite;
        this.grTomate = grTomate;
        this.grQueso = grQueso;
        this.tipoQueso = tipoQueso;
        this.grPinha = grPinha;
    }

    public int getGrHarina() {
        return grHarina;
    }

    public void setGrHarina(int grHarina) {
        this.grHarina = grHarina;
    }

    public int getMlAgua() {
        return mlAgua;
    }

    public void setMlAgua(int mlAgua) {
        this.mlAgua = mlAgua;
    }

    public int getGrSal() {
        return grSal;
    }

    public void setGrSal(int grSal) {
        this.grSal = grSal;
    }

    public int getMlAceite() {
        return mlAceite;
    }

    public void setMlAceite(int mlAceite) {
        this.mlAceite = mlAceite;
    }

    public String getTipoAceite() {
        return tipoAceite;
    }

    public void setTipoAceite(String tipoAceite) {
        this.tipoAceite = tipoAceite;
    }

    public int getGrTomate() {
        return grTomate;
    }

    public void setGrTomate(int grTomate) {
        this.grTomate = grTomate;
    }

    public int getGrQueso() {
        return grQueso;
    }

    public void setGrQueso(int grQueso) {
        this.grQueso = grQueso;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

    public int getGrPinha() {
        return grPinha;
    }

    public void setGrPinha(int grPinha) {
        this.grPinha = grPinha;
    }

    @Override
    public String toString() {
        return "Pizza{" + "grHarina=" + grHarina + ", mlAgua=" + mlAgua
                + ", grSal=" + grSal + ", mlAceite=" + mlAceite + ", tipoAceite="
                + tipoAceite + ", grTomate=" + grTomate + ", grQueso=" + grQueso
                + ", tipoQueso=" + tipoQueso + ", grPinha=" + grPinha + '}';
    }

}
