package kata.formacion;

import java.util.*;

// First Non-Repeating Character (fnrc)
public class Fnrc {

    public Fnrc() {
    }

    public static Character firstNonRepeatingLetter(String string) {

        HashMap<Character, Integer> map = new HashMap<>();
        Character first = null;

        for(Character i : string.toLowerCase().toCharArray()){
            map.merge(i, 1, Integer::sum);
        }

        for(Character i : string.toCharArray()){
            if(map.get(Character.toLowerCase(i)) == 1){
                first = i;
                break;
            }
        }

        return first;
    }

}
