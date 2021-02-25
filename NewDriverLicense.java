/**
 * You have to get a new driver´s license ans you
 * show up at the office at the same time as 4
 * other people. The office says that they will see
 * everyone in alphabetical order and takes 20
 * minutes for them to process each new license.
 * All of the agents are available now, and they
 * can each see one customer at the time. How
 * long will take for you to walk out of the office
 * with your new license?
 * 
 * Task:
 * Given everyone´s name that showed up at the
 * same time, determine how long it will take to
 * get your new license.
 * 
 * Input Format:
 * Your input will be a string of your name, then
 * an integer of number of available agents,
 * and lastly a string of the other four names
 * separated by spaces.
 * 
 * Output Format:
 * You will output an integer of the number of
 * minutes that it will take to get you license.
 * 
 * Sample Input:
 * "Eric"
 * 2
 * "Adam Caroline Rebecca Frank"
 * 
 * Sample Output:
 * 40
 */
package pruebas;
import java.util.Scanner;

/**
 * @author devendetta
 * Follow me https://github.com/devendetta
 * @version 1.0.0
 */
public class NewDriverLicense {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, names;
        int agents, time, index=0;
        
        name = sc.nextLine();
        agents = sc.nextInt();
        sc.nextLine();
        names = name + " " + sc.nextLine();
        
        String data[] = names.split(" ");
                
        String alpha;
        for (String n : data) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j].charAt(0) > data[j+1].charAt(0)) {
                    alpha = data[j];
                    data[j] = data[j+1];
                    data[j+1] = alpha;
                }
            }
        }
        
        for (int i=0; i<data.length; i++) {
            if (data[i].equals(name)) {
                index = i + 1;
            }
        }
        
        if (index <= agents) {
            time = 20;
        }
        else if (index % agents == 0){
            time = (index/agents) * 20;
        }
        else {
            time = ((index / agents) + 1) * 20;
        }
        
        System.out.println(time);
    }
}
