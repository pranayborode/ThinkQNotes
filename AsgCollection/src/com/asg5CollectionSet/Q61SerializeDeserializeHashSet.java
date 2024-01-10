package com.asg5CollectionSet;

import java.util.HashSet;
import java.io.*;

//61. Create hashset of 5 strings. Serialize and deserialize hashset.

public class Q61SerializeDeserializeHashSet {

	private static void serialize(HashSet<String> set, String filename) {

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
			oos.writeObject(set);
			System.out.println("HashSet serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	private static HashSet<String> deserialize(String filename) {
		HashSet<String> set = new HashSet<>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			set = (HashSet<String>) ois.readObject();
			System.out.println("HashSet deserialized successfully.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return set;
	}

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<>();

		hs.add("Apple");
		hs.add("Banana");
		hs.add("Orange");
		hs.add("Grapes");
		hs.add("Cherry");

		System.out.println(hs);

		serialize(hs, "hashSetSerialized.ser");

		// Deserialize the HashSet
		HashSet<String> deserializedSet = deserialize("hashSetSerialized.ser");

		// Display the deserialized HashSet
		System.out.println("Deserialized HashSet: " + deserializedSet);

	}

}
