package vttp.batch5.paf.day23.util;

import java.io.StringReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.batch5.paf.day23.model.LineItem;
import vttp.batch5.paf.day23.model.PurchaseOrder;

public class Serialise 
{
    public static PurchaseOrder toPurchaseOrder(String payload) throws ParseException
    {        
        JsonReader jReader = Json.createReader(new StringReader(payload));
        JsonObject jObj = jReader.readObject();

        PurchaseOrder po = new PurchaseOrder(); // alr sets a PO ID

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        po.setName(jObj.getString("name"));
        po.setAddress(jObj.getString("address"));
        po.setDeliveryDate(sdf.parse(jObj.getString("deliveryDate")));

        JsonArray jLineItemsArray = jObj.getJsonArray("lineItems");

        List<LineItem> lineItemList = new LinkedList<>();

        for (int i = 0; i < jLineItemsArray.size(); i++)
        {
            JsonObject jLineItemObj = jLineItemsArray.getJsonObject(i);

            LineItem lineItem = new LineItem();

            lineItem.setName(jLineItemObj.getString("name"));
            lineItem.setQuantiy(jLineItemObj.getInt("quantity"));
            lineItem.setUnitPrice(jLineItemObj.getJsonNumber("unitPrice").doubleValue());
            lineItem.setPoId(po.getPoId()); // FK

            lineItemList.add(lineItem);
        }

        po.setLineItems(lineItemList);

        return po;
    }
}
