public class Trie {
    // This is the building block of Trie which is called TrieNode
    // its internal data structure is an array of TrieNode
    public class TrieNode{
        private TrieNode[] links;
        private final int R = 26;
        private boolean isEnd;

        public TrieNode(){
            links = new TrieNode[R];
        }

        // check if certain character is in the links
        public boolean containsKey(char ch){
            return links[ch - 'a'] !=null;
        }

        public TrieNode get(char ch){
            return links[ch - 'a'];
        }

        public void put (char ch, TrieNode node){
            links[ch - 'a'] = node;
        }

        public void setEnd(){
            isEnd = true;
        }

        public boolean isEnd(){
            return isEnd;
        }
    }

    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    public void insert(String word){
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++){
            char currChar = word.charAt(i);
            if(!node.containsKey(currChar)){
                node.put(currChar, new TrieNode());
            }
            node = node.get(currChar);
        }
        node.setEnd();
    }

    public TrieNode searchPrefix( String word){
        TrieNode node = root;
        for (int i = 0; i <word.length(); i++){
            char curletter = word.charAt(i);
            if(node.containsKey(curletter)){
                node = node.get(curletter);
            }else {
                return null;
            }
        }
        return node;
    }

    public boolean search(String word){
        TrieNode node = searchPrefix(word);
        return node != null && node.isEnd();
    }

    public boolean startWith(String word){
        TrieNode node = searchPrefix(word);
        return node != null;
    }

}
