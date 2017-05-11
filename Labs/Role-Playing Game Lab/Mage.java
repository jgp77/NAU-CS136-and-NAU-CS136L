public class Mage implements Player
{
private double health;
private double attack;
private String attackType;
private String playerType;
private double slashDef;
private double smashDef;
private double fireDef;
private String playerName;
public Mage(String name)
{
        playerName=name;
        playerType="Mage";
        health=(int)((Math.random()*60)+10);
        attackType="fire";
        fireDef=0.5;
        slashDef=2;
        smashDef=1;
}
public double doDMG()
{
        return ((Math.random() *6)+0);
}
public boolean isAlive()
{
        if(health>0)
        {
                return true;
        }
        else
        {
                return false;
        }
}
public void takeDamage(String type,double amount)
{
        double actualDamage =0;
        // sets a double for calculating damage after defense is taken into account
        if(type.equals("smash"))
        // if damage type is smash
        {
                actualDamage=(amount*smashDef);
        }
        if(type.equals("fire"))
        // if damage type is fire
        {
                actualDamage=(amount*fireDef);
        }
        if(type.equals("slash"))
        // if damage type is slash
        {
                actualDamage=(amount*slashDef);
        }
        health-=actualDamage;
        // deducts damage from health
        if(health <0)
        // checks if player has died
        {
                System.out.println(playerName+" has died!");
                health=0;
        }
}
public String getName()
{
        return playerName;
}
public double getHP()
{
        return health;
}
public String getType()
{
        return attackType;
}
}
