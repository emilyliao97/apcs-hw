1. HashMap vs HashSet (and TreeMap vs TreeSet)

HashMaps and TreeMaps implement the Map interface, and provides keys that point to vales. Thus, a HashMap allows for duplication, because keys can point to multiple values, including null. On the other hand, HashSets and TreeSets implement the Set interface and puts values in an unordered set, in which no values can be repeated. While HashMaps and HashSets are unsorted, TreeMaps and TreeSets are sorted.

2. HashMap implementation

Instances of HashMaps, which implement the Map interface, have an initial capacity and a load factor. When the ratio of taken slots to available slots exceepts the load factor, the HashMap will grow in size in order to maintain efficiency.

3. TreeMap implementation

Instance of TreeMaps also implement the map interface and orders all the inputted values. it can take a comparator to sort these values, but can also use the natureal ordering of its keys. To insert and delete from a TreeMap requires for the shifting and re-balancing of the Tree to maintain its order.

4. HashMap vs TreeMap: the Speed Test
- inserting into the HashMap is faster than inserting into a TreeMap (probably because the TreeMap needs to sort the data)
- the same results hold true for deleting
- both clear at the same speeds

5. Heaps in java

The built-in Heap data structure in java is the PriorityQueue
