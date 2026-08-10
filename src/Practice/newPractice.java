package Practice;

public class newPractice {
    //right shift
    for(int i = arr.length-1 ; i>pos ;i--){
        arr[i] = arr[i-1] ;
    }

    //left shift
    for(int i=pos ; i<arr.length-1 ; i++){
        arr[i] = arr[i+1];
    }

    //rotation(R-->L)
    int first = arr[0];
    for(int i=0 ; i<arr.length ; i++){
        arr[i] = arr[i+1];
    }

    arr[arr.length-1] = first ;

    //left --> shift towards 0
    //right --> shift towards n-1

    //frequency count
    Hashmap<Integer, Integer> map = new Hashmap<>();
    for(int x : arr){
        map.put(map.getOrDefault(x,0) + 1);
    }
}
