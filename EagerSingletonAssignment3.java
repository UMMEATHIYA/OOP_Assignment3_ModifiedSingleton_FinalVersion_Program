package Q1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EagerSingletonAssignment3 {

    // the variables are defined as private static because they prove a good example of encapsulation and these variables can be accessed within the class and static variables can be accessed with the help of class name.
    private static final int MAXIMUM_INSTANCES = 3;
    private static int inst_count = 0;
    // this statement basically instantiates the number of instances to be created, also it holds an array of elements.
    // In this case there are 3 instances as suggested in the question.
    private static EagerSingletonAssignment3[] instances = new EagerSingletonAssignment3[MAXIMUM_INSTANCES];

    // this is a static initialization block which creates the instances during the loading time.
    // All the instances are created at one time even if the user may not be needing all the instances.
    // This is good for exception handling.
    // this block is traversing through the number of elements or the instances.
    static {
        for (int i = 0; i < MAXIMUM_INSTANCES; i++) {
            instances[i] = new EagerSingletonAssignment3(inst_count);
        }
    }

    private EagerSingletonAssignment3(int instanceNumber) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
        String formattedDate = dateFormat.format(new Date());
        System.out.println("Instance " + instanceNumber + " created at: " + formattedDate);
    }

    public static EagerSingletonAssignment3 getInstance(int instanceNumber) {
        EagerSingletonAssignment3 result;
        if (inst_count < MAXIMUM_INSTANCES) {
            result = instances[inst_count++];
        } else {
            System.out.println("Maximum number of instances reached.");
            result = null;
        }
        return result;


    }
}