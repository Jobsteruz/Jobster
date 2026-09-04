package com.smartbox.jobster.entity.quiz;

/**
 * Where a sent quiz currently stands, from the recruiter's point of view.
 * <p>
 * Not persisted — derived from the {@link QuizPerson} dates every time it is displayed. It has to
 * be: {@code finished} means the candidate went through the whole quiz (the web quiz sets it only
 * after the SMS verification step, the bots only after the last answer) and a timed-out attempt
 * never earns it, not even once its score has been recorded, so {@code finished} alone cannot tell
 * "still solving" from "ran out of time".
 */
public enum QuizProgress {
    /** Sent, but the candidate never pressed Start. */
    /** Started, still within the allotted time. */
    /** The candidate went through the whole quiz. */
    /** Started, but the allotted time ran out before the quiz was completed. */

    NOT_STARTED,
    IN_PROGRESS,
    FINISHED,
    EXPIRED
}