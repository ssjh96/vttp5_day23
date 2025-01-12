package vttp.batch5.paf.day23.util;

import java.io.StringReader;
import java.text.SimpleDateFormat;

import org.springframework.jdbc.support.rowset.SqlRowSet;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import vttp.batch5.paf.day23.model.PurchaseOrder;

public class Serialise 
{
    public static PurchaseOrder toPurchaseOrder(String payload)
    {        
        JsonReader jReader = Json.createReader(new StringReader(payload));
        JsonObject jObj = jReader.readObject();

        PurchaseOrder po = new PurchaseOrder();

        po.setPoId(jObj.getString("poId", ""));
        


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try
        {
            po.setPoId
        }
        catch
        po.setPoId(rs.getString(null));
    }
}
