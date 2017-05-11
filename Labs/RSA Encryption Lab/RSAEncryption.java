import java.math.BigInteger;
import java.util.Random;
// Import statements for use in the program: Random and BigInteger

public class RSAEncryption
{
private BigInteger publicKey;    //e
private BigInteger privateKey;    //d
private BigInteger modulous;    //n
private final static Random randomNum=new Random();

public RSAEncryption()
{
        BigInteger prime1=BigInteger.probablePrime(256,randomNum);  //q
        BigInteger prime2=BigInteger.probablePrime(256,randomNum);  //p
        // Creates two random prime numbers using probablePrime in BigInteger
        BigInteger totient=(prime1.subtract(BigInteger.valueOf(1))).multiply(prime2.subtract(BigInteger.valueOf(1)));  //Phi
        // Creates a variable named totient for use below
        modulous=prime1.multiply(prime2);
        // Creates modulous by doing prime1*prime2
        publicKey=new BigInteger("17");
        // Creates the publicKey using the prime # 17
        privateKey=publicKey.modInverse(totient);
        // Creates the privateKey by taking the modulous inverse of the publicKey using the totient
}
public BigInteger encrypt(BigInteger number)
{
        return number.modPow(publicKey,modulous);
        // Returns the number to the modulous power of publicKey using modulous
        // (number^publicKey)%modulous
}
public BigInteger decrypt(BigInteger encryptedNum)
{
        return encryptedNum.modPow(privateKey, modulous);
        // Returns the number to the modulous power of privateKey using modulous
        // (number^publicKey)%modulous
}
public static void main(String[] args)
{
        Boolean executed=false; // Creates a boolean named executed
        while(!executed)// While executed is not of executed
        {
                try // Tries to execute code
                {
                        RSAEncryption RSA = new RSAEncryption();
                        // Creates a new RSAEncryption named RSA
                        BigInteger number =BigInteger.probablePrime(255, randomNum);
                        // Creates a random BigInteger number that is probablePrime
                        System.out.println("Starting Number: "+number.toString());
                        // Prints out the starting number
                        number=RSA.encrypt(number);
                        // Encrypts number and sets it equal to number
                        System.out.println("Encrypted Number: "+number.toString());
                        // Prints out the number
                        number=RSA.decrypt(number);
                        // Decrypts the number
                        System.out.println("Encrypted Number After Decryption: "+number.toString());
                        // Prints out the decrypted number
                        executed=true;
                }
                catch(ArithmeticException main) // Catches any ArithmeticExceptions
                {
                        //empty to allow the try block to be repeated
                }
        }
}
}
