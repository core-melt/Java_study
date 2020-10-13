package JavaPrimitive;

public class primitive {
    public static void main(String[] args) {
    	int i = 123;
    	double d = i;	//キャスト不要
    	System.out.println(d);

    	double d2 = 1.2;
    	int i2 = (int)d2;	//明示的なキャストが必要
    	System.out.println(i2);

    }
}
