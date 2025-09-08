public class FactorsProgram {
    public static void main(String[] args) {
        int number = 12; 
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        int greatest = greatestFactor(factors);
        System.out.println("Greatest factor: " + greatest);
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);
        long productCube = productOfCubeOfFactors(factors);
        System.out.println("Product of cube of factors: " + productCube);
    }
    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    public static long productOfCubeOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}
