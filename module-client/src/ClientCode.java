import com.dxsys.testing.sourabh.FunctionAdded;

public class ClientCode {
    public static void main(String[] args) {
        FunctionAdded functionAdded = (a)-> System.out.println(a);
        functionAdded.test("abc");
    }
}
