class Main{
  public static void Snow(){
    System.out.print(" * *  *");
  }
  public static void Winter(int temp){
    if(temp<32){
      System.out.print("Brr! ");
    temp += 1;
    Winter( temp );
  }
}
public static void main(String[] args) {
  Winter(21);
  Snow();
}
}