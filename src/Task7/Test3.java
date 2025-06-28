package Task7;

public class Test3 {
    public static void main(String[] args) {

                int numOperations = 100000;
                // Test String concatenation
                long startTime = System.nanoTime();
                String str = "";
                for (int i = 0; i < numOperations; i++) {
                    str += "a"; // String concatenation
                }
                long endTime = System.nanoTime();
                long durationConcatenation = endTime - startTime;

                // Test StringBuilder
                startTime = System.nanoTime();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < numOperations; i++) {
                    stringBuilder.append("a");
                }
                endTime = System.nanoTime();
                long durationStringBuilder = endTime - startTime;

                // Test StringBuffer
                startTime = System.nanoTime();
                StringBuffer stringBuffer = new StringBuffer();
                for (int i = 0; i < numOperations; i++) {
                    stringBuffer.append("a");
                }
                endTime = System.nanoTime();
                long durationStringBuffer = endTime - startTime;

                // Print the results
                System.out.println("Time taken for String concatenation: " + durationConcatenation + " ns");
                System.out.println("Time taken for StringBuilder: " + durationStringBuilder + " ns");
                System.out.println("Time taken for StringBuffer: " + durationStringBuffer + " ns");
            }
        }



