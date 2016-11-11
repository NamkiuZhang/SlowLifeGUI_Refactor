# SlowLifeGUI

At the beginning, from the result, we could see that the method  in Mainpanel class: convertToPoint(), runContinuous(), backup() and Cell.init() use more time, and char[] use the most bytes.

<img width="560" alt="1" src="https://cloud.githubusercontent.com/assets/16142079/20227666/4d0d45be-a81b-11e6-9bd8-58166c7c9a90.png">

##convertToInt()
First, I look at he method convertToPoint(); I find that the parameter itself is a integer and the method can not change a negative number. It will cause number format exception.  I annotated the original codes and write 3 new line codes.

<img width="273" alt="2" src="https://cloud.githubusercontent.com/assets/16142079/20227668/51b5f34a-a81b-11e6-81dd-315b046236f9.png">

After I changed it. The CPU and Memory performance showed as following:
<img width="560" alt="3" src="https://cloud.githubusercontent.com/assets/16142079/20227670/51b93c3a-a81b-11e6-97df-9565d08f5966.png">

##runContinuous()
Then I began to look method runContinuous(), found that _r is still the same value as before after the for loop, and the thread.sleep also waste many time. So I annotated these lines and the statement of _r, since  _r parameter is no longer useful. 

<img width="560" alt="4" src="https://cloud.githubusercontent.com/assets/16142079/20227673/51b9cb82-a81b-11e6-9914-c60ebf4d06f9.png">



Then the performance changed

<img width="560" alt="5" src="https://cloud.githubusercontent.com/assets/16142079/20227669/51b8cfca-a81b-11e6-9ce5-6afb4ae275ea.png">













Next I run the game continuous and stop, then use write, the performance is following.
<img width="560" alt="6" src="https://cloud.githubusercontent.com/assets/16142079/20227671/51b937b2-a81b-11e6-8c6a-c75f683c9591.png">

##toString()
Then I began to check Cell.toString() method, found the for loop and the _maxSize variableis useless , I did the following change in Cell class 
Since the Cell.toString() method is called in MainPanel.toString() and from the screenshots find mainPanel.toString() is also in there. So I check it at the same time, did some changes.

<img width="560" alt="7" src="https://cloud.githubusercontent.com/assets/16142079/20227672/51b96084-a81b-11e6-967c-ff83def95470.png">

After I change, when I do write operation, the performance is following.
<img width="560" alt="8" src="https://cloud.githubusercontent.com/assets/16142079/20227674/51bbcb58-a81b-11e6-8cad-02d292c96986.png">


