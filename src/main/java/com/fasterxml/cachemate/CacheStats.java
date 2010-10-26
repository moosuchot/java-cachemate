package com.fasterxml.cachemate;

public class CacheStats
{
    protected final int _hits;
    protected final int _misses;
    protected final int _insertions;

    protected final int _entryCount;
    protected final long _totalWeight;

    protected final int _maxEntryCount;
    protected final long _maxTotalWeight;
    
    public CacheStats(int hits, int misses, int insertions,
            int entryCount, long totalWeight,
            int maxEntryCount, long maxTotalWeight)
    {
        _hits = hits;
        _misses = misses;
        _insertions = insertions;
        _entryCount = entryCount;
        _totalWeight = totalWeight;
        _maxEntryCount = maxEntryCount;
        _maxTotalWeight = maxTotalWeight;
    }

    public int getHits() { return _hits; }
    public int getMisses() { return _misses; }
    public int getTotalGets() { return _hits + _misses; }

    public int getEntryCount() { return _entryCount; }
    public long getTotalWeight() { return _totalWeight; }

    public int getMaxEntryCount() { return _maxEntryCount; }
    public long getMaxTotalWeight() { return _maxTotalWeight; }

}