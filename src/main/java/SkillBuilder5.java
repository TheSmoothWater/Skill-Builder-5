/**
 * This class provides various Skill Builder 5 - Array
 * exercises.
 *
 * @author (you)
 * @version (a version number or a date)
 */
public class SkillBuilder5
{
    /**
     * Calculates the prefix average of array data and returns the prefex average
     * in a new array.  The parameter data is never touched and left intact.
     *
     * @param data array of double values on which to calculate the prefix average.
     * @return returns an array containing the prefix average values calculated
     *         from data.
     */
    public static double[] prefixAverage(double[] data)
    {
        double[] averages = new double[data.length];
        double temp;
        for(int i = 1; i < data.length; i++){
            temp = 0;
            for(int j = 0; j <= i; j++) {
                temp = (temp + data[j]);
            }
            temp /= (i + 1);
            averages[i] = temp;
        }
        averages[0] = data[0];
        return averages;
    }

    /**
     * Finds the location in array anArray where value is located.  If anArray
     * does not contain an element equal to value a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param searchValue value to look for in the array
     * @param anArray array in which to look for a value
     * @returns index of the value in the array; -1 otherwise.
     */
    public static int  indexOf(int searchValue, int[] anArray)
    {
        for(int i = 0; i < anArray.length; i++){
            if(anArray[i] == searchValue){
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds the location in array anArray where string s is located.  If anArray
     * does not contain an element equal to s a -1 is returned; otherwise a
     * positive or zero index value is returned.
     * @param s a string to look for in the array
     * @param anArray array in which to look for a value
     * @return index of the string s in the array; -1 otherwise.
     */
    public static int  indexOf(String s, String[] anArray)
    {
        for(int i = 0; i < anArray.length; i++){
            if(anArray[i].equals(s)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Finds all occurrence of string s in anArray and removes them, returning
     * a new array with all occurrences of s removed.
     * @param s string to search for in array
     * @param anArray array in which to search and remove s
     * @return An array with all occurrences of s removed.
     */
    public static String[] remove(String s, String[] anArray)
    {
        int count = 0;
        for (String string : anArray) {
            if (string.equals(s)) {
                count++;
            }
        }
        String[] removed = new String[anArray.length - count];

        int subtract = 0;
        for(int j = 0; j < anArray.length; j++){
            if(!(anArray[j].equals(s))){
                removed[j - subtract] = anArray[j];
            }
            else{
                subtract ++;
            }
        }

        return removed;
    }

    /**
     * Reverses an array of integers.
     * @param anArray the array whose contents should be reversed.
     */
    public static void reverse(int[] anArray)
    {
        int[] reversed = new int[anArray.length];
        for(int i = anArray.length - 1; i >= 0; i--){
            reversed[(anArray.length - 1) - i] = anArray[i];
        }
        System.arraycopy(reversed, 0, anArray, 0, anArray.length);
    }
}
