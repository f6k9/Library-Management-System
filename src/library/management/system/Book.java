
package library.management.system;

public class Book {
   
    
    private String tittle;
    private double purchasesCost;

    public Book() {
    }

    public Book(String tittle, double purchasesCost) {
        this.tittle = tittle;
        this.purchasesCost = purchasesCost;
    }
//-------------------------------------------------------------
    public String getTittle() {
        return tittle;
    }

    public double getPurchasesCost() {
        return purchasesCost;
    }
//-------------------------------------------------------------
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public void setPurchasesCost(double purchasesCost) {
        this.purchasesCost = purchasesCost;
    }

    @Override
    public String toString() {
        return "Book Tittle:" + tittle + ", purchase' Cost:" + purchasesCost;
    }
    
}
