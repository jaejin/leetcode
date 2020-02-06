package lruCache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {


	@Test
	public void test() {
		LRUCache lruCache = new LRUCache(2);

		StringBuffer buffer = new StringBuffer();
		lruCache.put(1,1);
		lruCache.put(2,2);
		buffer.append(lruCache.get(1)) ;
		buffer.append(" ");
		lruCache.put(3,3);
		buffer.append(lruCache.get(2));
		buffer.append(" ");
		lruCache.put(4,4);
		buffer.append(lruCache.get(1));
		buffer.append(" ");
		buffer.append(lruCache.get(3));
		buffer.append(" ");
		buffer.append(lruCache.get(4));
		buffer.append(" ");

		assertEquals("1 -1 -1 3 4 ", buffer.toString());
	}

}