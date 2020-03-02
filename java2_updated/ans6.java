
// WAP showing try, multi-catch and finally blocks.
public class ans6 {

        public static void main(String[] args) {
            int[] arr =new int[5];
            try{
                int division = 98/0;
                int result = arr[7];
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("\nArrayIndexOutOfBoundsException:");
            }
            catch(ArithmeticException   e){
                System.out.println("\nDivide by zero exception :");
            }
            catch(Exception e){
                System.out.println("\nAnykind of Exception:");
            }
            finally{
                System.out.println("\nFinally block Executed:");
            }
        }
    }
