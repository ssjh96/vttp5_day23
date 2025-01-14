package vttp.batch5.paf.day23.model;

public class LineItem
{
    // Fields corresponding to line_items table's columns
    private Integer id; // Pri key to line_item table 
    private String name;
    private Integer quantiy;
    private double unitPrice;
    private String poId; // Foreign key to purchase_order table
    
    // CONSTRUCTOR
    public LineItem() {
    }

    public LineItem(Integer id, String name, Integer quantiy, float unitPrice, String poId) {
        this.id = id;
        this.name = name;
        this.quantiy = quantiy;
        this.unitPrice = unitPrice;
        this.poId = poId;
    }

    // GETTERS SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantiy() {
        return quantiy;
    }

    public void setQuantiy(Integer quantiy) {
        this.quantiy = quantiy;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

}
