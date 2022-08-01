import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StringArrayArgumentMarshaler implements ArgumentMarshaler{
    private List<String> strings = new ArrayList<>();

    public void set(Iterator<String> currentArgument) throws ArgsException {
        try{
            strings.add(currentArgument.next());
        }catch (NoSuchElementException e){
            throw new ArgsException(ArgsException.ErrorCode.MISSING_STRING);
        }
    }

    public static String[] getValue(ArgumentMarshaler am){
        if (am != null && am instanceof StringArrayArgumentMarshaler) {
            return ((StringArrayArgumentMarshaler)am).strings.toArray(new String[0]);
        }else {
            return new String[0];
        }
    }
}
