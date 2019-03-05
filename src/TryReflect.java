import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

/**
 * Created by zhiningbo on 2017/3/31.
 */
public class TryReflect {
    private final int vaule = 1;


    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        TryReflect instance = TryReflect.class.getConstructor().newInstance();
        Field vauleField = TryReflect.class.getDeclaredField("vaule");
        vauleField.setAccessible(true);
        Field modifiers = Field.class.getDeclaredField("modifiers");
        modifiers.setAccessible(true);
        modifiers.setInt(vauleField, vauleField.getModifiers() & ~Modifier.FINAL);
        vauleField.set(instance, Integer.MAX_VALUE);
        System.out.println(instance.vaule);

    }
}