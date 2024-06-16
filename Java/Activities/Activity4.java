package Activities;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Activity4 {
    public static void main(String []args){
int a[]={18,0,62,7,8,11,2};
asc(a);
    }
    public static void asc(int a[]){
        int temp=0;
for(int i=0;i<a.length;i++){
    for(int j=0;j<a.length;j++){
    if(a[i]<a[j]){  
        temp=a[j];
        a[j]=a[i];
        a[i]=temp;
        


    }
}
}

        System.out.println(Arrays.toString(a));
     

}
}
