package com.smartbox.jobster.bean;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.multimap.MultiMap;
import com.smartbox.jobster.config.caching.JbKeyGenerator;
import com.smartbox.jobster.config.caching.RedisCacheNames;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.UUID;

@Component(value = "jb_TgMessageIdsCache")
public class TgMessageIdsCache {
    private static final Logger log = LoggerFactory.getLogger(TgMessageIdsCache.class);

    @Autowired
    private HazelcastInstance hazelcastInstance;
    @Autowired
    private JbKeyGenerator jbKeyGenerator;

    public void cacheTgMessageId(UUID botId, Long chatId, Integer msgId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }


    // gets and removes random values size of maxElements
    public Collection<Integer> getAndRemoveTgMessageIds(UUID botId, Long chatId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
