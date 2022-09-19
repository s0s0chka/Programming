public class Lab1 {

    public static void printArray(double[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                System.out.printf("%8.4f ", array[i][j]);
            }
            System.out.println();
        }
    }

    public static double generateNumber(short condition, float x){
        double result;

        if (condition == 6){
            result = Math.cbrt(Math.tan(Math.cos(x)));
        } 
        else if(condition == 8 || condition == 12 || condition == 14 || condition == 20){
            result = Math.log(Math.pow(Math.tan(Math.cos(Math.asin((x + 0.5) / 25))), 2));
        } 
        else {
            result = Math.pow(Math.E, Math.pow((2/3) / (Math.pow(Math.pow(Math.E, x), Math.pow(2 - x, 3) / 2 - 1)), 3));
        }
        return result;
    }

    public static void main(String[] args){
        //Task 1
        short[] f = new short[9];
        short t = 4;
        for(int i = 0; i < f.length; i++){
            f[i] = t;
            t += 2;
        }

        //Task 2
        float[] x = new float[11];
        for(int i = 0; i < x.length; i++){
            x[i] = ((float)Math.random() * 26) - 12;
	        if (x[i] > 13) {
		        x[i] = 13;
	        }
        }

        //Task 3
        double p[][] = new double[9][11];

        for (int i = 0; i < p.length; i++){
            for (int j = 0; j < p[0].length; j++){
                p[i][j] = generateNumber(f[i], x[j]);
            }
        }
        printArray(p);
    }
}
