Grant Zukowski
Assignment 1: AD 325; Backmasking Minus
January 2016
NSC Winter Quarter

1. I tested my implementations by first creating .dat files from the .wav files.  Once I had
the .dat files, I ran the ReverseDat program on them to see what was produced.  Odly, the
array implementation worked the first time, which led me to suspicion.  After reversing the
.dat files, I converted them back to .wav files and listend to them.  I compared them with the
original .wav file by listening to both to see if the reversal was reasonable.  I also,
tested if each implementation was working by seeing what the file size of the output file was.
Since array implementation worked the first time, I had a lot of confidence for LinkedList
implementation.  Unfortunately, when I ran the LinkedList implementation I found that it never
stopped.  I had to close cmd.  When I checked the file size each time running it, I noticed that
it was based on how long I let the file run, so it could create a huge file and fill up my whole
drive.  This led me to believe I had a infinite loop running somewhere, so I found that first.
Once I closed the loop, the program would only produce a 34 kb file, which was only the header.
This led me to believe that the push wasn't working.  After thinking about it, I realized the 
pop was the culprit.  After some refactoring, everythign worked great.  During the testing
process I realized that I was actually doing a lot of refactoring, so my code was much more
streamlined and easy to read.

2. Yes, I transcribed all of them.  I used a mixture of linked and array implementation.  I was
curious which one was faster and how I would test the speed.  

3. My favorite part was the concept of creating an implementation of a larger projects tool.  
It seems much more useful and real-world when I create an implementation that your larger
project - ReverseDat is using.  Also, it was fun to create a class file from the .java file. 
Finally, it was fun to use another program to convert the files back to .wav files.

4. Getting everything organized in a file structure was difficult.  As well as trouble shooting
the bug in my linkedList implementation.  I had to get calm and remind myself that "this will
take some time".  