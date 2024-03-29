class TrieNode{
    boolean isWord;
    TrieNode[] children = new TrieNode[26];
    TrieNode(){
        isWord=false;
    }
}
class Trie {

    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
        root=new TrieNode();
        
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ws=root;
        for(int i=0;i<word.length();i++){
            int c=word.charAt(i);
            if(ws.children[c-'a']==null){
                ws.children[c-'a'] = new TrieNode();
            }
            ws=ws.children[c-'a'];
        }
        ws.isWord=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ws=root;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(ws.children[c-'a']==null){
                return false;
            }
            ws=ws.children[c-'a'];
        }
        return ws.isWord;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode ws=root;
        for(int i=0;i<prefix.length();i++){
            char c=prefix.charAt(i);
            if(ws.children[c-'a']==null){
                return false;
        }
            ws=ws.children[c-'a'];
    }
        return true;
}
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
