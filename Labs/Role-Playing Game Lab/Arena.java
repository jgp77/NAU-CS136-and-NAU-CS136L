public class Arena
{
public static void main(String[] args)
{
        Beserker beserk=new Beserker("Tom");
        // Creates first beserker
        System.out.println("Created: "+beserk.getName()+" with "+beserk.getHP()+" health.");
        // Prints out verification
        Beserker beserker=new Beserker("Jim");
        // Creates second beserker
        System.out.println("Created: "+beserker.getName()+" with "+beserker.getHP()+" health.");
        // Prints out verification
        Mage mage=new Mage("Jake");
        // Creates first mage
        System.out.println("Created: "+mage.getName()+" with "+mage.getHP()+" health.");
        // Prints out verification
        Mage magic=new Mage("Johnny");
        // Creates second mage
        System.out.println("Created: "+magic.getName()+" with "+magic.getHP()+" health.");
        // Prints out verification
        Warrior warrior=new Warrior("Theodore");
        // Creates first warrior
        System.out.println("Created: "+warrior.getName()+" with "+warrior.getHP()+" health.");
        // Prints out verification
        Warrior fighter=new Warrior("Tim");
        // Creates second warrior
        System.out.println("Created: "+fighter.getName()+" with "+fighter.getHP()+" health.");
        // Prints out verification
        boolean gameActive=true;
        // sets a boolean for active games
        double largestHP=0;
        // creates a double for the largest amount of health
        boolean turnActive=false;
        // sets a boolean for active turns
        double damage=0;
        // Damage to give to targets
        int target=0;
        // integer for aquiring targets
        while(gameActive)
        // while the game is active
        {
                // Beserker attack phase
                turnActive=true;
                // sets a new turn
                target=(int)((Math.random()*5)+1);
                // sets target to a random integer between 1 and 5
                damage=beserk.doDMG();
                // sets the damage to the beserkers damage
                while(turnActive&&beserk.isAlive())
                // while the turn is active and attacker is alive
                {
                        if(beserker.isAlive()&&target==1)
                        // if the beserker is alive and the target is 1
                        {
                                System.out.println(beserk.getName()+ " attacks "+beserker.getName()+" for "+damage+" damage.");
                                // Prints out the attack
                                beserker.takeDamage(beserk.getType(),damage);
                                // beserker takes damage
                                turnActive=false;
                                // ends turn
                        }
                        if(mage.isAlive()&&target==2)
                        // if the mage is alive and the target is 2
                        {
                                System.out.println(beserk.getName()+ " attacks "+mage.getName()+" for "+damage+" damage.");
                                // Prints out the attack
                                mage.takeDamage(beserk.getType(),damage);
                                // mage takes damage
                                if(!mage.isAlive())
                                // if the mage dies
                                {
                                        beserk.takeDamage(mage.getType(),5);
                                        // attacker takes damage
                                }
                                turnActive=false;
                                // ends turn
                        }
                        if(magic.isAlive()&&target==3)
                        // if magic is alive and target is 3
                        {
                                System.out.println(beserk.getName()+ " attacks "+magic.getName()+" for "+damage+" damage.");
                                // Prints out the attack
                                magic.takeDamage(beserk.getType(),damage);
                                // magic takes damage
                                if(!magic.isAlive())
                                //if magic dies
                                {
                                        beserk.takeDamage(magic.getType(),5);
                                        // attacker is damaged
                                }
                                turnActive=false;
                                // ends the turn
                        }
                        if(warrior.isAlive()&&target==4)
                        // if the warrior is alive and target is 4
                        {
                                System.out.println(beserk.getName()+ " attacks "+warrior.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                warrior.takeDamage(beserk.getType(),damage);
                                // warrior takes damage
                                turnActive=false;
                                //ends the turn
                        }
                        if(fighter.isAlive()&&target==5)
                        // if the fighter is alive and target is 5
                        {
                                System.out.println(beserk.getName()+ " attacks "+fighter.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                fighter.takeDamage(beserk.getType(),damage);
                                // fighter takes damage
                                turnActive=false;
                                // ends the turn
                        }
                        else
                        // else statement in case if one is dead
                        {
                                target+=1;
                        }
                }
                // Beserker attack phase
                turnActive=true;
                // sets a new turn
                target=(int)((Math.random()*5)+1);
                // sets target to a random integer between 1 and 5
                damage=beserker.doDMG();
                // sets the damage to the beserkers damage
                while(turnActive&&beserker.isAlive())
                // while the turn is active and attacker is alive
                {
                        if(beserk.isAlive()&&target==1)
                        // if beserk is alive and target is 1
                        {
                                System.out.println(beserker.getName()+ " attacks "+beserk.getName()+" for "+damage+" damage.");
                                // prints out attack
                                beserk.takeDamage(beserker.getType(),damage);
                                //beserk takes damage
                                turnActive=false;
                                // ends turn
                        }
                        if(mage.isAlive()&&target==2)
                        // if the mage is alive and the target is 2
                        {
                                System.out.println(beserk.getName()+ " attacks "+mage.getName()+" for "+damage+" damage.");
                                // Prints out the attack
                                mage.takeDamage(beserk.getType(),damage);
                                // mage takes damage
                                if(!mage.isAlive())
                                // if the mage dies
                                {
                                        beserk.takeDamage(mage.getType(),5);
                                        // attacker takes damage
                                }
                                turnActive=false;
                                // ends turn
                        }
                        if(magic.isAlive()&&target==3)
                        // if magic is alive and target is 3
                        {
                                System.out.println(beserk.getName()+ " attacks "+magic.getName()+" for "+damage+" damage.");
                                // Prints out the attack
                                magic.takeDamage(beserk.getType(),damage);
                                // magic takes damage
                                if(!magic.isAlive())
                                //if magic dies
                                {
                                        beserk.takeDamage(magic.getType(),5);
                                        // attacker is damaged
                                }
                                turnActive=false;
                                // ends the turn
                        }
                        if(warrior.isAlive()&&target==4)
                        // if the warrior is alive and target is 4
                        {
                                System.out.println(beserk.getName()+ " attacks "+warrior.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                warrior.takeDamage(beserk.getType(),damage);
                                // warrior takes damage
                                turnActive=false;
                                //ends the turn
                        }
                        if(fighter.isAlive()&&target==5)
                        // if the fighter is alive and target is 5
                        {
                                System.out.println(beserk.getName()+ " attacks "+fighter.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                fighter.takeDamage(beserk.getType(),damage);
                                // fighter takes damage
                                turnActive=false;
                                // ends the turn
                        }
                        else
                        // else statement in case if one is dead
                        {
                                target+=1;
                        }
                }
                // Mage attack phase
                turnActive=true;
                // activates turn
                while(turnActive&&mage.isAlive())
                // while the turn is active and attacker is alive
                {
                        damage=mage.doDMG();
                        System.out.println(mage.getName()+ " hurts themself in the attack for "+damage+" damage.");
                        mage.takeDamage(mage.getType(),damage);
                        if(beserker.isAlive())
                        // if the beserker is alive
                        {
                                damage=mage.doDMG();
                                System.out.println(mage.getName()+ " attacks "+beserker.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserker.takeDamage(mage.getType(),damage);
                                // does the attack
                        }
                        if(beserk.isAlive())
                        {
                                damage=mage.doDMG();
                                System.out.println(mage.getName()+ " attacks "+beserk.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserk.takeDamage(mage.getType(),damage);
                                // does the attack
                        }
                        if(magic.isAlive())
                        {
                                damage=mage.doDMG();
                                System.out.println(mage.getName()+ " attacks "+magic.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                magic.takeDamage(mage.getType(),damage);
                                // does the attack
                                if(!magic.isAlive())
                                // if magic dies
                                {
                                        mage.takeDamage(magic.getType(),5);
                                        // does damage to attacker
                                }
                        }
                        if(warrior.isAlive())
                        {
                                damage=mage.doDMG();
                                System.out.println(mage.getName()+ " attacks "+warrior.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                warrior.takeDamage(mage.getType(),damage);
                                // does the attack
                        }
                        if(fighter.isAlive())
                        {
                                damage=mage.doDMG();
                                System.out.println(mage.getName()+ " attacks "+fighter.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                fighter.takeDamage(mage.getType(),damage);
                                // does the attack
                        }
                        turnActive=false;
                        // ends turn
                }
                // Mage attack phase
                turnActive=true;
                while(turnActive&&magic.isAlive())
                // while the turn is active and attacker is alive
                {
                        damage=magic.doDMG();
                        System.out.println(magic.getName()+ " hurts themself in the attack for "+damage+" damage.");
                        mage.takeDamage(magic.getType(),damage);
                        if(beserker.isAlive())
                        {
                                damage=magic.doDMG();
                                System.out.println(magic.getName()+ " attacks "+beserker.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserker.takeDamage(magic.getType(),magic.doDMG());
                                // does the attack
                        }
                        if(beserk.isAlive())
                        {
                                damage=magic.doDMG();
                                System.out.println(magic.getName()+ " attacks "+beserk.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserk.takeDamage(magic.getType(),damage);
                                // does the attack
                        }
                        if(mage.isAlive())
                        {
                                damage=magic.doDMG();
                                System.out.println(magic.getName()+ " attacks "+mage.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                mage.takeDamage(magic.getType(),damage);
                                // does the attack
                                if(!mage.isAlive())
                                // if mage dies
                                {
                                        mage.takeDamage(magic.getType(),5);
                                        // damages attacker
                                }
                        }
                        if(warrior.isAlive())
                        {
                                damage=magic.doDMG();
                                System.out.println(magic.getName()+ " attacks "+warrior.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                warrior.takeDamage(magic.getType(),damage);
                                // does the attack
                        }
                        if(fighter.isAlive())
                        {
                                damage=magic.doDMG();
                                System.out.println(magic.getName()+ " attacks "+fighter.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                fighter.takeDamage(magic.getType(),damage);
                                // does the attack
                        }
                        turnActive=false;
                }
                // Warrior attack phase
                turnActive=true;
                // begins turn
                damage=warrior.doDMG();
                // sets damage to warrior's damage
                while(turnActive&&warrior.isAlive())
                // while the turn is active and attacker is alive
                {
                        if((beserk.getHP()>beserker.getHP()) && (beserk.getHP()> magic.getHP()) && beserk.getHP()>mage.getHP()&&beserk.getHP()>fighter.getHP())
                        // if beserk has the greatest health
                        {
                                System.out.println(warrior.getName()+ " attacks "+beserk.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserk.takeDamage(warrior.getType(),damage);
                                // does the attack
                        }
                        if(beserker.getHP()>beserk.getHP() && beserker.getHP()> magic.getHP()&& beserker.getHP()>mage.getHP()&&beserker.getHP()>fighter.getHP())
                        // if beserker has the greatest health
                        {
                                System.out.println(warrior.getName()+ " attacks "+beserker.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserker.takeDamage(warrior.getType(),damage);
                                // does the attack
                        }
                        if(magic.getHP()>beserk.getHP() && magic.getHP()> beserker.getHP()&& magic.getHP()>mage.getHP()&&magic.getHP()>fighter.getHP())
                        // if magic has the greatest health
                        {
                                System.out.println(warrior.getName()+ " attacks "+magic.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                magic.takeDamage(warrior.getType(),damage);
                                // does the attack
                                if(!magic.isAlive())
                                // if mage dies
                                {
                                        warrior.takeDamage(magic.getType(),5);
                                        // damages attacker
                                }
                        }
                        if(mage.getHP()>beserk.getHP() && mage.getHP()> beserker.getHP()&& mage.getHP()>magic.getHP()&&mage.getHP()>fighter.getHP())
                        // if mage has the greatest health
                        {
                                System.out.println(warrior.getName()+ " attacks "+mage.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                mage.takeDamage(warrior.getType(),damage);
                                // does the attack
                                if(!mage.isAlive())
                                // if mage dies
                                {
                                        warrior.takeDamage(mage.getType(),5);
                                        // damages attacker
                                }
                        }
                        if(fighter.getHP()>beserk.getHP() && fighter.getHP()> beserker.getHP()&& fighter.getHP()>magic.getHP()&&fighter.getHP()>mage.getHP())
                        // if fighter has the greatest health
                        {
                                System.out.println(warrior.getName()+ " attacks "+fighter.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                fighter.takeDamage(warrior.getType(),damage);
                                // does the attack
                        }
                        turnActive=false;
                        // ends turn
                }
                // Warrior attack phase
                turnActive=true;
                // begins turn
                damage=fighter.doDMG();
                // sets damage to fighter's damage
                while(turnActive&&fighter.isAlive())
                // while the turn is active and attacker is alive
                {
                        if((beserk.getHP()>beserker.getHP()) && (beserk.getHP()> magic.getHP()) && beserk.getHP()>mage.getHP()&&beserk.getHP()>fighter.getHP())
                        // if beserk has the greatest health
                        {
                                System.out.println(fighter.getName()+ " attacks "+beserk.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserk.takeDamage(fighter.getType(),damage);
                                // does the attack
                        }
                        if(beserker.getHP()>beserk.getHP() && beserker.getHP()> magic.getHP()&& beserker.getHP()>mage.getHP()&&beserker.getHP()>fighter.getHP())
                        // if beserker has the greatest health
                        {
                                System.out.println(fighter.getName()+ " attacks "+beserker.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                beserker.takeDamage(fighter.getType(),damage);
                                // does the attack
                        }
                        if(magic.getHP()>beserk.getHP() && magic.getHP()> beserker.getHP()&& magic.getHP()>mage.getHP()&&magic.getHP()>fighter.getHP())
                        // if magic has the greatest health
                        {
                                System.out.println(fighter.getName()+ " attacks "+magic.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                magic.takeDamage(fighter.getType(),damage);
                                // does the attack
                                if(!magic.isAlive())
                                // if mage dies
                                {
                                        fighter.takeDamage(magic.getType(),5);
                                        // damages attacker
                                }
                        }
                        if(mage.getHP()>beserk.getHP() && mage.getHP()> beserker.getHP()&& mage.getHP()>magic.getHP()&&mage.getHP()>fighter.getHP())
                        // if mage has the greatest health
                        {
                                System.out.println(fighter.getName()+ " attacks "+mage.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                mage.takeDamage(fighter.getType(),damage);
                                // does the attack
                                if(!mage.isAlive())
                                // if mage dies
                                {
                                        fighter.takeDamage(mage.getType(),5);
                                        // damages attacker
                                }
                        }
                        if(warrior.getHP()>beserk.getHP() && fighter.getHP()> beserker.getHP()&& fighter.getHP()>magic.getHP()&&fighter.getHP()>mage.getHP())
                        // if warrior has the greatest health
                        {
                                System.out.println(fighter.getName()+ " attacks "+warrior.getName()+" for "+damage+" damage.");
                                // prints out the attack
                                warrior.takeDamage(fighter.getType(),damage);
                                // does the attack
                        }
                        turnActive=false;
                        // Ends turn
                }
                // Winner checking faze
                if(beserk.isAlive()&&!beserker.isAlive()&&!mage.isAlive()&&!magic.isAlive()&&!warrior.isAlive()&&!fighter.isAlive())
                // if beserk is the only one alive
                {
                        System.out.println(beserk.getName()+" has won!");
                        gameActive=false;
                        // Print statement and ends game
                }
                if(beserker.isAlive()&&!beserk.isAlive()&&!mage.isAlive()&&!magic.isAlive()&&!warrior.isAlive()&&!fighter.isAlive())
                {
                        System.out.println(beserker.getName()+" has won!");
                        gameActive=false;
                        // Print statement and ends game
                }
                if(mage.isAlive()&&!beserk.isAlive()&&!beserker.isAlive()&&!magic.isAlive()&&!warrior.isAlive()&&!fighter.isAlive())
                {
                        System.out.println(mage.getName()+" has won!");
                        gameActive=false;
                        // Print statement and ends game
                }
                if(magic.isAlive()&&!beserk.isAlive()&&!beserker.isAlive()&&!mage.isAlive()&&!warrior.isAlive()&&!fighter.isAlive())
                {
                        System.out.println(magic.getName()+" has won!");
                        gameActive=false;
                        // Print statement and ends game
                }
                if(warrior.isAlive()&&!beserk.isAlive()&&!beserker.isAlive()&&!mage.isAlive()&&!magic.isAlive()&&!fighter.isAlive())
                {
                        System.out.println(warrior.getName()+" has won!");
                        gameActive=false;
                        // Print statement and ends game
                }
                if(fighter.isAlive()&&!beserk.isAlive()&&!beserker.isAlive()&&!mage.isAlive()&&!magic.isAlive()&&!warrior.isAlive())
                {
                        System.out.println(fighter.getName()+" has won!");
                        gameActive=false;
                        // Print statement and ends game
                }
        }
}
}
