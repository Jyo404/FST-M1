package Activities;

abstract class Book {
    String title;
   abstract void setTitle(String t);

String getTitle(){
               return title;
        }

}
class MyBook extends Book{
public void setTitle(String t){
    title=t;
}
}
public  class Activity5{
    public static void main(String args[]){
        String title="name";
        Book book=new MyBook();
        book.setTitle(title);
        System.out.println(book.getTitle());
        
    }

}
