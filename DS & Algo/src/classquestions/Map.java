package classquestions;
import java.util.*;

// implementation of hashtable using chaining linkedlist
class HashNode<K,V>{
    K key;
    V value;

    //next node
    HashNode next;

    //constructor
    HashNode(K key,V value){
        this.key = key;
        this.value = value;
    }
}

public class Map<K,V> {

    // initializing the array , size and capacity(bucketsize)
     ArrayList<HashNode<K,V>> bucket;
     int bucketSize;
     int size;



     //initializing capacity as 10
     public Map(){
         bucket = new ArrayList<>();
         bucketSize = 10;
         size = 0;

         //adding null so that index contains something
         for(int i = 0;i<bucketSize;i++){
             bucket.add(i,null);
         }
     }

     //getting the size filled capacity of map
    public int size(){
        return size;
    }

    //hashfunction to get the index
     public int getBucketIndex(K key){
         int k = key.hashCode();
         return k%bucketSize;
     }

     //getting the value of key
     public V get(K key){
         //getting index through hashfunction
         int index = getBucketIndex(key);
         //becomes the head
         HashNode<K,V> head = bucket.get(index);
         while(head!=null){
             if(head.key==key){
                 return head.value;
             }
             head = head.next;
         }
         return null;
     }

     //inserting a key value pair
     public void put(K key, V value){
         int bucketIndex = getBucketIndex(key);
         HashNode<K,V> head = bucket.get(bucketIndex);
         while (head!=null){
             // if already present replace the value
             if(head.key==key){
                 head.value = value;
                 return;
             }
             head = head.next;
         }

         //else increase the size
         size++;

         //resetting head to the index
         head = bucket.get(bucketIndex);
         //creating new node with the key value
         HashNode<K,V> node = new HashNode<>(key,value);
         //placing the node before head
         node.next = head;
         //adding the node in array
         bucket.set(bucketIndex,node);

         //Load factor greater than 0.7 then double the capacity with the help of new arraylist
         if(size/bucketSize>=0.7){
             ArrayList<HashNode<K,V>> tempList = bucket;
             bucketSize *=2;
             size = 0;

             //same process
             for(int i = 0;i<bucketSize;i++){
                 bucket.add(null);
             }

             //copying values to bucket array and adding
             for(HashNode<K,V> hashNode:tempList){
                 while (hashNode!=null){
                     put(hashNode.key,hashNode.value);
                     hashNode = hashNode.next;
                 }
             }
         }
     }

     public static void main(String [] args){
         Map<Integer,Integer> map = new Map<>();
         map.put(1,1);
         map.put(4,5);
         map.put(6,7);
         System.out.println(map.get(7));
     }
}
