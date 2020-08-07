package basicAlgorithm;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 通过LinkedHashMap实现LRU算法
 * @author guoshoujing
 * @create 2020-04-07 8:46 上午
 */
public class LruCache<K, V> extends LinkedHashMap<K, V> {
    private Integer capacity;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

    public LruCache(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor, true);
        capacity = initialCapacity;
    }

    public LruCache(int initialCapacity) {
        super(initialCapacity, DEFAULT_LOAD_FACTOR, true);
        capacity = initialCapacity;
    }

    public LruCache() {
        super(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR, true);
        capacity = DEFAULT_INITIAL_CAPACITY;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > capacity;
    }

    /**
     * 测试：容量指定为4, 插入[1,1] [2,2] [3,3] [4,4]遍历输出, 后访问[3,3], 之后遍历输出，再插入[5,5]遍历输出。
     */
    public static void main(String[] args) {
        LruCache<Integer, Integer> lruCache = new LruCache<>(4);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        System.out.println("---------");
        lruCache.forEach((key, value) -> System.out.println(key + "," + value));

        lruCache.get(3);
        System.out.println("---------");
        lruCache.forEach((key, value) -> System.out.println(key + "," + value));

        lruCache.put(5, 5);
        System.out.println("---------");
        lruCache.forEach((key, value) -> System.out.println(key + "," + value));
    }
}
