package lruCache;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {

	private Deque<Integer> keys;
	private Map<Integer, Integer> cache = new HashMap<>();
	private int capacity;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		keys = new ArrayDeque(capacity);
	}

	public int get(int key) {
		if(cache.containsKey(key)) {
			updateValue(key);
			return cache.get(key);
		}
		return -1;
	}

	private void updateValue(int key) {
		keys.remove(key);
		keys.addFirst(key);

	}

	public void put(int key, int value) {
		if (!cache.containsKey(key)) {
			if (keys.size() >= capacity) {
				int removeKey = keys.removeLast();
				cache.remove(removeKey);
			}
			cache.put(key, value);
			keys.addFirst(key);
		} else {
			cache.put(key, value);
			keys.remove(key);
			keys.addFirst(key);
		}
	}

}
