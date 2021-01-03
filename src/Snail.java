import java.util.ArrayList;
import java.util.List;

public class Snail {
    private static List<Integer> outputList;
    private static int currentRow, currentColumn, jumpsLeft;
    public static int[] snail(int[][] array) {
        currentRow=0;
        currentColumn=0;
        outputList = new ArrayList<>();
        jumpsLeft= array[0].length*2-1;
        if(jumpsLeft>0)
            leftToRight(array);
    return  getArray();
    }

    private static int[] getArray() {
        int[] outputArray = new int[outputList.size()];
        for(int i=0; i < outputList.size(); i++)
        {outputArray[i]=outputList.get(i);
        System.out.println(outputArray[i]);}
        return outputArray;
    }

    private static void leftToRight(int[][] array)
    {   jumpsLeft--;
        for(int i=currentColumn; i< array.length  - currentColumn; i++)
            outputList.add(array[currentRow][i]);
        if(jumpsLeft>0)
            upToDown(array);
    }
    private static void upToDown(int[][] array)
    {   jumpsLeft--;
        for(int i=currentRow+1; i < array.length - 1 - currentRow ; i++)
            outputList.add(array[i][array.length-currentColumn - 1]);
        if(jumpsLeft>0)
            rightToLeft(array);
    }
    private static void rightToLeft(int[][] array)
    {   jumpsLeft--;
        for(int i = array.length - 1 - currentColumn; i>=currentColumn ; i--)
            outputList.add(array[array.length - 1 - currentRow][i]);

        if(jumpsLeft>0)
            downToUp(array);

    }
    private static void downToUp(int[][] array)
    {   jumpsLeft--;
        for(int i = array.length - 2 - currentRow; i > currentRow; i--)
            outputList.add(array[i][currentColumn]);

        currentColumn++;
        currentRow++;

        if(jumpsLeft>0)
            leftToRight(array);
    }

}