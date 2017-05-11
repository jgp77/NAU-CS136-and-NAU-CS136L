public class RomCalc
{

  public String convertToRoman(int decNumber)
  {
    String romNumber="";
    int number=decNumber;
    while (number >= 1000)
    {
      number-=1000;
      romNumber+="M";
    }
    while (number >=900 && number <1000)
    {
      number-=900;
      romNumber+="CM";
    }
    while (number >= 500)
    {
      number-=500;
      romNumber+="D";
    }
    while (number >=400 && number <500)
    {
      number-=400;
      romNumber+="CD";
    }
    while (number >= 100)
    {
      number-=100;
      romNumber+="C";
    }
    while (number >=90 && number <100)
    {
      number-=90;
      romNumber+="XC";
    }
    while (number >= 50)
    {
      number-=50;
      romNumber+="L";
    }
    while (number >=40 && number <50)
    {
      number-=40;
      romNumber+="XL";
    }
    while (number >= 10)
    {
      number-=10;
      romNumber+="X";
    }
    while (number >=9 && number <10)
    {
      number-=9;
      romNumber+="IX";
    }
    while(number >= 5)
    {
      number-=5;
      romNumber+="V";
    }

    if (number == 4)
    {
      number-=4;
      romNumber+="IV";
    }
    while (number <= 3 && number >0)
    {
      number-=1;
      romNumber+="I";
    }
    return romNumber;
  }
}
