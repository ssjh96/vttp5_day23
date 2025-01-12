package vttp.batch5.paf.day23.model;

import java.util.Date;
import java.util.List;

public class PurchaseOrder {
    
    // Fields corresponding to purchase_orders table's column
    private String poId; // Pri key to purchase_orders table, also links LineItem table
    private String name;
    private String address;
    private Date deliveryDate;

    private List<LineItem>lineItems; 
    
    // Consider instantiating lineItems as LinkedList<>() to ensure app x throw NullPointerException, if not instantiated, adding line items will throw NullPointerException
    // private List<LineItem>lineItems = new LinkedList<>();

    // CONSTRUCTOR
    public PurchaseOrder() {
    }

    public PurchaseOrder(String poId, String name, String address, Date deliveryDate, List<LineItem> lineItems) {
        this.poId = poId;
        this.name = name;
        this.address = address;
        this.deliveryDate = deliveryDate;
        this.lineItems = lineItems;
    }

    // GETTERS SETTERS
    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    // public void addLineItem(LineItem lineItem) {
    //     this.lineItems.add(lineItem); // No NullPointerException}
    // }

}
