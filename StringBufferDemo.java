/*
 * StringBuffer is  Mutable
 */
public class StringBufferDemo {
    public static void main(String[] args) {
       // StringBuffer a= new StringBuffer(1000);
        //a.append("Hello");
        StringBuilder a = new StringBuilder("Hello");
        synchronized(a){
            a.append("hi");
        }
        //StringBuffer a = new StringBuffer("Hello");
        System.out.println(a.length());
        System.out.println(a.capacity());
        a.append("how are you");
        System.out.println(a.length());
        System.out.println(a.capacity());
       // a.ensureCapacity(1000);
        a.append(" I am Fine , Thank u gjhghjghjghjghjghjgjhgjhgjhgjhgjhgjhgjhgjhgjhgjhghjghjghjgjhghj");
        System.out.println(a.length());
        System.out.println(a.capacity());
        // String sql2 = "select * from products";
        // sql2 = sql2 + " where price>50000";
        
        // StringBuffer sql = new StringBuffer("select * from products");
        // sql.append(" where price>50000");
    }
}
