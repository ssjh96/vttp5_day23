package vttp.batch5.paf.day23.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp.batch5.paf.day23.model.LineItem;
import vttp.batch5.paf.day23.model.PurchaseOrder;
import vttp.batch5.paf.day23.util.Queries;

@Repository
public class LineItemRepo 
{
    @Autowired
    private JdbcTemplate template;

    public void createLineItemsForPoId(List<LineItem> lineItems, String poId)
    {
        for (LineItem item : lineItems)
        {
            template.update(Queries.SQL_CREATE_LINE_ITEM, item.getName(), item.getQuantiy(), item.getUnitPrice(), poId);
        }
    }
}
 