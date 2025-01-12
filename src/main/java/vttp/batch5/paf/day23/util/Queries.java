package vttp.batch5.paf.day23.util;

public class Queries 
{
    public static final String SQL_CREATE_PO = 
    """
        insert into purchase_orders(po_id, name, address, delivery_date)
            values (?, ?, ?, ?)
    """;

    public static final String SQL_CREATE_LINE_ITEM= 
    """
        insert into line_items(name, quantity, unit_price, po_id)
            values (?, ?, ?, ?)
    """;

    public static final String SQL_ALL_PO =
    """
        select * from purchase_orders
    """;

    public static final String SQL_ALL_LINE_ITEM =
    """
        select * from line_items
    """;

    
}
