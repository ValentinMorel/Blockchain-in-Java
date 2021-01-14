import chain.*;
import java.util.ArrayList;


public class MainChain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 4;

    public static void main(String[] args){
        System.out.println("Trying to block 1...");
        Block.addBlock(blockchain, new Block("Hi I'm genesis Block", "0"), difficulty);
    }
}
