public class SuperArray{

  private String[] arr;
  private int size;

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
      size = counter;
      return size;
  }



  public boolean isEmpty(){
    if(arr.length == 0){
      return true;
    }
    return false;
  }



  public boolean add(String element){
    String[] arrPlus = new String[arr.length + 1];
    arrPlus[arr.length - 1] = element;
    arr = arrPlus;
    size = size + 1;
    return true;
  }



  public String get(int index){
    if(index > arr.length){
      throw new IndexOutOfBoundsException();
    }
    return arr[index];
  }



  public String set(int index, String element){
    String oldEl = arr[index];
    if(index > arr.length){
      throw new IndexOutOfBoundsException();
    }
    arr[index] = element;
    return oldEl;
  }



  public String toString(){
      String output = "[";
      for(int i = 0; i < arr.length; i++){
        output += arr[i] + ",";
      }
      return output + "]";
  }



  public boolean contains(String element){
      int counter = 1;
      for(int i = 0; i < arr.length;i++){
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
    if(index > arr.length){
      throw new IndexOutOfBoundsException();
    }
    arr = new String[size + 1];
    size++;
    for(int i = size; i > index; i--){
      arr[i] = arr[i-1];
    }
    arr[index] = element;
  }

  public int indexOf(String element){
    for(int i = 0; i < size; i++){
      if(arr[i] == element){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String element){
    for (int i = 1; i - size() != 1; i++) {
      if (data[size() - i] == element) {
        return size() - i;
      }
    }
    return -1;
  }

  public String remove(int index){
    String output = arr[index];
    String[] tempArr = new String[size-1];
    for(int i = 0; i < index; i++){
      tempArr[i] = arr[i];
    }
    for(int i = index + 1; i < size; i++){
      tempArr[i - 1] = arr[1];
    }
    arr = tempArr;
    size--;
    return output;
  }


  public boolean remove(String element){
    int index = indexOf(element);
    remove(index);
    return true;
  }



}
