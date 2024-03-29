package generics.comparator.model;

public class AIPilotComparator<T extends IHasWeight> {
    //result - 0, a==b
    //result> 0 , a>b
    //result<0 , a<b
    public int compare(T a, T b){
        if(a.getWeight() > b.getWeight()){
            return 1;
        }
        else if (a.getWeight() < b.getWeight()){
            return -1;
        }
        else return 0;
    }
}
