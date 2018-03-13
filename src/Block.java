import java.util.Arrays;

public class Block {
    private int previousBlocksHash;
    private String[] transactions;

    private int blockHash;

    public Block(int previousBlocksHash, String[] transactions) {
        this.previousBlocksHash = previousBlocksHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions), previousBlocksHash};
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousBlocksHash() {
        return previousBlocksHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}

