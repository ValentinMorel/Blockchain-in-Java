package chain;
import java.util.Date;
import java.util.List;


public class Block {
    public String hash;
    public String previousHash;
    public String data;
    public long timestamp;
    public int nonce;

    public Block(String data, String previousHash){
        this.data = data;
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();

        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedHash = StringUtil.applySha256(
                        previousHash +
                        Long.toString(timestamp) +
                        Integer.toString(nonce) +
                        data
        );
        return calculatedHash;
    }

    public static void addBlock(List<Block> blockchain, Block newBlock, int difficulty){
        newBlock.mineBlock(difficulty);
        blockchain.add(newBlock);
    }

    public void mineBlock(int difficulty){
        String target = StringUtil.getDifficultyString(difficulty);
        while(!hash.substring(0, difficulty).equals(target)){
            nonce ++;
            hash = calculateHash();
        }
        System.out.println("Block mined ! : " + hash);
    }
}
