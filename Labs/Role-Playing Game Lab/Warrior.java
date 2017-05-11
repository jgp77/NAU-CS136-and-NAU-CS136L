public class Warrior implements Player
{
private double health;
private double attack;
private String attackType;
private String playerType;
private double slashDef;
private double smashDef;
private double fireDef;
private String playerName;
public Warrior(String name)
{
        playerName=name;
        playerType="Warrior";
        health= (int) ((Math.random() *40)+20);
        attackType="slash";
        attack=(int) ((Math.random() *16)+10);
        fireDef=1;
        slashDef=1;
        smashDef=1;
}
public void takeDamage(String type,double amount)
{
        int roll=(int)((Math.random() *4)+1);
        // rolls to see if attack is dodged
        double actualDamage=0;
        // sets a double for calculating damage after defense
        if(roll==1&&(type.equals("smash")||type.equals("slash")))
        // if the roll is 1 and the attack type is smash or slash
        {
                System.out.println(playerName+" dodges");
                // prints
        }
        else
        {
                if(type.equals("smash"))
                // If the attack type is smash
                {
                        actualDamage=amount*smashDef;
                }
                if(type.equals("fire"))
                // if attack type is fire
                {
                        actualDamage=amount*fireDef;
                }
                if(type.equals("slash"))
                // if attack is slash
                {
                        actualDamage=amount*slashDef;
                }
                health-=actualDamage;
                // subtracts the damage from health
                if(health <0)
                // if the player has died
                {
                        System.out.println(playerName+" has died!");
                        health=0;
                }
        }
}
public double doDMG()
{
        return ((Math.random() *16)+10);
        // calculates random amount of damage
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
