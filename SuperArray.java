public class SuperArray{

  private String[] arr;

  SuperArray(String[] newAr){
    arr = new String[10];
  }



  public void clear(){
      String[] arr = new String[10];
      System.out.println(arr);
  }



  public int size(){
      int counter = 0;
      for(int i = 0; i < arr.length; i++){
        counter += 1;
      }
      System.out.println(counter);
  }



  public boolean isEmpty(){
    if(arr.length == 0){
      return true;
    }
    return false;
  }



  public boolean add(String element){
    String[] arr = new String[arr.length + 1];
    ArrPlus[arr.length - 1] = element;
    return true;
  }



  public String get(int index){
    if(index > arr.length){
      return "Error: Index out of bound";
    }
    return arr[index];
  }



  public String set(int index, String element){
    oldEl = arr[index]
    if(index > arr.length){
      return "Error: Index out of bound";
    }
    arr[index] = element;
    System.out.println(oldEl);
  }



  public String toString(){
      for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i])
      }
  }



  public boolean contains(String element){
      int counter = 1;
      for(int i = 0; i < arr.lenth;i++){
        if (arr[i].equals(element)){
          counter += 1;
        }
      }
      if (counter >= 1){
        return true;
      }
      return false;
  }



  public void add(int index, String element){

  }



  public int lastIndexOf(String element){

  }



  public String remove(int index){
    if(index <= arr.length){
      newArr = new String[arr.length - 1];
      for(int i = 0; i < index; i++){
        arr[i] = newArr[i];
      }
      for(int i = index; i < arr.length; i++){
        arr[i + 1] = newArr[i];
      }
      System.out.println(arr[index]);
    }
    System.out.println("Error: Index out of bound")
  }
  



  public boolean remove(String element){

  }
}
