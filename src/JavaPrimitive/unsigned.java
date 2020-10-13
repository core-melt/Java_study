package JavaPrimitive;

public class unsigned {
    public static void main(String[] args) {
    	int i = Integer.MAX_VALUE + 1;

    	// 符号なし
    	System.out.println(Integer.toUnsignedString(Integer.MAX_VALUE));
    	System.out.println(Integer.toUnsignedString(i));
    	System.out.println(Integer.toUnsignedString(0xffffffff));
    	System.out.println(Integer.toUnsignedString(-1));
    	System.out.println(Integer.toUnsignedString(-10));

    }
}
