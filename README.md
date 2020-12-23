# Notes

## Process vs Thread

- One process can have multiple threads sharing data, code, heap and etc. 

- Context switch between threads cost less than processes.

## java.lang.Thread vs java.lang.Runnable

- Thread implements Runnable.

- Thread is a class. Runnable is a interface.

- Thread has multiple methods and variables. Runnable only has methods `run()`.

- Thread is created and starts by calling `Thread.start()`, then `Thread.run()` will be executed.