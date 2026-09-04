package com.smartbox.jobster.bot.tg.event;

public interface EventData {
    String EVENT = "EVENT_";
    String EVENT_RESPONSE_ACCEPT = EVENT + "RESPONSE_ACCEPT_";
    String EVENT_RESPONSE_DECLINE = EVENT + "RESPONSE_DECLINE_";
    String EVENT_CANCEL_REASON = EVENT + "CANCEL_REASON_";

    String MANAGER_EVENT = "MEV_";
    String MANAGER_EVENT_ACCEPT = MANAGER_EVENT + "ACCEPT_";
    String MANAGER_EVENT_DECLINE = MANAGER_EVENT + "DECLINE_";
}