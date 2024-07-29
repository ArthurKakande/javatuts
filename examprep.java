//// Anigram checker
import java.util.Arrays;


class HelloWorld {
    public static void main(String[] args) {
        String s1 = "cat";
        String s2 = "act";
        String s3 = "tac";
        
        System.out.println(isAni(s1, s3));
    }
    
    public static boolean isAni(String s1, String s2) {
        if (s1.length() != s2.length()){
            return false;
        }
        
        char [] firstletters = s1.toCharArray();
        char [] secondletters = s2.toCharArray();
        
        Arrays.sort(firstletters);
        Arrays.sort(secondletters);
        
        return Arrays.equals(firstletters, secondletters);
    }
}

##divide string
class HelloWorld {
    public static void main(String[] args) {
        String s1 = "abcdefghi";
        int parts = 3;
        
        String [] answer = divide(s1, parts);
        
        for (String part : answer){
            System.out.println(part);
        }
    }
    
    public static String [] divide(String s1, int parts) {
        if (s1.length()%parts != 0) {
            throw new IllegalArgumentException("false string and parts combination");
        }
        
        int partsize = s1.length()/parts;
        String [] result = new String [parts];
        
        for (int i = 0; i < parts; i++) {
            result[i] = s1.substring(i * partsize, (i + 1) * partsize);
        }
        return result;
    }
}


###reverse needle haystack
class HelloWorld {
    public static void main(String[] args) {
        String s1 = "catcatdogcat";
        String s2 = "catc";
        
        System.out.println(countsubstring(s1, s2));
    }
    
    public static int countsubstring (String s1, String s2) {
        if (s1.length() < s2.length()) {
            return 0;
        }
        
        int index = 0;
        int count = 0;
        while ((index=s1.indexOf(s2, index))!= -1) {
            count++;
            index+=s2.length();
        }
        return count;
    }
}

####reverse string
class HelloWorld {
    public static void main(String[] args) {
        String s1 = "mosel";
        
        System.out.println(reverse(s1));
    }
    
    public static String reverse (String s) {
        if (s.length() <= 1) {
            return s;
        }
        
        return reverse(s.substring(1)) + s.charAt(0);
    }
}

####inverted digit
class HelloWorld {
    public static void main(String[] args) {
        int dig = 198;
        
        System.out.println(invert(dig));
    }
    
    public static int invert(int i) {
        int inverted = 0;
        
        while (i > 0) {
            int digit = i%10; //remove last digit
            inverted = inverted*10 + digit; //append the removed digit
            i/=10; //remove the last digit
        }
        return inverted;
    }
}

###intersection of array
class HelloWorld {
    public static void main(String[] args) {
        int [] a = new int [] {1,2,3,4,5};
        int [] b = new int [] {3,4};
        
        int [] result = intersect(a,b);
        for (int digit:result) {
            System.out.print(digit);
            System.out.print(", ");
        }
    }
    
    public static int [] intersect(int[] a, int [] b) {
        Arrays.sort (a);
        Arrays.sort (b);
        
        int i = 0, j=0;
        int [] result = new int [Math.min(a.length, b.length)];
        int index = 0;
        while(i<a.length && j<b.length) {
            if (a[i] < b[j]) {
                i++;
            } else if (a[i]>b[j]) {
                j++;
            } else {
                result[index++] = a[i];
                i++;
                j++;
            }
        }
        return result;
    }
}

####dot product
import java.util.Arrays;


public class MyClass {
  public static void main(String args[]) {
    int [] s1 = new int [] {2,2,1};
    int [] s2 = new int [] {2,3};
    
    int result = dotp(s1, s2);

    System.out.println(result);
    
    
  }
  
  public static int dotp(int [] a, int [] b){
      if (a.length != b.length) {
          return 0;
      }
      
      int sum = 0;
      
      for (int i=0; i < a.length; i++) {
          for(int j =0; j<b.length; j++) {
              sum+=a[i]*b[j];
          }
      }
      return sum;
  }
}

###average temperature
public class MyClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Get matrix dimensions from user (replace with fixed size if desired)
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int numColumns = sc.nextInt();


        // Create matrix with user-provided dimensions
        int[][] matrix = new int[numRows][numColumns];

        // Input validation (optional): Ensure matrix dimensions are positive
        if (numRows <= 0 || numColumns <= 0) {
            System.err.println("Error: Matrix dimensions must be positive integers.");
            return;
        }

        // Get matrix elements from user
        System.out.println("Enter matrix elements (row-wise):");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Calculate and display row averages using average() method
        int[] result = average(matrix);
        System.out.println("Row averages:");
        for (int number : result) {
            System.out.println(number);
        }

        sc.close(); // Close Scanner to avoid resource leaks
    }

    public static int[] average(int[][] matrix) {
        int numRows = matrix.length; // Get number of rows from matrix length
        int numColumns = matrix[0].length; // Get number of columns from first row length

        int[] result = new int[numRows];

        for (int i = 0; i < numRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < numColumns; j++) {
                rowSum += matrix[i][j];
            }
            result[i] = rowSum / numRows;
        }

        return result;
    }
}

#########ds
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(containsSum("id05x"));
    }
    
    public static int adddigs(String str) {
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
                sum+=Character.getNumericValue(ch);
            }
        }
        return sum;
    }
    
    public static boolean containsSum(String str) {
        int ds = adddigs(str);
        String dsstring = Integer.toString(ds);
        return str.contains(dsstring);
    }
}

###unique words in string, digit sum
import java.util.HashSet;

public class MyClass {
  public static void main(String args[]) {
    String s = "boy";
    int [] seq = new int[]{2,1,0};

    System.out.println("String count " + countunique("hey") + "rerranged " + rearrange(s, seq));
  }
  
  public static int countunique(String str) {
      String [] words = str.split("\\st");
      HashSet <String> uniquewords = new HashSet <> ();
      for(String word : words) {
          uniquewords.add(word);
      }
      return uniquewords.size();
  }
  
  public static String rearrange(String str, int [] sequence) {
      StringBuilder rearrangedword = new StringBuilder ();
      for (int integer : sequence){
          rearrangedword.append(str.charAt(integer));
      }
      return rearrangedword.toString();
  }
}

##digit sum is contained
class HelloWorld {
    public static void main(String[] args) {
        System.out.println(containsSum("id05x"));
    }
    
    public static int adddigs(String str) {
        int sum = 0;
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) {
                sum+=Character.getNumericValue(ch);
            }
        }
        return sum;
    }
    
    public static boolean containsSum(String str) {
        int ds = adddigs(str);
        String dsstring = Integer.toString(ds);
        return str.contains(dsstring);
    }
}
