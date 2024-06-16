package Activities;

public class Activity2 {
    public static void main(String []args){
int a[]={10, 77, 10, 54, -11, 10};
int searchnum=10;
int sumnum=20;
System.out.println(result(a,searchnum,sumnum));
}
    public static boolean result(int a[],int searchnum,int sumnum){
        int count=0;
    for(int i=0;i<a.length;i++){
        if(a[i]==searchnum){
count=count+a[i];
        }

    
    if(count>sumnum){
        break;

    }
}
   
        return count==sumnum;
     
}
}
