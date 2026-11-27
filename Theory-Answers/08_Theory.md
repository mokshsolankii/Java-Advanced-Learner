# Question 8

**Explain thread lifecycle and the difference between start() and run().**

A thread moves through states such as NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, and TERMINATED. start() asks the JVM to schedule a new thread; calling run() directly is an ordinary method call on the current thread.
