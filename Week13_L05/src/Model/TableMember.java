    package Model;
    /**
     * Filename: TableMember.java
     * Short description: Interface
     * IST 242 Assignment: L04C
     * @author Sai Rangineeni
     * @version 3/28/2024
     */
    import java.util.ArrayList;

    public interface TableMember {
        String getAttribute(int n);
        String getAttributeName(int n);
        ArrayList<String> getAttributes();
        ArrayList<String> getAttributeNames();
    }
