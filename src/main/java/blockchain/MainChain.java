import chain.*;
import java.util.List;
import java.util.ArrayList;

public class MainChain {
    public static List<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 4;

    public static void main(String[] args){
        System.out.println("Trying to mine : block 1...");
        Block.addBlock(blockchain, new Block("Hi I'm genesis Block", "0"), difficulty);
    }
}
