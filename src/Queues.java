import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queues {
    public static void main(String[] args) {

        // Queue<String> games = new Queue<String>();  does not work!
        Queue<String> games = new LinkedList<String>();

        System.out.println(".add (No push in Queue) ------- to  build the Queue:  ");
        games.add("bottom");
        games.add("middle");
        games.add("higherMiddle");
        games.add("evenHigherMiddle");
        games.add("Top");
        games.add("Higher Top");

        System.out.println("                        New Queue is : " + games);

        System.out.println(".poll(), no pop --- to poll out,so changed original stack,  the first-in (left end) value as: " + games.poll());
        System.out.println("                     So, the resultant stack, after pop, as: " + games);

        System.out.println(".peek() --- look at the first-in (left end) item, not changing the original stack, to give : " + games.peek());
        System.out.println("                               So, the resultant stack unchanged as: " + games);

        System.out.println("Print by System.out.println(stackName); --- to print the items in a stack [bottom.....top] as :   " + games);

        System.out.println(".size() --- to print the # of items in a stack :  " + games.size());


        // No .get() , unlike stack.
//        System.out.println(".get(index#), more than .peek(), --- look at item by any index#, not changing the original stack.  For example .get(0) gives out:  " + games.get(0));
//        System.out.println("                                                                                               Another example .get(1) gives out:  " + games.get(1));
//        System.out.println("                               So, the resultant stack unchanged as: " + games);

        System.out.println(".contains() --- give true or false, therefore, .contains(\"bottom\") ?   " + games.contains("bottom"));

        // No .search() , unlike stack.
//        System.out.println(".search(), more than .contains(), --- give position# of an item from the top item as #1 (the right end). So in a stack of  " + games);
//        System.out.println("                                   .search(\"middle\") ---  give  " + games.search("middle"));
//        System.out.println("                                   .search() however --- give -1 if that item is not found in the stack, therefore, .search(\"car\") ------- give :  " + games.search("car"));

        System.out.println(".isEmpty() ------- give true of false, not changing the original stack, whether stack is empty ?   " + games.isEmpty());
        // No .empty() , unlike stack.
//        System.out.println(".empty() ------- give true of false, not changing the original stack, whether stack is empty ?   " + games.empty());
//        System.out.println("                 So, the resultant stack is unchanged as :  " + games);

//        System.out.println(".set(index#, value) ------ At index#, spit out the old value and replace the old value by a new value");
//        System.out.println("                    .set(1,\"content\") give out the replaced old value :  " + games.set(1,"content"));
//        System.out.println("                    So, changed the stack to  :  " + games);

        System.out.println(".toArray() ------- reproduce, not changing the original stack, an array out of this stack as :" + games.toArray());
        System.out.println("                   .get(index#) not used in Queue, print games.toArray()[2] , left end as index 0 , will give :  " + games.toArray()[2]);

        System.out.println(".clear()-----clear all elements in a stack but does not delete the stack. Now the stack is cleared:");
        games.clear();
        System.out.println(games);






    }
}
