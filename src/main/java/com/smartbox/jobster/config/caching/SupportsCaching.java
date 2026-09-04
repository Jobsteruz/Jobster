package com.smartbox.jobster.config.caching;

public interface SupportsCaching extends JbCacheKeyMaker{

    Object key();
}
