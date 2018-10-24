
public class TrieTest {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insertWord("car");
        trie.insertWord("card");
        trie.insertWord("chip");
        trie.insertWord("trie");
        trie.insertWord("try");
        
//        trie.isPrefixValid("tr");
//        trie.isPrefixValid("ca");
//        trie.isPrefixValid("ty");
        
//        trie.isWordValid("car");
//        trie.isWordValid("try");
//        trie.isWordValid("boy");
//        trie.isWordValid("cat");
        
        trie.printAllKeys();
        
    }
}