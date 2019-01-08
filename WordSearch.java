public class WordSearch{
    private char[][]data;
    private int rowNum;
    private int columnNum;



    WordSearch(int rows,int cols){
      data = new char[rows][cols];
		  for (int i = 0; i < data.length; i++){
			     for (int z = 0; z < data[i].length; z++){
				         data[i][z] = '_';
			     }
		  }
    }


    private void clear(){
      for(int i; i < data.length; i++){
        for (int z; data[i].length; z++){
          data[i][z] = '_';
        }
      }
    }


    public String toString(){
      for(int i = 0; i < data[rowNum]; i++){

      }
    }



    public boolean addWordHorizontal(String word,int row, int col){
      if(word.length() < col){
        for(int z = 0; z < data[row].length; i++){
          for(int i = 0; i < word.length(); i++){
            data[row][i] = word.charAt(i);
            return true;
          }
        }
      }
      clear();
      return false;
    }


    public boolean addWordVertical(String word,int row, int col){
      if(word.length() < row){
        for(int z = 0; z < data[col].length; z++){
          for(int i = 0; i < word.length(); i++){
            data[col][i] = word.charAt(i);
            return true;
          }
        }
      }
      clear();
      return false;
    }

    public boolean addWordDiagonal(String word, int row, int col){
      if(word.length() < row && word.length() < col){
        for(int z = 0; z < data[col].length; z++){
          for(int i = 0; i < word.length(); i++){
              data[z][i] = word.charAt(i);
              return true;
          }
        }
      }
      clear();
      return false;
    }

    public boolean addAllWords(String word, int row, int col){

    }





}
