package chapter5.DotGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Administrator on 2017/4/9.
 */
public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] args){
        locationCells = args;
    }

    public String checkYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);

        String result = "miss";
        for(int cell : locationCells){
            if(guess == cell){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}

class SimpleDotComTestDrive{
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "6";
        BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = null;
        try {
            inputLine = is.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String result = dot.checkYourself(inputLine);
        System.out.println(result);
    }
}
