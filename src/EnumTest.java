/**
 * Created by zhiningbo on 2016/11/20.
 */
public enum EnumTest {
    APP,DOC;
    public static void main(String[] args) {
        System.out.println(EnumTest.valueOf("APP").ordinal());
    }
}
