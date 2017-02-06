package com.rlsolutions.irl;
import java.util.ArrayList;

/**
 * Created by Kareem on 2017-01-30.
 */

public class Functions {

    public static ArrayList<HealthProvider> stringToHCPs(String hcpText){
        String[] lines = hcpText.split("\n");
        ArrayList<HealthProvider> retList =  new ArrayList<HealthProvider>();
        for (String line: lines){
            String[] keys = line.split(";");
            System.out.print(keys);
            HealthProvider curr = new HealthProvider(keys[0], keys[1], keys[2], keys[3]);
            retList.add(curr);
        }
        return retList;
    }
}
