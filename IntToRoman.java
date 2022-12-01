import java.util.ArrayList;
import java.util.List;


class Pair<Integer,String>
{
  private int p1;
  private String p2;
  Pair(int i, String j)
  {
    this.p1 = i;
    this.p2 = j;
  }
  public int getInt()
  {
    return p1;
  }
  public String getString(){
    return p2;
  }
}
public class IntToRoman {
        public String intRoman(int num) {
        //TreeMap<Integer, String> romanNum = new TreeMap<Integer, String>(Collections.reverseOrder());
        //Pair<Integer, String> finalVar = new Pair<Integer, String> ();
        List<Pair<Integer, String>> romList = new ArrayList<Pair<Integer,String>>();

        
        romList.add(0, new Pair(1,"I"));
        romList.add(1,new Pair(4,"IV"));
        romList.add(2, new Pair(5,"V"));
        romList.add(3, new Pair(9,"IX"));
        romList.add(4, new Pair(10,"X"));
        romList.add(5, new Pair(40,"XL"));
        romList.add(6, new Pair(50,"L"));
        romList.add(7, new Pair(90,"XC"));
        romList.add(8, new Pair(100,"C"));
        romList.add(9, new Pair(400,"CD"));
        romList.add(10, new Pair(500,"D"));
        romList.add(11, new Pair(900,"CM"));
        romList.add(12, new Pair(1000,"M"));
        
        //2560 = MMDLX

        String finalVar = "";
        int number = num;
        for (int i = romList.size()-1; i > -1 ; i--){

            int pairInt = romList.get(i).getInt(); //integer value for List's Pairs
            //System.out.println(pairInt);
            int tempVar = number / pairInt; //how many 
            //System.out.println(tempVar);
            int smaller = tempVar * pairInt; // how much to decrease the num by
           
            String rom = romList.get(i).getString();
            if(tempVar > 0 ){
               finalVar = finalVar + rom.repeat(tempVar);
            }
            number -= smaller;
        }
        return finalVar;
    }
    public static void main(String[] args){
        IntToRoman theFinal = new IntToRoman();
        String pissOff = theFinal.intRoman(1);
        System.out.println(pissOff);
    } 
}
