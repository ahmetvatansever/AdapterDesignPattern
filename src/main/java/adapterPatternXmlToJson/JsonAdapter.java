package adapterPatternXmlToJson;
import org.json.JSONObject;
import org.json.XML;

public class JsonAdapter {
    private XMLDataService xmlDataService;

    public JsonAdapter(XMLDataService xmlDataService) {
        this.xmlDataService = xmlDataService;
    }

    public String getJsonData(){
        String xml = xmlDataService.getData();

        // XML verisini JSON formatına dönüştürme işlemleri
        JSONObject soapDatainJsonObject = XML.toJSONObject(xml);
        return String.valueOf(soapDatainJsonObject);
    }
}