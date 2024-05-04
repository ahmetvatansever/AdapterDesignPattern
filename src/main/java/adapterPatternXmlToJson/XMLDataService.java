package adapterPatternXmlToJson;

public class XMLDataService {
    public String getData(){
        String myXML = "<testtype>test</testtype>";
        System.out.println("myXML: " + myXML);
        return myXML;
    }
}