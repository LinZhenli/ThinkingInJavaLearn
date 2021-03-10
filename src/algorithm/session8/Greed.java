package algorithm.session8;

import java.util.*;

public class Greed {
    public static void main(String[] args) {

        //1.�����еĵ�̨��Ӧ���ݵ����ݽṹ����Ϊ��̨��station,ֵΪ��Ӧ�ݵļ��ϡ�
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

        //2.��ע������Ҫ���ǵ���
        Set states_needed = new HashSet();//��Ҫ��������
        states_needed.addAll(kone);
        states_needed.addAll(ktwo);
        states_needed.addAll(kthree);
        states_needed.addAll(kfour);
        states_needed.addAll(kfive);
        System.out.println("��Ҫ����" + states_needed);

        //3.ѭ��������ÿ���ҳ����������ĵ�̨�������̰��
        Set final_stations = new HashSet();//���ս����ÿ��ѭ������ӽ�ȥ��
        while (states_needed.size()!=0) {
            Set states_covered = new HashSet();
            String best_station = null;//��ǰѭ����õĵ�̨
            //   for station, states_for_station in stations.items():
            for (String station : stations.keySet()) {
                Set states_for_station = stations.get(station);

                Set covered = new HashSet(states_needed);
                covered.retainAll(states_for_station);//��Ҫ�Ļ�δ���ǵ��ݺ͵�ǰ�����ĵ�̨���ݡ�
                if (covered.size() > states_covered.size()) {//ÿ��ȡ�������ġ�̰��
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
