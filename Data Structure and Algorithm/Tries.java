import java.util.HashMap;
// WILL IMPLEMENTED THIS LATER!!!!!!

// Tries is type of tree data structure to store the char
// implement a contact list using tries, two methods. One is add to the tries, and the other is given a string and see how many contact start with that string
// add(string)  findCount(prefix)
// each node store how many children it has
public class Tries {
    public static class Node{
        private static int NUMBER_OF_CHARACTERS = 26;
        Node[] children = new Node[NUMBER_OF_CHARACTERS];

        private static int getCharIndex(char c){
            return c - 'a';
        }


        // get the node at that value
        //private Node getNode(char c){}

        private void setNode(char c){}

        private void add(String s, int index){}

        //public int findCount(String s, int index){}


    }
    // bulid a hashmap for quick key value look up
    HashMap<Character, Node> children = new HashMap<>();

    // boolean method to return true or false if a certain char is a word
    public boolean isComplete(){


        return true;
    }


}
