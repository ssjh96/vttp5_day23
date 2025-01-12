package vttp.batch5.paf.day23.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.batch5.paf.day23.model.PurchaseOrder;
import vttp.batch5.paf.day23.repository.LineItemRepo;
import vttp.batch5.paf.day23.repository.PurchaseOrderRepo;

@Service
public class PurchaseOrderService {
    
    @Autowired
    private LineItemRepo lineItemRepo;

    @Autowired
    private PurchaseOrderRepo purchaseOrderRepo;

    public void createPurchaseOrder(PurchaseOrder po)
    {
        // Generate random UUID
        String poId = UUID.randomUUID().toString().replace("-", "").substring(0,  8);

        // Save PO w poId to DB
        purchaseOrderRepo.createPo(poId, po);

        // Save line items w poId to DB
        lineItemRepo.createLineItemsForPoId(po.getLineItems(), poId);
    }

}
