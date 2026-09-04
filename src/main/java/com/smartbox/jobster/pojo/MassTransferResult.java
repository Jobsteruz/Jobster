package com.smartbox.jobster.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @param movedByFromStage how many entities actually left each source stage, keyed by stage id. The
 *                         board needs the real numbers — not the selection size — to correct its
 *                         cached column totals, since a failed candidate never left its column.
 */
public record MassTransferResult(
        String username,
        String stageName,
        int total,
        int success,
        int failed,
        List<String> failedNames,
        Map<UUID, Integer> movedByFromStage
) implements Serializable {
}
