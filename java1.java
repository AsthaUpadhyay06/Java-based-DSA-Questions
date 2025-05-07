public class java1 {
    
    public static void main(String[] var0) {
       int[] var1 = new int[]{1, 2, 3, 4, 5};
       byte var2 = 5;
       int[] var3 = new int[var2];
       int var4 = 0;
       int var5 = 2;
       var5 %= var2;cc
 
       int var6;
       for(var6 = var2 - var5; var6 < var2; ++var6) {
          var3[var4++] = var1[var6];
       }
 
       for(var6 = 0; var6 < var2 - var5; ++var6) {
          var3[var4++] = var1[var6];
       }
 
       for(var6 = 0; var6 < var2; ++var6) {
          System.out.print(var3[var6] + " ");
       }
 
    }
 }
  
    

