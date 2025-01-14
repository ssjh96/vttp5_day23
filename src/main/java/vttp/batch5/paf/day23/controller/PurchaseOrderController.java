package vttp.batch5.paf.day23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp.batch5.paf.day23.model.PurchaseOrder;
import vttp.batch5.paf.day23.service.PurchaseOrderService;
import vttp.batch5.paf.day23.util.Serialise;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

// Client send PUT 
// The frontend sends a JSON payload with the purchase order and line items.

// Controller handles the request - maps the JSON payload to a PurchaseOrder object.
// Controller calls the service to handle the business logic.
// Service generates poId and saves the data

@RestController
@RequestMapping("/api")
public class PurchaseOrderController {

    @Autowired 
    private PurchaseOrderService poSvc;

    @PutMapping(path = "/purchaseorder", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> putPO(@RequestBody String payload) throws Throwable 
    {
        PurchaseOrder po = Serialise.toPurchaseOrder(payload);

        poSvc.createPurchaseOrder(po);

        return ResponseEntity.ok().body("{}");
    }
    
    
}
