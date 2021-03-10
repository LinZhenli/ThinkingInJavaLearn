package algorithm.session8;

import java.util.*;

public class Greed {
    public static void main(String[] args) {

        //1.把所有的电台对应的州的数据结构。键为电台名station,值为对应州的集合。
        Map<String, Set> stations = new HashMap();
        Set<String> kone = new HashSet();
        kone.add("id");
        kone.add("nv");
        kone.add("ut");
        stations.put("kone", kone);
        Set<String> ktwo = new HashSet(Arrays.asList("wa", "id", "mt"));
        stations.put("ktwo", ktwo);
        Set<String> kthree = new HashSet(Arrays.asList("or", "nv", "ca"));
        stations.put("kthree", kthree);
        Set<String> kfour = new HashSet(Arrays.asList("nv", "ut"));
        stations.put("kfour", kfour);
        Set<String> kfive = new HashSet(Arrays.asList("ca", "az"));
        stations.put("kfive", kfive);

        //2.标注所有需要覆盖的州
        Set states_needed = new HashSet();//需要的所有州
        states_needed.addAll(kone);
        states_needed.addAll(ktwo);
        states_needed.addAll(kthree);
        states_needed.addAll(kfour);
        states_needed.addAll(kfive);
        System.out.println("需要的州" + states_needed);

        //3.循环遍历，每次找出覆盖州最多的电台。这就是贪婪
        Set final_stations = new HashSet();//最终结果，每次循环后添加进去。
        while (states_needed.size()!=0) {
            Set states_covered = new HashSet();
            String best_station = null;//当前循环最好的电台
            //   for station, states_for_station in stations.items():
            for (String station : stations.keySet()) {
                Set states_for_station = stations.get(station);

                Set covered = new HashSet(states_needed);
                covered.retainAll(states_for_station);//需要的还未覆盖的州和当前遍历的电台的州。
                if (covered.size() > states_covered.size()) {//每次取交集最大的。贪婪
                    best_station = station;
                    states_covered = covered;
                }
            }
            states_needed.removeAll(states_covered);
            final_stations.add(best_station);
        }
        System.out.println(final_stations);

    }
}
