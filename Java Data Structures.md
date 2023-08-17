# Arrays
| Function                                       | Syntax                                                                         |
| ---------------------------------------------- | ------------------------------------------------------------------------------ |
| Initialization                                 | datatype[] arrayName = new datatype[size];                                     |
| Access Element                                 | arrayName[index];                                                              |
| Assign Element                                 | arrayName[index] = value;                                                      |
| Array Length                                   | arrayName.length;                                                              |
| Iterating through Array (for-each loop)        | for (datatype element : arrayName) { /\* code using element \*/ }              |
| Iterating through Array (traditional for loop) | for (int i = 0; i < arrayName.length; i++) { /\* code using arrayName[i] \*/ } |

# ArrayList (List)
| Function                    | Syntax                                                 |
|-----------------------------|--------------------------------------------------------|
| Import                      | import java.util.ArrayList;                            |
| Declaration                 | ArrayList\<ElementType> listName = new ArrayList\<>(); |
| Add Element                 | listName.add(element);                                 |
| Add at Index                | listName.add(index, element);                          |
| Deep Copy another List      | newList = new ArrayList\<>(oldList);                   |
| Get Element at Index        | ElementType element = listName.get(index);             |
| Set Element at Index        | listName.set(index, newElement);                       |
| Remove Element at Index     | listName.remove(index);                                |
| Remove by Object            | listName.remove(element);                              |
| Check Existence             | boolean exists = listName.contains(element);           |
| Get Index of Element        | int index = listName.indexOf(element);                 |
| Get Last Index of Element   | int lastIndex = listName.lastIndexOf(element);         |
| Get Size                    | int size = listName.size();                            |
| Is Empty                    | boolean isEmpty = listName.isEmpty();                  |
| Iterate using For-Each Loop | for (ElementType element : listName) { /\* code \*/ }  |

# HashSet (Set)
| Function            | Syntax                                               |
| ------------------- |------------------------------------------------------|
| Import              | import java.util.HashSet;                            |
| Declaration         | HashSet\<ElementType> setName = new HashSet<>();     |
| Add Element         | setName.add(element);                                |
| Remove Element      | setName.remove(element);                             |
| Check Existence     | boolean exists = setName.contains(element);          |
| Get Size            | int size = setName.size();                           |
| Clear All Elements  | setName.clear();                                     |
| Iterate through Set | for (ElementType element : setName) { /\* code \*/ } |

# HashMap (Map)
| Function                  | Syntax                                                                          |
| ------------------------- | ------------------------------------------------------------------------------- |
| Import                    | import java.util.HashMap;                                                       |
| Declaration               | HashMap<KeyType, ValueType> mapName = new HashMap<>();                          |
| Put Key-Value Pair        | mapName.put(key, value);                                                        |
| Get Value by Key          | ValueType value = mapName.get(key);                                             |
| Remove Key-Value Pair     | mapName.remove(key);                                                            |
| Clear All Key-Value Pairs | mapName.clear();                                                                |
| Check Key Existence       | boolean exists = mapName.containsKey(key);                                      |
| Check Value Existence     | boolean exists = mapName.containsValue(value);                                  |
| Get Size                  | int size = mapName.size();                                                      |
| Is Empty                  | boolean isEmpty = mapName.isEmpty();                                            |
| Iterate through Keys      | for (KeyType key : mapName.keySet()) { /\* code \*/ }                           |
| Iterate through Values    | for (ValueType value : mapName.values()) { /\* code \*/ }                       |
| Iterate through Entries   | for (Map.Entry<KeyType, ValueType> entry : mapName.entrySet()) { /\* code \*/ } |
| Replace Value             | mapName.replace(key, newValue);                                                 |