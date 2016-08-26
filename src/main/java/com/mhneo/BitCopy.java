public class CopyBit{
  public String copyBit(long data){
    String aa = "";
    for(int j=0;j< 32;j++){
      aa = (data & 1) + aa;
      data = data >> 1;
    }
    return aa;
  }
  public String copyBit(int data){
    String aa = "";
    for(int j=0;j< 32;j++){
      aa = (data & 1) + aa;
      data = data >> 1;
    }
    return aa;
  }
}
