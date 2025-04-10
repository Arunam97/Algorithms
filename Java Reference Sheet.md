# Arrays

| Description                                    | Syntax                                                      |
|------------------------------------------------|-------------------------------------------------------------|
| Import                                         | `import java.util.Arrays;`                                  |
| Initialization                                 | `datatype[] arrayName = new datatype[size]; `               |
| Access Element                                 | `arrayName[index];    `                                     |
| Assign Element                                 | `arrayName[index] = value;    `                             |
| Array Length                                   | `arrayName.length;     `                                    |
| Array to List                                  | `listName.addAll(Arrays.asList(array));`                    |
| Sort an Array                                  | `Arrays.sort(arrayName);`                                   |
| Iterating through Array (for-each loop)        | `for (datatype element : arrayName) { /* code */ }`         |
| Iterating through Array (traditional for loop) | `for (int i = 0; i < arrayName.length; i++) { /* code */ }` |

# ArrayList (List)

| Description                      | Syntax                                                |
|----------------------------------|-------------------------------------------------------|
| Import                           | `import java.util.ArrayList;`                         |
| Declaration                      | `ArrayList<ElementType> listName = new ArrayList<>()` |
| Add Element                      | `listName.add(element);`                              |
| Add at Index                     | `listName.add(index, element);`                       |
| Get Size                         | `int size = listName.size();`                         |
| Clear All Elements               | `listName.clear();`                                   |
| Add all elements of an Array     | `listName.addAll(Arrays.asList(array));`              |
| Convert ArrayList to Array       | `Object[] stringArray = stringList.toArray();`        |
| Sort List                        | `Collections.sort(listName);`                         |
| Add all elements of a Collection | `listName.addAll(collection);`                        |
| Deep Copy another List           | `listName = new ArrayList<>(oldList);`                |
| Get Element at Index             | `ElementType element = listName.get(index);`          |
| Set Element at Index             | `listName.set(index, newElement);`                    |
| Remove Element at Index          | `listName.remove(index);`                             |
| Check Existence                  | `boolean exists = listName.contains(element);`        |
| Get Index of Element             | `int index = listName.indexOf(element);`              |
| Get Last Index of Element        | `int lastIndex = listName.lastIndexOf(element);`      |
| Is Empty                         | `boolean isEmpty = listName.isEmpty();`               |
| Iterate using For-Each Loop      | `for (ElementType element : listName) { /* code */ }` |

# HashMap (Map)

| Description                 | Syntax                                                                                                                                                              |
|-----------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Import                      | `import java.util.HashMap;`                                                                                                                                         |
| Declaration                 | `HashMap<KeyType, ValueType> mapName = new HashMap<>();`                                                                                                            |
| Put Key-Value Pair          | `mapName.put(key, value);`                                                                                                                                          |
| Get Value by Key            | `ValueType value = mapName.get(key);`                                                                                                                               |
| Get Size                    | `int size = mapName.size();`                                                                                                                                        |
| Get Value or return default | `mapName.getOrDefault(key, defaultValue);`                                                                                                                          |
| Remove Key-Value Pair       | `mapName.remove(key);`                                                                                                                                              |
| Clear All Key-Value Pairs   | `mapName.clear();`                                                                                                                                                  |
| Check Key Existence         | `boolean exists = mapName.containsKey(key);`                                                                                                                        |
| Check Value Existence       | `boolean exists = mapName.containsValue(value);`                                                                                                                    |
| Is Empty                    | `boolean isEmpty = mapName.isEmpty();`                                                                                                                              |
| Iterate through Keys        | `for (KeyType key : mapName.keySet()) { /* code */ }`                                                                                                               |
| Iterate through Values      | `for (ValueType value : mapName.values()) { /* code */ }`                                                                                                           |
| Iterate through Entries     | `for (Map.Entry<KeyType, ValueType> entry : mapName.entrySet()) {` <br/> `System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()); `<br/> `}` |
| Replace Value               | `mapName.replace(key, newValue);`                                                                                                                                   |

# Character

| Description                                        | Syntax                          |
|----------------------------------------------------|---------------------------------|
| Checks if the character is a letter.               | `Character.isLetter(ch)`        |
| Checks if the character is a digit.                | `Character.isDigit(ch)`         |
| Checks if the character is a whitespace character. | `Character.isWhitespace(ch)`    |
| Checks if the character is a letter or digit.      | `Character.isLetterOrDigit(ch)` |
| Checks if the character is uppercase.              | `Character.isUpperCase(ch)`     |
| Checks if the character is lowercase.              | `Character.isLowerCase(ch)`     |
| Converts the character to uppercase.               | `Character.toUpperCase(ch)`     |
| Converts the character to lowercase.               | `Character.toLowerCase(ch)`     |
| Converts the character to a string.                | `Character.toString(ch)`        |

# Strings

| Description                                               | Syntax                                |
|-----------------------------------------------------------|---------------------------------------|
| Returns the length of the string.                         | `str.length()`                        |
| Returns the character at the specified index.             | `str.charAt(index)`                   |
| Converts the string to an array of characters.            | `str.toCharArray()`                   |
| Converts an array of characters to a string.              | `String.valueOf(charArray)`           |
| Checks if the string is empty.                            | `str.isEmpty()`                       |
| Checks if the string contains a sequence of characters.   | `str.contains(sequence)`              |
| Checks if the string matches a regular expression.        | `str.matches(regex)`                  |
| Removes leading and trailing whitespaces.                 | `str.trim()`                          |
| Splits the string into an array of substrings.            | `str.split(delimiter)`                |
| Returns a substring from the specified index.             | `str.substring(beginIndex)`           |
| Returns a substring from the specified range.             | `str.substring(beginIndex, endIndex)` |
| Concatenates the specified string to the end.             | `str.concat(otherStr)`                |
| Compares the content of two strings for equality.         | `str.equals(otherStr)`                |
| Checks if the string starts with the given prefix.        | `str.startsWith(prefix)`              |
| Checks if the string ends with the given suffix.          | `str.endsWith(suffix)`                |
| Returns the index of the first occurrence of a substring. | `str.indexOf(substring)`              |
| Replaces occurrences of a substring with another.         | `str.replace(oldStr, newStr)`         |
| Converts the string to uppercase.                         | `str.toUpperCase()`                   |
| Converts the string to lowercase.                         | `str.toLowerCase()`                   |

# HashSet (Set)

| Description                      | Syntax                                                       |
|----------------------------------|--------------------------------------------------------------|
| Import                           | `import java.util.HashSet;`                                  |
| Declaration                      | `HashSet<ElementType> setName = new HashSet<>();`            |
| Add Element                      | `setName.add(element);`                                      |
| Get Size                         | `int size = setName.size();`                                 |
| Convert Set to List              | `List<ElementType> list = new ArrayList<>(setName);`         |
| Convert List to Set              | `Set<ElementType> set = new HashSet<>(list);`                |
| Convert Set to Array             | `ElementType[] array = setName.toArray(new ElementType[0]);` |
| Add all elements of a Collection | `setName.addAll(collection);`                                |
| Remove Element                   | `setName.remove(element);`                                   |
| Check Existence                  | `boolean exists = setName.contains(element);`                |
| Clear All Elements               | `setName.clear();`                                           |
| Iterate through Set              | `for (ElementType element : setName) { /* code */ }`         |

# StringBuilder

| Description                                     | Syntax                                                     |
|-------------------------------------------------|------------------------------------------------------------|
| Creates a new StringBuilder object.             | `StringBuilder sb = new StringBuilder();`                  |
| Convert String to StringBuilder                 | `StringBuilder sb = new StringBuilder(str);`               |
| Convert to String                               | `String str = sb.toString();`                              |
| Returns the length of the StringBuilder.        | `sb.length()`                                              |
| Returns substring of StringBuilder              | `sb.substring(start)`                                      |
| Returns substring of specified range            | `sb.substring(start, end)` <br/> End index is not included |
| Appends the string representation of an object. | `sb.append(object)`                                        |
| Inserts the string representation of an object. | `sb.insert(index, object)`                                 |
| Replaces a substring with another string.       | `sb.replace(start, end, newStr)`                           |
| Deletes a substring from the StringBuilder.     | `sb.delete(start, end)`                                    |
| Deletes a character at the specified index.     | `sb.deleteCharAt(index)`                                   |
| Reverses the characters in the StringBuilder.   | `sb.reverse()`                                             |
