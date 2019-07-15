package LeftJoin;

import java.util.ArrayList;
import java.util.HashMap;

public class LeftJoin {

    public HashMap<String, ArrayList<String>> leftJoin(HashMap<String,String> first, HashMap<String,String> second){

        HashMap<String, ArrayList<String>> result = new HashMap<>();

        for(String key: first.keySet()) {
            ArrayList<String> synonym = new ArrayList<>();
            if(second.containsKey(key)) {
                synonym.add(first.get(key));
                synonym.add(second.get(key));

            }else {
                synonym.add(first.get(key));
                synonym.add(null);
            }
            result.put(key,synonym);
        }
        return result;
    }
}
