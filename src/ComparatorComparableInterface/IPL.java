package ComparatorComparableInterface;

import java.util.Arrays;
import java.util.Comparator;

class SortByRank implements Comparator<Team> {
    public int compare(Team o1, Team o2){
        return o1.rank-o2.rank;
    }
}

class SortByPoint implements Comparator<Team>{
    public int compare(Team o1, Team o2){
        return o1.points-o2.points;
    }
}

class Team{
    String name;
    int points;
    int rank;

    public Team(String name, int points, int rank) {
        this.name = name;
        this.points = points;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Team{" + "name='" + name + '\'' + ", points=" + points + ", rank=" + rank + '}';
    }

}


public class IPL {
    Team t1 = new Team("RCB", 6, 3);
    Team t2 = new Team("CSK", 2, 4);
    Team t3 = new Team("DC", 5, 2);
    Team t4 = new Team("SRH", 8, 1);

//    Team[] t = {t1, t2, t3, t4};
//    Arrays.sort(t,new SortByRank()){
//        for(Team team:t) {
//            System.out.println(team);
//        }
//    }
//
//    Arrays.sort(t,new SortByPoint()){
//        for(Team team:t){
//            System.out.println(team);
//        }
//    }

}



