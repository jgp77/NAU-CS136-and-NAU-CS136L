import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
* This program creates a JFrame from the BankAccount class.
* The class creates a panel with buttons that has a text field
* and will allow for a user to deposit and withdraw from a balance.
* The program will catch any invalid inputs (negative numbers,
* letters, etc...) and will prompt the user.
*
* @return      A JFrame with a JPanel that displays a textfield for user input
*/
@SuppressWarnings("serial")
public class BankAccountSimulator
{
  private JFrame frame=new JFrame();
  // Creates a frame to hold everything
  private JPanel panel=new JPanel();
  // Creates a panel to store the items
  private double balance=1000;
  // Double that holds current balance
  private JButton deposit=new JButton("Deposit");
  // Button to deposit money
  private JButton withdraw=new JButton("Withdraw");
  // Button to withdraw money
  private JLabel currentBalance=new JLabel("Balance: $"+String.valueOf(balance));
  // Label of the current balance
  private JLabel inputAmount=new JLabel("Amount to deposit/withdraw:");
  // Label for the text fields
  private JLabel transactionLabel=new JLabel("Welcome to a bank account simulator!");
  // Displays user withdraws/deposists
  private JTextField amount=new JTextField(10);;
  // Textfield for user input

  /**
  * Set up for the JPanels for the JFrame.
  * Also sets the size, close op, and visibility
  *
  * @param       createFrame   Method that creates the nessesary componenets and sets up frame
  * @return      A JFrame with a JPanel that displays a textfield for user input
  */
  public BankAccountSimulator()
  {
    createFrame();
    // Goes to createFrame
    frame.setSize(600,150);
    // Sets frame size
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Sets close op
    frame.setVisible(true);
    // Set visibility
  }

  /**
  * Creates the components, adds to a panel, and then adds to frame
  *
  * @param       deposit          Button to deposit amount
  * @param       withdraw         button to withdraw amount
  * @param       inputAmount      Label for the amount textfield
  * @param       amount           textfield for the user input
  * @param       currentBalance   Label of the current balance
  * @param       transactionLabel Label to prompt user of changes
  * @return      None, adds components to frame
  */
  private void createFrame()
  {
    deposit.addActionListener(new ActionListener()
    {
      // Adding ActionListener to the button
      public void actionPerformed(ActionEvent e)
      {
        // Tries to get and change balance
        try
        {
          double input=Double.parseDouble(amount.getText());
          // Gets textfields value
          if(input<0){throw new NumberFormatException();}
          // If number is negative throw exception
          else
          {
          balance+=input;
          // Else add input to balance
          currentBalance.setText("Balance: $"+String.valueOf(balance));
          // Set text of the currentBalance label
          transactionLabel.setText("Amount added: $"+input);
          // Changes information of the transaction label
        }
        }
        catch(NumberFormatException event){transactionLabel.setText("Invalid input! Must be a positive number.");}
        // Informs the user if the number inputted is not the correct input. I.E. not a number of less than 0
        finally{}
          // Empty finally as it is unneeded
        }
      });
      withdraw.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          // Tries to get and change balance
          try
          {
            double input=Double.parseDouble(amount.getText());
            // Gets textfields value
            if(input<0){throw new NumberFormatException();}
            // If number is negative throw exception
            else if(input>balance){throw new NumberFormatException();}
            // Else if the input is greater than the balance
            else{balance-=input; currentBalance.setText("Balance: $"+String.valueOf(balance)); transactionLabel.setText("Amount withdrawn: $"+input);}
            // else do input minus balance and changes corrisponding labels
          }
          catch(NumberFormatException event){transactionLabel.setText("Invalid input! Must be a positive number and less than current balance.");}
          // Informs the user if the number inputted is not the correct input. I.E. not a number of less than 0
          finally{}
            // Empty finally as it is unneeded
          }
        });
        panel.setBackground(Color.WHITE);
        panel.add(inputAmount);
        panel.add(amount);
        panel.add(deposit);
        panel.add(withdraw);
        panel.add(currentBalance);
        panel.add(transactionLabel);
        // Adding items to panel
        frame.add(panel);
        // Add panel to frame
      }

      public static void main(String[] args)
      {
        // Creates a new frame using BankAccount
        BankAccount testFrame=new BankAccount();
      }
    }
