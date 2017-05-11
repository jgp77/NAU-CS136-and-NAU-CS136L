public class Beserker implements Player
{
private double health;
private double attack;
private String attackType;
private String playerType;
private double slashDef;
private double smashDef;
private double fireDef;
private String playerName;
public Beserker(String name)
{
        playerName= name;
        playerType="Beserker";
        health=35;
        attackType="smash";
        attack=20;
        fireDef=0.5;
        slashDef=2;
        smashDef=1;
        attack=20;
}
public double doDMG()
{
        int hitSelf=(int)((Math.random() *4)+1);
        // creates a random int between 1 and 4
        if(hitSelf==1)
        // if the int is 1
        {
                System.out.println(playerName+" hits themself in the attack");
                // prints that they attack themself
                health-=attack;
                // reduces health
                return attack;
                // returns the attack
        }
        else
        {
                return attack;
                // returns the attack
        }
}

public boolean isAlive()
{
        if(health>0)
        // if the health is greater than 0
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
