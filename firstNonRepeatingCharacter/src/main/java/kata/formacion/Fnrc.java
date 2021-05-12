package kata.formacion;

import java.awt.geom.NoninvertibleTransformException;
import java.util.HashMap;
import java.util.Locale;

// First Non-Repeating Character (fnrc)
public class Fnrc {

    public Fnrc() {
    }

    public static Character firstNonRepeatingLetter(String string) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(Character i : string.toLowerCase().toCharArray()){
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        Character first = null;

        for(Character i : string.toCharArray()){
            if(map.get(Character.toLowerCase(i)) == 1){
                first = i;
                break;
            }
        }
        return first;
    }

}
