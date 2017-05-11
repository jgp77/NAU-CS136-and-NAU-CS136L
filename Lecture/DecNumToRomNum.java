public class DecNumToRomNum
{
  public static void main(String[] args)
  {
    RomCalc RomanNumeral=new RomCalc();
    int count=0;
    int random;
    while (count != 5)
    {
      count+=1;
      random=(int )(Math.random() * 3999 + 1);
      System.out.println(random+ " => " +RomanNumeral.convertToRoman(random));
    }
  }
}
