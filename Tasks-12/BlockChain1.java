import java.util.ArrayList;
import java.util.Arrays;

class Block {
private String[] transactions;
private int blockHash;
private int previousBlockHash;


    @Override
    public String toString() {
        return "Block{" +
                "transactions=" + Arrays.toString(transactions) +
                ", blockHash=" + blockHash +
                ", previousBlockHash=" + previousBlockHash +
                '}';
    }

    public Block(String[] transactions, int previousBlockHash ){
    super();
    this.transactions=transactions;
    this.previousBlockHash=previousBlockHash;
    this.blockHash= Arrays.hashCode(new int[]{Arrays.hashCode(transactions),this.previousBlockHash}  );
}

    public String[] getTransaction() {
        return transactions;
    }

    public void setTransaction(String[] transaction) {
        this.transactions = transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPreviousBlockHash() {
        return previousBlockHash;
    }

    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
}

//₹
public class BlockChain1 {
    public static void main(String[] args) {
        ArrayList<Block> blockchain=new ArrayList<Block>();

        //1st Block

        String [] initialValues= {"P1 has ₹7000","P2 has ₹5000"};
        Block firstBlock= new Block(initialValues,0);
         blockchain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The block chain is " + blockchain.toString());

        //2nd Block
        System.out.println("\n");

        String [] P2gives= {"P1 gives P3 ₹1000","P1 gives P4 ₹1500","P1 gives P5 ₹2000"};
        Block secondBlock= new Block(P2gives,firstBlock.getBlockHash());
        blockchain.add(secondBlock);
        System.out.println("Second block is " + secondBlock.toString());
        System.out.println("The block chain is " + blockchain.toString());


        //3rd Block
        System.out.println("\n");

        String [] P2gets= {"P1 gets ₹500 from P3","P1 gets ₹1500 from P5"};
        Block thirdBlock= new Block(P2gets,secondBlock.getBlockHash());
        blockchain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The block chain is " + blockchain.toString());

    }
}
