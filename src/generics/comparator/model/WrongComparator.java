package generics.comparator.model;

public class WrongComparator {
    //result - 0, a==b
    //result> 0 , a>b
    //result<0 , a<b
    public int compare(IHasWeight a, IHasWeight b){
        if(a.getWeight() > b.getWeight()){
            return 1;
        }
        else if (a.getWeight() < b.getWeight()){
            return -1;
        }
        else return 0;
    }
}
