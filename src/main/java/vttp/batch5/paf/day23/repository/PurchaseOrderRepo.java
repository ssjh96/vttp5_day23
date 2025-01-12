package vttp.batch5.paf.day23.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vttp.batch5.paf.day23.model.PurchaseOrder;
import vttp.batch5.paf.day23.util.Queries;

@Repository
public class PurchaseOrderRepo 
{
    @Autowired
    private JdbcTemplate template;

    public void createPo(String poId, PurchaseOrder po)
    {
        template.update(Queries.SQL_CREATE_PO, poId, po.getName(), po.getAddress(), po.getDeliveryDate());
    }
}
