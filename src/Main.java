import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        // Hash of arrays
        /*String[] list1 = {"a", "b", "c"};
        String[] list2 = {"ab", "b", "c"};
        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));*/

        // BlockChine
        String[] genesisTransaction = {"a satoshi sent ivan 10000 bitcoin", "hal finney sent 10 bitcoins to ivan"};
        Block genesisBlock = new Block(0, genesisTransaction);

        String[] block2Transaction = {"ivan sent 10 bitcoin to satoshi ", "satoshi sent 10 bitcoin to starbouck"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transaction);

        String[] block3Transaction = {"ivan sent 999 bitcoin to my mom"};
        Block block3 = new Block(genesisBlock.getBlockHash(), block3Transaction);

        System.out.println("Hash of genesis block");
        System.out.println(genesisBlock.getBlockHash());
        System.out.println("Hash of block 2");
        System.out.println(block2.getBlockHash());
        System.out.println("Hash of block 3");
        System.out.println(block3.getBlockHash());
    }
}
